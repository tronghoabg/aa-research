.class public final Li0/O;
.super Li0/J;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Object;

.field public final c:I

.field public final d:Le0/m;

.field public final e:F

.field public final f:Le0/m;

.field public final g:F

.field public final h:F

.field public final i:I

.field public final j:I

.field public final k:F

.field public final l:F

.field public final m:F

.field public final n:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ILe0/m;FLe0/m;FFIIFFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/O;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Li0/O;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Li0/O;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Li0/O;->d:Le0/m;

    .line 11
    .line 12
    iput p5, p0, Li0/O;->e:F

    .line 13
    .line 14
    iput-object p6, p0, Li0/O;->f:Le0/m;

    .line 15
    .line 16
    iput p7, p0, Li0/O;->g:F

    .line 17
    .line 18
    iput p8, p0, Li0/O;->h:F

    .line 19
    .line 20
    iput p9, p0, Li0/O;->i:I

    .line 21
    .line 22
    iput p10, p0, Li0/O;->j:I

    .line 23
    .line 24
    iput p11, p0, Li0/O;->k:F

    .line 25
    .line 26
    iput p12, p0, Li0/O;->l:F

    .line 27
    .line 28
    iput p13, p0, Li0/O;->m:F

    .line 29
    .line 30
    iput p14, p0, Li0/O;->n:F

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    if-eqz p1, :cond_6

    .line 6
    .line 7
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 8
    .line 9
    const-class v1, Li0/O;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    check-cast p1, Li0/O;

    .line 32
    .line 33
    iget-object v0, p0, Li0/O;->a:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Li0/O;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, Li0/O;->d:Le0/m;

    .line 46
    .line 47
    iget-object v1, p1, Li0/O;->d:Le0/m;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    iget v0, p0, Li0/O;->e:F

    .line 57
    .line 58
    iget v1, p1, Li0/O;->e:F

    .line 59
    .line 60
    cmpg-float v0, v0, v1

    .line 61
    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    iget-object v0, p0, Li0/O;->f:Le0/m;

    .line 65
    .line 66
    iget-object v1, p1, Li0/O;->f:Le0/m;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    iget v0, p0, Li0/O;->g:F

    .line 76
    .line 77
    iget v1, p1, Li0/O;->g:F

    .line 78
    .line 79
    cmpg-float v0, v0, v1

    .line 80
    .line 81
    if-nez v0, :cond_6

    .line 82
    .line 83
    iget v0, p0, Li0/O;->h:F

    .line 84
    .line 85
    iget v1, p1, Li0/O;->h:F

    .line 86
    .line 87
    cmpg-float v0, v0, v1

    .line 88
    .line 89
    if-nez v0, :cond_6

    .line 90
    .line 91
    iget v0, p0, Li0/O;->i:I

    .line 92
    .line 93
    iget v1, p1, Li0/O;->i:I

    .line 94
    .line 95
    if-ne v0, v1, :cond_6

    .line 96
    .line 97
    iget v0, p0, Li0/O;->j:I

    .line 98
    .line 99
    iget v1, p1, Li0/O;->j:I

    .line 100
    .line 101
    if-ne v0, v1, :cond_6

    .line 102
    .line 103
    iget v0, p0, Li0/O;->k:F

    .line 104
    .line 105
    iget v1, p1, Li0/O;->k:F

    .line 106
    .line 107
    cmpg-float v0, v0, v1

    .line 108
    .line 109
    if-nez v0, :cond_6

    .line 110
    .line 111
    iget v0, p0, Li0/O;->l:F

    .line 112
    .line 113
    iget v1, p1, Li0/O;->l:F

    .line 114
    .line 115
    cmpg-float v0, v0, v1

    .line 116
    .line 117
    if-nez v0, :cond_6

    .line 118
    .line 119
    iget v0, p0, Li0/O;->m:F

    .line 120
    .line 121
    iget v1, p1, Li0/O;->m:F

    .line 122
    .line 123
    cmpg-float v0, v0, v1

    .line 124
    .line 125
    if-nez v0, :cond_6

    .line 126
    .line 127
    iget v0, p0, Li0/O;->n:F

    .line 128
    .line 129
    iget v1, p1, Li0/O;->n:F

    .line 130
    .line 131
    cmpg-float v0, v0, v1

    .line 132
    .line 133
    if-nez v0, :cond_6

    .line 134
    .line 135
    iget v0, p0, Li0/O;->c:I

    .line 136
    .line 137
    iget v1, p1, Li0/O;->c:I

    .line 138
    .line 139
    if-ne v0, v1, :cond_6

    .line 140
    .line 141
    iget-object v0, p0, Li0/O;->b:Ljava/lang/Object;

    .line 142
    .line 143
    iget-object p1, p1, Li0/O;->b:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-nez p1, :cond_5

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    :goto_0
    const/4 p1, 0x1

    .line 153
    return p1

    .line 154
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 155
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Li0/O;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Li0/O;->b:Ljava/lang/Object;

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
    const/4 v0, 0x0

    .line 19
    iget-object v3, p0, Li0/O;->d:Le0/m;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v0

    .line 29
    :goto_0
    add-int/2addr v2, v3

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget v3, p0, Li0/O;->e:F

    .line 32
    .line 33
    invoke-static {v3, v2, v1}, LA/f;->c(FII)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p0, Li0/O;->f:Le0/m;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :cond_1
    add-int/2addr v2, v0

    .line 46
    mul-int/2addr v2, v1

    .line 47
    iget v0, p0, Li0/O;->g:F

    .line 48
    .line 49
    invoke-static {v0, v2, v1}, LA/f;->c(FII)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget v2, p0, Li0/O;->h:F

    .line 54
    .line 55
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget v2, p0, Li0/O;->i:I

    .line 60
    .line 61
    add-int/2addr v0, v2

    .line 62
    mul-int/2addr v0, v1

    .line 63
    iget v2, p0, Li0/O;->j:I

    .line 64
    .line 65
    add-int/2addr v0, v2

    .line 66
    mul-int/2addr v0, v1

    .line 67
    iget v2, p0, Li0/O;->k:F

    .line 68
    .line 69
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget v2, p0, Li0/O;->l:F

    .line 74
    .line 75
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget v2, p0, Li0/O;->m:F

    .line 80
    .line 81
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget v2, p0, Li0/O;->n:F

    .line 86
    .line 87
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget v1, p0, Li0/O;->c:I

    .line 92
    .line 93
    add-int/2addr v0, v1

    .line 94
    return v0
.end method
