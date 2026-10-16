.class public final LEf/r;
.super LEf/q0;
.source "SourceFile"

# interfaces
.implements LEf/q;


# instance fields
.field public final e:LEf/s;


# direct methods
.method public constructor <init>(LEf/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LJf/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LEf/r;->e:LEf/s;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LEf/q0;->h()LEf/z0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LEf/z0;->u(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LEf/q0;->h()LEf/z0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LEf/r;->e:LEf/s;

    .line 6
    .line 7
    check-cast v0, LEf/z0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LEf/z0;->q(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method
