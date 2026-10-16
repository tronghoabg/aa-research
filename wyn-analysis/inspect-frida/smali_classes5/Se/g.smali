.class public final LSe/g;
.super LSe/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LHe/g;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LSe/g;->b:I

    invoke-direct {p0, p1}, LSe/a;-><init>(LHe/g;)V

    iput-object p2, p0, LSe/g;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 3

    .line 1
    iget v0, p0, LSe/g;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LSe/i;

    .line 7
    .line 8
    iget-object v1, p0, LSe/g;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LHe/g;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v0, v2, p1, v1}, LSe/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LSe/a;->a:LHe/g;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    new-instance v0, LSe/p;

    .line 23
    .line 24
    iget-object v1, p0, LSe/g;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LHe/m;

    .line 27
    .line 28
    invoke-direct {v0, p1, v1}, LSe/p;-><init>(LHe/h;LHe/m;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LSe/a;->a:LHe/g;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    new-instance v0, LSe/f;

    .line 38
    .line 39
    iget-object v1, p0, LSe/g;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, LLe/d;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {v0, p1, v1, v2}, LSe/f;-><init>(LHe/h;LLe/d;I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, LSe/a;->a:LHe/g;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
