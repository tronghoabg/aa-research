.class public abstract LK/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/L0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LK/f;->r:LK/f;

    .line 2
    .line 3
    new-instance v1, LN/L0;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LN/f0;-><init>(Ltf/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, LK/M;->a:LN/L0;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lz0/p;LE0/o;)Lz0/p;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lz0/p;->a:Lz0/j;

    .line 4
    .line 5
    iget-object v2, v1, Lz0/j;->f:LE0/o;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v1, v1, Lz0/j;->a:LK0/g;

    .line 11
    .line 12
    invoke-interface {v1}, LK0/g;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-object v3, v0, Lz0/p;->a:Lz0/j;

    .line 17
    .line 18
    iget-wide v6, v3, Lz0/j;->b:J

    .line 19
    .line 20
    iget-object v0, v0, Lz0/p;->b:Lz0/h;

    .line 21
    .line 22
    iget-object v4, v0, Lz0/h;->a:LK0/c;

    .line 23
    .line 24
    new-instance v5, Lz0/p;

    .line 25
    .line 26
    move-object v9, v4

    .line 27
    new-instance v4, Lz0/j;

    .line 28
    .line 29
    iget-object v8, v3, Lz0/j;->a:LK0/g;

    .line 30
    .line 31
    invoke-interface {v8}, LK0/g;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v10

    .line 35
    invoke-static {v1, v2, v10, v11}, Le0/q;->b(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    if-eqz v10, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-wide v10, Le0/q;->i:J

    .line 43
    .line 44
    cmp-long v8, v1, v10

    .line 45
    .line 46
    if-eqz v8, :cond_2

    .line 47
    .line 48
    new-instance v8, LK0/b;

    .line 49
    .line 50
    invoke-direct {v8, v1, v2}, LK0/b;-><init>(J)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object v1, LK0/f;->a:LK0/f;

    .line 55
    .line 56
    move-object v8, v1

    .line 57
    :goto_0
    iget-object v1, v3, Lz0/j;->m:LK0/d;

    .line 58
    .line 59
    iget-object v2, v3, Lz0/j;->n:Le0/D;

    .line 60
    .line 61
    move-object v10, v5

    .line 62
    move-object v5, v8

    .line 63
    iget-object v8, v3, Lz0/j;->c:LE0/l;

    .line 64
    .line 65
    move-object v11, v9

    .line 66
    iget-object v9, v3, Lz0/j;->d:LE0/j;

    .line 67
    .line 68
    move-object v12, v10

    .line 69
    iget-object v10, v3, Lz0/j;->e:LE0/k;

    .line 70
    .line 71
    move-object v13, v12

    .line 72
    iget-object v12, v3, Lz0/j;->g:Ljava/lang/String;

    .line 73
    .line 74
    move-object v15, v13

    .line 75
    iget-wide v13, v3, Lz0/j;->h:J

    .line 76
    .line 77
    move-object/from16 v16, v15

    .line 78
    .line 79
    iget-object v15, v3, Lz0/j;->i:LK0/a;

    .line 80
    .line 81
    move-object/from16 v20, v1

    .line 82
    .line 83
    iget-object v1, v3, Lz0/j;->j:LK0/h;

    .line 84
    .line 85
    move-object/from16 v17, v1

    .line 86
    .line 87
    iget-object v1, v3, Lz0/j;->k:LG0/c;

    .line 88
    .line 89
    move-object/from16 v18, v1

    .line 90
    .line 91
    move-object/from16 v21, v2

    .line 92
    .line 93
    iget-wide v1, v3, Lz0/j;->l:J

    .line 94
    .line 95
    move-wide/from16 v22, v1

    .line 96
    .line 97
    move-object/from16 v2, v16

    .line 98
    .line 99
    move-object/from16 v16, v17

    .line 100
    .line 101
    move-object/from16 v17, v18

    .line 102
    .line 103
    move-wide/from16 v18, v22

    .line 104
    .line 105
    move-object v1, v11

    .line 106
    move-object/from16 v11, p1

    .line 107
    .line 108
    invoke-direct/range {v4 .. v21}, Lz0/j;-><init>(LK0/g;JLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;)V

    .line 109
    .line 110
    .line 111
    new-instance v8, Lz0/h;

    .line 112
    .line 113
    iget-wide v11, v0, Lz0/h;->c:J

    .line 114
    .line 115
    iget-object v13, v0, Lz0/h;->d:LK0/i;

    .line 116
    .line 117
    iget-object v10, v0, Lz0/h;->b:LK0/e;

    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    move-object v9, v1

    .line 121
    invoke-direct/range {v8 .. v14}, Lz0/h;-><init>(LK0/c;LK0/e;JLK0/i;LS3/f;)V

    .line 122
    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-direct {v2, v4, v8, v0}, Lz0/p;-><init>(Lz0/j;Lz0/h;I)V

    .line 126
    .line 127
    .line 128
    return-object v2
.end method
