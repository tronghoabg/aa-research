.class public final Lt6/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/l;


# instance fields
.field public final a:Lt6/l;

.field public b:J

.field public c:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lt6/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lt6/J;->a:Lt6/l;

    .line 8
    .line 9
    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 10
    .line 11
    iput-object p1, p0, Lt6/J;->c:Landroid/net/Uri;

    .line 12
    .line 13
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/J;->a:Lt6/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lt6/l;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/J;->a:Lt6/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lt6/l;->d()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/J;->a:Lt6/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lt6/l;->k()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    iget-object v0, p0, Lt6/J;->a:Lt6/l;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lt6/i;->read([BII)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, -0x1

    .line 8
    if-eq p1, p2, :cond_0

    .line 9
    .line 10
    iget-wide p2, p0, Lt6/J;->b:J

    .line 11
    .line 12
    int-to-long v0, p1

    .line 13
    add-long/2addr p2, v0

    .line 14
    iput-wide p2, p0, Lt6/J;->b:J

    .line 15
    .line 16
    :cond_0
    return p1
.end method

.method public final t(Lt6/n;)J
    .locals 3

    .line 1
    iget-object v0, p1, Lt6/n;->a:Landroid/net/Uri;

    .line 2
    .line 3
    iput-object v0, p0, Lt6/J;->c:Landroid/net/Uri;

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v0, p0, Lt6/J;->a:Lt6/l;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lt6/l;->t(Lt6/n;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-interface {v0}, Lt6/l;->k()Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lt6/J;->c:Landroid/net/Uri;

    .line 21
    .line 22
    invoke-interface {v0}, Lt6/l;->d()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    return-wide v1
.end method

.method public final z(Lt6/K;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt6/J;->a:Lt6/l;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lt6/l;->z(Lt6/K;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
