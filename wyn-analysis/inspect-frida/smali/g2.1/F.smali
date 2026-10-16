.class public final Lg2/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll8/j0;

.field public final b:Ll8/e0;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:Landroid/net/Uri;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lg2/E;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lg2/E;->a:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {v0}, Ll8/j0;->a(Ljava/util/Map;)Ll8/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lg2/F;->a:Ll8/j0;

    .line 11
    .line 12
    iget-object v0, p1, Lg2/E;->b:Ll8/H;

    .line 13
    .line 14
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lg2/F;->b:Ll8/e0;

    .line 19
    .line 20
    iget-object v0, p1, Lg2/E;->d:Ljava/lang/String;

    .line 21
    .line 22
    sget v1, LQ1/x;->a:I

    .line 23
    .line 24
    iput-object v0, p0, Lg2/F;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, p1, Lg2/E;->e:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v0, p0, Lg2/F;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, p1, Lg2/E;->f:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v0, p0, Lg2/F;->e:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v0, p1, Lg2/E;->g:Landroid/net/Uri;

    .line 35
    .line 36
    iput-object v0, p0, Lg2/F;->g:Landroid/net/Uri;

    .line 37
    .line 38
    iget-object v0, p1, Lg2/E;->h:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v0, p0, Lg2/F;->h:Ljava/lang/String;

    .line 41
    .line 42
    iget v0, p1, Lg2/E;->c:I

    .line 43
    .line 44
    iput v0, p0, Lg2/F;->f:I

    .line 45
    .line 46
    iget-object v0, p1, Lg2/E;->i:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v0, p0, Lg2/F;->i:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v0, p1, Lg2/E;->k:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v0, p0, Lg2/F;->j:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, p1, Lg2/E;->l:Ljava/lang/String;

    .line 55
    .line 56
    iput-object v0, p0, Lg2/F;->k:Ljava/lang/String;

    .line 57
    .line 58
    iget-object p1, p1, Lg2/E;->j:Ljava/lang/String;

    .line 59
    .line 60
    iput-object p1, p0, Lg2/F;->l:Ljava/lang/String;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lg2/F;

    .line 12
    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_1
    check-cast p1, Lg2/F;

    .line 18
    .line 19
    iget v0, p0, Lg2/F;->f:I

    .line 20
    .line 21
    iget v1, p1, Lg2/F;->f:I

    .line 22
    .line 23
    if-ne v0, v1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lg2/F;->a:Ll8/j0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, p1, Lg2/F;->a:Ll8/j0;

    .line 31
    .line 32
    invoke-static {v1, v0}, Ll8/s;->f(Ljava/lang/Object;Ljava/util/Map;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lg2/F;->b:Ll8/e0;

    .line 39
    .line 40
    iget-object v1, p1, Lg2/F;->b:Ll8/e0;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ll8/K;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    sget v0, LQ1/x;->a:I

    .line 49
    .line 50
    iget-object v0, p0, Lg2/F;->d:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, Lg2/F;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, Lg2/F;->c:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, Lg2/F;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    iget-object v0, p0, Lg2/F;->e:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p1, Lg2/F;->e:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    iget-object v0, p0, Lg2/F;->l:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, Lg2/F;->l:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    iget-object v0, p0, Lg2/F;->g:Landroid/net/Uri;

    .line 91
    .line 92
    iget-object v1, p1, Lg2/F;->g:Landroid/net/Uri;

    .line 93
    .line 94
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    iget-object v0, p0, Lg2/F;->j:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v1, p1, Lg2/F;->j:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    iget-object v0, p0, Lg2/F;->k:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v1, p1, Lg2/F;->k:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    iget-object v0, p0, Lg2/F;->h:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v1, p1, Lg2/F;->h:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_2

    .line 129
    .line 130
    iget-object v0, p0, Lg2/F;->i:Ljava/lang/String;

    .line 131
    .line 132
    iget-object p1, p1, Lg2/F;->i:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_2

    .line 139
    .line 140
    :goto_0
    const/4 p1, 0x1

    .line 141
    return p1

    .line 142
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 143
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lg2/F;->a:Ll8/j0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll8/j0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0xd9

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lg2/F;->b:Ll8/e0;

    .line 12
    .line 13
    invoke-virtual {v1}, Ll8/K;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iget-object v2, p0, Lg2/F;->d:Ljava/lang/String;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    move v2, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :goto_0
    add-int/2addr v1, v2

    .line 32
    mul-int/lit8 v1, v1, 0x1f

    .line 33
    .line 34
    iget-object v2, p0, Lg2/F;->c:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    move v2, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    :goto_1
    add-int/2addr v1, v2

    .line 45
    mul-int/lit8 v1, v1, 0x1f

    .line 46
    .line 47
    iget-object v2, p0, Lg2/F;->e:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    move v2, v0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    :goto_2
    add-int/2addr v1, v2

    .line 58
    mul-int/lit8 v1, v1, 0x1f

    .line 59
    .line 60
    iget v2, p0, Lg2/F;->f:I

    .line 61
    .line 62
    add-int/2addr v1, v2

    .line 63
    mul-int/lit8 v1, v1, 0x1f

    .line 64
    .line 65
    iget-object v2, p0, Lg2/F;->l:Ljava/lang/String;

    .line 66
    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    move v2, v0

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    :goto_3
    add-int/2addr v1, v2

    .line 76
    mul-int/lit8 v1, v1, 0x1f

    .line 77
    .line 78
    iget-object v2, p0, Lg2/F;->g:Landroid/net/Uri;

    .line 79
    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    move v2, v0

    .line 83
    goto :goto_4

    .line 84
    :cond_4
    invoke-virtual {v2}, Landroid/net/Uri;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :goto_4
    add-int/2addr v1, v2

    .line 89
    mul-int/lit8 v1, v1, 0x1f

    .line 90
    .line 91
    iget-object v2, p0, Lg2/F;->j:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v2, :cond_5

    .line 94
    .line 95
    move v2, v0

    .line 96
    goto :goto_5

    .line 97
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    :goto_5
    add-int/2addr v1, v2

    .line 102
    mul-int/lit8 v1, v1, 0x1f

    .line 103
    .line 104
    iget-object v2, p0, Lg2/F;->k:Ljava/lang/String;

    .line 105
    .line 106
    if-nez v2, :cond_6

    .line 107
    .line 108
    move v2, v0

    .line 109
    goto :goto_6

    .line 110
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    :goto_6
    add-int/2addr v1, v2

    .line 115
    mul-int/lit8 v1, v1, 0x1f

    .line 116
    .line 117
    iget-object v2, p0, Lg2/F;->h:Ljava/lang/String;

    .line 118
    .line 119
    if-nez v2, :cond_7

    .line 120
    .line 121
    move v2, v0

    .line 122
    goto :goto_7

    .line 123
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    :goto_7
    add-int/2addr v1, v2

    .line 128
    mul-int/lit8 v1, v1, 0x1f

    .line 129
    .line 130
    iget-object v2, p0, Lg2/F;->i:Ljava/lang/String;

    .line 131
    .line 132
    if-nez v2, :cond_8

    .line 133
    .line 134
    goto :goto_8

    .line 135
    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    :goto_8
    add-int/2addr v1, v0

    .line 140
    return v1
.end method
