.class public final synthetic LJ9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/u;


# direct methods
.method public synthetic constructor <init>(LJ9/u;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ9/s;->a:I

    iput-object p1, p0, LJ9/s;->b:LJ9/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LJ9/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, LJ9/s;->b:LJ9/u;

    .line 9
    .line 10
    sget-object v0, LSe/e;->a:LSe/e;

    .line 11
    .line 12
    iput-object v0, p1, LJ9/u;->b:LHe/g;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p1, Lta/f;

    .line 16
    .line 17
    iget-object v0, p0, LJ9/s;->b:LJ9/u;

    .line 18
    .line 19
    invoke-static {p1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, v0, LJ9/u;->b:LHe/g;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
