.class public final LE5/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/h;


# static fields
.field public static final g:LA5/f;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LE5/a0;

.field public final c:LE5/Z;

.field public final d:LE5/f0;

.field public final e:LE5/X;

.field public final f:LE5/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, LE5/V;

    .line 2
    .line 3
    invoke-direct {v0}, LE5/V;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 7
    .line 8
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 13
    .line 14
    sget-object v1, LE5/b0;->c:LE5/b0;

    .line 15
    .line 16
    new-instance v1, LE5/X;

    .line 17
    .line 18
    invoke-direct {v1, v0}, LE5/W;-><init>(LE5/V;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, LE5/Z;

    .line 22
    .line 23
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const v9, -0x800001

    .line 29
    .line 30
    .line 31
    move-wide v5, v3

    .line 32
    move-wide v7, v3

    .line 33
    move v10, v9

    .line 34
    invoke-direct/range {v2 .. v10}, LE5/Z;-><init>(JJJFF)V

    .line 35
    .line 36
    .line 37
    sget-object v0, LE5/f0;->G:LE5/f0;

    .line 38
    .line 39
    new-instance v0, LA5/f;

    .line 40
    .line 41
    const/16 v1, 0x9

    .line 42
    .line 43
    invoke-direct {v0, v1}, LA5/f;-><init>(I)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LE5/d0;->g:LA5/f;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LE5/X;LE5/a0;LE5/Z;LE5/f0;LE5/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE5/d0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, LE5/d0;->b:LE5/a0;

    .line 7
    .line 8
    iput-object p4, p0, LE5/d0;->c:LE5/Z;

    .line 9
    .line 10
    iput-object p5, p0, LE5/d0;->d:LE5/f0;

    .line 11
    .line 12
    iput-object p2, p0, LE5/d0;->e:LE5/X;

    .line 13
    .line 14
    iput-object p6, p0, LE5/d0;->f:LE5/b0;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Ljava/lang/String;)LE5/d0;
    .locals 19

    .line 1
    new-instance v0, LE5/V;

    .line 2
    .line 3
    invoke-direct {v0}, LE5/V;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 7
    .line 8
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 13
    .line 14
    sget-object v9, LE5/b0;->c:LE5/b0;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    move-object v4, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static/range {p0 .. p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    :goto_0
    if-eqz v4, :cond_1

    .line 26
    .line 27
    new-instance v5, LE5/a0;

    .line 28
    .line 29
    invoke-direct {v5, v4, v3, v1, v2}, LE5/a0;-><init>(Landroid/net/Uri;Lxg/g;Ljava/util/List;Ll8/K;)V

    .line 30
    .line 31
    .line 32
    move-object v6, v5

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v6, v3

    .line 35
    :goto_1
    new-instance v3, LE5/d0;

    .line 36
    .line 37
    new-instance v5, LE5/X;

    .line 38
    .line 39
    invoke-direct {v5, v0}, LE5/W;-><init>(LE5/V;)V

    .line 40
    .line 41
    .line 42
    new-instance v7, LE5/Z;

    .line 43
    .line 44
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const v17, -0x800001

    .line 50
    .line 51
    .line 52
    move-wide v13, v11

    .line 53
    move-wide v15, v11

    .line 54
    move/from16 v18, v17

    .line 55
    .line 56
    move-object v10, v7

    .line 57
    invoke-direct/range {v10 .. v18}, LE5/Z;-><init>(JJJFF)V

    .line 58
    .line 59
    .line 60
    sget-object v8, LE5/f0;->G:LE5/f0;

    .line 61
    .line 62
    const-string v4, ""

    .line 63
    .line 64
    invoke-direct/range {v3 .. v9}, LE5/d0;-><init>(Ljava/lang/String;LE5/X;LE5/a0;LE5/Z;LE5/f0;LE5/b0;)V

    .line 65
    .line 66
    .line 67
    return-object v3
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
    instance-of v0, p1, LE5/d0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, LE5/d0;

    .line 10
    .line 11
    iget-object v0, p1, LE5/d0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, LE5/d0;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, LE5/d0;->e:LE5/X;

    .line 22
    .line 23
    iget-object v1, p1, LE5/d0;->e:LE5/X;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, LE5/W;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, LE5/d0;->b:LE5/a0;

    .line 32
    .line 33
    iget-object v1, p1, LE5/d0;->b:LE5/a0;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, LE5/d0;->c:LE5/Z;

    .line 42
    .line 43
    iget-object v1, p1, LE5/d0;->c:LE5/Z;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, LE5/Z;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, LE5/d0;->d:LE5/f0;

    .line 52
    .line 53
    iget-object v1, p1, LE5/d0;->d:LE5/f0;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, LE5/d0;->f:LE5/b0;

    .line 62
    .line 63
    iget-object p1, p1, LE5/d0;->f:LE5/b0;

    .line 64
    .line 65
    invoke-static {v0, p1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    :goto_0
    const/4 p1, 0x1

    .line 72
    return p1

    .line 73
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 74
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LE5/d0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LE5/d0;->b:LE5/a0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, LE5/a0;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, LE5/d0;->c:LE5/Z;

    .line 23
    .line 24
    invoke-virtual {v1}, LE5/Z;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object v0, p0, LE5/d0;->e:LE5/X;

    .line 32
    .line 33
    invoke-virtual {v0}, LE5/W;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, LE5/d0;->d:LE5/f0;

    .line 41
    .line 42
    invoke-virtual {v1}, LE5/f0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    .line 49
    iget-object v0, p0, LE5/d0;->f:LE5/b0;

    .line 50
    .line 51
    invoke-virtual {v0}, LE5/b0;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v1

    .line 56
    return v0
.end method
