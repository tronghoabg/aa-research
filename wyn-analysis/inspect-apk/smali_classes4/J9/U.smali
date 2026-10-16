.class public final synthetic LJ9/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/b;
.implements LLe/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/V;


# direct methods
.method public synthetic constructor <init>(LJ9/V;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ9/U;->a:I

    iput-object p1, p0, LJ9/U;->b:LJ9/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LJ9/U;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, LJ9/U;->b:LJ9/V;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, LSe/e;->a:LSe/e;

    .line 14
    .line 15
    iput-object v0, p1, LJ9/V;->c:LHe/g;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p1, LJ9/S;

    .line 19
    .line 20
    iget-object v0, p0, LJ9/U;->b:LJ9/V;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, v0, LJ9/V;->c:LHe/g;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, LJ9/S;

    .line 2
    .line 3
    iget-object v0, p0, LJ9/U;->b:LJ9/V;

    .line 4
    .line 5
    iget-object v1, v0, LJ9/V;->a:LJ9/I;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, LB8/c;

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v2, v3, v1, p1}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LQe/b;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-direct {v1, v2, v3}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, LA5/h;

    .line 23
    .line 24
    const/16 v3, 0xe

    .line 25
    .line 26
    invoke-direct {v2, v3, v0, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, LHe/a;->b(LLe/a;)LQe/e;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method
