.class public final LY3/n;
.super Lh0/c;
.source "SourceFile"

# interfaces
.implements LN/q0;


# instance fields
.field public f:LKd/a;

.field public final g:LHf/x0;

.field public final h:LN/Y;

.field public final i:LN/Y;

.field public final j:LN/Y;

.field public k:LY3/g;

.field public l:Lh0/c;

.field public m:Ltf/l;

.field public n:Lr0/h;

.field public o:I

.field public p:Z

.field public final q:LN/Y;

.field public final r:LN/Y;

.field public final s:LN/Y;


# direct methods
.method public constructor <init>(Lh4/h;LX3/k;)V
    .locals 3

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
    invoke-static {v2}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LY3/n;->g:LHf/x0;

    .line 16
    .line 17
    sget-object v0, LN/P;->f:LN/P;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, p0, LY3/n;->h:LN/Y;

    .line 25
    .line 26
    const/high16 v2, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, p0, LY3/n;->i:LN/Y;

    .line 37
    .line 38
    invoke-static {v1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, LY3/n;->j:LN/Y;

    .line 43
    .line 44
    sget-object v1, LY3/c;->a:LY3/c;

    .line 45
    .line 46
    iput-object v1, p0, LY3/n;->k:LY3/g;

    .line 47
    .line 48
    sget-object v2, LY3/a;->k:LY3/a;

    .line 49
    .line 50
    iput-object v2, p0, LY3/n;->m:Ltf/l;

    .line 51
    .line 52
    sget-object v2, Lr0/g;->b:Lr0/f;

    .line 53
    .line 54
    iput-object v2, p0, LY3/n;->n:Lr0/h;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    iput v2, p0, LY3/n;->o:I

    .line 58
    .line 59
    invoke-static {v1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, LY3/n;->q:LN/Y;

    .line 64
    .line 65
    invoke-static {p1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, LY3/n;->r:LN/Y;

    .line 70
    .line 71
    invoke-static {p2, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, LY3/n;->s:LN/Y;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a(F)Z
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LY3/n;->i:LN/Y;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1
.end method

.method public final b(Le0/r;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LY3/n;->j:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, LY3/n;->f:LKd/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, LEf/S;->a:LLf/e;

    .line 11
    .line 12
    sget-object v1, LJf/n;->a:LFf/e;

    .line 13
    .line 14
    iget-object v1, v1, LFf/e;->e:LFf/e;

    .line 15
    .line 16
    invoke-static {v0, v1}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LY3/n;->f:LKd/a;

    .line 25
    .line 26
    iget-object v1, p0, LY3/n;->l:Lh0/c;

    .line 27
    .line 28
    instance-of v2, v1, LN/q0;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast v1, LN/q0;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v1, v3

    .line 37
    :goto_0
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, LN/q0;->c()V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-boolean v1, p0, LY3/n;->p:Z

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, LY3/n;->r:LN/Y;

    .line 47
    .line 48
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lh4/h;

    .line 53
    .line 54
    invoke-static {v0}, Lh4/h;->a(Lh4/h;)Lh4/g;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, LY3/n;->s:LN/Y;

    .line 59
    .line 60
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, LX3/k;

    .line 65
    .line 66
    iget-object v1, v1, LX3/k;->b:Lh4/b;

    .line 67
    .line 68
    iput-object v1, v0, Lh4/g;->b:Lh4/b;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    iput v1, v0, Lh4/g;->q:I

    .line 72
    .line 73
    invoke-virtual {v0}, Lh4/g;->a()Lh4/h;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, LY3/e;

    .line 78
    .line 79
    iget-object v0, v0, Lh4/h;->u:Lh4/b;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v0, Lk4/d;->a:Lh4/b;

    .line 85
    .line 86
    invoke-direct {v1, v3}, LY3/e;-><init>(Lh0/c;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v1}, LY3/n;->i(LY3/g;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    new-instance v1, LY3/j;

    .line 94
    .line 95
    invoke-direct {v1, p0, v3}, LY3/j;-><init>(LY3/n;Ljf/c;)V

    .line 96
    .line 97
    .line 98
    const/4 v2, 0x3

    .line 99
    invoke-static {v0, v3, v1, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-object v0, p0, LY3/n;->h:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh0/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lh0/c;->f()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    sget-wide v0, Ld0/f;->c:J

    .line 17
    .line 18
    return-wide v0
.end method

.method public final g(Lg0/d;)V
    .locals 7

    .line 1
    invoke-interface {p1}, Lg0/d;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Ld0/f;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Ld0/f;-><init>(J)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LY3/n;->g:LHf/x0;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LY3/n;->h:LN/Y;

    .line 20
    .line 21
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Lh0/c;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Lg0/d;->c()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    iget-object v0, p0, LY3/n;->i:LN/Y;

    .line 35
    .line 36
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    iget-object v0, p0, LY3/n;->j:LN/Y;

    .line 47
    .line 48
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, Le0/r;

    .line 54
    .line 55
    move-object v2, p1

    .line 56
    invoke-virtual/range {v1 .. v6}, Lh0/c;->e(Lg0/d;JFLe0/r;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public final h(Landroid/graphics/drawable/Drawable;)Lh0/c;
    .locals 7

    .line 1
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "<this>"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Le0/d;

    .line 17
    .line 18
    invoke-direct {v2, p1}, Le0/d;-><init>(Landroid/graphics/Bitmap;)V

    .line 19
    .line 20
    .line 21
    iget v0, p0, LY3/n;->o:I

    .line 22
    .line 23
    sget-wide v3, LL0/g;->b:J

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {v1, p1}, LBa/c;->a(II)J

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    new-instance v1, Lh0/a;

    .line 38
    .line 39
    invoke-direct/range {v1 .. v6}, Lh0/a;-><init>(Le0/d;JJ)V

    .line 40
    .line 41
    .line 42
    iput v0, v1, Lh0/a;->i:I

    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/ColorDrawable;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Lh0/b;

    .line 50
    .line 51
    check-cast p1, Landroid/graphics/drawable/ColorDrawable;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1}, Le0/z;->b(I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    invoke-direct {v0, v1, v2}, Lh0/b;-><init>(J)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_1
    new-instance v0, Lo5/a;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {v0, p1}, Lo5/a;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method public final i(LY3/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, LY3/n;->k:LY3/g;

    .line 2
    .line 3
    iget-object v1, p0, LY3/n;->m:Ltf/l;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LY3/g;

    .line 10
    .line 11
    iput-object p1, p0, LY3/n;->k:LY3/g;

    .line 12
    .line 13
    iget-object v1, p0, LY3/n;->q:LN/Y;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    instance-of v1, p1, LY3/f;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, LY3/f;

    .line 24
    .line 25
    iget-object v1, v1, LY3/f;->b:Lh4/o;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    instance-of v1, p1, LY3/d;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, LY3/d;

    .line 34
    .line 35
    iget-object v1, v1, LY3/d;->b:Lh4/d;

    .line 36
    .line 37
    :goto_0
    invoke-virtual {v1}, Lh4/i;->a()Lh4/h;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, Lh4/h;->f:Lj4/a;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p1}, LY3/g;->a()Lh0/c;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, LY3/n;->l:Lh0/c;

    .line 51
    .line 52
    iget-object v2, p0, LY3/n;->h:LN/Y;

    .line 53
    .line 54
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, LY3/n;->f:LKd/a;

    .line 58
    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0}, LY3/g;->a()Lh0/c;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p1}, LY3/g;->a()Lh0/c;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eq v1, v2, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0}, LY3/g;->a()Lh0/c;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    instance-of v1, v0, LN/q0;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    check-cast v0, LN/q0;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v0, v2

    .line 84
    :goto_1
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-interface {v0}, LN/q0;->k()V

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {p1}, LY3/g;->a()Lh0/c;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    instance-of v0, p1, LN/q0;

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    move-object v2, p1

    .line 98
    check-cast v2, LN/q0;

    .line 99
    .line 100
    :cond_4
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-interface {v2}, LN/q0;->c()V

    .line 103
    .line 104
    .line 105
    :cond_5
    return-void
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, LY3/n;->f:LKd/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, v1}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, LY3/n;->f:LKd/a;

    .line 10
    .line 11
    iget-object v0, p0, LY3/n;->l:Lh0/c;

    .line 12
    .line 13
    instance-of v2, v0, LN/q0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, LN/q0;

    .line 19
    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, LN/q0;->j()V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, LY3/n;->f:LKd/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, v1}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, LY3/n;->f:LKd/a;

    .line 10
    .line 11
    iget-object v0, p0, LY3/n;->l:Lh0/c;

    .line 12
    .line 13
    instance-of v2, v0, LN/q0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, LN/q0;

    .line 19
    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, LN/q0;->k()V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
.end method
