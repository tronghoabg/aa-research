.class public final Lh4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LEf/A;

.field public final b:LEf/A;

.field public final c:LEf/A;

.field public final d:LEf/A;

.field public final e:Lj4/a;

.field public final f:I

.field public final g:Landroid/graphics/Bitmap$Config;

.field public final h:Z

.field public final i:I

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LJf/n;->a:LFf/e;

    .line 4
    .line 5
    iget-object v0, v0, LFf/e;->e:LFf/e;

    .line 6
    .line 7
    sget-object v1, LLf/d;->b:LLf/d;

    .line 8
    .line 9
    sget-object v2, Lj4/a;->a:Lj4/a;

    .line 10
    .line 11
    sget-object v3, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lh4/b;->a:LEf/A;

    .line 17
    .line 18
    iput-object v1, p0, Lh4/b;->b:LEf/A;

    .line 19
    .line 20
    iput-object v1, p0, Lh4/b;->c:LEf/A;

    .line 21
    .line 22
    iput-object v1, p0, Lh4/b;->d:LEf/A;

    .line 23
    .line 24
    iput-object v2, p0, Lh4/b;->e:Lj4/a;

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    iput v0, p0, Lh4/b;->f:I

    .line 28
    .line 29
    iput-object v3, p0, Lh4/b;->g:Landroid/graphics/Bitmap$Config;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Lh4/b;->h:Z

    .line 33
    .line 34
    iput v0, p0, Lh4/b;->i:I

    .line 35
    .line 36
    iput v0, p0, Lh4/b;->j:I

    .line 37
    .line 38
    iput v0, p0, Lh4/b;->k:I

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lh4/b;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lh4/b;

    .line 9
    .line 10
    iget-object v0, p1, Lh4/b;->a:LEf/A;

    .line 11
    .line 12
    iget-object v1, p0, Lh4/b;->a:LEf/A;

    .line 13
    .line 14
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lh4/b;->b:LEf/A;

    .line 21
    .line 22
    iget-object v1, p1, Lh4/b;->b:LEf/A;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lh4/b;->c:LEf/A;

    .line 31
    .line 32
    iget-object v1, p1, Lh4/b;->c:LEf/A;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lh4/b;->d:LEf/A;

    .line 41
    .line 42
    iget-object v1, p1, Lh4/b;->d:LEf/A;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lh4/b;->e:Lj4/a;

    .line 51
    .line 52
    iget-object v1, p1, Lh4/b;->e:Lj4/a;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget v0, p0, Lh4/b;->f:I

    .line 61
    .line 62
    iget v1, p1, Lh4/b;->f:I

    .line 63
    .line 64
    if-ne v0, v1, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Lh4/b;->g:Landroid/graphics/Bitmap$Config;

    .line 67
    .line 68
    iget-object v1, p1, Lh4/b;->g:Landroid/graphics/Bitmap$Config;

    .line 69
    .line 70
    if-ne v0, v1, :cond_1

    .line 71
    .line 72
    iget-boolean v0, p0, Lh4/b;->h:Z

    .line 73
    .line 74
    iget-boolean v1, p1, Lh4/b;->h:Z

    .line 75
    .line 76
    if-ne v0, v1, :cond_1

    .line 77
    .line 78
    iget v0, p0, Lh4/b;->i:I

    .line 79
    .line 80
    iget v1, p1, Lh4/b;->i:I

    .line 81
    .line 82
    if-ne v0, v1, :cond_1

    .line 83
    .line 84
    iget v0, p0, Lh4/b;->j:I

    .line 85
    .line 86
    iget v1, p1, Lh4/b;->j:I

    .line 87
    .line 88
    if-ne v0, v1, :cond_1

    .line 89
    .line 90
    iget v0, p0, Lh4/b;->k:I

    .line 91
    .line 92
    iget p1, p1, Lh4/b;->k:I

    .line 93
    .line 94
    if-ne v0, p1, :cond_1

    .line 95
    .line 96
    :goto_0
    const/4 p1, 0x1

    .line 97
    return p1

    .line 98
    :cond_1
    const/4 p1, 0x0

    .line 99
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lh4/b;->a:LEf/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lh4/b;->b:LEf/A;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lh4/b;->c:LEf/A;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, Lh4/b;->d:LEf/A;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object v0, p0, Lh4/b;->e:Lj4/a;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-class v0, Lj4/a;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/2addr v0, v2

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget v2, p0, Lh4/b;->f:I

    .line 48
    .line 49
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v2, p0, Lh4/b;->g:Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    add-int/2addr v2, v0

    .line 60
    mul-int/2addr v2, v1

    .line 61
    iget-boolean v0, p0, Lh4/b;->h:Z

    .line 62
    .line 63
    const/16 v3, 0x4d5

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    const/16 v0, 0x4cf

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v0, v3

    .line 71
    :goto_0
    add-int/2addr v2, v0

    .line 72
    mul-int/2addr v2, v1

    .line 73
    add-int/2addr v2, v3

    .line 74
    const v0, 0xe1781

    .line 75
    .line 76
    .line 77
    mul-int/2addr v2, v0

    .line 78
    iget v0, p0, Lh4/b;->i:I

    .line 79
    .line 80
    invoke-static {v0, v2, v1}, LA/f;->d(III)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v2, p0, Lh4/b;->j:I

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget v1, p0, Lh4/b;->k:I

    .line 91
    .line 92
    invoke-static {v1}, LA/f;->f(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v1, v0

    .line 97
    return v1
.end method
