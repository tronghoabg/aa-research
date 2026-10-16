.class public final LSe/c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LJe/b;
.implements LHe/h;
.implements LHe/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHe/h;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LSe/c;->a:I

    .line 2
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 3
    iput-object p1, p0, LSe/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;I)V
    .locals 0

    .line 1
    iput p2, p0, LSe/c;->a:I

    iput-object p1, p0, LSe/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LJe/b;)V
    .locals 1

    .line 1
    iget v0, p0, LSe/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget v0, p0, LSe/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onComplete()V
    .locals 9

    .line 1
    iget v0, p0, LSe/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LTe/k;

    .line 9
    .line 10
    iget-object v1, v0, LTe/k;->d:LJe/a;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, LJe/a;->c(LJe/b;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LTe/k;->onComplete()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, LSe/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LTe/j;

    .line 22
    .line 23
    iget-object v1, v0, LTe/j;->d:LJe/a;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, LJe/a;->c(LJe/b;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, LTe/j;->onComplete()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, LSe/c;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LRe/A;

    .line 35
    .line 36
    iget-object v1, v0, LRe/A;->d:LJe/a;

    .line 37
    .line 38
    invoke-virtual {v1, p0}, LJe/a;->c(LJe/b;)Z

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-object v2, v0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    const-wide/16 v3, 0x1

    .line 48
    .line 49
    const v5, 0x7fffffff

    .line 50
    .line 51
    .line 52
    iget v6, v0, LRe/A;->b:I

    .line 53
    .line 54
    if-nez v1, :cond_6

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    const/4 v7, 0x1

    .line 58
    invoke-virtual {v0, v1, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_6

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_0

    .line 69
    .line 70
    move v1, v7

    .line 71
    :cond_0
    iget-object v2, v0, LRe/A;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, LVe/b;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    invoke-virtual {v2}, LVe/b;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    :cond_1
    iget-object v1, v0, LRe/A;->f:LZe/b;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v0, v0, LRe/A;->a:LHe/f;

    .line 99
    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    if-eq v6, v5, :cond_4

    .line 111
    .line 112
    iget-object v1, v0, LRe/A;->i:Lug/b;

    .line 113
    .line 114
    invoke-interface {v1, v3, v4}, Lug/b;->request(J)V

    .line 115
    .line 116
    .line 117
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_5

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    invoke-virtual {v0}, LRe/A;->f()V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 129
    .line 130
    .line 131
    if-eq v6, v5, :cond_7

    .line 132
    .line 133
    iget-object v1, v0, LRe/A;->i:Lug/b;

    .line 134
    .line 135
    invoke-interface {v1, v3, v4}, Lug/b;->request(J)V

    .line 136
    .line 137
    .line 138
    :cond_7
    invoke-virtual {v0}, LRe/A;->c()V

    .line 139
    .line 140
    .line 141
    :goto_0
    return-void

    .line 142
    :pswitch_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, LMe/a;->a:LMe/a;

    .line 147
    .line 148
    if-eq v0, v1, :cond_9

    .line 149
    .line 150
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, LJe/b;

    .line 155
    .line 156
    if-eq v0, v1, :cond_9

    .line 157
    .line 158
    :try_start_0
    iget-object v1, p0, LSe/c;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, LHe/h;

    .line 161
    .line 162
    invoke-interface {v1}, LHe/h;->onComplete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    if-eqz v0, :cond_9

    .line 166
    .line 167
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :catchall_0
    move-exception v1

    .line 172
    if-eqz v0, :cond_8

    .line 173
    .line 174
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 175
    .line 176
    .line 177
    :cond_8
    throw v1

    .line 178
    :cond_9
    :goto_1
    return-void

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget v0, p0, LSe/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LTe/k;

    .line 9
    .line 10
    iget-object v1, v0, LTe/k;->d:LJe/a;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, LJe/a;->c(LJe/b;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, LTe/k;->onError(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, LSe/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LTe/j;

    .line 22
    .line 23
    iget-object v1, v0, LTe/j;->d:LJe/a;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, LJe/a;->c(LJe/b;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, LTe/j;->onError(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, LSe/c;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LRe/A;

    .line 35
    .line 36
    iget-object v1, v0, LRe/A;->d:LJe/a;

    .line 37
    .line 38
    invoke-virtual {v1, p0}, LJe/a;->c(LJe/b;)Z

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, LRe/A;->f:LZe/b;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v2, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    iget-object p1, v0, LRe/A;->i:Lug/b;

    .line 53
    .line 54
    invoke-interface {p1}, Lug/b;->cancel()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, LJe/a;->dispose()V

    .line 58
    .line 59
    .line 60
    iget-object p1, v0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, LRe/A;->c()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_2
    if-nez p1, :cond_1

    .line 74
    .line 75
    new-instance v0, Ljava/lang/NullPointerException;

    .line 76
    .line 77
    const-string v1, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-object v0, p1

    .line 84
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sget-object v2, LMe/a;->a:LMe/a;

    .line 89
    .line 90
    if-eq v1, v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, LJe/b;

    .line 97
    .line 98
    if-eq v1, v2, :cond_3

    .line 99
    .line 100
    :try_start_0
    iget-object p1, p0, LSe/c;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, LHe/h;

    .line 103
    .line 104
    invoke-interface {p1, v0}, LHe/h;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    invoke-interface {v1}, LJe/b;->dispose()V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    if-eqz v1, :cond_2

    .line 115
    .line 116
    invoke-interface {v1}, LJe/b;->dispose()V

    .line 117
    .line 118
    .line 119
    :cond_2
    throw p1

    .line 120
    :cond_3
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    :goto_2
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, LSe/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LRe/A;

    .line 4
    .line 5
    iget-object v1, v0, LRe/A;->d:LJe/a;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, LJe/a;->c(LJe/b;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_6

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_6

    .line 23
    .line 24
    iget-object v3, v0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    move v1, v2

    .line 33
    :cond_0
    iget-object v2, v0, LRe/A;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    cmp-long v2, v2, v4

    .line 42
    .line 43
    if-eqz v2, :cond_4

    .line 44
    .line 45
    iget-object v2, v0, LRe/A;->a:LHe/f;

    .line 46
    .line 47
    invoke-interface {v2, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v0, LRe/A;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, LVe/b;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, LVe/b;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    :cond_1
    iget-object p1, v0, LRe/A;->f:LZe/b;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    iget-object v0, v0, LRe/A;->a:LHe/f;

    .line 80
    .line 81
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    iget-object p1, v0, LRe/A;->a:LHe/f;

    .line 86
    .line 87
    invoke-interface {p1}, LHe/f;->onComplete()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    iget-object p1, v0, LRe/A;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 92
    .line 93
    const-wide/16 v1, 0x1

    .line 94
    .line 95
    invoke-static {p1, v1, v2}, LFe/e;->P(Ljava/util/concurrent/atomic/AtomicLong;J)V

    .line 96
    .line 97
    .line 98
    iget p1, v0, LRe/A;->b:I

    .line 99
    .line 100
    const v3, 0x7fffffff

    .line 101
    .line 102
    .line 103
    if-eq p1, v3, :cond_5

    .line 104
    .line 105
    iget-object p1, v0, LRe/A;->i:Lug/b;

    .line 106
    .line 107
    invoke-interface {p1, v1, v2}, Lug/b;->request(J)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-virtual {v0}, LRe/A;->g()LVe/b;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    monitor-enter v1

    .line 116
    :try_start_0
    invoke-virtual {v1, p1}, LVe/b;->offer(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    :cond_5
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_7

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catchall_0
    move-exception p1

    .line 128
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    throw p1

    .line 130
    :cond_6
    invoke-virtual {v0}, LRe/A;->g()LVe/b;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    monitor-enter v1

    .line 135
    :try_start_2
    invoke-virtual {v1, p1}, LVe/b;->offer(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    iget-object p1, v0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    :goto_1
    return-void

    .line 151
    :cond_7
    invoke-virtual {v0}, LRe/A;->f()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :catchall_1
    move-exception p1

    .line 156
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 157
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LSe/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicReference;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-class v0, LSe/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicReference;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, "{"

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, "}"

    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
