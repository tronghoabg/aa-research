.class public final LHf/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LHf/l;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHf/l;LHf/l;Ltf/q;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LHf/a0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LHf/a0;->b:LHf/l;

    iput-object p2, p0, LHf/a0;->c:Ljava/lang/Object;

    check-cast p3, Llf/j;

    iput-object p3, p0, LHf/a0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LHf/l;Lfd/H;Lx1/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LHf/a0;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LHf/a0;->b:LHf/l;

    iput-object p2, p0, LHf/a0;->c:Ljava/lang/Object;

    iput-object p3, p0, LHf/a0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lef/C;->a:Lef/C;

    .line 3
    .line 4
    iget-object v2, p0, LHf/a0;->b:LHf/l;

    .line 5
    .line 6
    iget-object v3, p0, LHf/a0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, LHf/a0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iget v5, p0, LHf/a0;->a:I

    .line 11
    .line 12
    packed-switch v5, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v0, LHf/j;

    .line 16
    .line 17
    check-cast v4, Lx1/e;

    .line 18
    .line 19
    check-cast v3, Lfd/H;

    .line 20
    .line 21
    invoke-direct {v0, p1, v3, v4}, LHf/j;-><init>(LHf/m;Lfd/H;Lx1/e;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v2, v0, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 29
    .line 30
    if-ne p1, p2, :cond_0

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    :cond_0
    return-object v1

    .line 34
    :pswitch_0
    check-cast v3, LHf/l;

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    new-array v5, v5, [LHf/l;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    aput-object v2, v5, v6

    .line 41
    .line 42
    aput-object v3, v5, v0

    .line 43
    .line 44
    new-instance v2, LCd/a;

    .line 45
    .line 46
    check-cast v4, Llf/j;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v2, v4, v3}, LCd/a;-><init>(Ltf/q;Ljf/c;)V

    .line 50
    .line 51
    .line 52
    new-instance v4, LIf/t;

    .line 53
    .line 54
    invoke-direct {v4, v5, v2, p1, v3}, LIf/t;-><init>([LHf/l;LCd/a;LHf/m;Ljf/c;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, LIf/v;

    .line 58
    .line 59
    invoke-interface {p2}, Ljf/c;->getContext()Ljf/h;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {p1, p2, v2}, LJf/q;-><init>(Ljf/c;Ljf/h;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v0, p1, v4}, Lff/B;->L(LJf/q;ZLJf/q;Ltf/p;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 71
    .line 72
    if-ne p1, p2, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object p1, v1

    .line 76
    :goto_0
    if-ne p1, p2, :cond_2

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    :cond_2
    return-object v1

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
