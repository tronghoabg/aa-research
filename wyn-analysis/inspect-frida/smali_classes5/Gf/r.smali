.class public final LGf/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LGf/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LGf/r;->a:I

    iput-object p1, p0, LGf/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LGf/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, LGf/r;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, LEf/o0;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, LEf/z0;->r(Ljava/util/concurrent/CancellationException;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 31
    .line 32
    iget-object p1, p0, LGf/r;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, LEf/U;

    .line 35
    .line 36
    invoke-interface {p1}, LEf/U;->dispose()V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lef/C;->a:Lef/C;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v0, p0, LGf/r;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lp0/r;

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iput-boolean p1, v0, Lp0/r;->c:Z

    .line 56
    .line 57
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 61
    .line 62
    sget-object p1, Lef/C;->a:Lef/C;

    .line 63
    .line 64
    iget-object v0, p0, LGf/r;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, LEf/n;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
