.class public final LL9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:LG9/e;


# direct methods
.method public synthetic constructor <init>(ILG9/e;)V
    .locals 0

    .line 1
    iput p1, p0, LL9/d;->a:I

    iput-object p2, p0, LL9/d;->b:LG9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LL9/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LL9/d;->b:LG9/e;

    .line 7
    .line 8
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, LL9/d;->b:LG9/e;

    .line 17
    .line 18
    iget-object v0, v0, LG9/e;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    iget-object v0, p0, LL9/d;->b:LG9/e;

    .line 27
    .line 28
    iget-object v0, v0, LG9/e;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    invoke-static {v0}, LFe/b;->l(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
