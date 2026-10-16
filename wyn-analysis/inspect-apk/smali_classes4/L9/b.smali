.class public final LL9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:LDd/c;


# direct methods
.method public synthetic constructor <init>(ILDd/c;)V
    .locals 0

    .line 1
    iput p1, p0, LL9/b;->a:I

    iput-object p2, p0, LL9/b;->b:LDd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LL9/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LJ9/Y;

    .line 7
    .line 8
    iget-object v1, p0, LL9/b;->b:LDd/c;

    .line 9
    .line 10
    iget-object v1, v1, LDd/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ls8/g;

    .line 13
    .line 14
    invoke-direct {v0, v1}, LJ9/Y;-><init>(Ls8/g;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, LL9/b;->b:LDd/c;

    .line 19
    .line 20
    iget-object v0, v0, LDd/c;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, LP9/d;

    .line 23
    .line 24
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    iget-object v0, p0, LL9/b;->b:LDd/c;

    .line 29
    .line 30
    iget-object v0, v0, LDd/c;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ls8/g;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
