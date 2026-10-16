.class public final Lk2/k0;
.super LN1/N;
.source "SourceFile"


# static fields
.field public static final n:Ljava/lang/Object;


# instance fields
.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/lang/Object;

.field public final l:LN1/w;

.field public final m:LN1/s;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk2/k0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, LJ5/n;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, v1}, LJ5/n;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 15
    .line 16
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 17
    .line 18
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    sget-object v7, Ll8/e0;->e:Ll8/e0;

    .line 21
    .line 22
    new-instance v1, LE5/Y;

    .line 23
    .line 24
    invoke-direct {v1}, LE5/Y;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v2, LN1/u;->a:LN1/u;

    .line 28
    .line 29
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    new-instance v2, LN1/t;

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-direct/range {v2 .. v10}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 44
    .line 45
    .line 46
    :cond_0
    new-instance v2, LN1/w;

    .line 47
    .line 48
    invoke-virtual {v0}, LJ5/n;->a()LN1/r;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, LE5/Y;->b()LN1/s;

    .line 52
    .line 53
    .line 54
    sget-object v0, LN1/z;->B:LN1/z;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(JJJJJJZZZLjava/lang/Object;LN1/w;LN1/s;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-wide p1, p0, Lk2/k0;->b:J

    .line 6
    iput-wide p3, p0, Lk2/k0;->c:J

    .line 7
    iput-wide p5, p0, Lk2/k0;->d:J

    .line 8
    iput-wide p7, p0, Lk2/k0;->e:J

    .line 9
    iput-wide p9, p0, Lk2/k0;->f:J

    .line 10
    iput-wide p11, p0, Lk2/k0;->g:J

    .line 11
    iput-boolean p13, p0, Lk2/k0;->h:Z

    .line 12
    iput-boolean p14, p0, Lk2/k0;->i:Z

    .line 13
    iput-boolean p15, p0, Lk2/k0;->j:Z

    move-object/from16 p1, p16

    .line 14
    iput-object p1, p0, Lk2/k0;->k:Ljava/lang/Object;

    .line 15
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p1, p17

    .line 16
    iput-object p1, p0, Lk2/k0;->l:LN1/w;

    move-object/from16 p1, p18

    .line 17
    iput-object p1, p0, Lk2/k0;->m:LN1/s;

    return-void
.end method

.method public constructor <init>(JJJJZZZLjava/lang/Object;LN1/w;)V
    .locals 19

    move-object/from16 v0, p13

    if-eqz p11, :cond_0

    .line 2
    iget-object v1, v0, LN1/w;->c:LN1/s;

    :goto_0
    move-object/from16 v18, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v15, 0x0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move-wide/from16 v5, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    move/from16 v13, p9

    move/from16 v14, p10

    move-object/from16 v16, p12

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    .line 3
    invoke-direct/range {v0 .. v18}, Lk2/k0;-><init>(JJJJJJZZZLjava/lang/Object;LN1/w;LN1/s;)V

    return-void
.end method

.method public constructor <init>(JZZLN1/w;)V
    .locals 14

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-wide v3, p1

    move-object v0, p0

    move-wide v1, p1

    move/from16 v9, p3

    move/from16 v11, p4

    move-object/from16 v13, p5

    .line 1
    invoke-direct/range {v0 .. v13}, Lk2/k0;-><init>(JJJJZZZLjava/lang/Object;LN1/w;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Lk2/k0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, -0x1

    .line 12
    return p1
.end method

.method public final f(ILN1/L;Z)LN1/L;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, LQ1/k;->e(II)V

    .line 3
    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p1, Lk2/k0;->n:Ljava/lang/Object;

    .line 8
    .line 9
    :goto_0
    move-object v2, p1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :goto_1
    iget-wide v0, p0, Lk2/k0;->f:J

    .line 14
    .line 15
    neg-long v6, v0

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v8, LN1/b;->c:LN1/b;

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v1, 0x0

    .line 24
    iget-wide v4, p0, Lk2/k0;->d:J

    .line 25
    .line 26
    move-object v0, p2

    .line 27
    invoke-virtual/range {v0 .. v9}, LN1/L;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLN1/b;Z)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final h()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, LQ1/k;->e(II)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Lk2/k0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    return-object p1
.end method

.method public final m(ILN1/M;J)LN1/M;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move/from16 v2, p1

    .line 5
    .line 6
    invoke-static {v2, v1}, LQ1/k;->e(II)V

    .line 7
    .line 8
    .line 9
    iget-wide v1, v0, Lk2/k0;->g:J

    .line 10
    .line 11
    iget-boolean v13, v0, Lk2/k0;->i:Z

    .line 12
    .line 13
    if-eqz v13, :cond_1

    .line 14
    .line 15
    iget-boolean v3, v0, Lk2/k0;->j:Z

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long v3, p3, v3

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-wide v3, v0, Lk2/k0;->e:J

    .line 26
    .line 27
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v7, v3, v5

    .line 33
    .line 34
    if-nez v7, :cond_0

    .line 35
    .line 36
    :goto_0
    move-wide v15, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-long v1, v1, p3

    .line 39
    .line 40
    cmp-long v3, v1, v3

    .line 41
    .line 42
    if-lez v3, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-wide v15, v1

    .line 46
    :goto_1
    sget-object v1, LN1/M;->q:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v14, v0, Lk2/k0;->m:LN1/s;

    .line 49
    .line 50
    iget-wide v1, v0, Lk2/k0;->e:J

    .line 51
    .line 52
    iget-object v4, v0, Lk2/k0;->l:LN1/w;

    .line 53
    .line 54
    iget-object v5, v0, Lk2/k0;->k:Ljava/lang/Object;

    .line 55
    .line 56
    iget-wide v6, v0, Lk2/k0;->b:J

    .line 57
    .line 58
    iget-wide v8, v0, Lk2/k0;->c:J

    .line 59
    .line 60
    iget-boolean v12, v0, Lk2/k0;->h:Z

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    iget-wide v10, v0, Lk2/k0;->f:J

    .line 65
    .line 66
    move-object/from16 v3, p2

    .line 67
    .line 68
    move-wide/from16 v17, v1

    .line 69
    .line 70
    move-wide/from16 v20, v10

    .line 71
    .line 72
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-virtual/range {v3 .. v21}, LN1/M;->b(LN1/w;Ljava/lang/Object;JJJZZLN1/s;JJIJ)V

    .line 78
    .line 79
    .line 80
    return-object p2
.end method

.method public final o()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
