.class public final LA/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LS3/e;

.field public final b:Ljava/lang/Object;

.field public final c:LA/j;

.field public final d:LN/Y;

.field public final e:LN/Y;

.field public final f:LA/A;

.field public final g:LA/n;

.field public final h:LA/n;

.field public final i:LA/n;

.field public final j:LA/n;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LS3/e;Ljava/lang/Object;)V
    .locals 10

    .line 1
    const-string v0, "typeConverter"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, LA/e;->a:LS3/e;

    .line 10
    .line 11
    iput-object p3, p0, LA/e;->b:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v1, LA/j;

    .line 14
    .line 15
    const-wide/high16 v5, -0x8000000000000000L

    .line 16
    .line 17
    const-wide/high16 v7, -0x8000000000000000L

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    move-object v3, p1

    .line 22
    move-object v2, p2

    .line 23
    invoke-direct/range {v1 .. v9}, LA/j;-><init>(LS3/e;Ljava/lang/Object;LA/n;JJZ)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, LA/e;->c:LA/j;

    .line 27
    .line 28
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    sget-object p2, LN/P;->f:LN/P;

    .line 31
    .line 32
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, LA/e;->d:LN/Y;

    .line 37
    .line 38
    invoke-static {v3, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, LA/e;->e:LN/Y;

    .line 43
    .line 44
    new-instance p1, LA/A;

    .line 45
    .line 46
    invoke-direct {p1}, LA/A;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LA/e;->f:LA/A;

    .line 50
    .line 51
    new-instance p1, LA/F;

    .line 52
    .line 53
    const p2, 0x44bb8000    # 1500.0f

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2, p3}, LA/F;-><init>(FLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, v2, LS3/e;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lkotlin/jvm/internal/n;

    .line 62
    .line 63
    invoke-interface {p1, v3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, LA/n;

    .line 68
    .line 69
    invoke-virtual {p1}, LA/n;->b()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    const/4 p3, 0x0

    .line 74
    move v0, p3

    .line 75
    :goto_0
    if-ge v0, p2, :cond_0

    .line 76
    .line 77
    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 78
    .line 79
    invoke-virtual {p1, v1, v0}, LA/n;->e(FI)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iput-object p1, p0, LA/e;->g:LA/n;

    .line 86
    .line 87
    iget-object p2, p0, LA/e;->a:LS3/e;

    .line 88
    .line 89
    iget-object p2, p2, LS3/e;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, Lkotlin/jvm/internal/n;

    .line 92
    .line 93
    invoke-interface {p2, v3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, LA/n;

    .line 98
    .line 99
    invoke-virtual {p2}, LA/n;->b()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    :goto_1
    if-ge p3, v0, :cond_1

    .line 104
    .line 105
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 106
    .line 107
    invoke-virtual {p2, v1, p3}, LA/n;->e(FI)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 p3, p3, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    iput-object p2, p0, LA/e;->h:LA/n;

    .line 114
    .line 115
    iput-object p1, p0, LA/e;->i:LA/n;

    .line 116
    .line 117
    iput-object p2, p0, LA/e;->j:LA/n;

    .line 118
    .line 119
    return-void
.end method

.method public static final a(LA/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, LA/e;->g:LA/n;

    .line 2
    .line 3
    iget-object v1, p0, LA/e;->i:LA/n;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v2, p0, LA/e;->j:LA/n;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LA/e;->h:LA/n;

    .line 14
    .line 15
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object p0, p0, LA/e;->a:LS3/e;

    .line 23
    .line 24
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, LA/n;

    .line 33
    .line 34
    invoke-virtual {v0}, LA/n;->b()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    move v5, v4

    .line 40
    :goto_0
    if-ge v4, v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, v4}, LA/n;->a(I)F

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-virtual {v1, v4}, LA/n;->a(I)F

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    cmpg-float v6, v6, v7

    .line 51
    .line 52
    if-ltz v6, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v4}, LA/n;->a(I)F

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-virtual {v2, v4}, LA/n;->a(I)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    cmpl-float v6, v6, v7

    .line 63
    .line 64
    if-lez v6, :cond_2

    .line 65
    .line 66
    :cond_1
    invoke-virtual {v0, v4}, LA/n;->a(I)F

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {v1, v4}, LA/n;->a(I)F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v2, v4}, LA/n;->a(I)F

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-static {v5, v6, v7}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {v0, v5, v4}, LA/n;->e(FI)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    if-eqz v5, :cond_4

    .line 90
    .line 91
    iget-object p0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Lkotlin/jvm/internal/n;

    .line 94
    .line 95
    invoke-interface {p0, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_4
    :goto_1
    return-object p1
.end method

.method public static final b(LA/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, LA/e;->c:LA/j;

    .line 2
    .line 3
    iget-object v1, v0, LA/j;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LA/n;

    .line 6
    .line 7
    invoke-virtual {v1}, LA/n;->d()V

    .line 8
    .line 9
    .line 10
    const-wide/high16 v1, -0x8000000000000000L

    .line 11
    .line 12
    iput-wide v1, v0, LA/j;->b:J

    .line 13
    .line 14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object p0, p0, LA/e;->d:LN/Y;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static c(LA/e;Ljava/lang/Object;LA/i;Ljf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, LA/e;->a:LS3/e;

    .line 2
    .line 3
    iget-object v0, v0, LS3/e;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 6
    .line 7
    iget-object v1, p0, LA/e;->c:LA/j;

    .line 8
    .line 9
    iget-object v1, v1, LA/j;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LA/n;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p0}, LA/e;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    const-string v0, "animationSpec"

    .line 22
    .line 23
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "typeConverter"

    .line 27
    .line 28
    iget-object v7, p0, LA/e;->a:LS3/e;

    .line 29
    .line 30
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v5, LA/L;

    .line 34
    .line 35
    iget-object v0, v7, LS3/e;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 38
    .line 39
    invoke-interface {v0, v4}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v10, v0

    .line 44
    check-cast v10, LA/n;

    .line 45
    .line 46
    move-object v9, p1

    .line 47
    move-object v6, p2

    .line 48
    invoke-direct/range {v5 .. v10}, LA/L;-><init>(LA/i;LS3/e;Ljava/lang/Object;Ljava/lang/Object;LA/n;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, LA/e;->c:LA/j;

    .line 52
    .line 53
    iget-wide v6, p1, LA/j;->b:J

    .line 54
    .line 55
    new-instance v2, LA/b;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    move-object v3, p0

    .line 59
    invoke-direct/range {v2 .. v8}, LA/b;-><init>(LA/e;Ljava/lang/Object;LA/L;JLjf/c;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, v3, LA/e;->f:LA/A;

    .line 63
    .line 64
    invoke-static {p0, v2, p3}, LA/A;->a(LA/A;Ltf/l;Ljf/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA/e;->c:LA/j;

    .line 2
    .line 3
    iget-object v0, v0, LA/j;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LN/Y;

    .line 6
    .line 7
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final e(Ljava/lang/Comparable;Llf/j;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LA/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, LA/c;-><init>(LA/e;Ljava/lang/Comparable;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LA/e;->f:LA/A;

    .line 8
    .line 9
    invoke-static {p1, v0, p2}, LA/A;->a(LA/A;Ltf/l;Ljf/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 14
    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 19
    .line 20
    return-object p1
.end method

.method public final f(Llf/j;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LA/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LA/d;-><init>(LA/e;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LA/e;->f:LA/A;

    .line 8
    .line 9
    invoke-static {v1, v0, p1}, LA/A;->a(LA/A;Ltf/l;Ljf/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 19
    .line 20
    return-object p1
.end method
