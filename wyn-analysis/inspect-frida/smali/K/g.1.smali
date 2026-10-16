.class public abstract LK/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/L0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LK/f;->j:LK/f;

    .line 2
    .line 3
    new-instance v1, LN/L0;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, LK/g;->a:LN/L0;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(LK/e;J)J
    .locals 4

    .line 1
    const-string v0, "$this$contentColorFor"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LK/e;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {p1, p2, v0, v1}, Le0/q;->b(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, LK/e;->h:LN/Y;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Le0/q;

    .line 23
    .line 24
    iget-wide p0, p0, Le0/q;->a:J

    .line 25
    .line 26
    return-wide p0

    .line 27
    :cond_0
    iget-object v0, p0, LK/e;->b:LN/Y;

    .line 28
    .line 29
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Le0/q;

    .line 34
    .line 35
    iget-wide v2, v0, Le0/q;->a:J

    .line 36
    .line 37
    invoke-static {p1, p2, v2, v3}, Le0/q;->b(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Le0/q;

    .line 48
    .line 49
    iget-wide p0, p0, Le0/q;->a:J

    .line 50
    .line 51
    return-wide p0

    .line 52
    :cond_1
    iget-object v0, p0, LK/e;->c:LN/Y;

    .line 53
    .line 54
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Le0/q;

    .line 59
    .line 60
    iget-wide v0, v0, Le0/q;->a:J

    .line 61
    .line 62
    invoke-static {p1, p2, v0, v1}, Le0/q;->b(JJ)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v1, p0, LK/e;->i:LN/Y;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Le0/q;

    .line 75
    .line 76
    iget-wide p0, p0, Le0/q;->a:J

    .line 77
    .line 78
    return-wide p0

    .line 79
    :cond_2
    iget-object v0, p0, LK/e;->d:LN/Y;

    .line 80
    .line 81
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Le0/q;

    .line 86
    .line 87
    iget-wide v2, v0, Le0/q;->a:J

    .line 88
    .line 89
    invoke-static {p1, p2, v2, v3}, Le0/q;->b(JJ)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Le0/q;

    .line 100
    .line 101
    iget-wide p0, p0, Le0/q;->a:J

    .line 102
    .line 103
    return-wide p0

    .line 104
    :cond_3
    iget-object v0, p0, LK/e;->e:LN/Y;

    .line 105
    .line 106
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Le0/q;

    .line 111
    .line 112
    iget-wide v0, v0, Le0/q;->a:J

    .line 113
    .line 114
    invoke-static {p1, p2, v0, v1}, Le0/q;->b(JJ)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_4

    .line 119
    .line 120
    iget-object p0, p0, LK/e;->j:LN/Y;

    .line 121
    .line 122
    invoke-virtual {p0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Le0/q;

    .line 127
    .line 128
    iget-wide p0, p0, Le0/q;->a:J

    .line 129
    .line 130
    return-wide p0

    .line 131
    :cond_4
    invoke-virtual {p0}, LK/e;->c()J

    .line 132
    .line 133
    .line 134
    move-result-wide v0

    .line 135
    invoke-static {p1, p2, v0, v1}, Le0/q;->b(JJ)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    invoke-virtual {p0}, LK/e;->a()J

    .line 142
    .line 143
    .line 144
    move-result-wide p0

    .line 145
    return-wide p0

    .line 146
    :cond_5
    iget-object v0, p0, LK/e;->g:LN/Y;

    .line 147
    .line 148
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Le0/q;

    .line 153
    .line 154
    iget-wide v0, v0, Le0/q;->a:J

    .line 155
    .line 156
    invoke-static {p1, p2, v0, v1}, Le0/q;->b(JJ)Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-eqz p1, :cond_6

    .line 161
    .line 162
    iget-object p0, p0, LK/e;->l:LN/Y;

    .line 163
    .line 164
    invoke-virtual {p0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, Le0/q;

    .line 169
    .line 170
    iget-wide p0, p0, Le0/q;->a:J

    .line 171
    .line 172
    return-wide p0

    .line 173
    :cond_6
    sget-wide p0, Le0/q;->i:J

    .line 174
    .line 175
    return-wide p0
.end method

.method public static final b(JLN/o;)J
    .locals 2

    .line 1
    sget-object v0, LK/g;->a:LN/L0;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LK/e;

    .line 8
    .line 9
    invoke-static {v0, p0, p1}, LK/g;->a(LK/e;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    sget-wide v0, Le0/q;->i:J

    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    return-wide p0

    .line 20
    :cond_0
    sget-object p0, LK/i;->a:LN/D;

    .line 21
    .line 22
    invoke-virtual {p2, p0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Le0/q;

    .line 27
    .line 28
    iget-wide p0, p0, Le0/q;->a:J

    .line 29
    .line 30
    return-wide p0
.end method

.method public static c(JJIJ)LK/e;
    .locals 28

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide v0, 0xff6200eeL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Le0/z;->c(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    move-wide v3, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide/from16 v3, p0

    .line 17
    .line 18
    :goto_0
    and-int/lit8 v0, p4, 0x2

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-wide v0, 0xff3700b3L

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Le0/z;->c(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    move-wide v5, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-wide/from16 v5, p2

    .line 34
    .line 35
    :goto_1
    and-int/lit8 v0, p4, 0x4

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-wide v0, 0xff03dac6L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Le0/z;->c(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    move-wide v7, v0

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-wide/from16 v7, p5

    .line 51
    .line 52
    :goto_2
    const-wide v0, 0xff018786L

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Le0/z;->c(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide v9

    .line 61
    sget-wide v11, Le0/q;->d:J

    .line 62
    .line 63
    const-wide v0, 0xffb00020L

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Le0/z;->c(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v15

    .line 72
    sget-wide v19, Le0/q;->b:J

    .line 73
    .line 74
    new-instance v2, LK/e;

    .line 75
    .line 76
    const/16 v27, 0x1

    .line 77
    .line 78
    move-wide v13, v11

    .line 79
    move-wide/from16 v17, v11

    .line 80
    .line 81
    move-wide/from16 v21, v19

    .line 82
    .line 83
    move-wide/from16 v23, v19

    .line 84
    .line 85
    move-wide/from16 v25, v11

    .line 86
    .line 87
    invoke-direct/range {v2 .. v27}, LK/e;-><init>(JJJJJJJJJJJJZ)V

    .line 88
    .line 89
    .line 90
    return-object v2
.end method
