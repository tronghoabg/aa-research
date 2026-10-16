.class public final LX1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/F;
.implements Lk2/e0;


# static fields
.field public static final A:Ljava/util/regex/Pattern;

.field public static final z:Ljava/util/regex/Pattern;


# instance fields
.field public final a:I

.field public final b:LE4/n;

.field public final c:LS1/A;

.field public final d:LZ1/g;

.field public final e:Lae/d;

.field public final f:LS3/n;

.field public final g:J

.field public final h:Lo2/n;

.field public final i:Lo2/e;

.field public final j:Lk2/n0;

.field public final k:[LX1/a;

.field public final l:La9/b;

.field public final m:LX1/m;

.field public final n:Ljava/util/IdentityHashMap;

.field public final o:LZ1/d;

.field public final p:LZ1/d;

.field public q:Lk2/E;

.field public r:[Ll2/h;

.field public s:[LX1/j;

.field public t:Lk2/n;

.field public u:LY1/c;

.field public v:I

.field public w:Ljava/util/List;

.field public x:Z

.field public y:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CC([1-4])=(.+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LX1/b;->z:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "([1-4])=lang:(\\w+)(,.+)?"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LX1/b;->A:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(ILY1/c;LS3/n;ILE4/n;LS1/A;LZ1/g;LZ1/d;Lae/d;LZ1/d;JLo2/n;Lo2/e;La9/b;LY9/c;LV1/k;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    move-object/from16 v5, p14

    const/4 v6, 0x0

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move/from16 v7, p1

    .line 2
    iput v7, v0, LX1/b;->a:I

    .line 3
    iput-object v1, v0, LX1/b;->u:LY1/c;

    move-object/from16 v7, p3

    .line 4
    iput-object v7, v0, LX1/b;->f:LS3/n;

    .line 5
    iput v2, v0, LX1/b;->v:I

    .line 6
    iput-object v3, v0, LX1/b;->b:LE4/n;

    move-object/from16 v7, p6

    .line 7
    iput-object v7, v0, LX1/b;->c:LS1/A;

    .line 8
    iput-object v4, v0, LX1/b;->d:LZ1/g;

    move-object/from16 v7, p8

    .line 9
    iput-object v7, v0, LX1/b;->p:LZ1/d;

    move-object/from16 v7, p9

    .line 10
    iput-object v7, v0, LX1/b;->e:Lae/d;

    move-object/from16 v7, p10

    .line 11
    iput-object v7, v0, LX1/b;->o:LZ1/d;

    move-wide/from16 v7, p11

    .line 12
    iput-wide v7, v0, LX1/b;->g:J

    move-object/from16 v7, p13

    .line 13
    iput-object v7, v0, LX1/b;->h:Lo2/n;

    .line 14
    iput-object v5, v0, LX1/b;->i:Lo2/e;

    move-object/from16 v7, p15

    .line 15
    iput-object v7, v0, LX1/b;->l:La9/b;

    const/4 v8, 0x1

    .line 16
    iput-boolean v8, v0, LX1/b;->x:Z

    .line 17
    new-instance v9, LX1/m;

    move-object/from16 v10, p16

    invoke-direct {v9, v1, v10, v5}, LX1/m;-><init>(LY1/c;LY9/c;Lo2/e;)V

    iput-object v9, v0, LX1/b;->m:LX1/m;

    .line 18
    new-array v5, v6, [Ll2/h;

    .line 19
    iput-object v5, v0, LX1/b;->r:[Ll2/h;

    .line 20
    new-array v5, v6, [LX1/j;

    iput-object v5, v0, LX1/b;->s:[LX1/j;

    .line 21
    new-instance v5, Ljava/util/IdentityHashMap;

    invoke-direct {v5}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v5, v0, LX1/b;->n:Ljava/util/IdentityHashMap;

    .line 22
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v5, Lk2/n;

    sget-object v7, Ll8/K;->b:Ll8/I;

    .line 24
    sget-object v7, Ll8/e0;->e:Ll8/e0;

    .line 25
    invoke-direct {v5, v7, v7}, Lk2/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 26
    iput-object v5, v0, LX1/b;->t:Lk2/n;

    .line 27
    invoke-virtual {v1, v2}, LY1/c;->b(I)LY1/h;

    move-result-object v1

    .line 28
    iget-object v2, v1, LY1/h;->d:Ljava/util/List;

    iput-object v2, v0, LX1/b;->w:Ljava/util/List;

    .line 29
    iget-object v1, v1, LY1/h;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    .line 30
    new-instance v7, Ljava/util/HashMap;

    invoke-static {v5}, Ll8/s;->a(I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(I)V

    .line 31
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    new-instance v10, Landroid/util/SparseArray;

    invoke-direct {v10, v5}, Landroid/util/SparseArray;-><init>(I)V

    move v11, v6

    :goto_0
    if-ge v11, v5, :cond_0

    .line 33
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LY1/a;

    iget-wide v12, v12, LY1/a;->a:J

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v7, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 35
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    invoke-virtual {v10, v11, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/2addr v11, v8

    goto :goto_0

    :cond_0
    move v11, v6

    :goto_1
    const/4 v12, -0x1

    if-ge v11, v5, :cond_6

    .line 38
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LY1/a;

    .line 39
    iget-object v14, v13, LY1/a;->e:Ljava/util/List;

    .line 40
    const-string v15, "http://dashif.org/guidelines/trickmode"

    invoke-static {v15, v14}, LX1/b;->g(Ljava/lang/String;Ljava/util/List;)LY1/f;

    move-result-object v14

    .line 41
    iget-object v13, v13, LY1/a;->f:Ljava/util/List;

    if-nez v14, :cond_1

    .line 42
    invoke-static {v15, v13}, LX1/b;->g(Ljava/lang/String;Ljava/util/List;)LY1/f;

    move-result-object v14

    :cond_1
    if-eqz v14, :cond_2

    .line 43
    iget-object v14, v14, LY1/f;->b:Ljava/lang/String;

    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    .line 44
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v7, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    if-eqz v14, :cond_2

    .line 45
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_2

    :cond_2
    move v14, v11

    :goto_2
    if-ne v14, v11, :cond_4

    .line 46
    const-string v15, "urn:mpeg:dash:adaptation-set-switching:2016"

    invoke-static {v15, v13}, LX1/b;->g(Ljava/lang/String;Ljava/util/List;)LY1/f;

    move-result-object v13

    if-eqz v13, :cond_4

    .line 47
    sget v15, LQ1/x;->a:I

    .line 48
    iget-object v13, v13, LY1/f;->b:Ljava/lang/String;

    const-string v15, ","

    invoke-virtual {v13, v15, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    .line 49
    array-length v13, v12

    move v15, v6

    :goto_3
    if-ge v15, v13, :cond_4

    aget-object v16, v12, v15

    .line 50
    invoke-static/range {v16 .. v16}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v16

    move/from16 p1, v8

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-eqz v8, :cond_3

    .line 51
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v14, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    move v14, v8

    :cond_3
    add-int/lit8 v15, v15, 0x1

    move/from16 v8, p1

    goto :goto_3

    :cond_4
    move/from16 p1, v8

    if-eq v14, v11, :cond_5

    .line 52
    invoke-virtual {v10, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    .line 53
    invoke-virtual {v10, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    .line 54
    invoke-interface {v12, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 55
    invoke-virtual {v10, v11, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 56
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v11, v11, 0x1

    move/from16 v8, p1

    goto/16 :goto_1

    :cond_6
    move/from16 p1, v8

    .line 57
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v7, v5, [[I

    move v8, v6

    :goto_4
    if-ge v8, v5, :cond_7

    .line 58
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-static {v10}, LS3/f;->K(Ljava/util/Collection;)[I

    move-result-object v10

    aput-object v10, v7, v8

    .line 59
    invoke-static {v10}, Ljava/util/Arrays;->sort([I)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 60
    :cond_7
    new-array v8, v5, [Z

    .line 61
    new-array v9, v5, [[LN1/n;

    move v10, v6

    move v11, v10

    :goto_5
    if-ge v10, v5, :cond_10

    .line 62
    aget-object v13, v7, v10

    .line 63
    array-length v14, v13

    move v15, v6

    :goto_6
    if-ge v15, v14, :cond_a

    aget v12, v13, v15

    .line 64
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LY1/a;

    iget-object v12, v12, LY1/a;->c:Ljava/util/List;

    move-object/from16 v16, v7

    .line 65
    :goto_7
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_9

    .line 66
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LY1/m;

    .line 67
    iget-object v7, v7, LY1/m;->d:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_8

    .line 68
    aput-boolean p1, v8, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_9
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v7, v16

    const/4 v6, 0x0

    const/4 v12, -0x1

    goto :goto_6

    :cond_a
    move-object/from16 v16, v7

    .line 69
    :goto_8
    aget-object v6, v16, v10

    .line 70
    array-length v7, v6

    const/4 v12, 0x0

    :goto_9
    if-ge v12, v7, :cond_e

    aget v13, v6, v12

    .line 71
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LY1/a;

    .line 72
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LY1/a;

    iget-object v13, v13, LY1/a;->d:Ljava/util/List;

    move-object/from16 p3, v6

    const/4 v15, 0x0

    .line 73
    :goto_a
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v6

    if-ge v15, v6, :cond_d

    .line 74
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LY1/f;

    move/from16 v17, v7

    .line 75
    iget-object v7, v6, LY1/f;->a:Ljava/lang/String;

    move-object/from16 p4, v8

    const-string v8, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 76
    new-instance v7, LN1/m;

    invoke-direct {v7}, LN1/m;-><init>()V

    .line 77
    const-string v8, "application/cea-608"

    invoke-static {v8}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, LN1/m;->m:Ljava/lang/String;

    .line 78
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v12, v14, LY1/a;->a:J

    const-string v14, ":cea608"

    .line 79
    invoke-static {v8, v12, v13, v14}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 80
    iput-object v8, v7, LN1/m;->a:Ljava/lang/String;

    .line 81
    new-instance v8, LN1/n;

    invoke-direct {v8, v7}, LN1/n;-><init>(LN1/m;)V

    .line 82
    sget-object v7, LX1/b;->z:Ljava/util/regex/Pattern;

    invoke-static {v6, v7, v8}, LX1/b;->s(LY1/f;Ljava/util/regex/Pattern;LN1/n;)[LN1/n;

    move-result-object v6

    goto :goto_b

    .line 83
    :cond_b
    const-string v7, "urn:scte:dash:cc:cea-708:2015"

    iget-object v8, v6, LY1/f;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 84
    new-instance v7, LN1/m;

    invoke-direct {v7}, LN1/m;-><init>()V

    .line 85
    const-string v8, "application/cea-708"

    invoke-static {v8}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, LN1/m;->m:Ljava/lang/String;

    .line 86
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v12, v14, LY1/a;->a:J

    const-string v14, ":cea708"

    .line 87
    invoke-static {v8, v12, v13, v14}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 88
    iput-object v8, v7, LN1/m;->a:Ljava/lang/String;

    .line 89
    new-instance v8, LN1/n;

    invoke-direct {v8, v7}, LN1/n;-><init>(LN1/m;)V

    .line 90
    sget-object v7, LX1/b;->A:Ljava/util/regex/Pattern;

    invoke-static {v6, v7, v8}, LX1/b;->s(LY1/f;Ljava/util/regex/Pattern;LN1/n;)[LN1/n;

    move-result-object v6

    goto :goto_b

    :cond_c
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v8, p4

    move/from16 v7, v17

    goto :goto_a

    :cond_d
    move/from16 v17, v7

    move-object/from16 p4, v8

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v6, p3

    goto/16 :goto_9

    :cond_e
    move-object/from16 p4, v8

    const/4 v6, 0x0

    .line 91
    new-array v7, v6, [LN1/n;

    move-object v6, v7

    .line 92
    :goto_b
    aput-object v6, v9, v10

    .line 93
    array-length v6, v6

    if-eqz v6, :cond_f

    add-int/lit8 v11, v11, 0x1

    :cond_f
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v8, p4

    move-object/from16 v7, v16

    const/4 v6, 0x0

    const/4 v12, -0x1

    goto/16 :goto_5

    :cond_10
    move-object/from16 v16, v7

    move-object/from16 p4, v8

    add-int/2addr v11, v5

    .line 94
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v6, v11

    .line 95
    new-array v7, v6, [LN1/O;

    .line 96
    new-array v6, v6, [LX1/a;

    const/4 v8, 0x0

    const/4 v10, 0x0

    .line 97
    :goto_c
    const-string v11, "application/x-emsg"

    if-ge v10, v5, :cond_18

    .line 98
    aget-object v12, v16, v10

    .line 99
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 100
    array-length v14, v12

    const/4 v15, 0x0

    :goto_d
    if-ge v15, v14, :cond_11

    move/from16 p3, v5

    aget v5, v12, v15

    .line 101
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LY1/a;

    iget-object v5, v5, LY1/a;->c:Ljava/util/List;

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v15, v15, 0x1

    move/from16 v5, p3

    goto :goto_d

    :cond_11
    move/from16 p3, v5

    .line 102
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v14, v5, [LN1/n;

    const/4 v15, 0x0

    :goto_e
    if-ge v15, v5, :cond_12

    .line 103
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move/from16 p6, v5

    move-object/from16 v5, v17

    check-cast v5, LY1/m;

    iget-object v5, v5, LY1/m;->a:LN1/n;

    move/from16 p12, v8

    .line 104
    invoke-virtual {v5}, LN1/n;->a()LN1/m;

    move-result-object v8

    .line 105
    invoke-interface {v4, v5}, LZ1/g;->l(LN1/n;)I

    move-result v5

    .line 106
    iput v5, v8, LN1/m;->K:I

    .line 107
    new-instance v5, LN1/n;

    invoke-direct {v5, v8}, LN1/n;-><init>(LN1/m;)V

    .line 108
    aput-object v5, v14, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v5, p6

    move/from16 v8, p12

    goto :goto_e

    :cond_12
    move/from16 p12, v8

    const/4 v5, 0x0

    .line 109
    aget v8, v12, v5

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LY1/a;

    move-object v13, v9

    .line 110
    iget-wide v8, v5, LY1/a;->a:J

    const-wide/16 v17, -0x1

    cmp-long v15, v8, v17

    if-eqz v15, :cond_13

    .line 111
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    goto :goto_f

    .line 112
    :cond_13
    const-string v8, "unset:"

    .line 113
    invoke-static {v10, v8}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :goto_f
    add-int/lit8 v9, p12, 0x1

    .line 114
    aget-boolean v15, p4, v10

    if-eqz v15, :cond_14

    add-int/lit8 v15, p12, 0x2

    :goto_10
    move-object/from16 v17, v1

    goto :goto_11

    :cond_14
    move v15, v9

    const/4 v9, -0x1

    goto :goto_10

    .line 115
    :goto_11
    aget-object v1, v13, v10

    array-length v1, v1

    if-eqz v1, :cond_15

    add-int/lit8 v1, v15, 0x1

    goto :goto_12

    :cond_15
    move v1, v15

    const/4 v15, -0x1

    .line 116
    :goto_12
    invoke-static {v3, v14}, LX1/b;->p(LE4/n;[LN1/n;)V

    move/from16 p6, v1

    .line 117
    new-instance v1, LN1/O;

    invoke-direct {v1, v8, v14}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    aput-object v1, v7, p12

    .line 118
    new-instance v1, LX1/a;

    .line 119
    sget-object v14, Ll8/K;->b:Ll8/I;

    .line 120
    sget-object v14, Ll8/e0;->e:Ll8/e0;

    const/16 v18, 0x0

    const/16 v19, -0x1

    .line 121
    iget v5, v5, LY1/a;->b:I

    move-object/from16 p8, v1

    move/from16 p9, v5

    move/from16 p13, v9

    move-object/from16 p11, v12

    move-object/from16 p16, v14

    move/from16 p14, v15

    move/from16 p10, v18

    move/from16 p15, v19

    invoke-direct/range {p8 .. p16}, LX1/a;-><init>(II[IIIIILl8/e0;)V

    move-object/from16 v12, p8

    move-object/from16 v5, p11

    move/from16 v1, p12

    .line 122
    aput-object v12, v6, v1

    const/4 v12, -0x1

    if-eq v9, v12, :cond_16

    .line 123
    const-string v12, ":emsg"

    .line 124
    invoke-static {v8, v12}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move/from16 p12, v1

    .line 125
    new-instance v1, LN1/m;

    invoke-direct {v1}, LN1/m;-><init>()V

    .line 126
    iput-object v12, v1, LN1/m;->a:Ljava/lang/String;

    .line 127
    invoke-static {v11}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v1, LN1/m;->m:Ljava/lang/String;

    .line 128
    new-instance v11, LN1/n;

    invoke-direct {v11, v1}, LN1/n;-><init>(LN1/m;)V

    .line 129
    new-instance v1, LN1/O;

    move/from16 v4, p1

    move-object/from16 p11, v5

    new-array v5, v4, [LN1/n;

    const/4 v4, 0x0

    aput-object v11, v5, v4

    invoke-direct {v1, v12, v5}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    aput-object v1, v7, v9

    .line 130
    new-instance v1, LX1/a;

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v11, 0x5

    const/4 v12, -0x1

    const/16 v18, -0x1

    move-object/from16 p8, v1

    move/from16 p10, v4

    move/from16 p13, v5

    move/from16 p9, v11

    move/from16 p14, v12

    move-object/from16 p16, v14

    move/from16 p15, v18

    .line 131
    invoke-direct/range {p8 .. p16}, LX1/a;-><init>(II[IIIIILl8/e0;)V

    move-object/from16 v4, p8

    move-object/from16 v5, p11

    move/from16 v1, p12

    .line 132
    aput-object v4, v6, v9

    const/4 v12, -0x1

    :cond_16
    if-eq v15, v12, :cond_17

    .line 133
    const-string v4, ":cc"

    .line 134
    invoke-static {v8, v4}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 135
    aget-object v8, v13, v10

    .line 136
    invoke-static {v8}, Ll8/K;->k([Ljava/lang/Object;)Ll8/e0;

    move-result-object v8

    .line 137
    new-instance v9, LX1/a;

    const/4 v11, -0x1

    const/4 v14, -0x1

    const/16 v18, 0x3

    const/16 v19, 0x1

    const/16 v20, -0x1

    move/from16 p12, v1

    move-object/from16 p11, v5

    move-object/from16 p16, v8

    move-object/from16 p8, v9

    move/from16 p14, v11

    move/from16 p15, v14

    move/from16 p9, v18

    move/from16 p10, v19

    move/from16 p13, v20

    invoke-direct/range {p8 .. p16}, LX1/a;-><init>(II[IIIIILl8/e0;)V

    move-object/from16 v1, p8

    .line 138
    aput-object v1, v6, v15

    .line 139
    aget-object v1, v13, v10

    invoke-static {v3, v1}, LX1/b;->p(LE4/n;[LN1/n;)V

    .line 140
    new-instance v1, LN1/O;

    aget-object v5, v13, v10

    invoke-direct {v1, v4, v5}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    aput-object v1, v7, v15

    :cond_17
    const/4 v4, 0x1

    add-int/2addr v10, v4

    move/from16 v5, p3

    move/from16 v8, p6

    move/from16 p1, v4

    move-object v9, v13

    move-object/from16 v1, v17

    move-object/from16 v4, p7

    goto/16 :goto_c

    :cond_18
    move v1, v8

    const/4 v1, 0x0

    .line 141
    :goto_13
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_19

    .line 142
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY1/g;

    .line 143
    new-instance v4, LN1/m;

    invoke-direct {v4}, LN1/m;-><init>()V

    .line 144
    invoke-virtual {v3}, LY1/g;->a()Ljava/lang/String;

    move-result-object v5

    .line 145
    iput-object v5, v4, LN1/m;->a:Ljava/lang/String;

    .line 146
    invoke-static {v11}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, LN1/m;->m:Ljava/lang/String;

    .line 147
    new-instance v5, LN1/n;

    invoke-direct {v5, v4}, LN1/n;-><init>(LN1/m;)V

    .line 148
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, LY1/g;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 149
    new-instance v4, LN1/O;

    const/4 v9, 0x1

    new-array v10, v9, [LN1/n;

    const/4 v12, 0x0

    aput-object v5, v10, v12

    invoke-direct {v4, v3, v10}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    aput-object v4, v7, v8

    add-int/lit8 v3, v8, 0x1

    .line 150
    new-instance v4, LX1/a;

    new-array v5, v12, [I

    .line 151
    sget-object v9, Ll8/K;->b:Ll8/I;

    .line 152
    sget-object v9, Ll8/e0;->e:Ll8/e0;

    const/4 v10, 0x2

    const/4 v13, -0x1

    const/4 v14, 0x5

    const/4 v15, -0x1

    const/16 v16, -0x1

    move/from16 p12, v1

    move-object/from16 p5, v4

    move-object/from16 p8, v5

    move-object/from16 p13, v9

    move/from16 p7, v10

    move/from16 p9, v13

    move/from16 p6, v14

    move/from16 p10, v15

    move/from16 p11, v16

    .line 153
    invoke-direct/range {p5 .. p13}, LX1/a;-><init>(II[IIIIILl8/e0;)V

    .line 154
    aput-object v4, v6, v8

    const/4 v4, 0x1

    add-int/2addr v1, v4

    move v8, v3

    goto :goto_13

    .line 155
    :cond_19
    new-instance v1, Lk2/n0;

    invoke-direct {v1, v7}, Lk2/n0;-><init>([LN1/O;)V

    invoke-static {v1, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    .line 156
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lk2/n0;

    iput-object v2, v0, LX1/b;->j:Lk2/n0;

    .line 157
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [LX1/a;

    iput-object v1, v0, LX1/b;->k:[LX1/a;

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/util/List;)LY1/f;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LY1/f;

    .line 13
    .line 14
    iget-object v2, v1, LY1/f;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static p(LE4/n;[LN1/n;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_2

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    iget-object v2, p0, LE4/n;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LE4/F;

    .line 10
    .line 11
    iget-boolean v3, v2, LE4/F;->b:Z

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    iget-object v3, v2, LE4/F;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lwa/a;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Lwa/a;->d(LN1/n;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, LN1/n;->a()LN1/m;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "application/x-media3-cues"

    .line 30
    .line 31
    invoke-static {v4}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iput-object v4, v3, LN1/m;->m:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v2, v2, LE4/F;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lwa/a;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Lwa/a;->g(LN1/n;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iput v2, v3, LN1/m;->H:I

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v4, v1, LN1/n;->n:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, v1, LN1/n;->k:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    const-string v4, " "

    .line 62
    .line 63
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    const-string v1, ""

    .line 69
    .line 70
    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v3, LN1/m;->j:Ljava/lang/String;

    .line 78
    .line 79
    const-wide v1, 0x7fffffffffffffffL

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    iput-wide v1, v3, LN1/m;->r:J

    .line 85
    .line 86
    new-instance v1, LN1/n;

    .line 87
    .line 88
    invoke-direct {v1, v3}, LN1/n;-><init>(LN1/m;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    aput-object v1, p1, v0

    .line 92
    .line 93
    add-int/lit8 v0, v0, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    return-void
.end method

.method public static s(LY1/f;Ljava/util/regex/Pattern;LN1/n;)[LN1/n;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object p0, p0, LY1/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-array p0, v1, [LN1/n;

    .line 8
    .line 9
    aput-object p2, p0, v0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget v2, LQ1/x;->a:I

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    const-string v3, ";"

    .line 16
    .line 17
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    array-length v2, p0

    .line 22
    new-array v2, v2, [LN1/n;

    .line 23
    .line 24
    move v3, v0

    .line 25
    :goto_0
    array-length v4, p0

    .line 26
    if-ge v3, v4, :cond_2

    .line 27
    .line 28
    aget-object v4, p0, v3

    .line 29
    .line 30
    invoke-virtual {p1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_1

    .line 39
    .line 40
    new-array p0, v1, [LN1/n;

    .line 41
    .line 42
    aput-object p2, p0, v0

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {p2}, LN1/n;->a()LN1/m;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v7, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    iget-object v8, p2, LN1/n;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v8, ":"

    .line 68
    .line 69
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iput-object v7, v6, LN1/m;->a:Ljava/lang/String;

    .line 80
    .line 81
    iput v5, v6, LN1/m;->G:I

    .line 82
    .line 83
    const/4 v5, 0x2

    .line 84
    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iput-object v4, v6, LN1/m;->d:Ljava/lang/String;

    .line 89
    .line 90
    new-instance v4, LN1/n;

    .line 91
    .line 92
    invoke-direct {v4, v6}, LN1/n;-><init>(LN1/m;)V

    .line 93
    .line 94
    .line 95
    aput-object v4, v2, v3

    .line 96
    .line 97
    add-int/2addr v3, v1

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    return-object v2
.end method


# virtual methods
.method public final a(Lk2/f0;)V
    .locals 0

    .line 1
    iget-object p1, p0, LX1/b;->q:Lk2/E;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lk2/e0;->a(Lk2/f0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(JLU1/a0;)J
    .locals 6

    .line 1
    iget-object v0, p0, LX1/b;->r:[Ll2/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, Ll2/h;->a:I

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    if-ne v4, v5, :cond_0

    .line 13
    .line 14
    iget-object v0, v3, Ll2/h;->e:Ll2/i;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Ll2/i;->b(JLU1/a0;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-wide p1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, LX1/b;->t:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/n;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d(J)J
    .locals 6

    .line 1
    iget-object v0, p0, LX1/b;->r:[Ll2/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4, p1, p2}, Ll2/h;->z(J)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v3, v3, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, LX1/b;->s:[LX1/j;

    .line 17
    .line 18
    array-length v1, v0

    .line 19
    :goto_1
    if-ge v2, v1, :cond_2

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    iget-object v4, v3, LX1/j;->c:[J

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-static {v4, p1, p2, v5}, LQ1/x;->a([JJZ)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    iput v4, v3, LX1/j;->g:I

    .line 31
    .line 32
    iget-boolean v5, v3, LX1/j;->d:Z

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget-object v5, v3, LX1/j;->c:[J

    .line 37
    .line 38
    array-length v5, v5

    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    move-wide v4, p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    :goto_2
    iput-wide v4, v3, LX1/j;->h:J

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-wide p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LX1/b;->t:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/n;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()J
    .locals 6

    .line 1
    iget-object v0, p0, LX1/b;->r:[Ll2/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-boolean v5, v4, Ll2/h;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    iput-boolean v2, v4, Ll2/h;->x:Z

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    iget-wide v0, p0, LX1/b;->y:J

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    iput-boolean v2, v4, Ll2/h;->x:Z

    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    return-wide v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, LX1/b;->h:Lo2/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lo2/n;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(J)V
    .locals 4

    .line 1
    iget-object v0, p0, LX1/b;->r:[Ll2/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2}, Ll2/h;->i(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final j()Lk2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/b;->j:Lk2/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(LU1/C;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LX1/b;->t:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk2/n;->k(LU1/C;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final m(I[I)I
    .locals 4

    .line 1
    aget p1, p2, p1

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v1, p0, LX1/b;->k:[LX1/a;

    .line 8
    .line 9
    aget-object p1, v1, p1

    .line 10
    .line 11
    iget p1, p1, LX1/a;->e:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    array-length v3, p2

    .line 15
    if-ge v2, v3, :cond_2

    .line 16
    .line 17
    aget v3, p2, v2

    .line 18
    .line 19
    if-ne v3, p1, :cond_1

    .line 20
    .line 21
    aget-object v3, v1, v3

    .line 22
    .line 23
    iget v3, v3, LX1/a;->c:I

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    return v0
.end method

.method public final n()J
    .locals 2

    .line 1
    iget-object v0, p0, LX1/b;->t:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/n;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final o(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LX1/b;->t:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk2/n;->o(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Lk2/E;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LX1/b;->q:Lk2/E;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lk2/E;->l(Lk2/F;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r([Ln2/q;[Z[Lk2/d0;[ZJ)J
    .locals 35

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    array-length v1, v14

    .line 7
    new-array v1, v1, [I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    array-length v4, v14

    .line 12
    const/4 v6, -0x1

    .line 13
    if-ge v3, v4, :cond_1

    .line 14
    .line 15
    aget-object v4, v14, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v6, v5, LX1/b;->j:Lk2/n0;

    .line 20
    .line 21
    invoke-interface {v4}, Ln2/q;->g()LN1/O;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v6, v4}, Lk2/n0;->b(LN1/O;)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    aput v4, v1, v3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    aput v6, v1, v3

    .line 33
    .line 34
    :goto_1
    add-int/2addr v3, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v3, v2

    .line 37
    :goto_2
    array-length v4, v14

    .line 38
    const/16 v16, 0x0

    .line 39
    .line 40
    if-ge v3, v4, :cond_6

    .line 41
    .line 42
    aget-object v4, v14, v3

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    aget-boolean v4, p2, v3

    .line 47
    .line 48
    if-nez v4, :cond_5

    .line 49
    .line 50
    :cond_2
    aget-object v4, p3, v3

    .line 51
    .line 52
    instance-of v7, v4, Ll2/h;

    .line 53
    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    check-cast v4, Ll2/h;

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ll2/h;->y(LX1/b;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    instance-of v7, v4, Ll2/g;

    .line 63
    .line 64
    if-eqz v7, :cond_4

    .line 65
    .line 66
    check-cast v4, Ll2/g;

    .line 67
    .line 68
    iget-object v7, v4, Ll2/g;->e:Ll2/h;

    .line 69
    .line 70
    iget-object v8, v7, Ll2/h;->d:[Z

    .line 71
    .line 72
    iget v4, v4, Ll2/g;->c:I

    .line 73
    .line 74
    aget-boolean v8, v8, v4

    .line 75
    .line 76
    invoke-static {v8}, LQ1/k;->g(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v7, v7, Ll2/h;->d:[Z

    .line 80
    .line 81
    aput-boolean v2, v7, v4

    .line 82
    .line 83
    :cond_4
    :goto_3
    aput-object v16, p3, v3

    .line 84
    .line 85
    :cond_5
    add-int/2addr v3, v0

    .line 86
    goto :goto_2

    .line 87
    :cond_6
    move v3, v2

    .line 88
    :goto_4
    array-length v4, v14

    .line 89
    if-ge v3, v4, :cond_c

    .line 90
    .line 91
    aget-object v4, p3, v3

    .line 92
    .line 93
    instance-of v7, v4, Lk2/w;

    .line 94
    .line 95
    if-nez v7, :cond_7

    .line 96
    .line 97
    instance-of v4, v4, Ll2/g;

    .line 98
    .line 99
    if-eqz v4, :cond_b

    .line 100
    .line 101
    :cond_7
    invoke-virtual {v5, v3, v1}, LX1/b;->m(I[I)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-ne v4, v6, :cond_8

    .line 106
    .line 107
    aget-object v4, p3, v3

    .line 108
    .line 109
    instance-of v4, v4, Lk2/w;

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_8
    aget-object v7, p3, v3

    .line 113
    .line 114
    instance-of v8, v7, Ll2/g;

    .line 115
    .line 116
    if-eqz v8, :cond_9

    .line 117
    .line 118
    check-cast v7, Ll2/g;

    .line 119
    .line 120
    iget-object v7, v7, Ll2/g;->a:Ll2/h;

    .line 121
    .line 122
    aget-object v4, p3, v4

    .line 123
    .line 124
    if-ne v7, v4, :cond_9

    .line 125
    .line 126
    move v4, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_9
    move v4, v2

    .line 129
    :goto_5
    if-nez v4, :cond_b

    .line 130
    .line 131
    aget-object v4, p3, v3

    .line 132
    .line 133
    instance-of v7, v4, Ll2/g;

    .line 134
    .line 135
    if-eqz v7, :cond_a

    .line 136
    .line 137
    check-cast v4, Ll2/g;

    .line 138
    .line 139
    iget-object v7, v4, Ll2/g;->e:Ll2/h;

    .line 140
    .line 141
    iget-object v8, v7, Ll2/h;->d:[Z

    .line 142
    .line 143
    iget v4, v4, Ll2/g;->c:I

    .line 144
    .line 145
    aget-boolean v8, v8, v4

    .line 146
    .line 147
    invoke-static {v8}, LQ1/k;->g(Z)V

    .line 148
    .line 149
    .line 150
    iget-object v7, v7, Ll2/h;->d:[Z

    .line 151
    .line 152
    aput-boolean v2, v7, v4

    .line 153
    .line 154
    :cond_a
    aput-object v16, p3, v3

    .line 155
    .line 156
    :cond_b
    add-int/2addr v3, v0

    .line 157
    goto :goto_4

    .line 158
    :cond_c
    move v3, v2

    .line 159
    :goto_6
    array-length v4, v14

    .line 160
    if-ge v3, v4, :cond_18

    .line 161
    .line 162
    aget-object v24, v14, v3

    .line 163
    .line 164
    if-nez v24, :cond_d

    .line 165
    .line 166
    move v14, v0

    .line 167
    move-object/from16 v34, v1

    .line 168
    .line 169
    move/from16 v33, v2

    .line 170
    .line 171
    move/from16 v17, v3

    .line 172
    .line 173
    move-wide/from16 v0, p5

    .line 174
    .line 175
    goto/16 :goto_d

    .line 176
    .line 177
    :cond_d
    aget-object v4, p3, v3

    .line 178
    .line 179
    if-nez v4, :cond_16

    .line 180
    .line 181
    aput-boolean v0, p4, v3

    .line 182
    .line 183
    aget v4, v1, v3

    .line 184
    .line 185
    iget-object v7, v5, LX1/b;->k:[LX1/a;

    .line 186
    .line 187
    aget-object v4, v7, v4

    .line 188
    .line 189
    iget v7, v4, LX1/a;->c:I

    .line 190
    .line 191
    if-nez v7, :cond_15

    .line 192
    .line 193
    iget v7, v4, LX1/a;->f:I

    .line 194
    .line 195
    if-eq v7, v6, :cond_e

    .line 196
    .line 197
    move/from16 v30, v0

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_e
    move/from16 v30, v2

    .line 201
    .line 202
    :goto_7
    if-eqz v30, :cond_f

    .line 203
    .line 204
    iget-object v8, v5, LX1/b;->j:Lk2/n0;

    .line 205
    .line 206
    invoke-virtual {v8, v7}, Lk2/n0;->a(I)LN1/O;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    move v8, v0

    .line 211
    goto :goto_8

    .line 212
    :cond_f
    move v8, v2

    .line 213
    move-object/from16 v7, v16

    .line 214
    .line 215
    :goto_8
    iget v9, v4, LX1/a;->g:I

    .line 216
    .line 217
    if-eq v9, v6, :cond_10

    .line 218
    .line 219
    iget-object v10, v5, LX1/b;->k:[LX1/a;

    .line 220
    .line 221
    aget-object v9, v10, v9

    .line 222
    .line 223
    iget-object v9, v9, LX1/a;->h:Ll8/e0;

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_10
    sget-object v9, Ll8/K;->b:Ll8/I;

    .line 227
    .line 228
    sget-object v9, Ll8/e0;->e:Ll8/e0;

    .line 229
    .line 230
    :goto_9
    iget v10, v9, Ll8/e0;->d:I

    .line 231
    .line 232
    add-int/2addr v10, v8

    .line 233
    move v8, v3

    .line 234
    new-array v3, v10, [LN1/n;

    .line 235
    .line 236
    new-array v10, v10, [I

    .line 237
    .line 238
    if-eqz v30, :cond_11

    .line 239
    .line 240
    iget-object v7, v7, LN1/O;->d:[LN1/n;

    .line 241
    .line 242
    aget-object v7, v7, v2

    .line 243
    .line 244
    aput-object v7, v3, v2

    .line 245
    .line 246
    const/4 v7, 0x5

    .line 247
    aput v7, v10, v2

    .line 248
    .line 249
    move v7, v0

    .line 250
    goto :goto_a

    .line 251
    :cond_11
    move v7, v2

    .line 252
    :goto_a
    new-instance v11, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 255
    .line 256
    .line 257
    move v12, v2

    .line 258
    :goto_b
    iget v13, v9, Ll8/e0;->d:I

    .line 259
    .line 260
    if-ge v12, v13, :cond_12

    .line 261
    .line 262
    invoke-virtual {v9, v12}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    check-cast v13, LN1/n;

    .line 267
    .line 268
    aput-object v13, v3, v7

    .line 269
    .line 270
    const/16 v17, 0x3

    .line 271
    .line 272
    aput v17, v10, v7

    .line 273
    .line 274
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    add-int/2addr v7, v0

    .line 278
    add-int/2addr v12, v0

    .line 279
    goto :goto_b

    .line 280
    :cond_12
    iget-object v7, v5, LX1/b;->u:LY1/c;

    .line 281
    .line 282
    iget-boolean v7, v7, LY1/c;->d:Z

    .line 283
    .line 284
    if-eqz v7, :cond_13

    .line 285
    .line 286
    if-eqz v30, :cond_13

    .line 287
    .line 288
    iget-object v7, v5, LX1/b;->m:LX1/m;

    .line 289
    .line 290
    new-instance v9, LX1/l;

    .line 291
    .line 292
    iget-object v12, v7, LX1/m;->a:Lo2/e;

    .line 293
    .line 294
    invoke-direct {v9, v7, v12}, LX1/l;-><init>(LX1/m;Lo2/e;)V

    .line 295
    .line 296
    .line 297
    move-object/from16 v32, v9

    .line 298
    .line 299
    goto :goto_c

    .line 300
    :cond_13
    move-object/from16 v32, v16

    .line 301
    .line 302
    :goto_c
    iget-object v7, v5, LX1/b;->b:LE4/n;

    .line 303
    .line 304
    iget-object v9, v5, LX1/b;->h:Lo2/n;

    .line 305
    .line 306
    iget-object v12, v5, LX1/b;->u:LY1/c;

    .line 307
    .line 308
    iget-object v13, v5, LX1/b;->f:LS3/n;

    .line 309
    .line 310
    iget v0, v5, LX1/b;->v:I

    .line 311
    .line 312
    iget-object v2, v4, LX1/a;->a:[I

    .line 313
    .line 314
    iget v6, v4, LX1/a;->b:I

    .line 315
    .line 316
    move/from16 v22, v0

    .line 317
    .line 318
    move-object/from16 v34, v1

    .line 319
    .line 320
    iget-wide v0, v5, LX1/b;->g:J

    .line 321
    .line 322
    move-wide/from16 v27, v0

    .line 323
    .line 324
    iget-object v0, v5, LX1/b;->c:LS1/A;

    .line 325
    .line 326
    iget-object v1, v7, LE4/n;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, LS1/g;

    .line 329
    .line 330
    invoke-interface {v1}, LS1/g;->b()LS1/h;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    if-eqz v0, :cond_14

    .line 335
    .line 336
    invoke-interface {v1, v0}, LS1/h;->C(LS1/A;)V

    .line 337
    .line 338
    .line 339
    :cond_14
    new-instance v17, LX1/i;

    .line 340
    .line 341
    iget-object v0, v7, LE4/n;->d:Ljava/lang/Object;

    .line 342
    .line 343
    move-object/from16 v18, v0

    .line 344
    .line 345
    check-cast v18, LE4/F;

    .line 346
    .line 347
    iget v0, v7, LE4/n;->b:I

    .line 348
    .line 349
    move/from16 v29, v0

    .line 350
    .line 351
    move-object/from16 v26, v1

    .line 352
    .line 353
    move-object/from16 v23, v2

    .line 354
    .line 355
    move/from16 v25, v6

    .line 356
    .line 357
    move-object/from16 v19, v9

    .line 358
    .line 359
    move-object/from16 v31, v11

    .line 360
    .line 361
    move-object/from16 v20, v12

    .line 362
    .line 363
    move-object/from16 v21, v13

    .line 364
    .line 365
    invoke-direct/range {v17 .. v32}, LX1/i;-><init>(LE4/F;Lo2/n;LY1/c;LS3/n;I[ILn2/q;ILS1/h;JIZLjava/util/ArrayList;LX1/l;)V

    .line 366
    .line 367
    .line 368
    new-instance v0, Ll2/h;

    .line 369
    .line 370
    iget v1, v4, LX1/a;->b:I

    .line 371
    .line 372
    iget-object v6, v5, LX1/b;->i:Lo2/e;

    .line 373
    .line 374
    iget-object v9, v5, LX1/b;->d:LZ1/g;

    .line 375
    .line 376
    move-object v2, v10

    .line 377
    iget-object v10, v5, LX1/b;->p:LZ1/d;

    .line 378
    .line 379
    iget-object v11, v5, LX1/b;->e:Lae/d;

    .line 380
    .line 381
    iget-object v12, v5, LX1/b;->o:LZ1/d;

    .line 382
    .line 383
    iget-boolean v13, v5, LX1/b;->x:Z

    .line 384
    .line 385
    move-object/from16 v4, v17

    .line 386
    .line 387
    move-object/from16 v15, v32

    .line 388
    .line 389
    const/4 v14, 0x1

    .line 390
    const/16 v33, 0x0

    .line 391
    .line 392
    move/from16 v17, v8

    .line 393
    .line 394
    move-wide/from16 v7, p5

    .line 395
    .line 396
    invoke-direct/range {v0 .. v13}, Ll2/h;-><init>(I[I[LN1/n;Ll2/i;Lk2/e0;Lo2/e;JLZ1/g;LZ1/d;Lae/d;LZ1/d;Z)V

    .line 397
    .line 398
    .line 399
    move-object v2, v0

    .line 400
    move-wide v0, v7

    .line 401
    monitor-enter p0

    .line 402
    :try_start_0
    iget-object v3, v5, LX1/b;->n:Ljava/util/IdentityHashMap;

    .line 403
    .line 404
    invoke-virtual {v3, v2, v15}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 408
    aput-object v2, p3, v17

    .line 409
    .line 410
    goto :goto_d

    .line 411
    :catchall_0
    move-exception v0

    .line 412
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 413
    throw v0

    .line 414
    :cond_15
    move v14, v0

    .line 415
    move-object/from16 v34, v1

    .line 416
    .line 417
    move/from16 v33, v2

    .line 418
    .line 419
    move/from16 v17, v3

    .line 420
    .line 421
    move-object/from16 v2, v24

    .line 422
    .line 423
    move-wide/from16 v0, p5

    .line 424
    .line 425
    const/4 v3, 0x2

    .line 426
    if-ne v7, v3, :cond_17

    .line 427
    .line 428
    iget-object v3, v5, LX1/b;->w:Ljava/util/List;

    .line 429
    .line 430
    iget v4, v4, LX1/a;->d:I

    .line 431
    .line 432
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    check-cast v3, LY1/g;

    .line 437
    .line 438
    invoke-interface {v2}, Ln2/q;->g()LN1/O;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    iget-object v2, v2, LN1/O;->d:[LN1/n;

    .line 443
    .line 444
    aget-object v2, v2, v33

    .line 445
    .line 446
    new-instance v4, LX1/j;

    .line 447
    .line 448
    iget-object v6, v5, LX1/b;->u:LY1/c;

    .line 449
    .line 450
    iget-boolean v6, v6, LY1/c;->d:Z

    .line 451
    .line 452
    invoke-direct {v4, v3, v2, v6}, LX1/j;-><init>(LY1/g;LN1/n;Z)V

    .line 453
    .line 454
    .line 455
    aput-object v4, p3, v17

    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_16
    move v14, v0

    .line 459
    move-object/from16 v34, v1

    .line 460
    .line 461
    move/from16 v33, v2

    .line 462
    .line 463
    move/from16 v17, v3

    .line 464
    .line 465
    move-object/from16 v2, v24

    .line 466
    .line 467
    move-wide/from16 v0, p5

    .line 468
    .line 469
    instance-of v3, v4, Ll2/h;

    .line 470
    .line 471
    if-eqz v3, :cond_17

    .line 472
    .line 473
    check-cast v4, Ll2/h;

    .line 474
    .line 475
    iget-object v3, v4, Ll2/h;->e:Ll2/i;

    .line 476
    .line 477
    check-cast v3, LX1/i;

    .line 478
    .line 479
    iput-object v2, v3, LX1/i;->j:Ln2/q;

    .line 480
    .line 481
    :cond_17
    :goto_d
    add-int/lit8 v3, v17, 0x1

    .line 482
    .line 483
    move v0, v14

    .line 484
    move/from16 v2, v33

    .line 485
    .line 486
    move-object/from16 v1, v34

    .line 487
    .line 488
    const/4 v6, -0x1

    .line 489
    move-object/from16 v14, p1

    .line 490
    .line 491
    goto/16 :goto_6

    .line 492
    .line 493
    :cond_18
    move v14, v0

    .line 494
    move-object/from16 v34, v1

    .line 495
    .line 496
    move/from16 v33, v2

    .line 497
    .line 498
    move-wide/from16 v0, p5

    .line 499
    .line 500
    move-object/from16 v3, p1

    .line 501
    .line 502
    :goto_e
    array-length v4, v3

    .line 503
    if-ge v2, v4, :cond_1d

    .line 504
    .line 505
    aget-object v4, p3, v2

    .line 506
    .line 507
    if-nez v4, :cond_1c

    .line 508
    .line 509
    aget-object v4, v3, v2

    .line 510
    .line 511
    if-eqz v4, :cond_1c

    .line 512
    .line 513
    aget v4, v34, v2

    .line 514
    .line 515
    iget-object v6, v5, LX1/b;->k:[LX1/a;

    .line 516
    .line 517
    aget-object v4, v6, v4

    .line 518
    .line 519
    iget v6, v4, LX1/a;->c:I

    .line 520
    .line 521
    if-ne v6, v14, :cond_1c

    .line 522
    .line 523
    move-object/from16 v6, v34

    .line 524
    .line 525
    invoke-virtual {v5, v2, v6}, LX1/b;->m(I[I)I

    .line 526
    .line 527
    .line 528
    move-result v7

    .line 529
    const/4 v8, -0x1

    .line 530
    if-ne v7, v8, :cond_19

    .line 531
    .line 532
    new-instance v4, Lk2/w;

    .line 533
    .line 534
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 535
    .line 536
    .line 537
    aput-object v4, p3, v2

    .line 538
    .line 539
    goto :goto_10

    .line 540
    :cond_19
    aget-object v7, p3, v7

    .line 541
    .line 542
    check-cast v7, Ll2/h;

    .line 543
    .line 544
    iget v4, v4, LX1/a;->b:I

    .line 545
    .line 546
    move/from16 v9, v33

    .line 547
    .line 548
    :goto_f
    iget-object v10, v7, Ll2/h;->n:[Lk2/c0;

    .line 549
    .line 550
    array-length v11, v10

    .line 551
    if-ge v9, v11, :cond_1b

    .line 552
    .line 553
    iget-object v11, v7, Ll2/h;->b:[I

    .line 554
    .line 555
    aget v11, v11, v9

    .line 556
    .line 557
    if-ne v11, v4, :cond_1a

    .line 558
    .line 559
    iget-object v4, v7, Ll2/h;->d:[Z

    .line 560
    .line 561
    aget-boolean v11, v4, v9

    .line 562
    .line 563
    xor-int/2addr v11, v14

    .line 564
    invoke-static {v11}, LQ1/k;->g(Z)V

    .line 565
    .line 566
    .line 567
    aput-boolean v14, v4, v9

    .line 568
    .line 569
    aget-object v4, v10, v9

    .line 570
    .line 571
    invoke-virtual {v4, v0, v1, v14}, Lk2/c0;->F(JZ)Z

    .line 572
    .line 573
    .line 574
    new-instance v4, Ll2/g;

    .line 575
    .line 576
    aget-object v10, v10, v9

    .line 577
    .line 578
    invoke-direct {v4, v7, v7, v10, v9}, Ll2/g;-><init>(Ll2/h;Ll2/h;Lk2/c0;I)V

    .line 579
    .line 580
    .line 581
    aput-object v4, p3, v2

    .line 582
    .line 583
    goto :goto_10

    .line 584
    :cond_1a
    add-int/2addr v9, v14

    .line 585
    goto :goto_f

    .line 586
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 587
    .line 588
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 589
    .line 590
    .line 591
    throw v0

    .line 592
    :cond_1c
    move-object/from16 v6, v34

    .line 593
    .line 594
    const/4 v8, -0x1

    .line 595
    :goto_10
    add-int/2addr v2, v14

    .line 596
    move-object/from16 v34, v6

    .line 597
    .line 598
    goto :goto_e

    .line 599
    :cond_1d
    new-instance v2, Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 602
    .line 603
    .line 604
    new-instance v3, Ljava/util/ArrayList;

    .line 605
    .line 606
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 607
    .line 608
    .line 609
    move-object/from16 v15, p3

    .line 610
    .line 611
    array-length v4, v15

    .line 612
    move/from16 v6, v33

    .line 613
    .line 614
    :goto_11
    if-ge v6, v4, :cond_20

    .line 615
    .line 616
    aget-object v7, v15, v6

    .line 617
    .line 618
    instance-of v8, v7, Ll2/h;

    .line 619
    .line 620
    if-eqz v8, :cond_1e

    .line 621
    .line 622
    check-cast v7, Ll2/h;

    .line 623
    .line 624
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    goto :goto_12

    .line 628
    :cond_1e
    instance-of v8, v7, LX1/j;

    .line 629
    .line 630
    if-eqz v8, :cond_1f

    .line 631
    .line 632
    check-cast v7, LX1/j;

    .line 633
    .line 634
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    :cond_1f
    :goto_12
    add-int/2addr v6, v14

    .line 638
    goto :goto_11

    .line 639
    :cond_20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 640
    .line 641
    .line 642
    move-result v4

    .line 643
    new-array v4, v4, [Ll2/h;

    .line 644
    .line 645
    iput-object v4, v5, LX1/b;->r:[Ll2/h;

    .line 646
    .line 647
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 651
    .line 652
    .line 653
    move-result v4

    .line 654
    new-array v4, v4, [LX1/j;

    .line 655
    .line 656
    iput-object v4, v5, LX1/b;->s:[LX1/j;

    .line 657
    .line 658
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    iget-object v3, v5, LX1/b;->l:La9/b;

    .line 662
    .line 663
    new-instance v4, LV1/c;

    .line 664
    .line 665
    const/16 v6, 0xa

    .line 666
    .line 667
    invoke-direct {v4, v6}, LV1/c;-><init>(I)V

    .line 668
    .line 669
    .line 670
    invoke-static {v2, v4}, Ll8/s;->v(Ljava/util/List;Lk8/h;)Ljava/util/AbstractList;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    new-instance v3, Lk2/n;

    .line 678
    .line 679
    invoke-direct {v3, v2, v4}, Lk2/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 680
    .line 681
    .line 682
    iput-object v3, v5, LX1/b;->t:Lk2/n;

    .line 683
    .line 684
    iget-boolean v2, v5, LX1/b;->x:Z

    .line 685
    .line 686
    if-eqz v2, :cond_21

    .line 687
    .line 688
    move/from16 v2, v33

    .line 689
    .line 690
    iput-boolean v2, v5, LX1/b;->x:Z

    .line 691
    .line 692
    iput-wide v0, v5, LX1/b;->y:J

    .line 693
    .line 694
    :cond_21
    return-wide v0
.end method
