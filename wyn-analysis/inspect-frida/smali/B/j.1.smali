.class public final LB/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/B;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LN/V;

.field public final synthetic c:LD/i;


# direct methods
.method public synthetic constructor <init>(LN/V;LD/i;I)V
    .locals 0

    .line 1
    iput p3, p0, LB/j;->a:I

    iput-object p1, p0, LB/j;->b:LN/V;

    iput-object p2, p0, LB/j;->c:LD/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 3

    .line 1
    iget v0, p0, LB/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB/j;->b:LN/V;

    .line 7
    .line 8
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LD/e;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, LD/f;

    .line 17
    .line 18
    invoke-direct {v2, v1}, LD/f;-><init>(LD/e;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LB/j;->c:LD/i;

    .line 22
    .line 23
    iget-object v1, v1, LD/i;->a:LHf/j0;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, LHf/j0;->b(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-interface {v0, v1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :pswitch_0
    iget-object v0, p0, LB/j;->b:LN/V;

    .line 34
    .line 35
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, LD/a;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    new-instance v2, LD/b;

    .line 44
    .line 45
    invoke-direct {v2, v1}, LD/b;-><init>(LD/a;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LB/j;->c:LD/i;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object v1, v1, LD/i;->a:LHf/j0;

    .line 53
    .line 54
    invoke-virtual {v1, v2}, LHf/j0;->b(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    const/4 v1, 0x0

    .line 58
    invoke-interface {v0, v1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void

    .line 62
    :pswitch_1
    iget-object v0, p0, LB/j;->b:LN/V;

    .line 63
    .line 64
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, LD/k;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    new-instance v2, LD/j;

    .line 73
    .line 74
    invoke-direct {v2, v1}, LD/j;-><init>(LD/k;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, LB/j;->c:LD/i;

    .line 78
    .line 79
    iget-object v1, v1, LD/i;->a:LHf/j0;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, LHf/j0;->b(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-interface {v0, v1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
