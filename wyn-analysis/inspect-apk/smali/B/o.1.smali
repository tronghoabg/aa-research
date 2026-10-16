.class public final LB/o;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LB/o;->i:I

    iput-boolean p3, p0, LB/o;->j:Z

    iput-object p2, p0, LB/o;->k:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LB/o;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget-boolean v1, p0, LB/o;->j:Z

    .line 4
    .line 5
    iget v2, p0, LB/o;->i:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ln0/b;

    .line 11
    .line 12
    iget-object p1, p1, Ln0/b;->a:Landroid/view/KeyEvent;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    sget v1, LB/u;->b:I

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    if-eq v1, v3, :cond_0

    .line 27
    .line 28
    move v1, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x2

    .line 33
    :goto_0
    if-ne v1, v3, :cond_3

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {p1}, Lka/e0;->a(I)J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    const/16 p1, 0x20

    .line 44
    .line 45
    shr-long/2addr v4, p1

    .line 46
    long-to-int p1, v4

    .line 47
    const/16 v1, 0x17

    .line 48
    .line 49
    if-eq p1, v1, :cond_2

    .line 50
    .line 51
    const/16 v1, 0x42

    .line 52
    .line 53
    if-eq p1, v1, :cond_2

    .line 54
    .line 55
    const/16 v1, 0xa0

    .line 56
    .line 57
    if-eq p1, v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    check-cast v0, Ltf/a;

    .line 61
    .line 62
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move v2, v3

    .line 66
    :cond_3
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :pswitch_0
    check-cast p1, Ld0/c;

    .line 72
    .line 73
    iget-wide v2, p1, Ld0/c;->a:J

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    check-cast v0, LN/V;

    .line 78
    .line 79
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ltf/a;

    .line 84
    .line 85
    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
