.class public final Ly3/k;
.super Lx3/f;
.source "SourceFile"


# instance fields
.field public a:Landroid/webkit/WebResourceError;

.field public b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;


# virtual methods
.method public final a()Ljava/lang/CharSequence;
    .locals 2

    .line 1
    sget-object v0, Ly3/o;->a:Ly3/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly3/k;->a:Landroid/webkit/WebResourceError;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Ly3/p;->a:Ltc/j;

    .line 11
    .line 12
    iget-object v1, p0, Ly3/k;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v0, v0, Ltc/j;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertWebResourceError(Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/webkit/WebResourceError;

    .line 27
    .line 28
    iput-object v0, p0, Ly3/k;->a:Landroid/webkit/WebResourceError;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Ly3/k;->a:Landroid/webkit/WebResourceError;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method public final b()I
    .locals 2

    .line 1
    sget-object v0, Ly3/o;->b:Ly3/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly3/k;->a:Landroid/webkit/WebResourceError;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Ly3/p;->a:Ltc/j;

    .line 11
    .line 12
    iget-object v1, p0, Ly3/k;->b:Lorg/chromium/support_lib_boundary/WebResourceErrorBoundaryInterface;

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v0, v0, Ltc/j;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertWebResourceError(Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/webkit/WebResourceError;

    .line 27
    .line 28
    iput-object v0, p0, Ly3/k;->a:Landroid/webkit/WebResourceError;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Ly3/k;->a:Landroid/webkit/WebResourceError;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/webkit/WebResourceError;->getErrorCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    return v0
.end method
