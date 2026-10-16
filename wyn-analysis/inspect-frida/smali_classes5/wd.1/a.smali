.class public final synthetic Lwd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lwd/c;


# direct methods
.method public synthetic constructor <init>(Lwd/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lwd/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/a;->b:Lwd/c;

    return-void
.end method

.method public synthetic constructor <init>(Lwd/c;LGd/a;)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput p2, p0, Lwd/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/a;->b:Lwd/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwd/a;->a:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lwd/a;->b:Lwd/c;

    .line 11
    .line 12
    iget-object p1, p1, Lwd/c;->j:Ly3/j;

    .line 13
    .line 14
    sget-object v0, LHd/a;->e:Lwa/a;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ly3/j;->q(Lwa/a;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lwd/a;->b:Lwd/c;

    .line 25
    .line 26
    iget-object p1, p1, Lwd/c;->a:LAd/e;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p1, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
