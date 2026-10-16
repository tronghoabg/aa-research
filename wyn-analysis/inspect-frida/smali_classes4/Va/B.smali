.class public abstract LVa/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static b:I = 0x0

.field public static c:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, ""

    .line 5
    .line 6
    invoke-static {v2, v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    rsub-int/lit8 v1, v1, 0xd

    .line 11
    .line 12
    const/16 v3, 0x30

    .line 13
    .line 14
    invoke-static {v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    add-int/lit16 v3, v3, 0x12b

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const-wide/16 v6, -0x1

    .line 25
    .line 26
    cmp-long v4, v4, v6

    .line 27
    .line 28
    rsub-int/lit8 v4, v4, 0x9

    .line 29
    .line 30
    const-string v5, "\u0007\u0002\r\ufff8\ufffb\u0005\u0008\ufffb\ufffa\ufffd\n\ufff8\u0002"

    .line 31
    .line 32
    invoke-static {v1, v3, v4, v5}, LVa/B;->b(IIILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    const-wide/16 v5, 0x0

    .line 45
    .line 46
    cmp-long v3, v3, v5

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x11

    .line 49
    .line 50
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    add-int/lit16 v4, v4, 0x12e

    .line 55
    .line 56
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/lit8 v2, v2, 0x2

    .line 61
    .line 62
    const-string v5, "\ufffa\u0003\n\ufff6\ufff9\u0008\ufff4\u0008\ufffa\u0008\u0008\ufffe\u0004\u0003\ufff4\t\u0004\u0000"

    .line 63
    .line 64
    invoke-static {v3, v4, v2, v5}, LVa/B;->b(IIILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, LVa/B;->a:Ljava/util/Set;

    .line 88
    .line 89
    sget v0, LVa/B;->b:I

    .line 90
    .line 91
    add-int/lit8 v0, v0, 0x43

    .line 92
    .line 93
    rem-int/lit16 v0, v0, 0x80

    .line 94
    .line 95
    sput v0, LVa/B;->c:I

    .line 96
    .line 97
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, LVa/B;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/B;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    sget-object v1, LVa/B;->a:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x22

    .line 20
    .line 21
    div-int/lit8 v0, v0, 0x0

    .line 22
    .line 23
    :cond_0
    sget v0, LVa/B;->b:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x2f

    .line 26
    .line 27
    rem-int/lit16 v0, v0, 0x80

    .line 28
    .line 29
    sput v0, LVa/B;->c:I

    .line 30
    .line 31
    return p0
.end method

.method public static b(IIILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p0, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p0, :cond_0

    .line 18
    .line 19
    aget-char v4, p3, v3

    .line 20
    .line 21
    add-int/2addr v4, p1

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0xc3

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    if-lez p2, :cond_1

    .line 38
    .line 39
    sput p2, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p1, p0, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p0, p2

    .line 49
    .line 50
    invoke-static {p1, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int/2addr p0, p2

    .line 56
    invoke-static {p1, p2, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 62
    .line 63
    .line 64
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    return-object p0

    .line 66
    :goto_1
    monitor-exit v0

    .line 67
    throw p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget v0, LVa/B;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x47

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/B;->b:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x64

    .line 17
    .line 18
    invoke-static {v0, p0}, LVa/pb;->N(ILjava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2, p0}, LVa/pb;->N(ILjava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    :goto_0
    invoke-static {v2, p1}, LVa/pb;->N(ILjava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    sget p0, LVa/B;->c:I

    .line 38
    .line 39
    add-int/lit8 p0, p0, 0x2b

    .line 40
    .line 41
    rem-int/lit16 p1, p0, 0x80

    .line 42
    .line 43
    sput p1, LVa/B;->b:I

    .line 44
    .line 45
    rem-int/lit8 p0, p0, 0x2

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 v1, 0x1

    .line 51
    :goto_1
    add-int/lit8 p1, p1, 0x13

    .line 52
    .line 53
    rem-int/lit16 p0, p1, 0x80

    .line 54
    .line 55
    sput p0, LVa/B;->c:I

    .line 56
    .line 57
    rem-int/lit8 p1, p1, 0x2

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    return v1

    .line 62
    :cond_2
    const/4 p0, 0x0

    .line 63
    throw p0

    .line 64
    :cond_3
    return v1
.end method

.method public static d(Ljava/util/AbstractMap;Ljava/lang/String;)Z
    .locals 5

    .line 1
    sget v0, LVa/B;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x69

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B;->b:I

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget p0, LVa/B;->c:I

    .line 17
    .line 18
    add-int/lit8 p0, p0, 0x2f

    .line 19
    .line 20
    rem-int/lit16 p0, p0, 0x80

    .line 21
    .line 22
    sput p0, LVa/B;->b:I

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    sget-object v1, LVa/B;->a:Ljava/util/Set;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    move v2, v0

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, 0x1

    .line 41
    if-eq v3, v4, :cond_3

    .line 42
    .line 43
    sget p0, LVa/B;->b:I

    .line 44
    .line 45
    add-int/lit8 p0, p0, 0x23

    .line 46
    .line 47
    rem-int/lit16 p0, p0, 0x80

    .line 48
    .line 49
    sput p0, LVa/B;->c:I

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x5

    .line 52
    .line 53
    if-lt p1, v2, :cond_2

    .line 54
    .line 55
    return v4

    .line 56
    :cond_2
    return v0

    .line 57
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {p0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    sget v3, LVa/B;->b:I

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x17

    .line 72
    .line 73
    rem-int/lit16 v3, v3, 0x80

    .line 74
    .line 75
    sput v3, LVa/B;->c:I

    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_0
.end method
