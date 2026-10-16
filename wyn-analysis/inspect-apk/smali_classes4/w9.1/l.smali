.class public final Lw9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lw9/e;

.field public final b:Lw9/d;

.field public final c:J

.field public final d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:Lme/a;


# direct methods
.method public constructor <init>(Lw9/e;Lw9/d;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw9/l;->a:Lw9/e;

    .line 5
    .line 6
    iput-object p2, p0, Lw9/l;->b:Lw9/d;

    .line 7
    .line 8
    iput-wide p3, p0, Lw9/l;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lw9/l;->d:J

    .line 11
    .line 12
    iput-wide p5, p0, Lw9/l;->e:J

    .line 13
    .line 14
    new-instance p1, Ljava/util/Date;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    iput-wide p1, p0, Lw9/l;->g:J

    .line 24
    .line 25
    const-wide/16 p1, 0x0

    .line 26
    .line 27
    iput-wide p1, p0, Lw9/l;->f:J

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lw9/l;->h:Lme/a;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Lme/a;->n()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p0, Lw9/l;->h:Lme/a;

    .line 11
    .line 12
    :cond_0
    iget-wide v1, p0, Lw9/l;->f:J

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 19
    .line 20
    sub-double/2addr v3, v5

    .line 21
    iget-wide v5, p0, Lw9/l;->f:J

    .line 22
    .line 23
    long-to-double v5, v5

    .line 24
    mul-double/2addr v3, v5

    .line 25
    double-to-long v3, v3

    .line 26
    add-long/2addr v1, v3

    .line 27
    new-instance v3, Ljava/util/Date;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    iget-wide v5, p0, Lw9/l;->g:J

    .line 37
    .line 38
    sub-long/2addr v3, v5

    .line 39
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    sub-long v7, v1, v3

    .line 46
    .line 47
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    iget-wide v9, p0, Lw9/l;->f:J

    .line 52
    .line 53
    cmp-long v5, v9, v5

    .line 54
    .line 55
    if-lez v5, :cond_1

    .line 56
    .line 57
    const-class v5, Lw9/l;

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    iget-wide v9, p0, Lw9/l;->f:J

    .line 68
    .line 69
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const/4 v3, 0x4

    .line 82
    new-array v3, v3, [Ljava/lang/Object;

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    aput-object v6, v3, v4

    .line 86
    .line 87
    aput-object v9, v3, v0

    .line 88
    .line 89
    const/4 v4, 0x2

    .line 90
    aput-object v1, v3, v4

    .line 91
    .line 92
    const/4 v1, 0x3

    .line 93
    aput-object v2, v3, v1

    .line 94
    .line 95
    const-string v1, "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)"

    .line 96
    .line 97
    invoke-static {v5, v1, v0, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    new-instance v0, Lng/a;

    .line 101
    .line 102
    const/16 v1, 0x1b

    .line 103
    .line 104
    invoke-direct {v0, v1, p0, p1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lw9/l;->b:Lw9/d;

    .line 108
    .line 109
    iget-object v1, p0, Lw9/l;->a:Lw9/e;

    .line 110
    .line 111
    invoke-virtual {v1, p1, v7, v8, v0}, Lw9/e;->b(Lw9/d;JLjava/lang/Runnable;)Lme/a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, p0, Lw9/l;->h:Lme/a;

    .line 116
    .line 117
    iget-wide v0, p0, Lw9/l;->f:J

    .line 118
    .line 119
    long-to-double v0, v0

    .line 120
    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    .line 121
    .line 122
    mul-double/2addr v0, v2

    .line 123
    double-to-long v0, v0

    .line 124
    iput-wide v0, p0, Lw9/l;->f:J

    .line 125
    .line 126
    iget-wide v2, p0, Lw9/l;->c:J

    .line 127
    .line 128
    cmp-long p1, v0, v2

    .line 129
    .line 130
    if-gez p1, :cond_2

    .line 131
    .line 132
    iput-wide v2, p0, Lw9/l;->f:J

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    iget-wide v2, p0, Lw9/l;->e:J

    .line 136
    .line 137
    cmp-long p1, v0, v2

    .line 138
    .line 139
    if-lez p1, :cond_3

    .line 140
    .line 141
    iput-wide v2, p0, Lw9/l;->f:J

    .line 142
    .line 143
    :cond_3
    :goto_0
    iget-wide v0, p0, Lw9/l;->d:J

    .line 144
    .line 145
    iput-wide v0, p0, Lw9/l;->e:J

    .line 146
    .line 147
    return-void
.end method
