.class public final LF5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public c:J

.field public final d:Lf6/z;

.field public e:Z

.field public f:Z

.field public final synthetic g:LF5/h;


# direct methods
.method public constructor <init>(LF5/h;Ljava/lang/String;ILf6/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF5/g;->g:LF5/h;

    .line 5
    .line 6
    iput-object p2, p0, LF5/g;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, LF5/g;->b:I

    .line 9
    .line 10
    if-nez p4, :cond_0

    .line 11
    .line 12
    const-wide/16 p1, -0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-wide p1, p4, Lf6/x;->d:J

    .line 16
    .line 17
    :goto_0
    iput-wide p1, p0, LF5/g;->c:J

    .line 18
    .line 19
    if-eqz p4, :cond_1

    .line 20
    .line 21
    invoke-virtual {p4}, Lf6/x;->a()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iput-object p4, p0, LF5/g;->d:Lf6/z;

    .line 28
    .line 29
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(LF5/a;)Z
    .locals 7

    .line 1
    iget-object v0, p1, LF5/a;->d:Lf6/z;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LF5/g;->b:I

    .line 6
    .line 7
    iget p1, p1, LF5/a;->c:I

    .line 8
    .line 9
    if-eq v0, p1, :cond_8

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v1, p0, LF5/g;->c:J

    .line 13
    .line 14
    const-wide/16 v3, -0x1

    .line 15
    .line 16
    cmp-long v3, v1, v3

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-wide v3, v0, Lf6/x;->d:J

    .line 22
    .line 23
    cmp-long v1, v3, v1

    .line 24
    .line 25
    if-lez v1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget-object v1, p0, LF5/g;->d:Lf6/z;

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-object p1, p1, LF5/a;->b:LE5/J0;

    .line 34
    .line 35
    iget-object v2, v0, Lf6/x;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p1, v2}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v3, v1, Lf6/x;->a:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p1, v3}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-wide v3, v0, Lf6/x;->d:J

    .line 48
    .line 49
    iget-wide v5, v1, Lf6/x;->d:J

    .line 50
    .line 51
    cmp-long v3, v3, v5

    .line 52
    .line 53
    if-ltz v3, :cond_8

    .line 54
    .line 55
    if-ge v2, p1, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    if-le v2, p1, :cond_5

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_5
    invoke-virtual {v0}, Lf6/x;->a()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iget v2, v1, Lf6/x;->b:I

    .line 66
    .line 67
    if-eqz p1, :cond_6

    .line 68
    .line 69
    iget p1, v0, Lf6/x;->b:I

    .line 70
    .line 71
    if-gt p1, v2, :cond_7

    .line 72
    .line 73
    if-ne p1, v2, :cond_8

    .line 74
    .line 75
    iget p1, v1, Lf6/x;->c:I

    .line 76
    .line 77
    iget v0, v0, Lf6/x;->c:I

    .line 78
    .line 79
    if-le v0, p1, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    const/4 p1, -0x1

    .line 83
    iget v0, v0, Lf6/x;->e:I

    .line 84
    .line 85
    if-eq v0, p1, :cond_7

    .line 86
    .line 87
    if-le v0, v2, :cond_8

    .line 88
    .line 89
    :cond_7
    :goto_0
    const/4 p1, 0x1

    .line 90
    return p1

    .line 91
    :cond_8
    :goto_1
    const/4 p1, 0x0

    .line 92
    return p1
.end method

.method public final b(LE5/J0;LE5/J0;)Z
    .locals 6

    .line 1
    iget v0, p0, LF5/g;->b:I

    .line 2
    .line 3
    invoke-virtual {p1}, LE5/J0;->o()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, -0x1

    .line 9
    if-lt v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2}, LE5/J0;->o()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move v0, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget-object v1, p0, LF5/g;->g:LF5/h;

    .line 21
    .line 22
    iget-object v4, v1, LF5/h;->a:LE5/I0;

    .line 23
    .line 24
    invoke-virtual {p1, v0, v4}, LE5/J0;->n(ILE5/I0;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v1, LF5/h;->a:LE5/I0;

    .line 28
    .line 29
    iget v4, v0, LE5/I0;->n:I

    .line 30
    .line 31
    :goto_0
    iget v5, v0, LE5/I0;->o:I

    .line 32
    .line 33
    if-gt v4, v5, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v4}, LE5/J0;->l(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {p2, v5}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eq v5, v3, :cond_2

    .line 44
    .line 45
    iget-object p1, v1, LF5/h;->b:LE5/H0;

    .line 46
    .line 47
    invoke-virtual {p2, v5, p1, v2}, LE5/J0;->f(ILE5/H0;Z)LE5/H0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget v0, p1, LE5/H0;->c:I

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_1
    iput v0, p0, LF5/g;->b:I

    .line 58
    .line 59
    if-ne v0, v3, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    iget-object p1, p0, LF5/g;->d:Lf6/z;

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    iget-object p1, p1, Lf6/x;->a:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {p2, p1}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eq p1, v3, :cond_5

    .line 74
    .line 75
    :goto_2
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_5
    :goto_3
    return v2
.end method
