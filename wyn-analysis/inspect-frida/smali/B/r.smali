.class public final LB/r;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx0/e;Ljava/lang/String;ZLtf/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LB/r;->i:I

    .line 1
    iput-object p1, p0, LB/r;->k:Ljava/lang/Object;

    iput-object p2, p0, LB/r;->l:Ljava/lang/Object;

    iput-boolean p3, p0, LB/r;->j:Z

    iput-object p4, p0, LB/r;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZLKd/a;LN/V;LD/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LB/r;->i:I

    .line 2
    iput-boolean p1, p0, LB/r;->j:Z

    iput-object p2, p0, LB/r;->k:Ljava/lang/Object;

    iput-object p3, p0, LB/r;->l:Ljava/lang/Object;

    iput-object p4, p0, LB/r;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LB/r;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LB/r;->m:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LB/r;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean v3, p0, LB/r;->j:Z

    .line 8
    .line 9
    iget v4, p0, LB/r;->i:I

    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, LN/C;

    .line 15
    .line 16
    const-string v4, "$this$DisposableEffect"

    .line 17
    .line 18
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    new-instance p1, LB/x;

    .line 24
    .line 25
    check-cast v2, LN/V;

    .line 26
    .line 27
    check-cast v1, LD/i;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {p1, v1, v2, v3}, LB/x;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 31
    .line 32
    .line 33
    check-cast v0, LKd/a;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    invoke-static {v0, v3, p1, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 37
    .line 38
    .line 39
    :cond_0
    new-instance p1, LB/y;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    check-cast p1, Lx0/g;

    .line 46
    .line 47
    const-string v4, "$this$semantics"

    .line 48
    .line 49
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast v0, Lx0/e;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget v0, v0, Lx0/e;->a:I

    .line 57
    .line 58
    invoke-static {p1, v0}, Lx0/p;->b(Lx0/g;I)V

    .line 59
    .line 60
    .line 61
    :cond_1
    new-instance v0, LA0/p;

    .line 62
    .line 63
    check-cast v1, Ltf/a;

    .line 64
    .line 65
    const/4 v4, 0x2

    .line 66
    invoke-direct {v0, v1, v4}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    sget-object v1, Lx0/p;->a:[Lkotlin/reflect/KProperty;

    .line 70
    .line 71
    sget-object v1, Lx0/f;->b:Lx0/q;

    .line 72
    .line 73
    new-instance v4, Lx0/a;

    .line 74
    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct {v4, v2, v0}, Lx0/a;-><init>(Ljava/lang/String;Lef/e;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1, v4}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lef/C;->a:Lef/C;

    .line 84
    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    sget-object v1, Lx0/n;->i:Lx0/q;

    .line 88
    .line 89
    invoke-virtual {p1, v1, v0}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    return-object v0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
