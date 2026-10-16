.class public final synthetic LE5/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv6/o;


# direct methods
.method public synthetic constructor <init>(LF5/a;Lv6/o;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput p1, p0, LE5/E;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LE5/E;->b:Lv6/o;

    return-void
.end method

.method public synthetic constructor <init>(Lv6/o;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LE5/E;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/E;->b:Lv6/o;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, LE5/E;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LF5/j;

    .line 7
    .line 8
    iget-object v0, p1, LF5/j;->o:LS3/e;

    .line 9
    .line 10
    iget-object v1, p0, LE5/E;->b:Lv6/o;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, LS3/e;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LE5/T;

    .line 17
    .line 18
    iget v3, v2, LE5/T;->r:I

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, LE5/T;->a()LE5/S;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget v3, v1, Lv6/o;->a:I

    .line 28
    .line 29
    iput v3, v2, LE5/S;->p:I

    .line 30
    .line 31
    iget v3, v1, Lv6/o;->b:I

    .line 32
    .line 33
    iput v3, v2, LE5/S;->q:I

    .line 34
    .line 35
    new-instance v3, LE5/T;

    .line 36
    .line 37
    invoke-direct {v3, v2}, LE5/T;-><init>(LE5/S;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, LS3/e;

    .line 41
    .line 42
    iget-object v0, v0, LS3/e;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    const/4 v4, 0x5

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-direct {v2, v3, v5, v0, v4}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p1, LF5/j;->o:LS3/e;

    .line 52
    .line 53
    :cond_0
    iget p1, v1, Lv6/o;->a:I

    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_0
    check-cast p1, LE5/u0;

    .line 57
    .line 58
    iget-object v0, p0, LE5/E;->b:Lv6/o;

    .line 59
    .line 60
    invoke-interface {p1, v0}, LE5/u0;->x(Lv6/o;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
