.class public final Lb2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/h;


# static fields
.field public static final o:LV1/c;


# instance fields
.field public final a:La2/c;

.field public final b:Lb2/p;

.field public final c:Lae/d;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public f:LZ1/d;

.field public g:Lo2/m;

.field public h:Landroid/os/Handler;

.field public i:La2/n;

.field public j:Lb2/l;

.field public k:Landroid/net/Uri;

.field public l:Lb2/i;

.field public m:Z

.field public n:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LV1/c;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, LV1/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lb2/c;->o:LV1/c;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La2/c;Lae/d;Lb2/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb2/c;->a:La2/c;

    .line 5
    .line 6
    iput-object p3, p0, Lb2/c;->b:Lb2/p;

    .line 7
    .line 8
    iput-object p2, p0, Lb2/c;->c:Lae/d;

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lb2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    new-instance p1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lb2/c;->d:Ljava/util/HashMap;

    .line 23
    .line 24
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide p1, p0, Lb2/c;->n:J

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final A(Lo2/j;JJ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lo2/p;

    .line 6
    .line 7
    iget-object v2, v1, Lo2/p;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lb2/m;

    .line 10
    .line 11
    instance-of v3, v2, Lb2/i;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v2, Lb2/m;->a:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v5, Lb2/l;->n:Lb2/l;

    .line 18
    .line 19
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    new-instance v4, LN1/m;

    .line 24
    .line 25
    invoke-direct {v4}, LN1/m;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v5, "0"

    .line 29
    .line 30
    iput-object v5, v4, LN1/m;->a:Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, "application/x-mpegURL"

    .line 33
    .line 34
    invoke-static {v5}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iput-object v5, v4, LN1/m;->l:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v8, LN1/n;

    .line 41
    .line 42
    invoke-direct {v8, v4}, LN1/n;-><init>(LN1/m;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lb2/k;

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    invoke-direct/range {v6 .. v12}, Lb2/k;-><init>(Landroid/net/Uri;LN1/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    new-instance v7, Lb2/l;

    .line 59
    .line 60
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 61
    .line 62
    sget-object v18, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 63
    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const-string v8, ""

    .line 68
    .line 69
    const/16 v17, 0x0

    .line 70
    .line 71
    move-object v11, v9

    .line 72
    move-object v12, v9

    .line 73
    move-object v13, v9

    .line 74
    move-object v14, v9

    .line 75
    move-object/from16 v19, v9

    .line 76
    .line 77
    invoke-direct/range {v7 .. v19}, Lb2/l;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LN1/n;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move-object v7, v2

    .line 82
    check-cast v7, Lb2/l;

    .line 83
    .line 84
    :goto_0
    iput-object v7, v0, Lb2/c;->j:Lb2/l;

    .line 85
    .line 86
    iget-object v4, v7, Lb2/l;->e:Ljava/util/List;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lb2/k;

    .line 94
    .line 95
    iget-object v4, v4, Lb2/k;->a:Landroid/net/Uri;

    .line 96
    .line 97
    iput-object v4, v0, Lb2/c;->k:Landroid/net/Uri;

    .line 98
    .line 99
    iget-object v4, v0, Lb2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    new-instance v6, Lb2/a;

    .line 102
    .line 103
    invoke-direct {v6, v0}, Lb2/a;-><init>(Lb2/c;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    iget-object v4, v7, Lb2/l;->d:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    move v7, v5

    .line 116
    :goto_1
    if-ge v7, v6, :cond_1

    .line 117
    .line 118
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, Landroid/net/Uri;

    .line 123
    .line 124
    new-instance v9, Lb2/b;

    .line 125
    .line 126
    invoke-direct {v9, v0, v8}, Lb2/b;-><init>(Lb2/c;Landroid/net/Uri;)V

    .line 127
    .line 128
    .line 129
    iget-object v10, v0, Lb2/c;->d:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v10, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    add-int/lit8 v7, v7, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    new-instance v4, Lk2/z;

    .line 138
    .line 139
    iget-object v1, v1, Lo2/p;->d:LS1/z;

    .line 140
    .line 141
    iget-object v1, v1, LS1/z;->c:Landroid/net/Uri;

    .line 142
    .line 143
    move-wide/from16 v6, p4

    .line 144
    .line 145
    invoke-direct {v4, v6, v7}, Lk2/z;-><init>(J)V

    .line 146
    .line 147
    .line 148
    iget-object v1, v0, Lb2/c;->d:Ljava/util/HashMap;

    .line 149
    .line 150
    iget-object v6, v0, Lb2/c;->k:Landroid/net/Uri;

    .line 151
    .line 152
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Lb2/b;

    .line 157
    .line 158
    if-eqz v3, :cond_2

    .line 159
    .line 160
    check-cast v2, Lb2/i;

    .line 161
    .line 162
    invoke-virtual {v1, v2, v4}, Lb2/b;->f(Lb2/i;Lk2/z;)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_2
    invoke-virtual {v1, v5}, Lb2/b;->c(Z)V

    .line 167
    .line 168
    .line 169
    :goto_2
    iget-object v1, v0, Lb2/c;->c:Lae/d;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iget-object v1, v0, Lb2/c;->f:LZ1/d;

    .line 175
    .line 176
    const/4 v2, 0x4

    .line 177
    invoke-virtual {v1, v4, v2}, LZ1/d;->d(Lk2/z;I)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 4

    .line 1
    const/4 p2, 0x0

    .line 2
    check-cast p1, Lo2/p;

    .line 3
    .line 4
    new-instance p3, Lk2/z;

    .line 5
    .line 6
    iget-wide v0, p1, Lo2/p;->a:J

    .line 7
    .line 8
    iget-object v0, p1, Lo2/p;->d:LS1/z;

    .line 9
    .line 10
    iget-object v0, v0, LS1/z;->c:Landroid/net/Uri;

    .line 11
    .line 12
    invoke-direct {p3, p4, p5}, Lk2/z;-><init>(J)V

    .line 13
    .line 14
    .line 15
    iget-object p4, p0, Lb2/c;->c:Lae/d;

    .line 16
    .line 17
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of p4, p6, LN1/D;

    .line 21
    .line 22
    const/4 p5, 0x1

    .line 23
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    if-nez p4, :cond_2

    .line 29
    .line 30
    instance-of p4, p6, Ljava/io/FileNotFoundException;

    .line 31
    .line 32
    if-nez p4, :cond_2

    .line 33
    .line 34
    instance-of p4, p6, LS1/r;

    .line 35
    .line 36
    if-nez p4, :cond_2

    .line 37
    .line 38
    instance-of p4, p6, Lo2/l;

    .line 39
    .line 40
    if-nez p4, :cond_2

    .line 41
    .line 42
    sget p4, LS1/i;->b:I

    .line 43
    .line 44
    move-object p4, p6

    .line 45
    :goto_0
    if-eqz p4, :cond_1

    .line 46
    .line 47
    instance-of v2, p4, LS1/i;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    move-object v2, p4

    .line 52
    check-cast v2, LS1/i;

    .line 53
    .line 54
    iget v2, v2, LS1/i;->a:I

    .line 55
    .line 56
    const/16 v3, 0x7d8

    .line 57
    .line 58
    if-ne v2, v3, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sub-int/2addr p7, p5

    .line 67
    mul-int/lit16 p7, p7, 0x3e8

    .line 68
    .line 69
    const/16 p4, 0x1388

    .line 70
    .line 71
    invoke-static {p7, p4}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    int-to-long v2, p4

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    :goto_1
    move-wide v2, v0

    .line 78
    :goto_2
    cmp-long p4, v2, v0

    .line 79
    .line 80
    if-nez p4, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    move p5, p2

    .line 84
    :goto_3
    iget-object p4, p0, Lb2/c;->f:LZ1/d;

    .line 85
    .line 86
    iget p1, p1, Lo2/p;->c:I

    .line 87
    .line 88
    invoke-virtual {p4, p3, p1, p6, p5}, LZ1/d;->g(Lk2/z;ILjava/io/IOException;Z)V

    .line 89
    .line 90
    .line 91
    if-eqz p5, :cond_4

    .line 92
    .line 93
    sget-object p1, Lo2/m;->f:LU5/f;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_4
    new-instance p1, LU5/f;

    .line 97
    .line 98
    invoke-direct {p1, v2, v3, p2, p2}, LU5/f;-><init>(JIZ)V

    .line 99
    .line 100
    .line 101
    return-object p1
.end method

.method public final a(ZLandroid/net/Uri;)Lb2/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lb2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lb2/b;

    .line 8
    .line 9
    iget-object v1, v1, Lb2/b;->d:Lb2/i;

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    if-eqz p1, :cond_5

    .line 14
    .line 15
    iget-object p1, p0, Lb2/c;->k:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    iget-object p1, p0, Lb2/c;->j:Lb2/l;

    .line 24
    .line 25
    iget-object p1, p1, Lb2/l;->e:Ljava/util/List;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ge v2, v3, :cond_3

    .line 33
    .line 34
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lb2/k;

    .line 39
    .line 40
    iget-object v3, v3, Lb2/k;->a:Landroid/net/Uri;

    .line 41
    .line 42
    invoke-virtual {p2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Lb2/c;->l:Lb2/i;

    .line 49
    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    iget-boolean p1, p1, Lb2/i;->o:Z

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    iput-object p2, p0, Lb2/c;->k:Landroid/net/Uri;

    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lb2/b;

    .line 64
    .line 65
    iget-object v2, p1, Lb2/b;->d:Lb2/i;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-boolean v3, v2, Lb2/i;->o:Z

    .line 70
    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    iput-object v2, p0, Lb2/c;->l:Lb2/i;

    .line 74
    .line 75
    iget-object p1, p0, Lb2/c;->i:La2/n;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, La2/n;->u(Lb2/i;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {p0, p2}, Lb2/c;->b(Landroid/net/Uri;)Landroid/net/Uri;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {p1, v2}, Lb2/b;->e(Landroid/net/Uri;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    :goto_1
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lb2/b;

    .line 97
    .line 98
    iget-object p2, p1, Lb2/b;->d:Lb2/i;

    .line 99
    .line 100
    iget-boolean v0, p1, Lb2/b;->k:Z

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    const/4 v0, 0x1

    .line 106
    iput-boolean v0, p1, Lb2/b;->k:Z

    .line 107
    .line 108
    if-eqz p2, :cond_5

    .line 109
    .line 110
    iget-boolean p2, p2, Lb2/i;->o:Z

    .line 111
    .line 112
    if-nez p2, :cond_5

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Lb2/b;->c(Z)V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_2
    return-object v1
.end method

.method public final b(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    .line 1
    iget-object v0, p0, Lb2/c;->l:Lb2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lb2/i;->v:Lb2/h;

    .line 6
    .line 7
    iget-boolean v1, v1, Lb2/h;->e:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lb2/i;->t:Ll8/j0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lb2/e;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-wide v1, v0, Lb2/e;->b:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "_HLS_msn"

    .line 32
    .line 33
    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 34
    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    iget v0, v0, Lb2/e;->c:I

    .line 38
    .line 39
    if-eq v0, v1, :cond_0

    .line 40
    .line 41
    const-string v1, "_HLS_part"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :cond_1
    return-object p1
.end method

.method public final c(Landroid/net/Uri;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lb2/c;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lb2/b;

    .line 8
    .line 9
    iget-object v0, p1, Lb2/b;->d:Lb2/i;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object v2, p1, Lb2/b;->d:Lb2/i;

    .line 19
    .line 20
    iget-wide v2, v2, Lb2/i;->u:J

    .line 21
    .line 22
    invoke-static {v2, v3}, LQ1/x;->W(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const-wide/16 v4, 0x7530

    .line 27
    .line 28
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    iget-object v4, p1, Lb2/b;->d:Lb2/i;

    .line 33
    .line 34
    iget-boolean v5, v4, Lb2/i;->o:Z

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    if-nez v5, :cond_2

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    iget v4, v4, Lb2/i;->d:I

    .line 41
    .line 42
    if-eq v4, v5, :cond_2

    .line 43
    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    iget-wide v4, p1, Lb2/b;->e:J

    .line 47
    .line 48
    add-long/2addr v4, v2

    .line 49
    cmp-long p1, v4, v0

    .line 50
    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 55
    return p1

    .line 56
    :cond_2
    :goto_1
    return v6
.end method

.method public final w(Lo2/j;JJZ)V
    .locals 11

    .line 1
    check-cast p1, Lo2/p;

    .line 2
    .line 3
    new-instance v1, Lk2/z;

    .line 4
    .line 5
    iget-wide p2, p1, Lo2/p;->a:J

    .line 6
    .line 7
    iget-object p1, p1, Lo2/p;->d:LS1/z;

    .line 8
    .line 9
    iget-object p1, p1, LS1/z;->c:Landroid/net/Uri;

    .line 10
    .line 11
    move-wide p1, p4

    .line 12
    invoke-direct {v1, p1, p2}, Lk2/z;-><init>(J)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lb2/c;->c:Lae/d;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lb2/c;->f:LZ1/d;

    .line 21
    .line 22
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    const/4 v3, -0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-virtual/range {v0 .. v10}, LZ1/d;->c(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
