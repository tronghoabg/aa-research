.class public final Lh4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/graphics/Bitmap$Config;

.field public final c:Li4/f;

.field public final d:I

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Lokhttp3/Headers;

.field public final i:Lh4/p;

.field public final j:Lh4/n;

.field public final k:I

.field public final l:I

.field public final m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Li4/f;IZZZLokhttp3/Headers;Lh4/p;Lh4/n;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh4/l;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    iput-object p3, p0, Lh4/l;->c:Li4/f;

    .line 9
    .line 10
    iput p4, p0, Lh4/l;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lh4/l;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lh4/l;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lh4/l;->g:Z

    .line 17
    .line 18
    iput-object p8, p0, Lh4/l;->h:Lokhttp3/Headers;

    .line 19
    .line 20
    iput-object p9, p0, Lh4/l;->i:Lh4/p;

    .line 21
    .line 22
    iput-object p10, p0, Lh4/l;->j:Lh4/n;

    .line 23
    .line 24
    iput p11, p0, Lh4/l;->k:I

    .line 25
    .line 26
    iput p12, p0, Lh4/l;->l:I

    .line 27
    .line 28
    iput p13, p0, Lh4/l;->m:I

    .line 29
    .line 30
    return-void
.end method

.method public static a(Lh4/l;)Lh4/l;
    .locals 14

    .line 1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    iget-object v1, p0, Lh4/l;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, Lh4/l;->c:Li4/f;

    .line 9
    .line 10
    iget v4, p0, Lh4/l;->d:I

    .line 11
    .line 12
    iget-boolean v5, p0, Lh4/l;->e:Z

    .line 13
    .line 14
    iget-boolean v6, p0, Lh4/l;->f:Z

    .line 15
    .line 16
    iget-boolean v7, p0, Lh4/l;->g:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v8, p0, Lh4/l;->h:Lokhttp3/Headers;

    .line 22
    .line 23
    iget-object v9, p0, Lh4/l;->i:Lh4/p;

    .line 24
    .line 25
    iget-object v10, p0, Lh4/l;->j:Lh4/n;

    .line 26
    .line 27
    iget v11, p0, Lh4/l;->k:I

    .line 28
    .line 29
    iget v12, p0, Lh4/l;->l:I

    .line 30
    .line 31
    iget v13, p0, Lh4/l;->m:I

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, Lh4/l;

    .line 37
    .line 38
    invoke-direct/range {v0 .. v13}, Lh4/l;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Li4/f;IZZZLokhttp3/Headers;Lh4/p;Lh4/n;III)V

    .line 39
    .line 40
    .line 41
    return-object v0
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
    instance-of v0, p1, Lh4/l;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lh4/l;

    .line 9
    .line 10
    iget-object v0, p1, Lh4/l;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v1, p0, Lh4/l;->a:Landroid/content/Context;

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
    iget-object v0, p0, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

    .line 21
    .line 22
    iget-object v1, p1, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lh4/l;->c:Li4/f;

    .line 27
    .line 28
    iget-object v1, p1, Lh4/l;->c:Li4/f;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget v0, p0, Lh4/l;->d:I

    .line 37
    .line 38
    iget v1, p1, Lh4/l;->d:I

    .line 39
    .line 40
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    iget-boolean v0, p0, Lh4/l;->e:Z

    .line 43
    .line 44
    iget-boolean v1, p1, Lh4/l;->e:Z

    .line 45
    .line 46
    if-ne v0, v1, :cond_1

    .line 47
    .line 48
    iget-boolean v0, p0, Lh4/l;->f:Z

    .line 49
    .line 50
    iget-boolean v1, p1, Lh4/l;->f:Z

    .line 51
    .line 52
    if-ne v0, v1, :cond_1

    .line 53
    .line 54
    iget-boolean v0, p0, Lh4/l;->g:Z

    .line 55
    .line 56
    iget-boolean v1, p1, Lh4/l;->g:Z

    .line 57
    .line 58
    if-ne v0, v1, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lh4/l;->h:Lokhttp3/Headers;

    .line 61
    .line 62
    iget-object v1, p1, Lh4/l;->h:Lokhttp3/Headers;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    iget-object v0, p0, Lh4/l;->i:Lh4/p;

    .line 71
    .line 72
    iget-object v1, p1, Lh4/l;->i:Lh4/p;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lh4/p;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    iget-object v0, p0, Lh4/l;->j:Lh4/n;

    .line 81
    .line 82
    iget-object v1, p1, Lh4/l;->j:Lh4/n;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lh4/n;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    iget v0, p0, Lh4/l;->k:I

    .line 91
    .line 92
    iget v1, p1, Lh4/l;->k:I

    .line 93
    .line 94
    if-ne v0, v1, :cond_1

    .line 95
    .line 96
    iget v0, p0, Lh4/l;->l:I

    .line 97
    .line 98
    iget v1, p1, Lh4/l;->l:I

    .line 99
    .line 100
    if-ne v0, v1, :cond_1

    .line 101
    .line 102
    iget v0, p0, Lh4/l;->m:I

    .line 103
    .line 104
    iget p1, p1, Lh4/l;->m:I

    .line 105
    .line 106
    if-ne v0, p1, :cond_1

    .line 107
    .line 108
    :goto_0
    const/4 p1, 0x1

    .line 109
    return p1

    .line 110
    :cond_1
    const/4 p1, 0x0

    .line 111
    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lh4/l;->a:Landroid/content/Context;

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
    iget-object v2, p0, Lh4/l;->b:Landroid/graphics/Bitmap$Config;

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
    mul-int/lit16 v2, v2, 0x3c1

    .line 18
    .line 19
    iget-object v0, p0, Lh4/l;->c:Li4/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Li4/f;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, v2

    .line 26
    mul-int/2addr v0, v1

    .line 27
    iget v2, p0, Lh4/l;->d:I

    .line 28
    .line 29
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-boolean v2, p0, Lh4/l;->e:Z

    .line 34
    .line 35
    const/16 v3, 0x4d5

    .line 36
    .line 37
    const/16 v4, 0x4cf

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    move v2, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v2, v3

    .line 44
    :goto_0
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget-boolean v2, p0, Lh4/l;->f:Z

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    move v2, v4

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v2, v3

    .line 53
    :goto_1
    add-int/2addr v0, v2

    .line 54
    mul-int/2addr v0, v1

    .line 55
    iget-boolean v2, p0, Lh4/l;->g:Z

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    move v3, v4

    .line 60
    :cond_2
    add-int/2addr v0, v3

    .line 61
    mul-int/lit16 v0, v0, 0x3c1

    .line 62
    .line 63
    iget-object v2, p0, Lh4/l;->h:Lokhttp3/Headers;

    .line 64
    .line 65
    iget-object v2, v2, Lokhttp3/Headers;->a:[Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    add-int/2addr v0, v2

    .line 72
    mul-int/2addr v0, v1

    .line 73
    iget-object v2, p0, Lh4/l;->i:Lh4/p;

    .line 74
    .line 75
    iget-object v2, v2, Lh4/p;->a:Ljava/util/Map;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    add-int/2addr v2, v0

    .line 82
    mul-int/2addr v2, v1

    .line 83
    iget-object v0, p0, Lh4/l;->j:Lh4/n;

    .line 84
    .line 85
    iget-object v0, v0, Lh4/n;->a:Ljava/util/Map;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    add-int/2addr v0, v2

    .line 92
    mul-int/2addr v0, v1

    .line 93
    iget v2, p0, Lh4/l;->k:I

    .line 94
    .line 95
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    iget v2, p0, Lh4/l;->l:I

    .line 100
    .line 101
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget v1, p0, Lh4/l;->m:I

    .line 106
    .line 107
    invoke-static {v1}, LA/f;->f(I)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v1, v0

    .line 112
    return v1
.end method
