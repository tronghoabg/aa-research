.class public final LL9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lxa/d;


# direct methods
.method public synthetic constructor <init>(Lxa/d;I)V
    .locals 0

    .line 1
    iput p2, p0, LL9/e;->a:I

    iput-object p1, p0, LL9/e;->b:Lxa/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LL9/e;->b:Lxa/d;

    .line 2
    .line 3
    iget v1, p0, LL9/e;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LJ9/H;

    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v1, LB8/b;

    .line 14
    .line 15
    const/16 v2, 0x12

    .line 16
    .line 17
    invoke-direct {v1, v0, v2}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    sget v0, LHe/c;->a:I

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    const-string v2, "mode is null"

    .line 24
    .line 25
    invoke-static {v0, v2}, LN0/a;->n(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, LRe/m;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, v1, v2}, LRe/m;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LHe/c;->c()LRe/Q;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, LRe/Q;->f()V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
