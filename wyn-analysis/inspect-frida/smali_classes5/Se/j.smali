.class public final LSe/j;
.super LSe/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:LLe/c;


# direct methods
.method public synthetic constructor <init>(LHe/g;LLe/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LSe/j;->b:I

    invoke-direct {p0, p1}, LSe/a;-><init>(LHe/g;)V

    iput-object p2, p0, LSe/j;->c:LLe/c;

    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 3

    .line 1
    iget v0, p0, LSe/j;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LSe/q;

    .line 7
    .line 8
    iget-object v1, p0, LSe/j;->c:LLe/c;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LSe/q;-><init>(LHe/h;LLe/c;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LSe/a;->a:LHe/g;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    new-instance v0, LQe/d;

    .line 20
    .line 21
    iget-object v1, p0, LSe/j;->c:LLe/c;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v0, p1, v1, v2}, LQe/d;-><init>(LHe/h;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LSe/a;->a:LHe/g;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    new-instance v0, LSe/b;

    .line 34
    .line 35
    iget-object v1, p0, LSe/j;->c:LLe/c;

    .line 36
    .line 37
    invoke-direct {v0, p1, v1}, LSe/b;-><init>(LHe/h;LLe/c;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LSe/a;->a:LHe/g;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
