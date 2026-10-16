.class public final Lo6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:J

.field public final e:J

.field public final f:Lo6/f;

.field public final g:[Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Lo6/d;

.field public final k:Ljava/util/HashMap;

.field public final l:Ljava/util/HashMap;

.field public m:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLo6/f;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo6/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo6/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lo6/d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p10, p0, Lo6/d;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p7, p0, Lo6/d;->f:Lo6/f;

    .line 11
    .line 12
    iput-object p8, p0, Lo6/d;->g:[Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    iput-boolean p1, p0, Lo6/d;->c:Z

    .line 20
    .line 21
    iput-wide p3, p0, Lo6/d;->d:J

    .line 22
    .line 23
    iput-wide p5, p0, Lo6/d;->e:J

    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object p9, p0, Lo6/d;->h:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p11, p0, Lo6/d;->j:Lo6/d;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lo6/d;->k:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lo6/d;->l:Ljava/util/HashMap;

    .line 45
    .line 46
    return-void
.end method

.method public static a(Ljava/lang/String;)Lo6/d;
    .locals 12

    .line 1
    new-instance v0, Lo6/d;

    .line 2
    .line 3
    const-string v1, "\r\n"

    .line 4
    .line 5
    const-string v2, "\n"

    .line 6
    .line 7
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, " *\n *"

    .line 12
    .line 13
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, " "

    .line 18
    .line 19
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v2, "[ \t\\x0B\u000c\r]+"

    .line 24
    .line 25
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v1, 0x0

    .line 32
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const-string v9, ""

    .line 45
    .line 46
    invoke-direct/range {v0 .. v11}, Lo6/d;-><init>(Ljava/lang/String;Ljava/lang/String;JJLo6/f;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo6/d;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lh6/a;

    .line 8
    .line 9
    invoke-direct {v0}, Lh6/a;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-virtual {p1, p0, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lh6/a;

    .line 27
    .line 28
    iget-object p0, p0, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p0, Landroid/text/SpannableStringBuilder;

    .line 34
    .line 35
    return-object p0
.end method


# virtual methods
.method public final b(I)Lo6/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lo6/d;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lo6/d;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo6/d;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final d(Ljava/util/TreeSet;Z)V
    .locals 6

    .line 1
    const-string v0, "p"

    .line 2
    .line 3
    iget-object v1, p0, Lo6/d;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v2, "div"

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lo6/d;->i:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :cond_0
    iget-wide v1, p0, Lo6/d;->d:J

    .line 26
    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v5, v1, v3

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-wide v1, p0, Lo6/d;->e:J

    .line 44
    .line 45
    cmp-long v3, v1, v3

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p1, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object v1, p0, Lo6/d;->m:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/4 v1, 0x0

    .line 62
    move v2, v1

    .line 63
    :goto_0
    iget-object v3, p0, Lo6/d;->m:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ge v2, v3, :cond_6

    .line 70
    .line 71
    iget-object v3, p0, Lo6/d;->m:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Lo6/d;

    .line 78
    .line 79
    if-nez p2, :cond_5

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v4, v1

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    :goto_1
    const/4 v4, 0x1

    .line 87
    :goto_2
    invoke-virtual {v3, p1, v4}, Lo6/d;->d(Ljava/util/TreeSet;Z)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_6
    :goto_3
    return-void
.end method

.method public final f(J)Z
    .locals 7

    .line 1
    iget-wide v0, p0, Lo6/d;->d:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    iget-wide v5, p0, Lo6/d;->e:J

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    cmp-long v4, v5, v2

    .line 15
    .line 16
    if-eqz v4, :cond_3

    .line 17
    .line 18
    :cond_0
    cmp-long v4, v0, p1

    .line 19
    .line 20
    if-gtz v4, :cond_1

    .line 21
    .line 22
    cmp-long v4, v5, v2

    .line 23
    .line 24
    if-eqz v4, :cond_3

    .line 25
    .line 26
    :cond_1
    cmp-long v2, v0, v2

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    cmp-long v2, p1, v5

    .line 31
    .line 32
    if-ltz v2, :cond_3

    .line 33
    .line 34
    :cond_2
    cmp-long v0, v0, p1

    .line 35
    .line 36
    if-gtz v0, :cond_4

    .line 37
    .line 38
    cmp-long p1, p1, v5

    .line 39
    .line 40
    if-gez p1, :cond_4

    .line 41
    .line 42
    :cond_3
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_4
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public final g(JLjava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-object v1, p0, Lo6/d;->h:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p3, v1

    .line 13
    :goto_0
    invoke-virtual {p0, p1, p2}, Lo6/d;->f(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string v0, "div"

    .line 20
    .line 21
    iget-object v1, p0, Lo6/d;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lo6/d;->i:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-instance p1, Landroid/util/Pair;

    .line 34
    .line 35
    invoke-direct {p1, p3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_1
    invoke-virtual {p0}, Lo6/d;->c()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-ge v0, v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lo6/d;->b(I)Lo6/d;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, p1, p2, p3, p4}, Lo6/d;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    return-void
.end method

.method public final h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v8, 0x1

    .line 7
    invoke-virtual/range {p0 .. p2}, Lo6/d;->f(J)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1c

    .line 14
    .line 15
    :cond_0
    const-string v2, ""

    .line 16
    .line 17
    iget-object v3, v0, Lo6/d;->h:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move-object/from16 v6, p5

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v6, v3

    .line 29
    :goto_0
    iget-object v2, v0, Lo6/d;->l:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2d

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    check-cast v7, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v9, v0, Lo6/d;->k:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v9, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-eqz v10, :cond_2

    .line 64
    .line 65
    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 v9, 0x0

    .line 77
    :goto_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eq v9, v3, :cond_2a

    .line 88
    .line 89
    move-object/from16 v10, p6

    .line 90
    .line 91
    invoke-virtual {v10, v7}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Lh6/a;

    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-object/from16 v11, p4

    .line 101
    .line 102
    invoke-virtual {v11, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    check-cast v12, Lo6/e;

    .line 107
    .line 108
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v13, v0, Lo6/d;->f:Lo6/f;

    .line 112
    .line 113
    iget-object v14, v0, Lo6/d;->g:[Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v13, v14, v4}, LFe/g;->I(Lo6/f;[Ljava/lang/String;Ljava/util/Map;)Lo6/f;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    iget-object v14, v7, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 120
    .line 121
    check-cast v14, Landroid/text/SpannableStringBuilder;

    .line 122
    .line 123
    if-nez v14, :cond_3

    .line 124
    .line 125
    new-instance v14, Landroid/text/SpannableStringBuilder;

    .line 126
    .line 127
    invoke-direct {v14}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-object v14, v7, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 131
    .line 132
    :cond_3
    if-eqz v13, :cond_2b

    .line 133
    .line 134
    iget v15, v13, Lo6/f;->h:I

    .line 135
    .line 136
    if-ne v15, v1, :cond_4

    .line 137
    .line 138
    iget v5, v13, Lo6/f;->i:I

    .line 139
    .line 140
    if-ne v5, v1, :cond_4

    .line 141
    .line 142
    move v5, v1

    .line 143
    goto :goto_5

    .line 144
    :cond_4
    if-ne v15, v8, :cond_5

    .line 145
    .line 146
    move v5, v8

    .line 147
    goto :goto_3

    .line 148
    :cond_5
    const/4 v5, 0x0

    .line 149
    :goto_3
    iget v15, v13, Lo6/f;->i:I

    .line 150
    .line 151
    if-ne v15, v8, :cond_6

    .line 152
    .line 153
    const/4 v15, 0x2

    .line 154
    goto :goto_4

    .line 155
    :cond_6
    const/4 v15, 0x0

    .line 156
    :goto_4
    or-int/2addr v5, v15

    .line 157
    :goto_5
    if-eq v5, v1, :cond_b

    .line 158
    .line 159
    new-instance v5, Landroid/text/style/StyleSpan;

    .line 160
    .line 161
    iget v15, v13, Lo6/f;->h:I

    .line 162
    .line 163
    if-ne v15, v1, :cond_8

    .line 164
    .line 165
    iget v8, v13, Lo6/f;->i:I

    .line 166
    .line 167
    if-ne v8, v1, :cond_7

    .line 168
    .line 169
    move v15, v1

    .line 170
    const/4 v8, 0x1

    .line 171
    goto :goto_8

    .line 172
    :cond_7
    const/4 v8, 0x1

    .line 173
    :cond_8
    if-ne v15, v8, :cond_9

    .line 174
    .line 175
    move/from16 v16, v8

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    const/16 v16, 0x0

    .line 179
    .line 180
    :goto_6
    iget v15, v13, Lo6/f;->i:I

    .line 181
    .line 182
    if-ne v15, v8, :cond_a

    .line 183
    .line 184
    const/4 v15, 0x2

    .line 185
    goto :goto_7

    .line 186
    :cond_a
    const/4 v15, 0x0

    .line 187
    :goto_7
    or-int v15, v16, v15

    .line 188
    .line 189
    :goto_8
    invoke-direct {v5, v15}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 190
    .line 191
    .line 192
    const/16 v15, 0x21

    .line 193
    .line 194
    invoke-interface {v14, v5, v9, v3, v15}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 195
    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_b
    const/16 v15, 0x21

    .line 199
    .line 200
    :goto_9
    iget v5, v13, Lo6/f;->f:I

    .line 201
    .line 202
    if-ne v5, v8, :cond_c

    .line 203
    .line 204
    new-instance v5, Landroid/text/style/StrikethroughSpan;

    .line 205
    .line 206
    invoke-direct {v5}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {v14, v5, v9, v3, v15}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 210
    .line 211
    .line 212
    :cond_c
    iget v5, v13, Lo6/f;->g:I

    .line 213
    .line 214
    if-ne v5, v8, :cond_d

    .line 215
    .line 216
    new-instance v5, Landroid/text/style/UnderlineSpan;

    .line 217
    .line 218
    invoke-direct {v5}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-interface {v14, v5, v9, v3, v15}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 222
    .line 223
    .line 224
    :cond_d
    iget-boolean v5, v13, Lo6/f;->c:Z

    .line 225
    .line 226
    if-eqz v5, :cond_f

    .line 227
    .line 228
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 229
    .line 230
    iget-boolean v8, v13, Lo6/f;->c:Z

    .line 231
    .line 232
    if-eqz v8, :cond_e

    .line 233
    .line 234
    iget v8, v13, Lo6/f;->b:I

    .line 235
    .line 236
    invoke-direct {v5, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v14, v5, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 240
    .line 241
    .line 242
    goto :goto_a

    .line 243
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 244
    .line 245
    const-string v2, "Font color has not been defined."

    .line 246
    .line 247
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v1

    .line 251
    :cond_f
    :goto_a
    iget-boolean v5, v13, Lo6/f;->e:Z

    .line 252
    .line 253
    if-eqz v5, :cond_11

    .line 254
    .line 255
    new-instance v5, Landroid/text/style/BackgroundColorSpan;

    .line 256
    .line 257
    iget-boolean v8, v13, Lo6/f;->e:Z

    .line 258
    .line 259
    if-eqz v8, :cond_10

    .line 260
    .line 261
    iget v8, v13, Lo6/f;->d:I

    .line 262
    .line 263
    invoke-direct {v5, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v14, v5, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 267
    .line 268
    .line 269
    goto :goto_b

    .line 270
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 271
    .line 272
    const-string v2, "Background color has not been defined."

    .line 273
    .line 274
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v1

    .line 278
    :cond_11
    :goto_b
    iget-object v5, v13, Lo6/f;->a:Ljava/lang/String;

    .line 279
    .line 280
    if-eqz v5, :cond_12

    .line 281
    .line 282
    new-instance v5, Landroid/text/style/TypefaceSpan;

    .line 283
    .line 284
    iget-object v8, v13, Lo6/f;->a:Ljava/lang/String;

    .line 285
    .line 286
    invoke-direct {v5, v8}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v14, v5, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 290
    .line 291
    .line 292
    :cond_12
    iget-object v5, v13, Lo6/f;->r:Lo6/b;

    .line 293
    .line 294
    const/4 v8, 0x3

    .line 295
    if-eqz v5, :cond_17

    .line 296
    .line 297
    iget v15, v5, Lo6/b;->a:I

    .line 298
    .line 299
    if-ne v15, v1, :cond_15

    .line 300
    .line 301
    iget v12, v12, Lo6/e;->j:I

    .line 302
    .line 303
    const/4 v15, 0x2

    .line 304
    if-eq v12, v15, :cond_14

    .line 305
    .line 306
    const/4 v15, 0x1

    .line 307
    if-ne v12, v15, :cond_13

    .line 308
    .line 309
    goto :goto_c

    .line 310
    :cond_13
    const/4 v12, 0x1

    .line 311
    goto :goto_d

    .line 312
    :cond_14
    :goto_c
    move v12, v8

    .line 313
    :goto_d
    move v15, v12

    .line 314
    const/4 v12, 0x1

    .line 315
    :goto_e
    move/from16 v17, v1

    .line 316
    .line 317
    goto :goto_f

    .line 318
    :cond_15
    iget v12, v5, Lo6/b;->b:I

    .line 319
    .line 320
    goto :goto_e

    .line 321
    :goto_f
    const/4 v1, -0x2

    .line 322
    iget v5, v5, Lo6/b;->c:I

    .line 323
    .line 324
    if-ne v5, v1, :cond_16

    .line 325
    .line 326
    const/4 v5, 0x1

    .line 327
    :cond_16
    new-instance v1, Ll6/d;

    .line 328
    .line 329
    invoke-direct {v1, v15, v12, v5}, Ll6/d;-><init>(III)V

    .line 330
    .line 331
    .line 332
    invoke-static {v14, v1, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 333
    .line 334
    .line 335
    goto :goto_10

    .line 336
    :cond_17
    move/from16 v17, v1

    .line 337
    .line 338
    :goto_10
    iget v1, v13, Lo6/f;->m:I

    .line 339
    .line 340
    const/4 v15, 0x2

    .line 341
    if-eq v1, v15, :cond_19

    .line 342
    .line 343
    if-eq v1, v8, :cond_18

    .line 344
    .line 345
    const/4 v5, 0x4

    .line 346
    if-eq v1, v5, :cond_18

    .line 347
    .line 348
    :goto_11
    move/from16 v12, v17

    .line 349
    .line 350
    goto/16 :goto_18

    .line 351
    .line 352
    :cond_18
    new-instance v1, Lo6/a;

    .line 353
    .line 354
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 355
    .line 356
    .line 357
    const/16 v15, 0x21

    .line 358
    .line 359
    invoke-interface {v14, v1, v9, v3, v15}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 360
    .line 361
    .line 362
    goto :goto_11

    .line 363
    :cond_19
    iget-object v1, v0, Lo6/d;->j:Lo6/d;

    .line 364
    .line 365
    :goto_12
    if-eqz v1, :cond_1b

    .line 366
    .line 367
    iget-object v12, v1, Lo6/d;->f:Lo6/f;

    .line 368
    .line 369
    iget-object v15, v1, Lo6/d;->g:[Ljava/lang/String;

    .line 370
    .line 371
    invoke-static {v12, v15, v4}, LFe/g;->I(Lo6/f;[Ljava/lang/String;Ljava/util/Map;)Lo6/f;

    .line 372
    .line 373
    .line 374
    move-result-object v12

    .line 375
    if-eqz v12, :cond_1a

    .line 376
    .line 377
    iget v12, v12, Lo6/f;->m:I

    .line 378
    .line 379
    const/4 v15, 0x1

    .line 380
    if-ne v12, v15, :cond_1a

    .line 381
    .line 382
    goto :goto_13

    .line 383
    :cond_1a
    iget-object v1, v1, Lo6/d;->j:Lo6/d;

    .line 384
    .line 385
    goto :goto_12

    .line 386
    :cond_1b
    const/4 v1, 0x0

    .line 387
    :goto_13
    if-nez v1, :cond_1c

    .line 388
    .line 389
    goto :goto_11

    .line 390
    :cond_1c
    new-instance v12, Ljava/util/ArrayDeque;

    .line 391
    .line 392
    invoke-direct {v12}, Ljava/util/ArrayDeque;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :goto_14
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v15

    .line 402
    if-nez v15, :cond_1f

    .line 403
    .line 404
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v15

    .line 408
    check-cast v15, Lo6/d;

    .line 409
    .line 410
    iget-object v5, v15, Lo6/d;->f:Lo6/f;

    .line 411
    .line 412
    iget-object v8, v15, Lo6/d;->g:[Ljava/lang/String;

    .line 413
    .line 414
    invoke-static {v5, v8, v4}, LFe/g;->I(Lo6/f;[Ljava/lang/String;Ljava/util/Map;)Lo6/f;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    if-eqz v5, :cond_1d

    .line 419
    .line 420
    iget v5, v5, Lo6/f;->m:I

    .line 421
    .line 422
    const/4 v8, 0x3

    .line 423
    if-ne v5, v8, :cond_1d

    .line 424
    .line 425
    move-object v5, v15

    .line 426
    goto :goto_16

    .line 427
    :cond_1d
    invoke-virtual {v15}, Lo6/d;->c()I

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    const/16 v16, 0x1

    .line 432
    .line 433
    add-int/lit8 v5, v5, -0x1

    .line 434
    .line 435
    :goto_15
    if-ltz v5, :cond_1e

    .line 436
    .line 437
    invoke-virtual {v15, v5}, Lo6/d;->b(I)Lo6/d;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    invoke-virtual {v12, v8}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    add-int/lit8 v5, v5, -0x1

    .line 445
    .line 446
    goto :goto_15

    .line 447
    :cond_1e
    const/4 v8, 0x3

    .line 448
    goto :goto_14

    .line 449
    :cond_1f
    const/4 v5, 0x0

    .line 450
    :goto_16
    if-nez v5, :cond_20

    .line 451
    .line 452
    goto :goto_11

    .line 453
    :cond_20
    invoke-virtual {v5}, Lo6/d;->c()I

    .line 454
    .line 455
    .line 456
    move-result v8

    .line 457
    const/4 v15, 0x1

    .line 458
    if-ne v8, v15, :cond_23

    .line 459
    .line 460
    const/4 v8, 0x0

    .line 461
    invoke-virtual {v5, v8}, Lo6/d;->b(I)Lo6/d;

    .line 462
    .line 463
    .line 464
    move-result-object v12

    .line 465
    iget-object v12, v12, Lo6/d;->b:Ljava/lang/String;

    .line 466
    .line 467
    if-eqz v12, :cond_23

    .line 468
    .line 469
    invoke-virtual {v5, v8}, Lo6/d;->b(I)Lo6/d;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    iget-object v8, v8, Lo6/d;->b:Ljava/lang/String;

    .line 474
    .line 475
    sget v12, Lu6/v;->a:I

    .line 476
    .line 477
    iget-object v12, v5, Lo6/d;->f:Lo6/f;

    .line 478
    .line 479
    iget-object v5, v5, Lo6/d;->g:[Ljava/lang/String;

    .line 480
    .line 481
    invoke-static {v12, v5, v4}, LFe/g;->I(Lo6/f;[Ljava/lang/String;Ljava/util/Map;)Lo6/f;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    if-eqz v5, :cond_21

    .line 486
    .line 487
    iget v5, v5, Lo6/f;->n:I

    .line 488
    .line 489
    move/from16 v12, v17

    .line 490
    .line 491
    goto :goto_17

    .line 492
    :cond_21
    move/from16 v5, v17

    .line 493
    .line 494
    move v12, v5

    .line 495
    :goto_17
    if-ne v5, v12, :cond_22

    .line 496
    .line 497
    iget-object v15, v1, Lo6/d;->f:Lo6/f;

    .line 498
    .line 499
    iget-object v1, v1, Lo6/d;->g:[Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v15, v1, v4}, LFe/g;->I(Lo6/f;[Ljava/lang/String;Ljava/util/Map;)Lo6/f;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    if-eqz v1, :cond_22

    .line 506
    .line 507
    iget v5, v1, Lo6/f;->n:I

    .line 508
    .line 509
    :cond_22
    new-instance v1, Ll6/c;

    .line 510
    .line 511
    invoke-direct {v1, v8, v5}, Ll6/c;-><init>(Ljava/lang/String;I)V

    .line 512
    .line 513
    .line 514
    const/16 v15, 0x21

    .line 515
    .line 516
    invoke-interface {v14, v1, v9, v3, v15}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 517
    .line 518
    .line 519
    goto :goto_18

    .line 520
    :cond_23
    move/from16 v12, v17

    .line 521
    .line 522
    const-string v1, "TtmlRenderUtil"

    .line 523
    .line 524
    const-string v5, "Skipping rubyText node without exactly one text child."

    .line 525
    .line 526
    invoke-static {v1, v5}, Lu6/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    :goto_18
    iget v1, v13, Lo6/f;->q:I

    .line 530
    .line 531
    const/4 v15, 0x1

    .line 532
    if-ne v1, v15, :cond_24

    .line 533
    .line 534
    new-instance v1, Ll6/a;

    .line 535
    .line 536
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 537
    .line 538
    .line 539
    invoke-static {v14, v1, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 540
    .line 541
    .line 542
    :cond_24
    iget v1, v13, Lo6/f;->j:I

    .line 543
    .line 544
    const/high16 v5, 0x42c80000    # 100.0f

    .line 545
    .line 546
    if-eq v1, v15, :cond_27

    .line 547
    .line 548
    const/4 v15, 0x2

    .line 549
    if-eq v1, v15, :cond_26

    .line 550
    .line 551
    const/4 v8, 0x3

    .line 552
    if-eq v1, v8, :cond_25

    .line 553
    .line 554
    goto :goto_19

    .line 555
    :cond_25
    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    .line 556
    .line 557
    iget v8, v13, Lo6/f;->k:F

    .line 558
    .line 559
    div-float/2addr v8, v5

    .line 560
    invoke-direct {v1, v8}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 561
    .line 562
    .line 563
    invoke-static {v14, v1, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 564
    .line 565
    .line 566
    goto :goto_19

    .line 567
    :cond_26
    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    .line 568
    .line 569
    iget v8, v13, Lo6/f;->k:F

    .line 570
    .line 571
    invoke-direct {v1, v8}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 572
    .line 573
    .line 574
    invoke-static {v14, v1, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 575
    .line 576
    .line 577
    goto :goto_19

    .line 578
    :cond_27
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    .line 579
    .line 580
    iget v8, v13, Lo6/f;->k:F

    .line 581
    .line 582
    float-to-int v8, v8

    .line 583
    const/4 v15, 0x1

    .line 584
    invoke-direct {v1, v8, v15}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 585
    .line 586
    .line 587
    invoke-static {v14, v1, v9, v3}, LFe/e;->i(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 588
    .line 589
    .line 590
    :goto_19
    const-string v1, "p"

    .line 591
    .line 592
    iget-object v3, v0, Lo6/d;->a:Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    if-eqz v1, :cond_2c

    .line 599
    .line 600
    iget v1, v13, Lo6/f;->s:F

    .line 601
    .line 602
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 603
    .line 604
    .line 605
    cmpl-float v3, v1, v3

    .line 606
    .line 607
    if-eqz v3, :cond_28

    .line 608
    .line 609
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 610
    .line 611
    mul-float/2addr v1, v3

    .line 612
    div-float/2addr v1, v5

    .line 613
    iput v1, v7, Lh6/a;->q:F

    .line 614
    .line 615
    :cond_28
    iget-object v1, v13, Lo6/f;->o:Landroid/text/Layout$Alignment;

    .line 616
    .line 617
    if-eqz v1, :cond_29

    .line 618
    .line 619
    iput-object v1, v7, Lh6/a;->c:Landroid/text/Layout$Alignment;

    .line 620
    .line 621
    :cond_29
    iget-object v1, v13, Lo6/f;->p:Landroid/text/Layout$Alignment;

    .line 622
    .line 623
    if-eqz v1, :cond_2c

    .line 624
    .line 625
    iput-object v1, v7, Lh6/a;->d:Landroid/text/Layout$Alignment;

    .line 626
    .line 627
    goto :goto_1a

    .line 628
    :cond_2a
    move-object/from16 v11, p4

    .line 629
    .line 630
    move-object/from16 v10, p6

    .line 631
    .line 632
    :cond_2b
    move v12, v1

    .line 633
    :cond_2c
    :goto_1a
    move v1, v12

    .line 634
    const/4 v8, 0x1

    .line 635
    goto/16 :goto_1

    .line 636
    .line 637
    :cond_2d
    const/4 v8, 0x0

    .line 638
    :goto_1b
    move-object/from16 v11, p4

    .line 639
    .line 640
    move-object/from16 v10, p6

    .line 641
    .line 642
    invoke-virtual {v0}, Lo6/d;->c()I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-ge v8, v1, :cond_2e

    .line 647
    .line 648
    invoke-virtual {v0, v8}, Lo6/d;->b(I)Lo6/d;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    move-wide/from16 v2, p1

    .line 653
    .line 654
    move-object v7, v10

    .line 655
    move-object v5, v11

    .line 656
    invoke-virtual/range {v1 .. v7}, Lo6/d;->h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 657
    .line 658
    .line 659
    const/16 v16, 0x1

    .line 660
    .line 661
    add-int/lit8 v8, v8, 0x1

    .line 662
    .line 663
    move-object/from16 v4, p3

    .line 664
    .line 665
    goto :goto_1b

    .line 666
    :cond_2e
    :goto_1c
    return-void
.end method

.method public final i(JZLjava/lang/String;Ljava/util/TreeMap;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lo6/d;->k:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v6, p0, Lo6/d;->l:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 9
    .line 10
    .line 11
    const-string v1, "metadata"

    .line 12
    .line 13
    iget-object v2, p0, Lo6/d;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_7

    .line 22
    .line 23
    :cond_0
    const-string v1, ""

    .line 24
    .line 25
    iget-object v3, p0, Lo6/d;->h:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    move-object v4, p4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v4, v3

    .line 36
    :goto_0
    iget-boolean p4, p0, Lo6/d;->c:Z

    .line 37
    .line 38
    if-eqz p4, :cond_2

    .line 39
    .line 40
    if-eqz p3, :cond_2

    .line 41
    .line 42
    invoke-static {v4, p5}, Lo6/d;->e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p2, p0, Lo6/d;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    const-string p4, "br"

    .line 56
    .line 57
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    const/16 v7, 0xa

    .line 62
    .line 63
    if-eqz p4, :cond_3

    .line 64
    .line 65
    if-eqz p3, :cond_3

    .line 66
    .line 67
    invoke-static {v4, p5}, Lo6/d;->e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1, v7}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    invoke-virtual/range {p0 .. p2}, Lo6/d;->f(J)Z

    .line 76
    .line 77
    .line 78
    move-result p4

    .line 79
    if-eqz p4, :cond_a

    .line 80
    .line 81
    invoke-virtual {p5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/util/Map$Entry;

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Lh6/a;

    .line 112
    .line 113
    iget-object v1, v1, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    check-cast v1, Ljava/lang/CharSequence;

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const-string p4, "p"

    .line 133
    .line 134
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p4

    .line 138
    const/4 v8, 0x0

    .line 139
    move v9, v8

    .line 140
    :goto_2
    invoke-virtual {p0}, Lo6/d;->c()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    const/4 v1, 0x1

    .line 145
    if-ge v9, v0, :cond_7

    .line 146
    .line 147
    invoke-virtual {p0, v9}, Lo6/d;->b(I)Lo6/d;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-nez p3, :cond_6

    .line 152
    .line 153
    if-eqz p4, :cond_5

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    move v3, v8

    .line 157
    move-wide v1, p1

    .line 158
    move-object v5, p5

    .line 159
    goto :goto_4

    .line 160
    :cond_6
    :goto_3
    move v3, v1

    .line 161
    move-object v5, p5

    .line 162
    move-wide v1, p1

    .line 163
    :goto_4
    invoke-virtual/range {v0 .. v5}, Lo6/d;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v9, v9, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_7
    if-eqz p4, :cond_9

    .line 170
    .line 171
    invoke-static {v4, p5}, Lo6/d;->e(Ljava/lang/String;Ljava/util/TreeMap;)Landroid/text/SpannableStringBuilder;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    sub-int/2addr p2, v1

    .line 180
    :goto_5
    if-ltz p2, :cond_8

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result p3

    .line 186
    const/16 p4, 0x20

    .line 187
    .line 188
    if-ne p3, p4, :cond_8

    .line 189
    .line 190
    add-int/lit8 p2, p2, -0x1

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_8
    if-ltz p2, :cond_9

    .line 194
    .line 195
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eq p2, v7, :cond_9

    .line 200
    .line 201
    invoke-virtual {p1, v7}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 202
    .line 203
    .line 204
    :cond_9
    invoke-virtual {p5}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    if-eqz p2, :cond_a

    .line 217
    .line 218
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    check-cast p2, Ljava/util/Map$Entry;

    .line 223
    .line 224
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p3

    .line 228
    check-cast p3, Ljava/lang/String;

    .line 229
    .line 230
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    check-cast p2, Lh6/a;

    .line 235
    .line 236
    iget-object p2, p2, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    check-cast p2, Ljava/lang/CharSequence;

    .line 242
    .line 243
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    invoke-virtual {v6, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_a
    :goto_7
    return-void
.end method
