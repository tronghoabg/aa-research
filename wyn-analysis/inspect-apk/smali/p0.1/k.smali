.class public final Lp0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:J

.field public final f:J

.field public final g:Z

.field public final h:I

.field public final i:J

.field public final j:Ljava/util/ArrayList;

.field public k:LVa/zb;


# direct methods
.method public constructor <init>(JJJZJJZILjava/util/ArrayList;J)V
    .locals 17

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move/from16 v7, p7

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    move/from16 v12, p12

    move/from16 v14, p13

    move-wide/from16 v15, p15

    .line 16
    invoke-direct/range {v0 .. v16}, Lp0/k;-><init>(JJJZJJZZIJ)V

    move-object/from16 v1, p14

    .line 17
    iput-object v1, v0, Lp0/k;->j:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(JJJZJJZZIJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lp0/k;->a:J

    .line 3
    iput-wide p3, p0, Lp0/k;->b:J

    .line 4
    iput-wide p5, p0, Lp0/k;->c:J

    .line 5
    iput-boolean p7, p0, Lp0/k;->d:Z

    .line 6
    iput-wide p8, p0, Lp0/k;->e:J

    .line 7
    iput-wide p10, p0, Lp0/k;->f:J

    .line 8
    iput-boolean p12, p0, Lp0/k;->g:Z

    .line 9
    iput p14, p0, Lp0/k;->h:I

    move-wide p1, p15

    .line 10
    iput-wide p1, p0, Lp0/k;->i:J

    .line 11
    new-instance p1, LVa/zb;

    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-boolean p13, p1, LVa/zb;->a:Z

    .line 14
    iput-boolean p13, p1, LVa/zb;->b:Z

    .line 15
    iput-object p1, p0, Lp0/k;->k:LVa/zb;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/k;->k:LVa/zb;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, LVa/zb;->b:Z

    .line 5
    .line 6
    iput-boolean v1, v0, LVa/zb;->a:Z

    .line 7
    .line 8
    return-void
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/k;->k:LVa/zb;

    .line 2
    .line 3
    iget-boolean v1, v0, LVa/zb;->b:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-boolean v0, v0, LVa/zb;->a:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PointerInputChange(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lp0/k;->a:J

    .line 9
    .line 10
    invoke-static {v1, v2}, Lp0/j;->a(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", uptimeMillis="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-wide v1, p0, Lp0/k;->b:J

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", position="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-wide v1, p0, Lp0/k;->c:J

    .line 33
    .line 34
    invoke-static {v1, v2}, Ld0/c;->g(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", pressed="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p0, Lp0/k;->d:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", previousUptimeMillis="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, Lp0/k;->e:J

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", previousPosition="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-wide v1, p0, Lp0/k;->f:J

    .line 67
    .line 68
    invoke-static {v1, v2}, Ld0/c;->g(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", previousPressed="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Lp0/k;->g:Z

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", isConsumed="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lp0/k;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", type="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const/4 v1, 0x1

    .line 103
    iget v2, p0, Lp0/k;->h:I

    .line 104
    .line 105
    if-eq v2, v1, :cond_3

    .line 106
    .line 107
    const/4 v1, 0x2

    .line 108
    if-eq v2, v1, :cond_2

    .line 109
    .line 110
    const/4 v1, 0x3

    .line 111
    if-eq v2, v1, :cond_1

    .line 112
    .line 113
    const/4 v1, 0x4

    .line 114
    if-eq v2, v1, :cond_0

    .line 115
    .line 116
    const-string v1, "Unknown"

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    const-string v1, "Eraser"

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    const-string v1, "Stylus"

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    const-string v1, "Mouse"

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    const-string v1, "Touch"

    .line 129
    .line 130
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", historical="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lp0/k;->j:Ljava/util/ArrayList;

    .line 139
    .line 140
    if-nez v1, :cond_4

    .line 141
    .line 142
    sget-object v1, Lff/v;->a:Lff/v;

    .line 143
    .line 144
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v1, ",scrollDelta="

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-wide v1, p0, Lp0/k;->i:J

    .line 153
    .line 154
    invoke-static {v1, v2}, Ld0/c;->g(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const/16 v1, 0x29

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0
.end method
