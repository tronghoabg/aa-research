.class public final synthetic LJ9/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/c;
.implements LLe/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/V;

.field public final synthetic c:LN9/b;


# direct methods
.method public synthetic constructor <init>(LJ9/V;LN9/b;I)V
    .locals 0

    .line 1
    iput p3, p0, LJ9/T;->a:I

    iput-object p1, p0, LJ9/T;->b:LJ9/V;

    iput-object p2, p0, LJ9/T;->c:LN9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LJ9/T;->a:I

    .line 2
    .line 3
    check-cast p1, LJ9/S;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LJ9/T;->b:LJ9/V;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LJ9/T;->c:LN9/b;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LJ9/V;->b()LJ9/O;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, LJ9/S;->d(LJ9/O;)LJ9/O;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget-object v0, p0, LJ9/T;->b:LJ9/V;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LJ9/T;->c:LN9/b;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, LJ9/V;->b()LJ9/O;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1, v2}, LJ9/S;->d(LJ9/O;)LJ9/O;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "The item is null"

    .line 46
    .line 47
    invoke-static {v2, v3}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v4, LTe/n;

    .line 51
    .line 52
    invoke-direct {v4, v2}, LTe/n;-><init>(LJ9/O;)V

    .line 53
    .line 54
    .line 55
    new-instance v2, LJ9/T;

    .line 56
    .line 57
    const/4 v5, 0x1

    .line 58
    invoke-direct {v2, v0, v1, v5}, LJ9/T;-><init>(LJ9/V;LN9/b;I)V

    .line 59
    .line 60
    .line 61
    new-instance v5, LTe/c;

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    invoke-direct {v5, v4, v2, v6}, LTe/c;-><init>(LHe/i;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, LJ9/V;->b()LJ9/O;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2, v3}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, LTe/n;

    .line 75
    .line 76
    invoke-direct {v3, v2}, LTe/n;-><init>(LJ9/O;)V

    .line 77
    .line 78
    .line 79
    new-instance v2, LTe/c;

    .line 80
    .line 81
    const/4 v4, 0x4

    .line 82
    invoke-direct {v2, v5, v3, v4}, LTe/c;-><init>(LHe/i;Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    new-instance v3, LA5/h;

    .line 86
    .line 87
    const/16 v4, 0xd

    .line 88
    .line 89
    invoke-direct {v3, v4, p1, v1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, LTe/c;

    .line 93
    .line 94
    const/4 v1, 0x3

    .line 95
    invoke-direct {p1, v2, v3, v1}, LTe/c;-><init>(LHe/i;Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    new-instance v1, LJ9/U;

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    invoke-direct {v1, v0, v2}, LJ9/U;-><init>(LJ9/V;I)V

    .line 102
    .line 103
    .line 104
    new-instance v0, LTe/l;

    .line 105
    .line 106
    invoke-direct {v0, p1, v1}, LTe/l;-><init>(LTe/c;LJ9/U;)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    iget v0, p0, LJ9/T;->a:I

    .line 2
    .line 3
    check-cast p1, LJ9/O;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LJ9/T;->b:LJ9/V;

    .line 9
    .line 10
    iget-object v0, v0, LJ9/V;->b:LM9/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-virtual {p1}, LJ9/O;->f()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    sub-long/2addr v0, v2

    .line 24
    iget-object v2, p0, LJ9/T;->c:LN9/b;

    .line 25
    .line 26
    iget-wide v3, v2, LN9/b;->b:J

    .line 27
    .line 28
    cmp-long v0, v0, v3

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, LJ9/O;->getValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iget-wide v2, v2, LN9/b;->a:J

    .line 38
    .line 39
    cmp-long p1, v0, v2

    .line 40
    .line 41
    if-gez p1, :cond_1

    .line 42
    .line 43
    :goto_0
    const/4 p1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    :goto_1
    return p1

    .line 47
    :pswitch_0
    iget-object v0, p0, LJ9/T;->b:LJ9/V;

    .line 48
    .line 49
    iget-object v0, v0, LJ9/V;->b:LM9/a;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-virtual {p1}, LJ9/O;->f()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    sub-long/2addr v0, v2

    .line 63
    iget-object p1, p0, LJ9/T;->c:LN9/b;

    .line 64
    .line 65
    iget-wide v2, p1, LN9/b;->b:J

    .line 66
    .line 67
    cmp-long p1, v0, v2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    if-lez p1, :cond_2

    .line 71
    .line 72
    move p1, v0

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const/4 p1, 0x0

    .line 75
    :goto_2
    xor-int/2addr p1, v0

    .line 76
    return p1

    .line 77
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
