.class public final LJ9/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ldf/a;

.field public final c:LA9/b;


# direct methods
.method public constructor <init>(LA/e0;LK9/a;LA9/c;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, LJ9/W;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p2, p0, LJ9/W;->b:Ldf/a;

    .line 6
    iput-object p3, p0, LJ9/W;->c:LA9/b;

    return-void
.end method

.method public constructor <init>(Ldf/a;LL9/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ9/W;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ9/W;->b:Ldf/a;

    .line 3
    iput-object p2, p0, LJ9/W;->c:LA9/b;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LJ9/W;->c:LA9/b;

    .line 2
    .line 3
    iget-object v1, p0, LJ9/W;->b:Ldf/a;

    .line 4
    .line 5
    iget v2, p0, LJ9/W;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, LK9/a;

    .line 11
    .line 12
    invoke-virtual {v1}, LK9/a;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lmd/d;

    .line 17
    .line 18
    check-cast v0, LA9/c;

    .line 19
    .line 20
    invoke-virtual {v0}, LA9/c;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lmd/b0;

    .line 25
    .line 26
    new-instance v2, Lud/g;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lud/g;-><init>(Lmd/b0;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    new-array v0, v0, [Lud/g;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    aput-object v2, v0, v3

    .line 36
    .line 37
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Lud/g;

    .line 56
    .line 57
    new-instance v3, Lmd/g;

    .line 58
    .line 59
    invoke-direct {v3, v1, v2}, Lmd/g;-><init>(Lmd/d;Lud/g;)V

    .line 60
    .line 61
    .line 62
    move-object v1, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object v0, Lmd/c;->i:Lmd/c;

    .line 65
    .line 66
    sget-object v2, Lud/e;->c:LB8/e;

    .line 67
    .line 68
    sget-object v3, Lud/b;->a:Lud/b;

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3}, Lmd/c;->c(LB8/e;Ljava/lang/Object;)Lmd/c;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v2, Lta/p;

    .line 75
    .line 76
    invoke-direct {v2, v1, v0}, LJ4/d;-><init>(Lmd/d;Lmd/c;)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :pswitch_0
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, LJ9/I;

    .line 85
    .line 86
    check-cast v0, LL9/g;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v0, LM9/a;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v2, LJ9/V;

    .line 97
    .line 98
    invoke-direct {v2, v1, v0}, LJ9/V;-><init>(LJ9/I;LM9/a;)V

    .line 99
    .line 100
    .line 101
    return-object v2

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
