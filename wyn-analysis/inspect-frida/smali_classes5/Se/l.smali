.class public final LSe/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe/b;
.implements LJe/b;
.implements LHe/h;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public c:LJe/b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LSe/l;->a:I

    iput-object p1, p0, LSe/l;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget v0, p0, LSe/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/l;->c:LJe/b;

    .line 7
    .line 8
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, LSe/l;->c:LJe/b;

    .line 15
    .line 16
    iget-object p1, p0, LSe/l;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LHe/o;

    .line 19
    .line 20
    invoke-interface {p1, p0}, LHe/o;->a(LJe/b;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, LSe/l;->c:LJe/b;

    .line 25
    .line 26
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iput-object p1, p0, LSe/l;->c:LJe/b;

    .line 33
    .line 34
    iget-object p1, p0, LSe/l;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LHe/h;

    .line 37
    .line 38
    invoke-interface {p1, p0}, LHe/h;->a(LJe/b;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    :pswitch_1
    iget-object v0, p0, LSe/l;->c:LJe/b;

    .line 43
    .line 44
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iput-object p1, p0, LSe/l;->c:LJe/b;

    .line 51
    .line 52
    iget-object p1, p0, LSe/l;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, LHe/h;

    .line 55
    .line 56
    invoke-interface {p1, p0}, LHe/h;->a(LJe/b;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget v0, p0, LSe/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/l;->c:LJe/b;

    .line 7
    .line 8
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 9
    .line 10
    .line 11
    sget-object v0, LMe/a;->a:LMe/a;

    .line 12
    .line 13
    iput-object v0, p0, LSe/l;->c:LJe/b;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LSe/l;->c:LJe/b;

    .line 17
    .line 18
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, LSe/l;->c:LJe/b;

    .line 23
    .line 24
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 25
    .line 26
    .line 27
    sget-object v0, LMe/a;->a:LMe/a;

    .line 28
    .line 29
    iput-object v0, p0, LSe/l;->c:LJe/b;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onComplete()V
    .locals 2

    .line 1
    iget v0, p0, LSe/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LMe/a;->a:LMe/a;

    .line 7
    .line 8
    iput-object v0, p0, LSe/l;->c:LJe/b;

    .line 9
    .line 10
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    iget-object v1, p0, LSe/l;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LHe/o;

    .line 15
    .line 16
    invoke-interface {v1, v0}, LHe/o;->onSuccess(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object v1, p0, LSe/l;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, LHe/h;

    .line 25
    .line 26
    invoke-interface {v1, v0}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    sget-object v0, LMe/a;->a:LMe/a;

    .line 31
    .line 32
    iput-object v0, p0, LSe/l;->c:LJe/b;

    .line 33
    .line 34
    iget-object v0, p0, LSe/l;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LHe/h;

    .line 37
    .line 38
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, LSe/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LMe/a;->a:LMe/a;

    .line 7
    .line 8
    iput-object v0, p0, LSe/l;->c:LJe/b;

    .line 9
    .line 10
    iget-object v0, p0, LSe/l;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LHe/o;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LHe/o;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LSe/l;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LHe/h;

    .line 21
    .line 22
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    sget-object v0, LMe/a;->a:LMe/a;

    .line 27
    .line 28
    iput-object v0, p0, LSe/l;->c:LJe/b;

    .line 29
    .line 30
    iget-object v0, p0, LSe/l;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LHe/h;

    .line 33
    .line 34
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget p1, p0, LSe/l;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, LMe/a;->a:LMe/a;

    .line 7
    .line 8
    iput-object p1, p0, LSe/l;->c:LJe/b;

    .line 9
    .line 10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    iget-object v0, p0, LSe/l;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LHe/o;

    .line 15
    .line 16
    invoke-interface {v0, p1}, LHe/o;->onSuccess(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object v0, p0, LSe/l;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LHe/h;

    .line 25
    .line 26
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
