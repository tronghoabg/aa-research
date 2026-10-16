.class public abstract synthetic Lx3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Landroidx/webkit/ProfileStore;
    .locals 2

    .line 1
    sget-object v0, Ly3/o;->j:Ly3/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly3/n;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Ly3/g;->b:Ly3/g;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ly3/g;

    .line 14
    .line 15
    sget-object v1, Ly3/q;->a:Ly3/s;

    .line 16
    .line 17
    invoke-interface {v1}, Ly3/s;->getProfileStore()Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Ly3/g;-><init>(Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ly3/g;->b:Ly3/g;

    .line 25
    .line 26
    :cond_0
    sget-object v0, Ly3/g;->b:Ly3/g;

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static {}, Ly3/o;->a()Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    throw v0
.end method
