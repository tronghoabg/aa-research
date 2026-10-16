.class public final LQe/f;
.super LHe/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:LLe/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LLe/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LQe/f;->a:I

    iput-object p1, p0, LQe/f;->b:Ljava/lang/Object;

    iput-object p2, p0, LQe/f;->c:LLe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(LHe/b;)V
    .locals 3

    .line 1
    iget v0, p0, LQe/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LSe/i;

    .line 7
    .line 8
    iget-object v1, p0, LQe/f;->c:LLe/c;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v2, p1, v1}, LSe/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, LHe/b;->a(LJe/b;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LQe/f;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, LHe/g;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    new-instance v0, LJe/c;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, v1}, LJe/c;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0}, LHe/b;->a(LJe/b;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, LDd/c;

    .line 35
    .line 36
    const/16 v2, 0xb

    .line 37
    .line 38
    invoke-direct {v1, p0, p1, v0, v2}, LDd/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, LQe/f;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, LQe/e;

    .line 44
    .line 45
    invoke-virtual {p1, v1}, LHe/a;->d(LHe/b;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
