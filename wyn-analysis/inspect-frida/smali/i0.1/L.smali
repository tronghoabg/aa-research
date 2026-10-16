.class public final Li0/L;
.super Lh0/c;
.source "SourceFile"


# instance fields
.field public final f:LN/Y;

.field public final g:LN/Y;

.field public final h:Li0/D;

.field public i:LN/p;

.field public final j:LN/Y;

.field public k:F

.field public l:Le0/r;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lh0/c;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-wide v0, Ld0/f;->b:J

    .line 5
    .line 6
    new-instance v2, Ld0/f;

    .line 7
    .line 8
    invoke-direct {v2, v0, v1}, Ld0/f;-><init>(J)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LN/P;->f:LN/P;

    .line 12
    .line 13
    invoke-static {v2, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Li0/L;->f:LN/Y;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {v1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Li0/L;->g:LN/Y;

    .line 26
    .line 27
    new-instance v1, Li0/D;

    .line 28
    .line 29
    invoke-direct {v1}, Li0/D;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v2, LA0/p;

    .line 33
    .line 34
    const/16 v3, 0x17

    .line 35
    .line 36
    invoke-direct {v2, p0, v3}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    iput-object v2, v1, Li0/D;->e:Lkotlin/jvm/internal/n;

    .line 40
    .line 41
    iput-object v1, p0, Li0/L;->h:Li0/D;

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Li0/L;->j:LN/Y;

    .line 50
    .line 51
    const/high16 v0, 0x3f800000    # 1.0f

    .line 52
    .line 53
    iput v0, p0, Li0/L;->k:F

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a(F)Z
    .locals 0

    .line 1
    iput p1, p0, Li0/L;->k:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final b(Le0/r;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Li0/L;->l:Le0/r;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-object v0, p0, Li0/L;->f:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld0/f;

    .line 8
    .line 9
    iget-wide v0, v0, Ld0/f;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final g(Lg0/d;)V
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li0/L;->l:Le0/r;

    .line 7
    .line 8
    iget-object v1, p0, Li0/L;->h:Li0/D;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v1, Li0/D;->f:LN/Y;

    .line 13
    .line 14
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Le0/r;

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Li0/L;->g:LN/Y;

    .line 21
    .line 22
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Lg0/d;->getLayoutDirection()LL0/i;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v3, LL0/i;->b:LL0/i;

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, Lg0/d;->x()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    invoke-interface {p1}, Lg0/d;->u()Lba/a;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lba/a;->y()J

    .line 51
    .line 52
    .line 53
    move-result-wide v5

    .line 54
    invoke-virtual {v4}, Lba/a;->v()Le0/o;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-interface {v7}, Le0/o;->m()V

    .line 59
    .line 60
    .line 61
    iget-object v7, v4, Lba/a;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, Lad/L;

    .line 64
    .line 65
    iget-object v7, v7, Lad/L;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v7, Lba/a;

    .line 68
    .line 69
    invoke-virtual {v7}, Lba/a;->v()Le0/o;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-static {v2, v3}, Ld0/c;->b(J)F

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    invoke-static {v2, v3}, Ld0/c;->c(J)F

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    invoke-interface {v7, v8, v9}, Le0/o;->f(FF)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v7}, Le0/o;->d()V

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v3}, Ld0/c;->b(J)F

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    neg-float v8, v8

    .line 92
    invoke-static {v2, v3}, Ld0/c;->c(J)F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    neg-float v2, v2

    .line 97
    invoke-interface {v7, v8, v2}, Le0/o;->f(FF)V

    .line 98
    .line 99
    .line 100
    iget v2, p0, Li0/L;->k:F

    .line 101
    .line 102
    invoke-virtual {v1, p1, v2, v0}, Li0/D;->e(Lg0/d;FLe0/r;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Lba/a;->v()Le0/o;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1}, Le0/o;->restore()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v5, v6}, Lba/a;->J(J)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    iget v2, p0, Li0/L;->k:F

    .line 117
    .line 118
    invoke-virtual {v1, p1, v2, v0}, Li0/D;->e(Lg0/d;FLe0/r;)V

    .line 119
    .line 120
    .line 121
    :goto_0
    iget-object p1, p0, Li0/L;->j:LN/Y;

    .line 122
    .line 123
    invoke-virtual {p1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    return-void
.end method

.method public final h(Ljava/lang/String;FFLV/d;LN/o;I)V
    .locals 7

    .line 1
    const v0, 0x4b64c23f    # 1.4991935E7f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5, v0}, LN/o;->N(I)LN/o;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Li0/L;->h:Li0/D;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Li0/D;->b:Li0/a;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object p1, v1, Li0/a;->i:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1}, Li0/B;->c()V

    .line 20
    .line 21
    .line 22
    iget v2, v0, Li0/D;->g:F

    .line 23
    .line 24
    cmpg-float v2, v2, p2

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput p2, v0, Li0/D;->g:F

    .line 31
    .line 32
    iput-boolean v3, v0, Li0/D;->c:Z

    .line 33
    .line 34
    iget-object v2, v0, Li0/D;->e:Lkotlin/jvm/internal/n;

    .line 35
    .line 36
    invoke-interface {v2}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :goto_0
    iget v2, v0, Li0/D;->h:F

    .line 40
    .line 41
    cmpg-float v2, v2, p3

    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iput p3, v0, Li0/D;->h:F

    .line 47
    .line 48
    iput-boolean v3, v0, Li0/D;->c:Z

    .line 49
    .line 50
    iget-object v0, v0, Li0/D;->e:Lkotlin/jvm/internal/n;

    .line 51
    .line 52
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-static {p5}, LN/d;->H(LN/o;)LN/m;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v2, p0, Li0/L;->i:LN/p;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-interface {v2}, LN/p;->a()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    :cond_2
    new-instance v2, Li0/C;

    .line 70
    .line 71
    const-string v4, "root"

    .line 72
    .line 73
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, v1}, LE9/c;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, LN/s;

    .line 80
    .line 81
    invoke-direct {v1, v0, v2}, LN/s;-><init>(LN/q;LE9/c;)V

    .line 82
    .line 83
    .line 84
    move-object v2, v1

    .line 85
    :cond_3
    iput-object v2, p0, Li0/L;->i:LN/p;

    .line 86
    .line 87
    new-instance v0, LB/i;

    .line 88
    .line 89
    const/4 v1, 0x3

    .line 90
    invoke-direct {v0, v1, p4, p0}, LB/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v1, LV/d;

    .line 94
    .line 95
    const v4, -0x723b937d

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, v4, v3, v0}, LV/d;-><init>(IZLef/e;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v2, v1}, LN/p;->b(LV/d;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, LB/F;

    .line 105
    .line 106
    const/16 v1, 0x10

    .line 107
    .line 108
    invoke-direct {v0, v2, v1}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v0, p5}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p5}, LN/o;->r()LN/i0;

    .line 115
    .line 116
    .line 117
    move-result-object p5

    .line 118
    if-nez p5, :cond_4

    .line 119
    .line 120
    return-void

    .line 121
    :cond_4
    new-instance v0, Li0/K;

    .line 122
    .line 123
    move-object v1, p0

    .line 124
    move-object v2, p1

    .line 125
    move v3, p2

    .line 126
    move v4, p3

    .line 127
    move-object v5, p4

    .line 128
    move v6, p6

    .line 129
    invoke-direct/range {v0 .. v6}, Li0/K;-><init>(Li0/L;Ljava/lang/String;FFLV/d;I)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p5, LN/i0;->d:Ltf/p;

    .line 133
    .line 134
    return-void
.end method
