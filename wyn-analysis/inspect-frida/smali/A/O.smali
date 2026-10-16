.class public final LA/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/K0;


# instance fields
.field public final a:LS3/e;

.field public final b:LN/Y;

.field public final c:LN/Y;

.field public final d:LN/Y;

.field public final e:LN/Y;

.field public final f:LN/Y;

.field public final g:LN/Y;

.field public final h:LN/Y;

.field public i:LA/n;

.field public final j:LA/F;

.field public final synthetic k:LA/U;


# direct methods
.method public constructor <init>(LA/U;Ljava/lang/Object;LA/n;LS3/e;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "initialVelocityVector"

    .line 5
    .line 6
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "typeConverter"

    .line 10
    .line 11
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "label"

    .line 15
    .line 16
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LA/O;->k:LA/U;

    .line 20
    .line 21
    iput-object p4, p0, LA/O;->a:LS3/e;

    .line 22
    .line 23
    sget-object p1, LN/P;->f:LN/P;

    .line 24
    .line 25
    invoke-static {p2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 26
    .line 27
    .line 28
    move-result-object p5

    .line 29
    iput-object p5, p0, LA/O;->b:LN/Y;

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {v0, v1}, LA/t;->i(ILjava/lang/Object;)LA/F;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, LA/O;->c:LN/Y;

    .line 42
    .line 43
    new-instance v2, LA/L;

    .line 44
    .line 45
    invoke-virtual {p0}, LA/O;->b()LA/u;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p5}, LN/Y;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    move-object v5, p2

    .line 54
    move-object v7, p3

    .line 55
    move-object v4, p4

    .line 56
    invoke-direct/range {v2 .. v7}, LA/L;-><init>(LA/i;LS3/e;Ljava/lang/Object;Ljava/lang/Object;LA/n;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iput-object p2, p0, LA/O;->d:LN/Y;

    .line 64
    .line 65
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-static {p2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput-object p2, p0, LA/O;->e:LN/Y;

    .line 72
    .line 73
    const-wide/16 p2, 0x0

    .line 74
    .line 75
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iput-object p2, p0, LA/O;->f:LN/Y;

    .line 84
    .line 85
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-static {p2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iput-object p2, p0, LA/O;->g:LN/Y;

    .line 92
    .line 93
    invoke-static {v5, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, LA/O;->h:LN/Y;

    .line 98
    .line 99
    iput-object v7, p0, LA/O;->i:LA/n;

    .line 100
    .line 101
    sget-object p1, LA/f0;->a:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Ljava/lang/Float;

    .line 108
    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iget-object p2, v4, LS3/e;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p2, Lkotlin/jvm/internal/n;

    .line 118
    .line 119
    invoke-interface {p2, v5}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, LA/n;

    .line 124
    .line 125
    invoke-virtual {p2}, LA/n;->b()I

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    const/4 p4, 0x0

    .line 130
    :goto_0
    if-ge p4, p3, :cond_0

    .line 131
    .line 132
    invoke-virtual {p2, p1, p4}, LA/n;->e(FI)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 p4, p4, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    iget-object p1, p0, LA/O;->a:LS3/e;

    .line 139
    .line 140
    iget-object p1, p1, LS3/e;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, Lkotlin/jvm/internal/n;

    .line 143
    .line 144
    invoke-interface {p1, p2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_1
    const/4 p1, 0x3

    .line 149
    invoke-static {p1, v1}, LA/t;->i(ILjava/lang/Object;)LA/F;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iput-object p1, p0, LA/O;->j:LA/F;

    .line 154
    .line 155
    return-void
.end method

.method public static c(LA/O;Ljava/lang/Object;ZI)V
    .locals 6

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, LA/O;->h:LN/Y;

    .line 6
    .line 7
    invoke-virtual {p1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    move-object v3, p1

    .line 12
    and-int/lit8 p1, p3, 0x2

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    :cond_1
    if-eqz p2, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, LA/O;->b()LA/u;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of p1, p1, LA/F;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, LA/O;->b()LA/u;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    move-object v1, p1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object p1, p0, LA/O;->j:LA/F;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-virtual {p0}, LA/O;->b()LA/u;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    new-instance v0, LA/L;

    .line 42
    .line 43
    iget-object p1, p0, LA/O;->b:LN/Y;

    .line 44
    .line 45
    invoke-virtual {p1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object v5, p0, LA/O;->i:LA/n;

    .line 50
    .line 51
    iget-object v2, p0, LA/O;->a:LS3/e;

    .line 52
    .line 53
    invoke-direct/range {v0 .. v5}, LA/L;-><init>(LA/i;LS3/e;Ljava/lang/Object;Ljava/lang/Object;LA/n;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LA/O;->d:LN/Y;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, LA/O;->k:LA/U;

    .line 62
    .line 63
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    iget-object p2, p0, LA/U;->g:LN/Y;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, LA/U;->d()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    iget-object p0, p0, LA/U;->h:LX/p;

    .line 77
    .line 78
    invoke-virtual {p0}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const-wide/16 v0, 0x0

    .line 83
    .line 84
    move-wide v2, v0

    .line 85
    :goto_2
    move-object p1, p0

    .line 86
    check-cast p1, LX/v;

    .line 87
    .line 88
    invoke-virtual {p1}, LX/v;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-eqz p3, :cond_4

    .line 93
    .line 94
    invoke-virtual {p1}, LX/v;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, LA/O;

    .line 99
    .line 100
    invoke-virtual {p1}, LA/O;->a()LA/L;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    iget-wide v4, p3, LA/L;->h:J

    .line 105
    .line 106
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    invoke-virtual {p1}, LA/O;->a()LA/L;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    invoke-virtual {p3, v0, v1}, LA/L;->a(J)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    iget-object v4, p1, LA/O;->h:LN/Y;

    .line 119
    .line 120
    invoke-virtual {v4, p3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, LA/O;->a()LA/L;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    invoke-virtual {p3, v0, v1}, LA/L;->b(J)LA/n;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    iput-object p3, p1, LA/O;->i:LA/n;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {p2, p0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    return-void
.end method


# virtual methods
.method public final a()LA/L;
    .locals 1

    .line 1
    iget-object v0, p0, LA/O;->d:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LA/L;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b()LA/u;
    .locals 1

    .line 1
    iget-object v0, p0, LA/O;->c:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LA/u;

    .line 8
    .line 9
    return-object v0
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;LA/u;)V
    .locals 1

    .line 1
    const-string v0, "animationSpec"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/O;->b:LN/Y;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LA/O;->c:LN/Y;

    .line 12
    .line 13
    invoke-virtual {v0, p3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LA/O;->a()LA/L;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    iget-object p3, p3, LA/L;->c:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, LA/O;->a()LA/L;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    iget-object p3, p3, LA/L;->d:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const/4 p2, 0x2

    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-static {p0, p1, p3, p2}, LA/O;->c(LA/O;Ljava/lang/Object;ZI)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final e(Ljava/lang/Object;LA/u;)V
    .locals 3

    .line 1
    const-string v0, "animationSpec"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/O;->b:LN/Y;

    .line 7
    .line 8
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, LA/O;->g:LN/Y;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, LA/O;->c:LN/Y;

    .line 38
    .line 39
    invoke-virtual {p1, p2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LA/O;->e:LN/Y;

    .line 43
    .line 44
    invoke-virtual {p1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const/4 v0, 0x1

    .line 55
    xor-int/2addr p2, v0

    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-static {p0, v1, p2, v0}, LA/O;->c(LA/O;Ljava/lang/Object;ZI)V

    .line 58
    .line 59
    .line 60
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, LA/O;->k:LA/U;

    .line 66
    .line 67
    iget-object p1, p1, LA/U;->e:LN/Y;

    .line 68
    .line 69
    invoke-virtual {p1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object v0, p0, LA/O;->f:LN/Y;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, p2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA/O;->h:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
