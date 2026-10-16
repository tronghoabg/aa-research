.class public final Laa/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ9/b;


# instance fields
.field public final synthetic a:Laa/n;


# direct methods
.method public constructor <init>(Laa/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laa/m;->a:Laa/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LZ9/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(LZ9/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Laa/m;->a:Laa/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, v0, Laa/n;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    iget-object v0, p0, Laa/m;->a:Laa/n;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Laa/n;->g(LZ9/f;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method
