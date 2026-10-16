.class public final Lf6/Y;
.super LE5/J0;
.source "SourceFile"


# static fields
.field public static final g:Ljava/lang/Object;


# instance fields
.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:LE5/d0;

.field public final f:LE5/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf6/Y;->g:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, LE5/V;

    .line 9
    .line 10
    invoke-direct {v0}, LE5/V;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 14
    .line 15
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 16
    .line 17
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 20
    .line 21
    sget-object v3, LE5/b0;->c:LE5/b0;

    .line 22
    .line 23
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    new-instance v4, LE5/a0;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-direct {v4, v3, v5, v1, v2}, LE5/a0;-><init>(Landroid/net/Uri;Lxg/g;Ljava/util/List;Ll8/K;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    new-instance v1, LE5/d0;

    .line 34
    .line 35
    invoke-virtual {v0}, LE5/V;->a()LE5/X;

    .line 36
    .line 37
    .line 38
    sget-object v0, LE5/f0;->G:LE5/f0;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(JZZLE5/d0;)V
    .locals 0

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    iget-object p4, p5, LE5/d0;->c:LE5/Z;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p4, 0x0

    .line 7
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, Lf6/Y;->b:J

    .line 11
    .line 12
    iput-wide p1, p0, Lf6/Y;->c:J

    .line 13
    .line 14
    iput-boolean p3, p0, Lf6/Y;->d:Z

    .line 15
    .line 16
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iput-object p5, p0, Lf6/Y;->e:LE5/d0;

    .line 20
    .line 21
    iput-object p4, p0, Lf6/Y;->f:LE5/Z;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Lf6/Y;->g:Ljava/lang/Object;

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

.method public final f(ILE5/H0;Z)LE5/H0;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lu6/a;->h(II)V

    .line 3
    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p1, Lf6/Y;->g:Ljava/lang/Object;

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
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v8, Lg6/b;->f:Lg6/b;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    iget-wide v4, p0, Lf6/Y;->b:J

    .line 22
    .line 23
    const-wide/16 v6, 0x0

    .line 24
    .line 25
    move-object v0, p2

    .line 26
    invoke-virtual/range {v0 .. v9}, LE5/H0;->h(Ljava/lang/Integer;Ljava/lang/Object;IJJLg6/b;Z)V

    .line 27
    .line 28
    .line 29
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
    invoke-static {p1, v0}, Lu6/a;->h(II)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Lf6/Y;->g:Ljava/lang/Object;

    .line 6
    .line 7
    return-object p1
.end method

.method public final m(ILE5/I0;J)LE5/I0;
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
    invoke-static {v2, v1}, Lu6/a;->h(II)V

    .line 7
    .line 8
    .line 9
    sget-object v3, LE5/I0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget-wide v1, v0, Lf6/Y;->c:J

    .line 12
    .line 13
    const/16 v18, 0x0

    .line 14
    .line 15
    iget-object v4, v0, Lf6/Y;->e:LE5/d0;

    .line 16
    .line 17
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
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
    iget-boolean v11, v0, Lf6/Y;->d:Z

    .line 33
    .line 34
    const/4 v12, 0x0

    .line 35
    iget-object v13, v0, Lf6/Y;->f:LE5/Z;

    .line 36
    .line 37
    const-wide/16 v14, 0x0

    .line 38
    .line 39
    const/16 v19, 0x0

    .line 40
    .line 41
    const-wide/16 v20, 0x0

    .line 42
    .line 43
    move-wide/from16 v16, v1

    .line 44
    .line 45
    move-object/from16 v2, p2

    .line 46
    .line 47
    invoke-virtual/range {v2 .. v21}, LE5/I0;->b(Ljava/lang/Object;LE5/d0;JJJZZLE5/Z;JJIIJ)V

    .line 48
    .line 49
    .line 50
    return-object p2
.end method

.method public final o()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
