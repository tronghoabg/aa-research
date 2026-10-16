.class public final LT3/c;
.super LT3/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:LK3/q;


# direct methods
.method public synthetic constructor <init>(LK3/q;I)V
    .locals 0

    .line 1
    iput p2, p0, LT3/c;->c:I

    iput-object p1, p0, LT3/c;->d:LK3/q;

    invoke-direct {p0}, LT3/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 4

    .line 1
    iget v0, p0, LT3/c;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT3/c;->d:LK3/q;

    .line 7
    .line 8
    iget-object v1, v0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 9
    .line 10
    invoke-virtual {v1}, Lk3/m;->c()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, LS3/q;->f()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v3}, LT3/d;->a(LK3/q;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :goto_1
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :pswitch_0
    iget-object v0, p0, LT3/c;->d:LK3/q;

    .line 55
    .line 56
    iget-object v1, v0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 57
    .line 58
    invoke-virtual {v1}, Lk3/m;->c()V

    .line 59
    .line 60
    .line 61
    :try_start_1
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, LS3/q;->g()Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v0, v3}, LT3/d;->a(LK3/q;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    goto :goto_3

    .line 91
    :cond_1
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 95
    .line 96
    .line 97
    iget-object v1, v0, LK3/q;->b:LJ3/b;

    .line 98
    .line 99
    iget-object v2, v0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 100
    .line 101
    iget-object v0, v0, LK3/q;->e:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {v1, v2, v0}, LK3/i;->a(LJ3/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :goto_3
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
