.class public final Lff/l;
.super Lff/h;
.source "SourceFile"


# static fields
.field public static final d:[Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:[Ljava/lang/Object;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v0, Lff/l;->d:[Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lff/l;->d:[Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lff/l;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 7

    .line 2
    sget-object v0, Lff/f;->Companion:Lff/c;

    .line 3
    iget v1, p0, Lff/l;->c:I

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, Lff/c;->c(II)V

    .line 5
    iget v0, p0, Lff/l;->c:I

    if-ne p1, v0, :cond_0

    .line 6
    invoke-virtual {p0, p2}, Lff/l;->addLast(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 7
    invoke-virtual {p0, p2}, Lff/l;->addFirst(Ljava/lang/Object;)V

    return-void

    .line 8
    :cond_1
    invoke-virtual {p0}, Lff/l;->j()V

    .line 9
    iget v0, p0, Lff/l;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 10
    invoke-virtual {p0, v0}, Lff/l;->e(I)V

    .line 11
    iget v0, p0, Lff/l;->a:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lff/l;->i(I)I

    move-result v0

    .line 12
    iget v2, p0, Lff/l;->c:I

    add-int/lit8 v3, v2, 0x1

    shr-int/2addr v3, v1

    const/4 v4, 0x0

    if-ge p1, v3, :cond_5

    .line 13
    const-string p1, "<this>"

    if-nez v0, :cond_2

    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    array-length v0, v0

    :cond_2
    sub-int/2addr v0, v1

    .line 15
    iget v2, p0, Lff/l;->a:I

    if-nez v2, :cond_3

    .line 16
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    array-length p1, v2

    sub-int/2addr p1, v1

    goto :goto_0

    :cond_3
    add-int/lit8 p1, v2, -0x1

    .line 18
    :goto_0
    iget v2, p0, Lff/l;->a:I

    if-lt v0, v2, :cond_4

    .line 19
    iget-object v3, p0, Lff/l;->b:[Ljava/lang/Object;

    aget-object v4, v3, v2

    aput-object v4, v3, p1

    add-int/lit8 v4, v2, 0x1

    add-int/lit8 v5, v0, 0x1

    .line 20
    invoke-static {v3, v2, v3, v4, v5}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_1

    .line 21
    :cond_4
    iget-object v3, p0, Lff/l;->b:[Ljava/lang/Object;

    add-int/lit8 v5, v2, -0x1

    array-length v6, v3

    invoke-static {v3, v5, v3, v2, v6}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 22
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v3, v2

    sub-int/2addr v3, v1

    aget-object v5, v2, v4

    aput-object v5, v2, v3

    add-int/lit8 v3, v0, 0x1

    .line 23
    invoke-static {v2, v4, v2, v1, v3}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 24
    :goto_1
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    aput-object p2, v2, v0

    .line 25
    iput p1, p0, Lff/l;->a:I

    goto :goto_3

    .line 26
    :cond_5
    iget p1, p0, Lff/l;->a:I

    add-int/2addr v2, p1

    invoke-virtual {p0, v2}, Lff/l;->i(I)I

    move-result p1

    if-ge v0, p1, :cond_6

    .line 27
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3, v2, v0, p1}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_2

    .line 28
    :cond_6
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    invoke-static {v2, v1, v2, v4, p1}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 29
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v2, p1

    sub-int/2addr v2, v1

    aget-object v2, p1, v2

    aput-object v2, p1, v4

    add-int/lit8 v2, v0, 0x1

    .line 30
    array-length v3, p1

    sub-int/2addr v3, v1

    invoke-static {p1, v2, p1, v0, v3}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 31
    :goto_2
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    aput-object p2, p1, v0

    .line 32
    :goto_3
    iget p1, p0, Lff/l;->c:I

    add-int/2addr p1, v1

    .line 33
    iput p1, p0, Lff/l;->c:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lff/l;->addLast(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 8

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    sget-object v0, Lff/f;->Companion:Lff/c;

    .line 9
    iget v1, p0, Lff/l;->c:I

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, Lff/c;->c(II)V

    .line 11
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 12
    :cond_0
    iget v0, p0, Lff/l;->c:I

    if-ne p1, v0, :cond_1

    .line 13
    invoke-virtual {p0, p2}, Lff/l;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 14
    :cond_1
    invoke-virtual {p0}, Lff/l;->j()V

    .line 15
    iget v0, p0, Lff/l;->c:I

    .line 16
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Lff/l;->e(I)V

    .line 17
    iget v0, p0, Lff/l;->a:I

    .line 18
    iget v2, p0, Lff/l;->c:I

    add-int/2addr v2, v0

    .line 19
    invoke-virtual {p0, v2}, Lff/l;->i(I)I

    move-result v0

    .line 20
    iget v2, p0, Lff/l;->a:I

    add-int/2addr v2, p1

    invoke-virtual {p0, v2}, Lff/l;->i(I)I

    move-result v2

    .line 21
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v3

    .line 22
    iget v4, p0, Lff/l;->c:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    shr-int/2addr v4, v5

    if-ge p1, v4, :cond_6

    .line 23
    iget p1, p0, Lff/l;->a:I

    sub-int v0, p1, v3

    if-lt v2, p1, :cond_4

    if-ltz v0, :cond_2

    .line 24
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    invoke-static {v1, v0, v1, p1, v2}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_0

    .line 25
    :cond_2
    iget-object v4, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v6, v4

    add-int/2addr v0, v6

    sub-int v6, v2, p1

    .line 26
    array-length v7, v4

    sub-int/2addr v7, v0

    if-lt v7, v6, :cond_3

    .line 27
    invoke-static {v4, v0, v4, p1, v2}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_0

    :cond_3
    add-int v6, p1, v7

    .line 28
    invoke-static {v4, v0, v4, p1, v6}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 29
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    iget v4, p0, Lff/l;->a:I

    add-int/2addr v4, v7

    invoke-static {p1, v1, p1, v4, v2}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_0

    .line 30
    :cond_4
    iget-object v4, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v6, v4

    invoke-static {v4, v0, v4, p1, v6}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    if-lt v3, v2, :cond_5

    .line 31
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {p1, v4, p1, v1, v2}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_0

    .line 32
    :cond_5
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {p1, v4, p1, v1, v3}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 33
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    invoke-static {p1, v1, p1, v3, v2}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 34
    :goto_0
    iput v0, p0, Lff/l;->a:I

    sub-int/2addr v2, v3

    .line 35
    invoke-virtual {p0, v2}, Lff/l;->g(I)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lff/l;->d(ILjava/util/Collection;)V

    return v5

    :cond_6
    add-int p1, v2, v3

    if-ge v2, v0, :cond_9

    add-int/2addr v3, v0

    .line 36
    iget-object v4, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v6, v4

    if-gt v3, v6, :cond_7

    .line 37
    invoke-static {v4, p1, v4, v2, v0}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_1

    .line 38
    :cond_7
    array-length v6, v4

    if-lt p1, v6, :cond_8

    .line 39
    array-length v1, v4

    sub-int/2addr p1, v1

    invoke-static {v4, p1, v4, v2, v0}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_1

    .line 40
    :cond_8
    array-length v6, v4

    sub-int/2addr v3, v6

    sub-int v3, v0, v3

    .line 41
    invoke-static {v4, v1, v4, v3, v0}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 42
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    invoke-static {v0, p1, v0, v2, v3}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_1

    .line 43
    :cond_9
    iget-object v4, p0, Lff/l;->b:[Ljava/lang/Object;

    invoke-static {v4, v3, v4, v1, v0}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 44
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v4, v0

    if-lt p1, v4, :cond_a

    .line 45
    array-length v1, v0

    sub-int/2addr p1, v1

    array-length v1, v0

    invoke-static {v0, p1, v0, v2, v1}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_1

    .line 46
    :cond_a
    array-length v4, v0

    sub-int/2addr v4, v3

    array-length v6, v0

    invoke-static {v0, v1, v0, v4, v6}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 47
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v1, v0

    sub-int/2addr v1, v3

    invoke-static {v0, p1, v0, v2, v1}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 48
    :goto_1
    invoke-virtual {p0, v2, p2}, Lff/l;->d(ILjava/util/Collection;)V

    return v5
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lff/l;->j()V

    .line 3
    invoke-virtual {p0}, Lff/l;->a()I

    move-result v0

    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lff/l;->e(I)V

    .line 5
    iget v0, p0, Lff/l;->a:I

    .line 6
    invoke-virtual {p0}, Lff/l;->a()I

    move-result v1

    add-int/2addr v1, v0

    .line 7
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lff/l;->d(ILjava/util/Collection;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addFirst(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lff/l;->j()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lff/l;->c:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lff/l;->e(I)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lff/l;->a:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 16
    .line 17
    const-string v1, "<this>"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    array-length v0, v0

    .line 23
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    iput v0, p0, Lff/l;->a:I

    .line 26
    .line 27
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 28
    .line 29
    aput-object p1, v1, v0

    .line 30
    .line 31
    iget p1, p0, Lff/l;->c:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    iput p1, p0, Lff/l;->c:I

    .line 36
    .line 37
    return-void
.end method

.method public final addLast(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lff/l;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lff/l;->a()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lff/l;->e(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 14
    .line 15
    iget v1, p0, Lff/l;->a:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lff/l;->a()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v1

    .line 22
    invoke-virtual {p0, v2}, Lff/l;->i(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    aput-object p1, v0, v1

    .line 27
    .line 28
    invoke-virtual {p0}, Lff/l;->a()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    add-int/lit8 p1, p1, 0x1

    .line 33
    .line 34
    iput p1, p0, Lff/l;->c:I

    .line 35
    .line 36
    return-void
.end method

.method public final c(I)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lff/f;->Companion:Lff/c;

    .line 2
    .line 3
    iget v1, p0, Lff/l;->c:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v1}, Lff/c;->b(II)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lr7/e;->z(Ljava/util/List;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lff/l;->removeLast()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lff/l;->removeFirst()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    invoke-virtual {p0}, Lff/l;->j()V

    .line 30
    .line 31
    .line 32
    iget v0, p0, Lff/l;->a:I

    .line 33
    .line 34
    add-int/2addr v0, p1

    .line 35
    invoke-virtual {p0, v0}, Lff/l;->i(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 40
    .line 41
    aget-object v2, v1, v0

    .line 42
    .line 43
    iget v3, p0, Lff/l;->c:I

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    shr-int/2addr v3, v4

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    if-ge p1, v3, :cond_3

    .line 50
    .line 51
    iget p1, p0, Lff/l;->a:I

    .line 52
    .line 53
    if-lt v0, p1, :cond_2

    .line 54
    .line 55
    add-int/lit8 v3, p1, 0x1

    .line 56
    .line 57
    invoke-static {v1, v3, v1, p1, v0}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {v1, v4, v1, v6, v0}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 65
    .line 66
    array-length v0, p1

    .line 67
    sub-int/2addr v0, v4

    .line 68
    aget-object v0, p1, v0

    .line 69
    .line 70
    aput-object v0, p1, v6

    .line 71
    .line 72
    iget v0, p0, Lff/l;->a:I

    .line 73
    .line 74
    add-int/lit8 v1, v0, 0x1

    .line 75
    .line 76
    array-length v3, p1

    .line 77
    sub-int/2addr v3, v4

    .line 78
    invoke-static {p1, v1, p1, v0, v3}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    :goto_0
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 82
    .line 83
    iget v0, p0, Lff/l;->a:I

    .line 84
    .line 85
    aput-object v5, p1, v0

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lff/l;->f(I)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput p1, p0, Lff/l;->a:I

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    iget p1, p0, Lff/l;->a:I

    .line 95
    .line 96
    invoke-static {p0}, Lr7/e;->z(Ljava/util/List;)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v1, p1

    .line 101
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-gt v0, p1, :cond_4

    .line 106
    .line 107
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 108
    .line 109
    add-int/lit8 v3, v0, 0x1

    .line 110
    .line 111
    add-int/lit8 v6, p1, 0x1

    .line 112
    .line 113
    invoke-static {v1, v0, v1, v3, v6}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 118
    .line 119
    add-int/lit8 v3, v0, 0x1

    .line 120
    .line 121
    array-length v7, v1

    .line 122
    invoke-static {v1, v0, v1, v3, v7}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 126
    .line 127
    array-length v1, v0

    .line 128
    sub-int/2addr v1, v4

    .line 129
    aget-object v3, v0, v6

    .line 130
    .line 131
    aput-object v3, v0, v1

    .line 132
    .line 133
    add-int/lit8 v1, p1, 0x1

    .line 134
    .line 135
    invoke-static {v0, v6, v0, v4, v1}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 136
    .line 137
    .line 138
    :goto_1
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 139
    .line 140
    aput-object v5, v0, p1

    .line 141
    .line 142
    :goto_2
    iget p1, p0, Lff/l;->c:I

    .line 143
    .line 144
    sub-int/2addr p1, v4

    .line 145
    iput p1, p0, Lff/l;->c:I

    .line 146
    .line 147
    return-object v2
.end method

.method public final clear()V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lff/l;->j()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lff/l;->a:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lff/l;->a()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v1, p0, Lff/l;->a:I

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Lff/l;->h(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput v0, p0, Lff/l;->a:I

    .line 28
    .line 29
    iput v0, p0, Lff/l;->c:I

    .line 30
    .line 31
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lff/l;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final d(ILjava/util/Collection;)V
    .locals 4

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    :goto_0
    if-ge p1, v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    aput-object v3, v2, p1

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget p1, p0, Lff/l;->a:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_1
    if-ge v1, p1, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    aput-object v3, v2, v1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget p1, p0, Lff/l;->c:I

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    add-int/2addr p2, p1

    .line 56
    iput p2, p0, Lff/l;->c:I

    .line 57
    .line 58
    return-void
.end method

.method public final e(I)V
    .locals 4

    .line 1
    if-ltz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-gt p1, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object v1, Lff/l;->d:[Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v0, v1, :cond_2

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    move p1, v0

    .line 18
    :cond_1
    new-array p1, p1, [Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    sget-object v1, Lff/f;->Companion:Lff/c;

    .line 24
    .line 25
    array-length v0, v0

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p1}, Lff/c;->e(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    new-array p1, p1, [Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 36
    .line 37
    iget v1, p0, Lff/l;->a:I

    .line 38
    .line 39
    array-length v2, v0

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static {v0, v3, p1, v1, v2}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 45
    .line 46
    array-length v1, v0

    .line 47
    iget v2, p0, Lff/l;->a:I

    .line 48
    .line 49
    sub-int/2addr v1, v2

    .line 50
    invoke-static {v0, v1, p1, v3, v2}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    iput v3, p0, Lff/l;->a:I

    .line 54
    .line 55
    iput-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v0, "Deque is too big."

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public final f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    array-length v0, v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    return p1
.end method

.method public final g(I)I
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    add-int/2addr p1, v0

    .line 7
    :cond_0
    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lff/f;->Companion:Lff/c;

    .line 2
    .line 3
    iget v1, p0, Lff/l;->c:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v1}, Lff/c;->b(II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v1, p0, Lff/l;->a:I

    .line 14
    .line 15
    add-int/2addr v1, p1

    .line 16
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    aget-object p1, v0, p1

    .line 21
    .line 22
    return-object p1
.end method

.method public final h(II)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ge p1, p2, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {v1, v0, p1, p2}, Lff/m;->o0([Ljava/lang/Object;LH6/g;II)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    invoke-static {v1, p1, v2, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {p1, v0, v1, p2}, Lff/m;->o0([Ljava/lang/Object;LH6/g;II)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final i(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    sub-int/2addr p1, v0

    .line 8
    :cond_0
    return p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lff/l;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lff/l;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/2addr v1, v0

    .line 8
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, Lff/l;->a:I

    .line 13
    .line 14
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    :goto_0
    if-ge v1, v0, :cond_5

    .line 17
    .line 18
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget p1, p0, Lff/l;->a:I

    .line 29
    .line 30
    :goto_1
    sub-int/2addr v1, p1

    .line 31
    return v1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_5

    .line 40
    .line 41
    iget v1, p0, Lff/l;->a:I

    .line 42
    .line 43
    if-lt v1, v0, :cond_5

    .line 44
    .line 45
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 46
    .line 47
    array-length v2, v2

    .line 48
    :goto_2
    if-ge v1, v2, :cond_3

    .line 49
    .line 50
    iget-object v3, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 51
    .line 52
    aget-object v3, v3, v1

    .line 53
    .line 54
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iget p1, p0, Lff/l;->a:I

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const/4 v1, 0x0

    .line 67
    :goto_3
    if-ge v1, v0, :cond_5

    .line 68
    .line 69
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 70
    .line 71
    aget-object v2, v2, v1

    .line 72
    .line 73
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 80
    .line 81
    array-length p1, p1

    .line 82
    add-int/2addr v1, p1

    .line 83
    iget p1, p0, Lff/l;->a:I

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    const/4 p1, -0x1

    .line 90
    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lff/l;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final j()V
    .locals 1

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 6
    .line 7
    return-void
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, Lff/l;->a:I

    .line 2
    .line 3
    iget v1, p0, Lff/l;->c:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lff/l;->a:I

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    if-gt v1, v0, :cond_5

    .line 18
    .line 19
    :goto_0
    iget-object v3, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v3, v3, v0

    .line 22
    .line 23
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget p1, p0, Lff/l;->a:I

    .line 30
    .line 31
    :goto_1
    sub-int/2addr v0, p1

    .line 32
    return v0

    .line 33
    :cond_0
    if-eq v0, v1, :cond_5

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lff/l;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    iget v1, p0, Lff/l;->a:I

    .line 45
    .line 46
    if-lt v1, v0, :cond_5

    .line 47
    .line 48
    add-int/lit8 v0, v0, -0x1

    .line 49
    .line 50
    :goto_2
    if-ge v2, v0, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object v1, v1, v0

    .line 55
    .line 56
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 63
    .line 64
    array-length p1, p1

    .line 65
    add-int/2addr v0, p1

    .line 66
    iget p1, p0, Lff/l;->a:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 73
    .line 74
    const-string v1, "<this>"

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    array-length v0, v0

    .line 80
    add-int/lit8 v0, v0, -0x1

    .line 81
    .line 82
    iget v1, p0, Lff/l;->a:I

    .line 83
    .line 84
    if-gt v1, v0, :cond_5

    .line 85
    .line 86
    :goto_3
    iget-object v3, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 87
    .line 88
    aget-object v3, v3, v0

    .line 89
    .line 90
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    iget p1, p0, Lff/l;->a:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    if-eq v0, v1, :cond_5

    .line 100
    .line 101
    add-int/lit8 v0, v0, -0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    return v2
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lff/l;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lff/l;->c(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 11

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lff/l;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_8

    .line 12
    .line 13
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v0, v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lff/l;->a:I

    .line 21
    .line 22
    iget v2, p0, Lff/l;->c:I

    .line 23
    .line 24
    add-int/2addr v2, v0

    .line 25
    invoke-virtual {p0, v2}, Lff/l;->i(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v2, p0, Lff/l;->a:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-ge v2, v0, :cond_3

    .line 34
    .line 35
    move v5, v2

    .line 36
    :goto_0
    if-ge v2, v0, :cond_2

    .line 37
    .line 38
    iget-object v6, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 39
    .line 40
    aget-object v6, v6, v2

    .line 41
    .line 42
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-nez v7, :cond_1

    .line 47
    .line 48
    iget-object v7, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 49
    .line 50
    add-int/lit8 v8, v5, 0x1

    .line 51
    .line 52
    aput-object v6, v7, v5

    .line 53
    .line 54
    move v5, v8

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v1, v3

    .line 57
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {p1, v4, v5, v0}, Lff/m;->o0([Ljava/lang/Object;LH6/g;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_6

    .line 66
    :cond_3
    iget-object v5, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 67
    .line 68
    array-length v5, v5

    .line 69
    move v7, v1

    .line 70
    move v6, v2

    .line 71
    :goto_2
    if-ge v2, v5, :cond_5

    .line 72
    .line 73
    iget-object v8, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 74
    .line 75
    aget-object v9, v8, v2

    .line 76
    .line 77
    aput-object v4, v8, v2

    .line 78
    .line 79
    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_4

    .line 84
    .line 85
    iget-object v8, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 86
    .line 87
    add-int/lit8 v10, v6, 0x1

    .line 88
    .line 89
    aput-object v9, v8, v6

    .line 90
    .line 91
    move v6, v10

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move v7, v3

    .line 94
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    invoke-virtual {p0, v6}, Lff/l;->i(I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    move v5, v2

    .line 102
    :goto_4
    if-ge v1, v0, :cond_7

    .line 103
    .line 104
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 105
    .line 106
    aget-object v6, v2, v1

    .line 107
    .line 108
    aput-object v4, v2, v1

    .line 109
    .line 110
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_6

    .line 115
    .line 116
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 117
    .line 118
    aput-object v6, v2, v5

    .line 119
    .line 120
    invoke-virtual {p0, v5}, Lff/l;->f(I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    goto :goto_5

    .line 125
    :cond_6
    move v7, v3

    .line 126
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    move v1, v7

    .line 130
    :goto_6
    if-eqz v1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p0}, Lff/l;->j()V

    .line 133
    .line 134
    .line 135
    iget p1, p0, Lff/l;->a:I

    .line 136
    .line 137
    sub-int/2addr v5, p1

    .line 138
    invoke-virtual {p0, v5}, Lff/l;->g(I)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iput p1, p0, Lff/l;->c:I

    .line 143
    .line 144
    :cond_8
    :goto_7
    return v1
.end method

.method public final removeFirst()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lff/l;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lff/l;->j()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, p0, Lff/l;->a:I

    .line 13
    .line 14
    aget-object v2, v0, v1

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v3, v0, v1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lff/l;->f(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lff/l;->a:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lff/l;->a()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    iput v0, p0, Lff/l;->c:I

    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 35
    .line 36
    const-string v1, "ArrayDeque is empty."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public final removeLast()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lff/l;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lff/l;->j()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lff/l;->a:I

    .line 11
    .line 12
    invoke-static {p0}, Lr7/e;->z(Ljava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v2, v1, v0

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v3, v1, v0

    .line 27
    .line 28
    invoke-virtual {p0}, Lff/l;->a()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    iput v0, p0, Lff/l;->c:I

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 38
    .line 39
    const-string v1, "ArrayDeque is empty."

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public final removeRange(II)V
    .locals 7

    .line 1
    sget-object v0, Lff/f;->Companion:Lff/c;

    .line 2
    .line 3
    iget v1, p0, Lff/l;->c:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2, v1}, Lff/c;->d(III)V

    .line 9
    .line 10
    .line 11
    sub-int v0, p2, p1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget v1, p0, Lff/l;->c:I

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lff/l;->clear()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lff/l;->c(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    invoke-virtual {p0}, Lff/l;->j()V

    .line 32
    .line 33
    .line 34
    iget v2, p0, Lff/l;->c:I

    .line 35
    .line 36
    sub-int/2addr v2, p2

    .line 37
    if-ge p1, v2, :cond_4

    .line 38
    .line 39
    add-int/lit8 v2, p1, -0x1

    .line 40
    .line 41
    iget v3, p0, Lff/l;->a:I

    .line 42
    .line 43
    add-int/2addr v3, v2

    .line 44
    invoke-virtual {p0, v3}, Lff/l;->i(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    sub-int/2addr p2, v1

    .line 49
    iget v1, p0, Lff/l;->a:I

    .line 50
    .line 51
    add-int/2addr v1, p2

    .line 52
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    :goto_0
    if-lez p1, :cond_3

    .line 57
    .line 58
    add-int/lit8 v1, v2, 0x1

    .line 59
    .line 60
    add-int/lit8 v3, p2, 0x1

    .line 61
    .line 62
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iget-object v4, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 71
    .line 72
    sub-int/2addr p2, v3

    .line 73
    add-int/lit8 v5, p2, 0x1

    .line 74
    .line 75
    sub-int/2addr v2, v3

    .line 76
    add-int/lit8 v6, v2, 0x1

    .line 77
    .line 78
    invoke-static {v4, v5, v4, v6, v1}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v2}, Lff/l;->g(I)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p0, p2}, Lff/l;->g(I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    sub-int/2addr p1, v3

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    iget p1, p0, Lff/l;->a:I

    .line 92
    .line 93
    add-int/2addr p1, v0

    .line 94
    invoke-virtual {p0, p1}, Lff/l;->i(I)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iget p2, p0, Lff/l;->a:I

    .line 99
    .line 100
    invoke-virtual {p0, p2, p1}, Lff/l;->h(II)V

    .line 101
    .line 102
    .line 103
    iput p1, p0, Lff/l;->a:I

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    iget v1, p0, Lff/l;->a:I

    .line 107
    .line 108
    add-int/2addr v1, p2

    .line 109
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget v2, p0, Lff/l;->a:I

    .line 114
    .line 115
    add-int/2addr v2, p1

    .line 116
    invoke-virtual {p0, v2}, Lff/l;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    iget v2, p0, Lff/l;->c:I

    .line 121
    .line 122
    :goto_1
    sub-int/2addr v2, p2

    .line 123
    if-lez v2, :cond_5

    .line 124
    .line 125
    iget-object p2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 126
    .line 127
    array-length v3, p2

    .line 128
    sub-int/2addr v3, v1

    .line 129
    array-length p2, p2

    .line 130
    sub-int/2addr p2, p1

    .line 131
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    iget-object v3, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 140
    .line 141
    add-int v4, v1, p2

    .line 142
    .line 143
    invoke-static {v3, p1, v3, v1, v4}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v4}, Lff/l;->i(I)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    add-int/2addr p1, p2

    .line 151
    invoke-virtual {p0, p1}, Lff/l;->i(I)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    goto :goto_1

    .line 156
    :cond_5
    iget p1, p0, Lff/l;->a:I

    .line 157
    .line 158
    iget p2, p0, Lff/l;->c:I

    .line 159
    .line 160
    add-int/2addr p2, p1

    .line 161
    invoke-virtual {p0, p2}, Lff/l;->i(I)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    sub-int p2, p1, v0

    .line 166
    .line 167
    invoke-virtual {p0, p2}, Lff/l;->g(I)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    invoke-virtual {p0, p2, p1}, Lff/l;->h(II)V

    .line 172
    .line 173
    .line 174
    :goto_2
    iget p1, p0, Lff/l;->c:I

    .line 175
    .line 176
    sub-int/2addr p1, v0

    .line 177
    iput p1, p0, Lff/l;->c:I

    .line 178
    .line 179
    return-void
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 11

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lff/l;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_8

    .line 12
    .line 13
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v0, v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lff/l;->a:I

    .line 21
    .line 22
    iget v2, p0, Lff/l;->c:I

    .line 23
    .line 24
    add-int/2addr v2, v0

    .line 25
    invoke-virtual {p0, v2}, Lff/l;->i(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v2, p0, Lff/l;->a:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-ge v2, v0, :cond_3

    .line 34
    .line 35
    move v5, v2

    .line 36
    :goto_0
    if-ge v2, v0, :cond_2

    .line 37
    .line 38
    iget-object v6, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 39
    .line 40
    aget-object v6, v6, v2

    .line 41
    .line 42
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_1

    .line 47
    .line 48
    iget-object v7, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 49
    .line 50
    add-int/lit8 v8, v5, 0x1

    .line 51
    .line 52
    aput-object v6, v7, v5

    .line 53
    .line 54
    move v5, v8

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v1, v3

    .line 57
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object p1, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {p1, v4, v5, v0}, Lff/m;->o0([Ljava/lang/Object;LH6/g;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_6

    .line 66
    :cond_3
    iget-object v5, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 67
    .line 68
    array-length v5, v5

    .line 69
    move v7, v1

    .line 70
    move v6, v2

    .line 71
    :goto_2
    if-ge v2, v5, :cond_5

    .line 72
    .line 73
    iget-object v8, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 74
    .line 75
    aget-object v9, v8, v2

    .line 76
    .line 77
    aput-object v4, v8, v2

    .line 78
    .line 79
    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_4

    .line 84
    .line 85
    iget-object v8, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 86
    .line 87
    add-int/lit8 v10, v6, 0x1

    .line 88
    .line 89
    aput-object v9, v8, v6

    .line 90
    .line 91
    move v6, v10

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move v7, v3

    .line 94
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    invoke-virtual {p0, v6}, Lff/l;->i(I)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    move v5, v2

    .line 102
    :goto_4
    if-ge v1, v0, :cond_7

    .line 103
    .line 104
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 105
    .line 106
    aget-object v6, v2, v1

    .line 107
    .line 108
    aput-object v4, v2, v1

    .line 109
    .line 110
    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 117
    .line 118
    aput-object v6, v2, v5

    .line 119
    .line 120
    invoke-virtual {p0, v5}, Lff/l;->f(I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    goto :goto_5

    .line 125
    :cond_6
    move v7, v3

    .line 126
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    move v1, v7

    .line 130
    :goto_6
    if-eqz v1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p0}, Lff/l;->j()V

    .line 133
    .line 134
    .line 135
    iget p1, p0, Lff/l;->a:I

    .line 136
    .line 137
    sub-int/2addr v5, p1

    .line 138
    invoke-virtual {p0, v5}, Lff/l;->g(I)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iput p1, p0, Lff/l;->c:I

    .line 143
    .line 144
    :cond_8
    :goto_7
    return v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lff/f;->Companion:Lff/c;

    .line 2
    .line 3
    iget v1, p0, Lff/l;->c:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v1}, Lff/c;->b(II)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lff/l;->a:I

    .line 12
    .line 13
    add-int/2addr v0, p1

    .line 14
    invoke-virtual {p0, v0}, Lff/l;->i(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v0, p0, Lff/l;->b:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v1, v0, p1

    .line 21
    .line 22
    aput-object p2, v0, p1

    .line 23
    .line 24
    return-object v1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lff/l;->a()I

    move-result v0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lff/l;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    array-length v0, p1

    .line 4
    iget v1, p0, Lff/l;->c:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/Object;

    .line 6
    :goto_0
    iget v0, p0, Lff/l;->a:I

    .line 7
    iget v1, p0, Lff/l;->c:I

    add-int/2addr v1, v0

    .line 8
    invoke-virtual {p0, v1}, Lff/l;->i(I)I

    move-result v0

    .line 9
    iget v1, p0, Lff/l;->a:I

    if-ge v1, v0, :cond_1

    .line 10
    iget-object v2, p0, Lff/l;->b:[Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v2, v1, p1, v0, v3}, Lff/m;->j0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {p0}, Lff/l;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 12
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    iget v2, p0, Lff/l;->a:I

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, p1, v2, v3}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 13
    iget-object v1, p0, Lff/l;->b:[Ljava/lang/Object;

    array-length v2, v1

    iget v3, p0, Lff/l;->a:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2, p1, v4, v0}, Lff/m;->h0([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 14
    :cond_2
    :goto_1
    iget v0, p0, Lff/l;->c:I

    .line 15
    array-length v1, p1

    if-ge v0, v1, :cond_3

    const/4 v1, 0x0

    .line 16
    aput-object v1, p1, v0

    :cond_3
    return-object p1
.end method
