.class public final LTe/c;
.super LTe/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LHe/i;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LTe/c;->b:I

    invoke-direct {p0, p1}, LTe/a;-><init>(LHe/i;)V

    iput-object p2, p0, LTe/c;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(LHe/j;)V
    .locals 3

    .line 1
    iget v0, p0, LTe/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LA7/b0;

    .line 7
    .line 8
    iget-object v1, p0, LTe/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LTe/n;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, LA7/b0;-><init>(LHe/j;LTe/n;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LJe/c;

    .line 18
    .line 19
    invoke-interface {p1, v1}, LHe/j;->a(LJe/b;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LTe/a;->a:LHe/i;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    new-instance v0, LTe/f;

    .line 29
    .line 30
    iget-object v1, p0, LTe/c;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LLe/c;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v0, p1, v1, v2}, LTe/f;-><init>(LHe/j;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, LTe/a;->a:LHe/i;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    new-instance v0, LTe/j;

    .line 45
    .line 46
    iget-object v1, p0, LTe/c;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, LJ9/U;

    .line 49
    .line 50
    invoke-direct {v0, p1, v1}, LTe/j;-><init>(LHe/j;LJ9/U;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, LTe/a;->a:LHe/i;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    new-instance v0, LTe/f;

    .line 60
    .line 61
    iget-object v1, p0, LTe/c;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, LJ9/T;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-direct {v0, p1, v1, v2}, LTe/f;-><init>(LHe/j;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, LTe/a;->a:LHe/i;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_3
    new-instance v0, LTe/b;

    .line 76
    .line 77
    iget-object v1, p0, LTe/c;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, LNe/a;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    invoke-direct {v0, p1, v1, v2}, LTe/b;-><init>(Ljava/lang/Object;LNe/a;I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, LTe/a;->a:LHe/i;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
