.class public final synthetic LF5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;
.implements LQ1/c;
.implements LQ1/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LP2/m;JI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LF5/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF5/e;->d:Ljava/lang/Object;

    iput-wide p2, p0, LF5/e;->b:J

    iput p4, p0, LF5/e;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IJJI)V
    .locals 0

    .line 2
    iput p7, p0, LF5/e;->a:I

    iput-object p1, p0, LF5/e;->d:Ljava/lang/Object;

    iput p2, p0, LF5/e;->c:I

    iput-wide p3, p0, LF5/e;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 11

    .line 1
    check-cast p1, LP2/a;

    .line 2
    .line 3
    iget-object v0, p0, LF5/e;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LP2/m;

    .line 6
    .line 7
    iget-object v1, v0, LP2/m;->h:LN1/n;

    .line 8
    .line 9
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, LP2/a;->a:Ll8/K;

    .line 13
    .line 14
    iget-wide v2, p1, LP2/a;->c:J

    .line 15
    .line 16
    invoke-static {v2, v3, v1}, Lm9/S;->d(JLl8/K;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, v0, LP2/m;->c:LQ1/o;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    array-length v3, v1

    .line 26
    invoke-virtual {v2, v3, v1}, LQ1/o;->E(I[B)V

    .line 27
    .line 28
    .line 29
    iget-object v3, v0, LP2/m;->a:Ls2/C;

    .line 30
    .line 31
    array-length v4, v1

    .line 32
    invoke-interface {v3, v4, v2}, Ls2/C;->e(ILQ1/o;)V

    .line 33
    .line 34
    .line 35
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    iget-wide v4, p1, LP2/a;->b:J

    .line 41
    .line 42
    cmp-long p1, v4, v2

    .line 43
    .line 44
    iget-wide v2, p0, LF5/e;->b:J

    .line 45
    .line 46
    const-wide v6, 0x7fffffffffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    iget-object p1, v0, LP2/m;->h:LN1/n;

    .line 54
    .line 55
    iget-wide v4, p1, LN1/n;->s:J

    .line 56
    .line 57
    cmp-long p1, v4, v6

    .line 58
    .line 59
    if-nez p1, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    :goto_0
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 65
    .line 66
    .line 67
    :goto_1
    move-wide v5, v2

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    iget-object p1, v0, LP2/m;->h:LN1/n;

    .line 70
    .line 71
    iget-wide v8, p1, LN1/n;->s:J

    .line 72
    .line 73
    cmp-long p1, v8, v6

    .line 74
    .line 75
    if-nez p1, :cond_2

    .line 76
    .line 77
    add-long/2addr v2, v4

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    add-long v2, v4, v8

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :goto_2
    array-length v8, v1

    .line 83
    iget-object v4, v0, LP2/m;->a:Ls2/C;

    .line 84
    .line 85
    iget v7, p0, LF5/e;->c:I

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v10, 0x0

    .line 89
    invoke-interface/range {v4 .. v10}, Ls2/C;->a(JIIILs2/B;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget v0, p0, LF5/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LV1/i;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LF5/e;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LV1/a;

    .line 14
    .line 15
    iget-object v1, v0, LV1/a;->d:Lk2/H;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v0, v0, LV1/a;->b:LN1/N;

    .line 20
    .line 21
    iget-object v2, p1, LV1/i;->b:LV1/f;

    .line 22
    .line 23
    invoke-virtual {v2, v0, v1}, LV1/f;->d(LN1/N;Lk2/H;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p1, LV1/i;->h:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Long;

    .line 34
    .line 35
    iget-object p1, p1, LV1/i;->g:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/lang/Long;

    .line 42
    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    move-wide v6, v4

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    :goto_0
    iget-wide v8, p0, LF5/e;->b:J

    .line 54
    .line 55
    add-long/2addr v6, v8

    .line 56
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    :goto_1
    iget v1, p0, LF5/e;->c:I

    .line 71
    .line 72
    int-to-long v1, v1

    .line 73
    add-long/2addr v4, v1

    .line 74
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void

    .line 82
    :pswitch_0
    check-cast p1, LF5/j;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, LF5/e;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, LF5/a;

    .line 90
    .line 91
    iget-object v1, v0, LF5/a;->d:Lf6/z;

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    iget-object v0, v0, LF5/a;->b:LE5/J0;

    .line 96
    .line 97
    iget-object v2, p1, LF5/j;->b:LF5/h;

    .line 98
    .line 99
    invoke-virtual {v2, v0, v1}, LF5/h;->c(LE5/J0;Lf6/z;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v1, p1, LF5/j;->h:Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/Long;

    .line 110
    .line 111
    iget-object p1, p1, LF5/j;->g:Ljava/util/HashMap;

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Ljava/lang/Long;

    .line 118
    .line 119
    const-wide/16 v4, 0x0

    .line 120
    .line 121
    if-nez v2, :cond_3

    .line 122
    .line 123
    move-wide v6, v4

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 126
    .line 127
    .line 128
    move-result-wide v6

    .line 129
    :goto_2
    iget-wide v8, p0, LF5/e;->b:J

    .line 130
    .line 131
    add-long/2addr v6, v8

    .line 132
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    if-nez v3, :cond_4

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    :goto_3
    iget v1, p0, LF5/e;->c:I

    .line 147
    .line 148
    int-to-long v1, v1

    .line 149
    add-long/2addr v4, v1

    .line 150
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    :cond_5
    return-void

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
