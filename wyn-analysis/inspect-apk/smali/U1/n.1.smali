.class public final synthetic LU1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ1/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LU1/P;


# direct methods
.method public synthetic constructor <init>(LU1/P;I)V
    .locals 0

    .line 1
    iput p2, p0, LU1/n;->a:I

    iput-object p1, p0, LU1/n;->b:LU1/P;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LU1/n;->a:I

    .line 2
    .line 3
    check-cast p1, LN1/H;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 9
    .line 10
    iget-object v0, v0, LU1/P;->f:LU1/j;

    .line 11
    .line 12
    invoke-interface {p1, v0}, LN1/H;->C(LN1/E;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 17
    .line 18
    iget-object v0, v0, LU1/P;->f:LU1/j;

    .line 19
    .line 20
    invoke-interface {p1, v0}, LN1/H;->x(LN1/E;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 25
    .line 26
    iget-object v0, v0, LU1/P;->o:LN1/F;

    .line 27
    .line 28
    invoke-interface {p1, v0}, LN1/H;->A(LN1/F;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 33
    .line 34
    invoke-virtual {v0}, LU1/P;->k()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-interface {p1, v0}, LN1/H;->m(Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 43
    .line 44
    iget v0, v0, LU1/P;->n:I

    .line 45
    .line 46
    invoke-interface {p1, v0}, LN1/H;->a(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 51
    .line 52
    iget-boolean v1, v0, LU1/P;->l:Z

    .line 53
    .line 54
    iget v0, v0, LU1/P;->m:I

    .line 55
    .line 56
    invoke-interface {p1, v0, v1}, LN1/H;->i(IZ)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_5
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 61
    .line 62
    iget v0, v0, LU1/P;->e:I

    .line 63
    .line 64
    invoke-interface {p1, v0}, LN1/H;->b(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_6
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 69
    .line 70
    iget-boolean v1, v0, LU1/P;->l:Z

    .line 71
    .line 72
    iget v0, v0, LU1/P;->e:I

    .line 73
    .line 74
    invoke-interface {p1, v0, v1}, LN1/H;->l(IZ)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_7
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 79
    .line 80
    iget-boolean v1, v0, LU1/P;->g:Z

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-boolean v0, v0, LU1/P;->g:Z

    .line 86
    .line 87
    invoke-interface {p1, v0}, LN1/H;->h(Z)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_8
    iget-object v0, p0, LU1/n;->b:LU1/P;

    .line 92
    .line 93
    iget-object v0, v0, LU1/P;->i:Ln2/t;

    .line 94
    .line 95
    iget-object v0, v0, Ln2/t;->d:LN1/V;

    .line 96
    .line 97
    invoke-interface {p1, v0}, LN1/H;->F(LN1/V;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
