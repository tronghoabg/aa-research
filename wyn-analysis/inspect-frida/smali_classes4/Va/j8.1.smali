.class public LVa/j8;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field public static e:I = 0x0

.field public static f:I = 0x1

.field public static final g:[C

.field public static h:I = 0x0

.field public static i:I = 0x1

.field public static j:I = 0x0

.field public static k:I = 0x1


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LVa/i8;

.field public final c:Ljava/lang/Throwable;

.field public final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/j8;->g:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x17bs
        0x17as
        0x174s
        0x136s
        0x169s
        0x176s
        0x16fs
        0x15as
        0x16ds
        0x175s
        0x177s
        0x17cs
        0x17ds
        0x171s
        0x14ds
        0x180s
        0x16bs
        0x178s
    .end array-data
.end method

.method public constructor <init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 10

    const/4 v0, 0x0

    iput v0, p0, LVa/j8;->d:I

    .line 12
    new-instance v0, LVa/i8;

    .line 13
    invoke-virtual {p1}, LVa/y7;->u()LVa/B7;

    move-result-object v1

    invoke-virtual {v1}, LVa/B7;->j()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-virtual {p1}, LVa/y7;->h()LVa/ha;

    move-result-object p1

    invoke-virtual {p1}, LVa/ha;->b()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-direct {v0, v1, p1}, LVa/i8;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    add-int/lit8 v3, v3, 0x8

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v6

    add-int/lit8 v6, v6, 0x5c

    int-to-byte v6, v6

    const-string v7, "\u0001\u0002\u0003\u0000\u0005\u0006\u0006\n"

    invoke-static {v6, v3, v7}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, LVa/i8;->b:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ""

    const/4 v6, 0x0

    invoke-static {v3, v6}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x1

    invoke-static {v6}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v7

    cmp-long v4, v7, v4

    rsub-int/lit8 v4, v4, 0x7b

    int-to-byte v4, v4

    const-string v5, "\u00a8"

    invoke-static {v4, v3, v5}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, LVa/i8;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int/lit8 v4, v4, 0x69

    int-to-byte v4, v4

    const-string v5, "\u0004\u000b\u0001\u000b"

    invoke-static {v4, v3, v5}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget v3, LVa/i8;->e:I

    add-int/lit8 v3, v3, 0x3f

    rem-int/lit16 v4, v3, 0x80

    sput v4, LVa/i8;->f:I

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    const/16 v3, 0x2c

    div-int/2addr v3, v6

    :cond_0
    if-eqz p2, :cond_5

    .line 17
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    const/4 v4, 0x0

    if-eqz p2, :cond_3

    .line 18
    sget v5, LVa/x8;->l:I

    add-int/lit8 v7, v5, 0x21

    rem-int/lit16 v8, v7, 0x80

    sput v8, LVa/x8;->k:I

    rem-int/lit8 v7, v7, 0x2

    if-nez v7, :cond_2

    .line 19
    iget-object v7, p2, LVa/x8;->e:LVa/r8;

    if-eqz v7, :cond_3

    add-int/lit8 v5, v5, 0x1

    .line 20
    rem-int/lit16 v4, v5, 0x80

    sput v4, LVa/x8;->k:I

    rem-int/lit8 v5, v5, 0x2

    if-eqz v5, :cond_1

    .line 21
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x32

    .line 22
    div-int/2addr v4, v6

    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    :goto_1
    iget-object p2, p2, LVa/x8;->d:LVa/x8;

    goto :goto_0

    .line 25
    :cond_2
    throw v4

    .line 26
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LVa/x8;

    .line 27
    invoke-static {v1}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 28
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v7

    shr-int/lit8 v7, v7, 0x16

    add-int/lit8 v7, v7, 0x1

    const-string v8, "\u4738\u778c"

    invoke-static {v7, v8}, LVa/i8;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 29
    new-instance v7, LVa/m8;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    sget v8, LVa/x8;->l:I

    add-int/lit8 v8, v8, 0x13

    rem-int/lit16 v9, v8, 0x80

    sput v9, LVa/x8;->k:I

    rem-int/lit8 v8, v8, 0x2

    if-nez v8, :cond_4

    iget-object v8, v3, LVa/x8;->e:LVa/r8;

    .line 31
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    sget v9, LVa/r8;->f:I

    add-int/lit8 v9, v9, 0x19

    rem-int/lit16 v9, v9, 0x80

    sput v9, LVa/r8;->g:I

    iget-object v8, v8, LVa/r8;->a:Ljava/lang/String;

    .line 33
    sget v9, LVa/x8;->l:I

    add-int/lit8 v9, v9, 0x31

    rem-int/lit16 v9, v9, 0x80

    sput v9, LVa/x8;->k:I

    iget-object v9, v3, LVa/x8;->e:LVa/r8;

    invoke-virtual {v9}, LVa/r8;->a()I

    move-result v9

    invoke-virtual {v3}, LVa/x8;->b()I

    move-result v3

    add-int/2addr v3, v9

    sget v9, LVa/x8;->l:I

    add-int/lit8 v9, v9, 0x47

    rem-int/lit16 v9, v9, 0x80

    sput v9, LVa/x8;->k:I

    .line 34
    invoke-direct {v7, v5, v8, v2, v3}, LVa/m8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v7}, LVa/i8;->a(LVa/m8;)V

    goto :goto_2

    .line 35
    :cond_4
    throw v4

    .line 36
    :cond_5
    new-instance p2, LVa/m8;

    .line 37
    invoke-static {v1}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 38
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x10

    const-string v4, "\u0617\u1bcf\uefe6\u464a\u33c4\ue25e\ubad0\u5f66\u7640\u5d63\ufcf8\ubceb\u638e\uf04b\u796d\u2cbd"

    invoke-static {v3, v4}, LVa/i8;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 39
    invoke-direct {p2, v1, p1, v2, v6}, LVa/m8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 40
    invoke-virtual {v0, p2}, LVa/i8;->a(LVa/m8;)V

    .line 41
    :cond_6
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    .line 42
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 43
    const-class v1, LVa/r8;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 44
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    :goto_3
    if-ltz v2, :cond_7

    .line 45
    aget-object v3, p1, v2

    .line 46
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 48
    invoke-virtual {p2, v6, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_3

    .line 49
    :cond_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/StackTraceElement;

    .line 50
    new-instance v1, LVa/m8;

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p2

    invoke-direct {v1, v2, v3, v4, p2}, LVa/m8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, LVa/i8;->a(LVa/m8;)V

    goto :goto_4

    .line 51
    :cond_8
    invoke-direct {p0, p3, v0, p4}, LVa/j8;-><init>(Ljava/lang/String;LVa/i8;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LVa/i8;Ljava/lang/Throwable;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 9
    iput-object p1, p0, LVa/j8;->a:Ljava/lang/String;

    .line 10
    iput-object p2, p0, LVa/j8;->b:LVa/i8;

    .line 11
    iput-object p3, p0, LVa/j8;->c:Ljava/lang/Throwable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LVa/w8;)V
    .locals 6

    const/4 v0, 0x1

    iput v0, p0, LVa/j8;->d:I

    .line 1
    new-instance v0, LVa/i8;

    .line 2
    invoke-direct {v0, p1, p2}, LVa/i8;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-static {v2, v2}, Landroid/graphics/PointF;->length(FF)F

    move-result v3

    cmpl-float v2, v3, v2

    rsub-int/lit8 v2, v2, 0x8

    const-string v3, "\uaafd\u6785\u7d65\uaee0\u7808\u18db\u7e0f\ufe0c"

    invoke-static {v2, v3}, LVa/i8;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    add-int/lit8 v2, v2, 0x1

    const-string v3, "\u5b0b\u5813"

    invoke-static {v2, v3}, LVa/i8;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    add-int/lit8 v2, v2, 0x3

    const-string v3, "\ue26e\ue2cf\u59c1\u1e27"

    invoke-static {v2, v3}, LVa/i8;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, LVa/m8;

    .line 5
    invoke-static {p1}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/4 v3, 0x0

    .line 6
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    const v4, -0xffffff

    sub-int/2addr v4, v3

    const-string v3, "\u8959\u77f5"

    invoke-static {v4, v3}, LVa/i8;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p3, v1, p4}, LVa/m8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v2}, LVa/i8;->a(LVa/m8;)V

    .line 7
    invoke-direct {p0, p5, v0, p6}, LVa/j8;-><init>(Ljava/lang/String;LVa/i8;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x79ce47f51e5c4427L    # 5.3678135704911085E278

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method private c()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/j8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/j8;->h:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, 0x7f

    .line 15
    .line 16
    const-string v2, "\u0086\u008b\u008e\u008c\u0092\u0089\u0091\u0090\u008f\u0089\u008a\u008e\u008c\u0086\u008d\u0088\u0089\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0085\u0083\u0084\u0083\u0082\u0081"

    .line 17
    .line 18
    const-string v3, "ISO-8859-1"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, [B

    .line 25
    .line 26
    sget-object v3, LVa/a;->x:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    sget-object v4, LVa/j8;->g:[C

    .line 30
    .line 31
    array-length v5, v2

    .line 32
    sput v5, LVa/a;->w:I

    .line 33
    .line 34
    new-array v5, v5, [C

    .line 35
    .line 36
    sput v0, LVa/a;->v:I

    .line 37
    .line 38
    :goto_0
    sget v0, LVa/a;->v:I

    .line 39
    .line 40
    sget v6, LVa/a;->w:I

    .line 41
    .line 42
    if-ge v0, v6, :cond_0

    .line 43
    .line 44
    add-int/lit8 v6, v6, -0x1

    .line 45
    .line 46
    sub-int/2addr v6, v0

    .line 47
    aget-byte v6, v2, v6

    .line 48
    .line 49
    add-int/2addr v6, v1

    .line 50
    aget-char v6, v4, v6

    .line 51
    .line 52
    add-int/lit16 v6, v6, -0x108

    .line 53
    .line 54
    int-to-char v6, v6

    .line 55
    aput-char v6, v5, v0

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    sput v0, LVa/a;->v:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 67
    .line 68
    .line 69
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget v1, LVa/j8;->h:I

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x51

    .line 77
    .line 78
    rem-int/lit16 v1, v1, 0x80

    .line 79
    .line 80
    sput v1, LVa/j8;->i:I

    .line 81
    .line 82
    return-object v0

    .line 83
    :goto_1
    monitor-exit v3

    .line 84
    throw v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, LVa/j8;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/j8;->k:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x57

    .line 9
    .line 10
    rem-int/lit16 v0, v0, 0x80

    .line 11
    .line 12
    sput v0, LVa/j8;->j:I

    .line 13
    .line 14
    const-string v0, "\u15c0\u2d9e\u6561\ubc80\uf4a3\u0c09\u47e7\u9f4d\ud765\ueeb4\u2664\u79d4\ub1b4\uc909\u00ef\u5845\u9006\uab84\ue37e\u3adb\u72af\u8a0c\ucdf0\u0555\u5d35"

    .line 15
    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    shr-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    add-int/lit16 v1, v1, 0x385f

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [C

    .line 29
    .line 30
    sget-object v2, LVa/a;->u:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v2

    .line 33
    :try_start_0
    sput v1, LVa/a;->t:I

    .line 34
    .line 35
    array-length v1, v0

    .line 36
    new-array v1, v1, [C

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    sput v3, LVa/a;->s:I

    .line 40
    .line 41
    :goto_0
    sget v3, LVa/a;->s:I

    .line 42
    .line 43
    array-length v4, v0

    .line 44
    if-ge v3, v4, :cond_0

    .line 45
    .line 46
    aget-char v4, v0, v3

    .line 47
    .line 48
    sget v5, LVa/a;->t:I

    .line 49
    .line 50
    mul-int/2addr v5, v3

    .line 51
    xor-int/2addr v4, v5

    .line 52
    int-to-long v4, v4

    .line 53
    const-wide v6, 0x6e2cd9931ae215b3L    # 5.2142414613119936E222

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    xor-long/2addr v4, v6

    .line 59
    long-to-int v4, v4

    .line 60
    int-to-char v4, v4

    .line 61
    aput-char v4, v1, v3

    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    sput v3, LVa/a;->s:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 73
    .line 74
    .line 75
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget v1, LVa/j8;->j:I

    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x65

    .line 83
    .line 84
    rem-int/lit16 v1, v1, 0x80

    .line 85
    .line 86
    sput v1, LVa/j8;->k:I

    .line 87
    .line 88
    return-object v0

    .line 89
    :goto_1
    monitor-exit v2

    .line 90
    throw v0

    .line 91
    :pswitch_0
    invoke-direct {p0}, LVa/j8;->c()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget v0, LVa/j8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/j8;->e:I

    .line 8
    .line 9
    sget v0, LVa/a;->p:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x73

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/a;->o:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    iget-object v1, p0, LVa/j8;->a:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, v1, v2, p0}, LVa/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;LVa/j8;)V

    .line 23
    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    sget p1, LVa/a;->p:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x3

    .line 30
    .line 31
    rem-int/lit16 v0, p1, 0x80

    .line 32
    .line 33
    sput v0, LVa/a;->o:I

    .line 34
    .line 35
    rem-int/lit8 p1, p1, 0x2

    .line 36
    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    sget p1, LVa/j8;->e:I

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0x49

    .line 42
    .line 43
    rem-int/lit16 p1, p1, 0x80

    .line 44
    .line 45
    sput p1, LVa/j8;->f:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    throw v2

    .line 49
    :cond_1
    throw v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LVa/j8;->a()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, ""

    .line 15
    .line 16
    const/16 v3, 0x30

    .line 17
    .line 18
    invoke-static {v2, v3, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const v3, 0xd6e0

    .line 23
    .line 24
    .line 25
    sub-int/2addr v3, v1

    .line 26
    const-string v1, "\u441d\u92e6"

    .line 27
    .line 28
    invoke-static {v3, v1}, LVa/j8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, LVa/j8;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v1, 0xa

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, LVa/j8;->b:LVa/i8;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, LVa/j8;->c:Ljava/lang/Throwable;

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    const-wide/16 v5, 0x0

    .line 68
    .line 69
    cmp-long v3, v3, v5

    .line 70
    .line 71
    const v4, 0xca9e

    .line 72
    .line 73
    .line 74
    sub-int/2addr v4, v3

    .line 75
    const-string v3, "\u442d\u8ef9\ud17c\u1b85\u6e20\ub153\ufbed\uce4c\u10ad\u5bdb\uae3f\uf0b8"

    .line 76
    .line 77
    invoke-static {v4, v3}, LVa/j8;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    sget v1, LVa/j8;->f:I

    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x41

    .line 103
    .line 104
    rem-int/lit16 v1, v1, 0x80

    .line 105
    .line 106
    sput v1, LVa/j8;->e:I

    .line 107
    .line 108
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method
