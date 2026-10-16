.class public final Lx4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/t;


# static fields
.field public static b:Lx4/c;


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    return-void
.end method

.method public static a(Landroid/content/Context;ZLx4/h;)Lx4/e;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lx4/f;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, Lx4/f;-><init>(Landroid/content/Context;Lx4/h;)V

    .line 6
    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    :try_start_0
    sget-object p1, Ld7/e;->d:Ld7/e;

    .line 10
    .line 11
    sget v0, Ld7/f;->a:I

    .line 12
    .line 13
    invoke-virtual {p1, p0, v0}, Ld7/f;->d(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result p1
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Lx4/b;

    .line 20
    .line 21
    invoke-direct {p1, p0, p2}, Lx4/b;-><init>(Landroid/content/Context;Lx4/h;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :catch_0
    :cond_1
    new-instance p1, Lx4/f;

    .line 26
    .line 27
    invoke-direct {p1, p0, p2}, Lx4/f;-><init>(Landroid/content/Context;Lx4/h;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public static declared-synchronized b()Lx4/c;
    .locals 2

    .line 1
    const-class v0, Lx4/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lx4/c;->b:Lx4/c;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lx4/c;

    .line 9
    .line 10
    invoke-direct {v1}, Lx4/c;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lx4/c;->b:Lx4/c;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lx4/c;->b:Lx4/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    .line 1
    iget-object p3, p0, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lx4/e;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Lx4/e;->d(II)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1
.end method
