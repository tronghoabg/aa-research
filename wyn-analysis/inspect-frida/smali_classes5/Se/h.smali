.class public final LSe/h;
.super LHe/g;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LSe/h;->a:I

    iput-object p2, p0, LSe/h;->b:Ljava/lang/Object;

    iput-object p3, p0, LSe/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 6

    .line 1
    iget v0, p0, LSe/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [LHe/g;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    aget-object v0, v0, v3

    .line 16
    .line 17
    new-instance v1, LQe/d;

    .line 18
    .line 19
    new-instance v2, LY9/c;

    .line 20
    .line 21
    const/16 v3, 0x17

    .line 22
    .line 23
    invoke-direct {v2, p0, v3}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v1, p1, v2, v3}, LQe/d;-><init>(LHe/h;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, LHe/g;->b(LHe/h;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    new-instance v2, LSe/v;

    .line 35
    .line 36
    iget-object v4, p0, LSe/h;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Lx4/d;

    .line 39
    .line 40
    invoke-direct {v2, p1, v1, v4}, LSe/v;-><init>(LHe/h;ILx4/d;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v2}, LHe/h;->a(LJe/b;)V

    .line 44
    .line 45
    .line 46
    move p1, v3

    .line 47
    :goto_0
    if-ge p1, v1, :cond_5

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-gtz v4, :cond_1

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/4 v4, 0x0

    .line 58
    :goto_1
    if-eqz v4, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    aget-object v4, v0, p1

    .line 62
    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    new-instance v0, Ljava/lang/NullPointerException;

    .line 66
    .line 67
    const-string v1, "One of the sources is null"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-lez v1, :cond_3

    .line 77
    .line 78
    invoke-virtual {v2, p1}, LSe/v;->a(I)V

    .line 79
    .line 80
    .line 81
    iget-object p1, v2, LSe/v;->a:LHe/h;

    .line 82
    .line 83
    invoke-interface {p1, v0}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    iget-object v5, v2, LSe/v;->c:[LSe/w;

    .line 92
    .line 93
    aget-object v5, v5, p1

    .line 94
    .line 95
    invoke-virtual {v4, v5}, LHe/g;->b(LHe/h;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 p1, p1, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    :goto_2
    return-void

    .line 102
    :pswitch_0
    new-instance v0, LSe/f;

    .line 103
    .line 104
    iget-object v1, p0, LSe/h;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, LLe/d;

    .line 107
    .line 108
    const/4 v2, 0x1

    .line 109
    invoke-direct {v0, p1, v1, v2}, LSe/f;-><init>(LHe/h;LLe/d;I)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, LSe/h;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, LHe/n;

    .line 115
    .line 116
    invoke-virtual {p1, v0}, LHe/n;->b(LHe/o;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
