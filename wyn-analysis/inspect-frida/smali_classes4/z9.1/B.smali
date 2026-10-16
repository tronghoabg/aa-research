.class public final Lz9/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LJ9/i;

.field public final b:LJ9/k;

.field public final c:LJ9/j;

.field public final d:LJ9/H;

.field public e:Z

.field public f:LA5/h;

.field public final g:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(LJ9/C;LJ9/H;LJ9/i;LP9/d;LJ9/k;LJ9/j;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lz9/B;->d:LJ9/H;

    .line 8
    .line 9
    iput-object p3, p0, Lz9/B;->a:LJ9/i;

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    iput-boolean p2, p0, Lz9/B;->e:Z

    .line 13
    .line 14
    iput-object p5, p0, Lz9/B;->b:LJ9/k;

    .line 15
    .line 16
    iput-object p6, p0, Lz9/B;->c:LJ9/j;

    .line 17
    .line 18
    iput-object p7, p0, Lz9/B;->g:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    check-cast p4, LP9/c;

    .line 21
    .line 22
    invoke-virtual {p4}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    new-instance p4, Lm9/B;

    .line 27
    .line 28
    const/16 p5, 0x1d

    .line 29
    .line 30
    invoke-direct {p4, p5}, Lm9/B;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p7, p4}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 34
    .line 35
    .line 36
    iget-object p3, p1, LJ9/C;->j:LJ9/b;

    .line 37
    .line 38
    iget-object p3, p3, LJ9/b;->b:LRe/Q;

    .line 39
    .line 40
    sget p4, LHe/c;->a:I

    .line 41
    .line 42
    const-string p4, "source1 is null"

    .line 43
    .line 44
    iget-object p5, p1, LJ9/C;->a:LRe/Q;

    .line 45
    .line 46
    invoke-static {p5, p4}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string p4, "source2 is null"

    .line 50
    .line 51
    invoke-static {p3, p4}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string p4, "source3 is null"

    .line 55
    .line 56
    iget-object p6, p1, LJ9/C;->b:LRe/Q;

    .line 57
    .line 58
    invoke-static {p6, p4}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-array p4, v1, [Lug/a;

    .line 62
    .line 63
    aput-object p5, p4, p2

    .line 64
    .line 65
    aput-object p3, p4, v2

    .line 66
    .line 67
    aput-object p6, p4, v0

    .line 68
    .line 69
    new-instance p2, LRe/m;

    .line 70
    .line 71
    invoke-direct {p2, p4, v2}, LRe/m;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    sget-object p3, LNe/b;->a:Lza/a;

    .line 75
    .line 76
    const-string p4, "maxConcurrency"

    .line 77
    .line 78
    invoke-static {v1, p4}, LNe/b;->b(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget p4, LHe/c;->a:I

    .line 82
    .line 83
    const-string p5, "bufferSize"

    .line 84
    .line 85
    invoke-static {p4, p5}, LNe/b;->b(ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    instance-of p6, p2, LOe/f;

    .line 89
    .line 90
    if-eqz p6, :cond_1

    .line 91
    .line 92
    check-cast p2, LOe/f;

    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-nez p2, :cond_0

    .line 99
    .line 100
    sget-object p2, LRe/u;->b:LRe/u;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    new-instance p6, LRe/S;

    .line 104
    .line 105
    invoke-direct {p6, p2, p3}, LRe/S;-><init>(Ljava/lang/Object;LLe/c;)V

    .line 106
    .line 107
    .line 108
    move-object p2, p6

    .line 109
    goto :goto_0

    .line 110
    :cond_1
    new-instance p3, LRe/h;

    .line 111
    .line 112
    invoke-direct {p3, p2, p4}, LRe/h;-><init>(LRe/m;I)V

    .line 113
    .line 114
    .line 115
    move-object p2, p3

    .line 116
    :goto_0
    new-instance p3, LF5/d;

    .line 117
    .line 118
    const/16 p6, 0x13

    .line 119
    .line 120
    invoke-direct {p3, p6}, LF5/d;-><init>(I)V

    .line 121
    .line 122
    .line 123
    new-instance p6, LRe/p;

    .line 124
    .line 125
    invoke-direct {p6, p2, p3}, LRe/p;-><init>(LHe/c;LF5/d;)V

    .line 126
    .line 127
    .line 128
    iget-object p2, p1, LJ9/C;->f:LJ9/X;

    .line 129
    .line 130
    iget-object p3, p2, LJ9/X;->a:LHe/m;

    .line 131
    .line 132
    const-string p7, "scheduler is null"

    .line 133
    .line 134
    invoke-static {p3, p7}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p4, p5}, LNe/b;->b(ILjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v1, LRe/B;

    .line 141
    .line 142
    invoke-direct {v1, p6, p3, p4}, LRe/B;-><init>(LHe/c;LHe/m;I)V

    .line 143
    .line 144
    .line 145
    new-instance p3, LJ9/w;

    .line 146
    .line 147
    invoke-direct {p3, p1, v2}, LJ9/w;-><init>(LJ9/C;I)V

    .line 148
    .line 149
    .line 150
    const-string p1, "prefetch"

    .line 151
    .line 152
    invoke-static {v0, p1}, LNe/b;->b(ILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    instance-of p1, v1, LOe/f;

    .line 156
    .line 157
    if-eqz p1, :cond_3

    .line 158
    .line 159
    check-cast v1, LOe/f;

    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-nez p1, :cond_2

    .line 166
    .line 167
    sget-object p1, LRe/u;->b:LRe/u;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_2
    new-instance p6, LRe/S;

    .line 171
    .line 172
    invoke-direct {p6, p1, p3}, LRe/S;-><init>(Ljava/lang/Object;LLe/c;)V

    .line 173
    .line 174
    .line 175
    move-object p1, p6

    .line 176
    goto :goto_1

    .line 177
    :cond_3
    new-instance p1, LRe/h;

    .line 178
    .line 179
    invoke-direct {p1, v1, p3}, LRe/h;-><init>(LRe/B;LJ9/w;)V

    .line 180
    .line 181
    .line 182
    :goto_1
    iget-object p2, p2, LJ9/X;->b:LHe/m;

    .line 183
    .line 184
    invoke-static {p2, p7}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {p4, p5}, LNe/b;->b(ILjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance p3, LRe/B;

    .line 191
    .line 192
    invoke-direct {p3, p1, p2, p4}, LRe/B;-><init>(LHe/c;LHe/m;I)V

    .line 193
    .line 194
    .line 195
    new-instance p1, Lo1/c;

    .line 196
    .line 197
    const/16 p2, 0x1a

    .line 198
    .line 199
    invoke-direct {p1, p0, p2}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    new-instance p2, LXe/c;

    .line 203
    .line 204
    invoke-direct {p2, p1}, LXe/c;-><init>(Lo1/c;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p3, p2}, LHe/c;->d(LHe/f;)V

    .line 208
    .line 209
    .line 210
    return-void
.end method
