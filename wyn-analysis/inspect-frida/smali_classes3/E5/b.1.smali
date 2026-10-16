.class public final LE5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/T0;


# static fields
.field public static e:I = 0x0

.field public static f:I = 0x1

.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LE5/b;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LE5/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LE5/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LS1/g;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LE5/b;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 22
    new-instance p1, Lwa/a;

    const/16 v0, 0x18

    .line 23
    invoke-direct {p1, v0}, Lwa/a;-><init>(I)V

    .line 24
    iput-object p1, p0, LE5/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;LE5/F;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LE5/b;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 15
    new-instance p1, LE5/a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, p3, v0}, LE5/a;-><init>(Ljava/lang/Object;Landroid/os/Handler;Ljava/lang/Object;I)V

    iput-object p1, p0, LE5/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;LU1/r;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LE5/b;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 12
    new-instance p1, LE5/a;

    const/4 v0, 0x1

    invoke-direct {p1, p0, p2, p3, v0}, LE5/a;-><init>(Ljava/lang/Object;Landroid/os/Handler;Ljava/lang/Object;I)V

    iput-object p1, p0, LE5/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LE5/b;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LE5/b;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, LE5/b;->b:Z

    .line 19
    iput-object p1, p0, LE5/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LE5/b;->a:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, LE5/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Comparable;ZI)V
    .locals 0

    .line 2
    iput p4, p0, LE5/b;->a:I

    iput-object p1, p0, LE5/b;->c:Ljava/lang/Object;

    iput-object p2, p0, LE5/b;->d:Ljava/lang/Object;

    iput-boolean p3, p0, LE5/b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/LinkedHashMap;LY2/B;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LE5/b;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, LE5/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lod/o0;Lod/k0;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, LE5/b;->a:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/b;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 27
    iput-boolean p1, p0, LE5/b;->b:Z

    .line 28
    iput-object p2, p0, LE5/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Z[D[D)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LE5/b;->a:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LE5/b;->b:Z

    iput-object p2, p0, LE5/b;->c:Ljava/lang/Object;

    iput-object p3, p0, LE5/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public static u(Ljava/lang/String;I)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p0

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p0

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p0, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p0, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0xbaa2

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    const v11, 0xb866

    .line 59
    .line 60
    .line 61
    add-int/2addr v10, v11

    .line 62
    xor-int/2addr v9, v10

    .line 63
    sub-int/2addr v7, v9

    .line 64
    int-to-char v7, v7

    .line 65
    aput-char v7, v3, v5

    .line 66
    .line 67
    add-int v9, v7, v4

    .line 68
    .line 69
    shl-int/lit8 v10, v7, 0x4

    .line 70
    .line 71
    add-int/lit16 v10, v10, 0x7cf1

    .line 72
    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    const v10, 0x93bc

    .line 77
    .line 78
    .line 79
    add-int/2addr v7, v10

    .line 80
    xor-int/2addr v7, v9

    .line 81
    sub-int/2addr v8, v7

    .line 82
    int-to-char v7, v8

    .line 83
    aput-char v7, v3, v2

    .line 84
    .line 85
    const v7, 0x9e37

    .line 86
    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 95
    .line 96
    aget-char v6, v3, v2

    .line 97
    .line 98
    aput-char v6, v1, v4

    .line 99
    .line 100
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    aget-char v5, v3, v5

    .line 103
    .line 104
    aput-char v5, v1, v6

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x2

    .line 107
    .line 108
    sput v4, LVa/Ab;->E:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return-object p0

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p0
.end method

.method public static v(ILjava/lang/String;)Ljava/lang/String;
    .locals 12

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p1

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p1

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p1, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p1, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0xb201

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    add-int/lit16 v10, v10, 0x1625

    .line 59
    .line 60
    xor-int/2addr v9, v10

    .line 61
    sub-int/2addr v7, v9

    .line 62
    int-to-char v7, v7

    .line 63
    aput-char v7, v3, v5

    .line 64
    .line 65
    add-int v9, v7, v4

    .line 66
    .line 67
    shl-int/lit8 v10, v7, 0x4

    .line 68
    .line 69
    const v11, 0xec62

    .line 70
    .line 71
    .line 72
    add-int/2addr v10, v11

    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    add-int/lit16 v7, v7, 0x5f2c

    .line 77
    .line 78
    xor-int/2addr v7, v9

    .line 79
    sub-int/2addr v8, v7

    .line 80
    int-to-char v7, v8

    .line 81
    aput-char v7, v3, v2

    .line 82
    .line 83
    const v7, 0x9e37

    .line 84
    .line 85
    .line 86
    sub-int/2addr v4, v7

    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_2

    .line 92
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 93
    .line 94
    aget-char v6, v3, v2

    .line 95
    .line 96
    aput-char v6, v1, v4

    .line 97
    .line 98
    add-int/lit8 v6, v4, 0x1

    .line 99
    .line 100
    aget-char v5, v3, v5

    .line 101
    .line 102
    aput-char v5, v1, v6

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x2

    .line 105
    .line 106
    sput v4, LVa/Ab;->E:I

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 112
    .line 113
    .line 114
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    return-object p1

    .line 116
    :goto_2
    monitor-exit v0

    .line 117
    throw p0
.end method


# virtual methods
.method public a(Ls9/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LE4/n;

    .line 4
    .line 5
    iget-object v0, v0, LE4/n;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b(Ls9/j;Lt9/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LE4/n;

    .line 4
    .line 5
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v1, Lt9/g;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2}, Lt9/g;-><init>(Ls9/j;Lt9/p;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c(Ls9/j;)LE5/b;
    .locals 4

    .line 1
    iget-object v0, p0, LE5/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls9/j;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0, p1}, Ls9/e;->b(Ls9/e;)Ls9/e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ls9/j;

    .line 14
    .line 15
    :goto_0
    new-instance v0, LE5/b;

    .line 16
    .line 17
    iget-object v1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LE4/n;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/16 v3, 0xd

    .line 23
    .line 24
    invoke-direct {v0, v1, p1, v2, v3}, LE5/b;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;ZI)V

    .line 25
    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    :goto_1
    iget-object v1, p1, Ls9/e;->a:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ge v2, v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Ls9/e;->g(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, LE5/b;->q(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_2
    return-object v0
.end method

.method public d(LU4/b;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, LE5/b;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 28
    .line 29
    check-cast p1, LU4/d;

    .line 30
    .line 31
    invoke-virtual {p1}, LU4/d;->c()V

    .line 32
    .line 33
    .line 34
    :cond_3
    return v0
.end method

.method public e()Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    invoke-virtual {p0}, LE5/b;->r()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, LE5/b;->b:Z

    .line 6
    .line 7
    iget-object v0, p0, LE5/b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    invoke-virtual {v0}, LDd/c;->C()V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, LDd/c;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lp9/n;

    .line 30
    .line 31
    iget-object v2, p0, LE5/b;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lp9/n;->f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    monitor-exit v0

    .line 40
    return-object v1

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw v1

    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method

.method public f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
    .locals 3

    .line 1
    iget-object v0, p0, LE5/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls9/j;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ls9/e;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, " (found in field "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ls9/j;->c()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ")"

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    const-string v0, ""

    .line 39
    .line 40
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    const-string v2, "Invalid data. "

    .line 43
    .line 44
    invoke-static {v2, p1, v0}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method

.method public g(DD)V
    .locals 11

    .line 1
    iget-boolean v0, p0, LE5/b;->b:Z

    .line 2
    .line 3
    iget-object v1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [D

    .line 6
    .line 7
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    aget-wide v5, v1, v4

    .line 14
    .line 15
    mul-double/2addr v5, p1

    .line 16
    const/4 v0, 0x7

    .line 17
    aget-wide v7, v1, v0

    .line 18
    .line 19
    mul-double/2addr v7, p3

    .line 20
    add-double/2addr v7, v5

    .line 21
    const/16 v0, 0xf

    .line 22
    .line 23
    aget-wide v5, v1, v0

    .line 24
    .line 25
    add-double/2addr v7, v5

    .line 26
    div-double/2addr v2, v7

    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    aget-wide v5, v1, v0

    .line 29
    .line 30
    mul-double/2addr v5, p1

    .line 31
    const/4 v7, 0x4

    .line 32
    aget-wide v7, v1, v7

    .line 33
    .line 34
    mul-double/2addr v7, p3

    .line 35
    add-double/2addr v7, v5

    .line 36
    const/16 v5, 0xc

    .line 37
    .line 38
    aget-wide v5, v1, v5

    .line 39
    .line 40
    add-double/2addr v7, v5

    .line 41
    mul-double/2addr v7, v2

    .line 42
    const/4 v5, 0x1

    .line 43
    aget-wide v9, v1, v5

    .line 44
    .line 45
    mul-double/2addr v9, p1

    .line 46
    const/4 p1, 0x5

    .line 47
    aget-wide p1, v1, p1

    .line 48
    .line 49
    mul-double/2addr p1, p3

    .line 50
    add-double/2addr p1, v9

    .line 51
    const/16 p3, 0xd

    .line 52
    .line 53
    aget-wide p3, v1, p3

    .line 54
    .line 55
    add-double/2addr p1, p3

    .line 56
    mul-double/2addr p1, v2

    .line 57
    iget-object p3, p0, LE5/b;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p3, [D

    .line 60
    .line 61
    aget-wide v1, p3, v0

    .line 62
    .line 63
    cmpg-double p4, v7, v1

    .line 64
    .line 65
    if-gez p4, :cond_1

    .line 66
    .line 67
    aput-wide v7, p3, v0

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    aget-wide v0, p3, v5

    .line 71
    .line 72
    cmpl-double p4, v7, v0

    .line 73
    .line 74
    if-lez p4, :cond_2

    .line 75
    .line 76
    aput-wide v7, p3, v5

    .line 77
    .line 78
    :cond_2
    :goto_1
    const/4 p4, 0x2

    .line 79
    aget-wide v0, p3, p4

    .line 80
    .line 81
    cmpg-double v0, p1, v0

    .line 82
    .line 83
    if-gez v0, :cond_3

    .line 84
    .line 85
    aput-wide p1, p3, p4

    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    aget-wide v0, p3, v4

    .line 89
    .line 90
    cmpl-double p4, p1, v0

    .line 91
    .line 92
    if-lez p4, :cond_4

    .line 93
    .line 94
    aput-wide p1, p3, v4

    .line 95
    .line 96
    :cond_4
    return-void
.end method

.method public h()Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x1

    .line 7
    iget-object v6, p0, LE5/b;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v6, LE4/n;

    .line 10
    .line 11
    iget v7, v6, LE4/n;->b:I

    .line 12
    .line 13
    invoke-static {v7}, LA/f;->f(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    if-eqz v7, :cond_7

    .line 18
    .line 19
    if-eq v7, v5, :cond_7

    .line 20
    .line 21
    if-eq v7, v4, :cond_7

    .line 22
    .line 23
    if-eq v7, v3, :cond_6

    .line 24
    .line 25
    if-ne v7, v2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget v6, v6, LE4/n;->b:I

    .line 29
    .line 30
    if-eq v6, v5, :cond_5

    .line 31
    .line 32
    if-eq v6, v4, :cond_4

    .line 33
    .line 34
    if-eq v6, v3, :cond_3

    .line 35
    .line 36
    if-eq v6, v2, :cond_2

    .line 37
    .line 38
    const/4 v2, 0x5

    .line 39
    if-ne v6, v2, :cond_1

    .line 40
    .line 41
    const-string v2, "ArrayArgument"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    throw v1

    .line 45
    :cond_2
    const-string v2, "Argument"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const-string v2, "Update"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    const-string v2, "MergeSet"

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    const-string v2, "Set"

    .line 55
    .line 56
    :goto_0
    new-array v3, v5, [Ljava/lang/Object;

    .line 57
    .line 58
    aput-object v2, v3, v0

    .line 59
    .line 60
    const-string v0, "Unexpected case for UserDataSource: %s"

    .line 61
    .line 62
    invoke-static {v0, v3}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_6
    :goto_1
    return v0

    .line 67
    :cond_7
    return v5
.end method

.method public i(J)Z
    .locals 7

    .line 1
    iget-object v0, p0, LE5/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LY2/B;

    .line 4
    .line 5
    iget-object v0, v0, LY2/B;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    move-object v5, v4

    .line 22
    check-cast v5, Lp0/m;

    .line 23
    .line 24
    iget-wide v5, v5, Lp0/m;->a:J

    .line 25
    .line 26
    cmp-long v5, v5, p1

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v4, 0x0

    .line 35
    :goto_1
    check-cast v4, Lp0/m;

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    iget-boolean p1, v4, Lp0/m;->g:Z

    .line 40
    .line 41
    return p1

    .line 42
    :cond_2
    return v2
.end method

.method public j()V
    .locals 5

    .line 1
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-static {v0}, LY4/m;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LU4/b;

    .line 24
    .line 25
    check-cast v1, LU4/d;

    .line 26
    .line 27
    invoke-virtual {v1}, LU4/d;->e()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    iget-object v2, v1, LU4/d;->c:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v2

    .line 36
    :try_start_0
    iget v3, v1, LU4/d;->z:I

    .line 37
    .line 38
    const/4 v4, 0x6

    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v3, 0x0

    .line 44
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, LU4/d;->c()V

    .line 48
    .line 49
    .line 50
    iget-boolean v2, p0, LE5/b;->b:Z

    .line 51
    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1}, LU4/d;->a()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget-object v2, p0, LE5/b;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw v0

    .line 69
    :cond_3
    return-void
.end method

.method public k(Lm9/m;Ljava/util/Map;Lm9/a0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->k(Lm9/m;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "Provided data must not be null."

    .line 9
    .line 10
    invoke-static {p2, v1}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "Provided options must not be null."

    .line 14
    .line 15
    invoke-static {p3, v1}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LE5/b;->r()V

    .line 19
    .line 20
    .line 21
    iget-boolean v1, p3, Lm9/a0;->a:Z

    .line 22
    .line 23
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object p3, p3, Lm9/a0;->b:Lt9/f;

    .line 28
    .line 29
    invoke-virtual {v0, p2, p3}, Lm9/f0;->e(Ljava/lang/Object;Lt9/f;)Lmd/J;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0, p2}, Lm9/f0;->g(Ljava/lang/Object;)Lmd/J;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    :goto_0
    iget-object p3, p0, LE5/b;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p3, Ljava/util/ArrayList;

    .line 41
    .line 42
    sget-object v0, Lt9/m;->c:Lt9/m;

    .line 43
    .line 44
    iget-object p1, p1, Lm9/m;->a:Ls9/h;

    .line 45
    .line 46
    invoke-virtual {p2, p1, v0}, Lmd/J;->y(Ls9/h;Lt9/m;)Lt9/h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget v0, p0, LE5/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LE5/b;->b:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, LE5/b;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LE5/a;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, LE5/b;->b:Z

    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_0
    iget-boolean v0, p0, LE5/b;->b:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/content/Context;

    .line 32
    .line 33
    iget-object v1, p0, LE5/b;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LE5/a;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, LE5/b;->b:Z

    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m(Ljava/util/concurrent/ScheduledFuture;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LE5/b;->b:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, LE5/b;->d:Ljava/lang/Object;

    .line 9
    .line 10
    :cond_0
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p1
.end method

.method public n(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lod/k0;

    .line 4
    .line 5
    iget-object v1, p0, LE5/b;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lod/o0;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroidx/lifecycle/a0;

    .line 13
    .line 14
    invoke-direct {v2, v1, v0, p1}, Landroidx/lifecycle/a0;-><init>(Lod/o0;Lod/k0;Z)V

    .line 15
    .line 16
    .line 17
    iget-object p1, v1, Lod/o0;->k:Lmd/n0;

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public o(Lmd/k0;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    iget-object v2, p0, LE5/b;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lod/o0;

    .line 6
    .line 7
    iget-object v3, v2, Lod/o0;->i:Lmd/e;

    .line 8
    .line 9
    iget-object v4, p0, LE5/b;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Lod/k0;

    .line 12
    .line 13
    invoke-virtual {v4}, Lod/U;->f()Lmd/F;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {p1}, Lod/o0;->j(Lmd/k0;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    new-array v6, v1, [Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    aput-object v4, v6, v7

    .line 25
    .line 26
    aput-object v5, v6, v0

    .line 27
    .line 28
    const-string v4, "{0} SHUTDOWN with {1}"

    .line 29
    .line 30
    invoke-virtual {v3, v1, v4, v6}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-boolean v0, p0, LE5/b;->b:Z

    .line 34
    .line 35
    new-instance v0, Lod/A;

    .line 36
    .line 37
    const/16 v1, 0xf

    .line 38
    .line 39
    invoke-direct {v0, v1, p0, p1}, Lod/A;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, v2, Lod/o0;->k:Lmd/n0;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public p()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, LE5/b;->b:Z

    .line 4
    .line 5
    const-string v3, "transportShutdown() must be called before transportTerminated()."

    .line 6
    .line 7
    invoke-static {v3, v2}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, LE5/b;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lod/o0;

    .line 13
    .line 14
    iget-object v3, v2, Lod/o0;->i:Lmd/e;

    .line 15
    .line 16
    iget-object v4, p0, LE5/b;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lod/k0;

    .line 19
    .line 20
    invoke-virtual {v4}, Lod/U;->f()Lmd/F;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    new-array v6, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    aput-object v5, v6, v0

    .line 27
    .line 28
    const-string v5, "{0} Terminated"

    .line 29
    .line 30
    const/4 v7, 0x2

    .line 31
    invoke-virtual {v3, v7, v5, v6}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v2, Lod/o0;->g:Lmd/C;

    .line 35
    .line 36
    iget-object v3, v3, Lmd/C;->c:Lj$/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v4}, Lod/U;->f()Lmd/F;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-wide v5, v5, Lmd/F;->c:J

    .line 43
    .line 44
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-interface {v3, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lmd/E;

    .line 53
    .line 54
    new-instance v3, Landroidx/lifecycle/a0;

    .line 55
    .line 56
    invoke-direct {v3, v2, v4, v0}, Landroidx/lifecycle/a0;-><init>(Lod/o0;Lod/k0;Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v2, Lod/o0;->k:Lmd/n0;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v2, Lod/o0;->j:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_0

    .line 75
    .line 76
    new-instance v2, Lod/m0;

    .line 77
    .line 78
    invoke-direct {v2, p0, v1}, Lod/m0;-><init>(LE5/b;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    invoke-virtual {v4}, Lod/U;->b()Lmd/b;

    .line 92
    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    throw v0

    .line 96
    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 99
    .line 100
    .line 101
    throw v0
.end method

.method public q(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, LE5/b;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v0, "__"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p1, "Document fields cannot begin and end with \"__\""

    .line 29
    .line 30
    invoke-virtual {p0, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1

    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    :cond_2
    const-string p1, "Document fields must not be empty"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    throw p1
.end method

.method public r()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LE5/b;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "A write batch can no longer be used after commit() has been called."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public s(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    sget v2, LE5/b;->e:I

    .line 4
    .line 5
    add-int/lit8 v2, v2, 0x23

    .line 6
    .line 7
    rem-int/lit16 v3, v2, 0x80

    .line 8
    .line 9
    sput v3, LE5/b;->f:I

    .line 10
    .line 11
    rem-int/lit8 v2, v2, 0x2

    .line 12
    .line 13
    iget-object v3, p0, LE5/b;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, LVa/y7;

    .line 16
    .line 17
    iget-object v4, p0, LE5/b;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v5, "\uf2c7\u36a0"

    .line 34
    .line 35
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    shr-int/lit8 v6, v6, 0x10

    .line 40
    .line 41
    rsub-int/lit8 v6, v6, 0x1

    .line 42
    .line 43
    invoke-static {v5, v6}, LE5/b;->u(Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast p1, LVa/H9;

    .line 66
    .line 67
    if-eqz p3, :cond_0

    .line 68
    .line 69
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception p1

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    :goto_0
    new-array v5, v0, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object p1, v5, v1

    .line 84
    .line 85
    invoke-static {p3, v5}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance p3, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-boolean v5, p0, LE5/b;->b:Z

    .line 95
    .line 96
    xor-int/2addr v5, v0

    .line 97
    if-eq v5, v0, :cond_1

    .line 98
    .line 99
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-object p1, p3

    .line 103
    :cond_1
    invoke-virtual {v3}, LVa/y7;->b()LVa/Ra;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    iget-object v5, p3, LVa/Ra;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v5, LVa/y7;

    .line 110
    .line 111
    invoke-static {v5, v2, v0, v1, p1}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 112
    .line 113
    .line 114
    new-instance v5, LVa/t7;

    .line 115
    .line 116
    invoke-direct {v5, p3, v2, v1, p1}, LVa/t7;-><init>(LVa/Ra;Ljava/lang/String;ZLjava/util/ArrayList;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v5, v1}, LVa/y7;->C(LVa/t7;Z)V

    .line 120
    .line 121
    .line 122
    new-instance v5, LVa/t7;

    .line 123
    .line 124
    invoke-direct {v5, p3, v2, v0, p1}, LVa/t7;-><init>(LVa/Ra;Ljava/lang/String;ZLjava/util/ArrayList;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v5, v0}, LVa/y7;->C(LVa/t7;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    .line 129
    .line 130
    :cond_2
    sget p1, LE5/b;->f:I

    .line 131
    .line 132
    add-int/lit8 p1, p1, 0x35

    .line 133
    .line 134
    rem-int/lit16 p2, p1, 0x80

    .line 135
    .line 136
    sput p2, LE5/b;->e:I

    .line 137
    .line 138
    rem-int/lit8 p1, p1, 0x2

    .line 139
    .line 140
    if-eqz p1, :cond_3

    .line 141
    .line 142
    const/16 p1, 0x13

    .line 143
    .line 144
    div-int/2addr p1, v1

    .line 145
    :cond_3
    return-void

    .line 146
    :cond_4
    const/4 p1, 0x0

    .line 147
    :try_start_1
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    :catchall_0
    move-exception p1

    .line 149
    throw p1

    .line 150
    :goto_1
    invoke-virtual {v3}, LVa/y7;->f()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-wide/16 v2, 0x0

    .line 160
    .line 161
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    rsub-int/lit8 v2, v2, 0xf

    .line 166
    .line 167
    const-string v3, "\u45e2\ud0fa\uc9b6\uca4d\u1494\u00f7\ud75d\u46de\u0c5c\u4c5f\u2074\ubbd1\u82b5\u8f2e\u9898\u3cb5"

    .line 168
    .line 169
    invoke-static {v3, v2}, LE5/b;->u(Ljava/lang/String;I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string p2, ""

    .line 188
    .line 189
    const/16 v2, 0x30

    .line 190
    .line 191
    invoke-static {p2, v2, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    rsub-int/lit8 v1, v1, 0xa

    .line 196
    .line 197
    const-string v2, "\u49b3\uc6b4\ue651\u78c1\u0ee4\u00b9\ua86d\u0392\u08a4\u7190\u9898\u3cb5"

    .line 198
    .line 199
    invoke-static {v2, v1}, LE5/b;->u(Ljava/lang/String;I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-static {p2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    rsub-int/lit8 p2, p2, 0x9

    .line 218
    .line 219
    const-string v1, "\ub2c7\u37dc\u1835\ub32c\uab48\u7b22\u4727\u595b\u5333\uaf54"

    .line 220
    .line 221
    invoke-static {v1, p2}, LE5/b;->u(Ljava/lang/String;I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-static {p3, p2, p1}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public t(LVa/mb;)V
    .locals 4

    .line 1
    sget v0, LE5/b;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x67

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LE5/b;->h:I

    .line 8
    .line 9
    invoke-virtual {p0}, LE5/b;->w()Landroid/webkit/WebView;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {v0}, LVa/Ab;->F(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, LVa/V9;

    .line 21
    .line 22
    invoke-direct {v3, v2, p1}, LVa/V9;-><init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebViewClient;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-direct {p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LE5/b;->d:Ljava/lang/Object;

    .line 31
    .line 32
    sget p1, LE5/b;->h:I

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x77

    .line 35
    .line 36
    rem-int/lit16 p1, p1, 0x80

    .line 37
    .line 38
    sput p1, LE5/b;->g:I

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, LE5/b;->b:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception p1

    .line 48
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/lit8 v0, v0, 0x10

    .line 53
    .line 54
    const-string v2, "\u16f3\ub556\ud48b\uf258\u0937\u783e\ua2b9\u4497\u8fb2\u823c\u4d4b\ua6c9\ueaf1\uf487\u6d1f\u79b4"

    .line 55
    .line 56
    invoke-static {v0, v2}, LE5/b;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v2, ""

    .line 65
    .line 66
    invoke-static {v2, v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    rsub-int/lit8 v2, v2, 0x1b

    .line 71
    .line 72
    const-string v3, "\u2494\ue70a\ub95b\u402d\u35d7\ue153\u6322\u093a\u92b3\u10f8\ub86f\uf810\u4926\u6562\u16f3\ub556\ud48b\uf258\u0937\u783e\u9bfa\ud4ca\uc284\u643c\u4d4b\ua6c9\ueddd\u29b8"

    .line 73
    .line 74
    invoke-static {v2, v3}, LE5/b;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v0, v2, p1, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 83
    .line 84
    .line 85
    :cond_0
    iput-boolean v1, p0, LE5/b;->b:Z

    .line 86
    .line 87
    sget p1, LE5/b;->h:I

    .line 88
    .line 89
    add-int/lit8 p1, p1, 0x4b

    .line 90
    .line 91
    rem-int/lit16 v0, p1, 0x80

    .line 92
    .line 93
    sput v0, LE5/b;->g:I

    .line 94
    .line 95
    rem-int/lit8 p1, p1, 0x2

    .line 96
    .line 97
    if-nez p1, :cond_1

    .line 98
    .line 99
    return-void

    .line 100
    :cond_1
    const/4 p1, 0x0

    .line 101
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LE5/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "{numRequests="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LE5/b;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", isPaused="

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-boolean v1, p0, LE5/b;->b:Z

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, "}"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public w()Landroid/webkit/WebView;
    .locals 3

    .line 1
    sget v0, LE5/b;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LE5/b;->g:I

    .line 8
    .line 9
    iget-object v0, p0, LE5/b;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/webkit/WebView;

    .line 18
    .line 19
    sget v1, LE5/b;->h:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x25

    .line 22
    .line 23
    rem-int/lit16 v2, v1, 0x80

    .line 24
    .line 25
    sput v2, LE5/b;->g:I

    .line 26
    .line 27
    rem-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    throw v0
.end method

.method public x(LVa/nb;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LE5/b;->w()Landroid/webkit/WebView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget v0, LE5/b;->g:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x65

    .line 10
    .line 11
    rem-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    sput v0, LE5/b;->h:I

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, LVa/Ab;->c0(Landroid/webkit/WebView;)Landroid/webkit/WebChromeClient;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget p1, LE5/b;->h:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x6b

    .line 24
    .line 25
    rem-int/lit16 p1, p1, 0x80

    .line 26
    .line 27
    sput p1, LE5/b;->g:I

    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    const-wide/16 v0, 0x0

    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/lit8 v0, v0, 0x11

    .line 38
    .line 39
    const-string v1, "\u16f3\ub556\ud48b\uf258\u0937\u783e\ua2b9\u4497\u8fb2\u823c\u4d4b\ua6c9\ueaf1\uf487\u6d1f\u79b4"

    .line 40
    .line 41
    invoke-static {v0, v1}, LE5/b;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {v1}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x0

    .line 55
    cmpl-float v2, v2, v3

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1d

    .line 58
    .line 59
    const-string v3, "\u2494\ue70a\ub95b\u402d\u35d7\ue153\u6322\u093a\u92b3\u10f8\ub86f\uf810\u4926\u6562\u16f3\ub556\u4de3\uf1dc\uca79\u9663\u3fdb\u0c2d\u2758\u5132\uc284\u643c\u4d4b\ua6c9\ueddd\u29b8"

    .line 60
    .line 61
    invoke-static {v2, v3}, LE5/b;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v0, v2, p1, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
.end method
