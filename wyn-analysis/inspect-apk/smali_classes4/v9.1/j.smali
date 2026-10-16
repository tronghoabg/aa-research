.class public final Lv9/j;
.super Lmd/e;
.source "SourceFile"


# instance fields
.field public final synthetic d:LE4/n;

.field public final synthetic e:[Lmd/f;

.field public final synthetic f:Lv9/m;


# direct methods
.method public constructor <init>(Lv9/m;LE4/n;[Lmd/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv9/j;->f:Lv9/m;

    .line 5
    .line 6
    iput-object p2, p0, Lv9/j;->d:LE4/n;

    .line 7
    .line 8
    iput-object p3, p0, Lv9/j;->e:[Lmd/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final i(Lmd/k0;Lmd/b0;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p2, p0, Lv9/j;->d:LE4/n;

    .line 2
    .line 3
    new-instance v0, Lng/a;

    .line 4
    .line 5
    const/16 v1, 0x14

    .line 6
    .line 7
    invoke-direct {v0, v1, p2, p1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p2, LE4/n;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, LA2/d;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LA2/d;->N(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    iget-object p2, p0, Lv9/j;->f:Lv9/m;

    .line 20
    .line 21
    iget-object p2, p2, Lv9/m;->a:Lw9/e;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lw9/e;->c(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final k(Lmd/b0;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lv9/j;->d:LE4/n;

    .line 2
    .line 3
    new-instance v1, Lng/a;

    .line 4
    .line 5
    const/16 v2, 0x13

    .line 6
    .line 7
    invoke-direct {v1, v2, v0, p1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, v0, LE4/n;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, LA2/d;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, LA2/d;->N(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    iget-object v0, p0, Lv9/j;->f:Lv9/m;

    .line 20
    .line 21
    iget-object v0, v0, Lv9/m;->a:Lw9/e;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lw9/e;->c(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final l(Lcom/google/protobuf/MessageLite;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lv9/j;->d:LE4/n;

    .line 2
    .line 3
    iget v1, v0, LE4/n;->b:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    add-int/2addr v1, v2

    .line 7
    new-instance v3, LMb/b;

    .line 8
    .line 9
    const/4 v4, 0x7

    .line 10
    invoke-direct {v3, v0, v1, p1, v4}, LMb/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, v0, LE4/n;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, LA2/d;

    .line 16
    .line 17
    invoke-virtual {p1, v3}, LA2/d;->N(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    iput v1, v0, LE4/n;->b:I

    .line 21
    .line 22
    iget-object p1, p0, Lv9/j;->e:[Lmd/f;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    aget-object p1, p1, v0

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Lmd/f;->c(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    iget-object v0, p0, Lv9/j;->f:Lv9/m;

    .line 33
    .line 34
    iget-object v0, v0, Lv9/m;->a:Lw9/e;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lw9/e;->c(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final m()V
    .locals 0

    .line 1
    return-void
.end method
