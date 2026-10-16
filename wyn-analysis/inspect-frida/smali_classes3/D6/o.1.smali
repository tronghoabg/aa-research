.class public final LD6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LD6/u1;LD6/f1;LD6/f1;Lcom/google/android/gms/internal/ads/zzboe;Lcom/google/android/gms/internal/ads/zzbzf;LD6/f1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/o;->a:Ljava/lang/Object;

    iput-object p2, p0, LD6/o;->b:Ljava/lang/Object;

    iput-object p3, p0, LD6/o;->c:Ljava/lang/Object;

    iput-object p4, p0, LD6/o;->d:Ljava/lang/Object;

    iput-object p5, p0, LD6/o;->e:Ljava/lang/Object;

    iput-object p6, p0, LD6/o;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LH4/c;LH4/c;LH4/c;LH4/c;LE4/o;LE4/o;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, LS3/l;

    invoke-direct {v0, p0}, LS3/l;-><init>(Ljava/lang/Object;)V

    const/16 v1, 0x96

    .line 25
    invoke-static {v1, v0}, LZ4/d;->a(ILZ4/a;)LDd/c;

    move-result-object v0

    iput-object v0, p0, LD6/o;->g:Ljava/lang/Object;

    .line 26
    iput-object p1, p0, LD6/o;->a:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, LD6/o;->b:Ljava/lang/Object;

    .line 28
    iput-object p3, p0, LD6/o;->c:Ljava/lang/Object;

    .line 29
    iput-object p4, p0, LD6/o;->d:Ljava/lang/Object;

    .line 30
    iput-object p5, p0, LD6/o;->e:Ljava/lang/Object;

    .line 31
    iput-object p6, p0, LD6/o;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LR8/t;LX8/a;LY8/a;LT8/e;LX8/c;LR8/z;LS8/f;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, LD6/o;->a:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, LD6/o;->b:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, LD6/o;->c:Ljava/lang/Object;

    .line 19
    iput-object p4, p0, LD6/o;->d:Ljava/lang/Object;

    .line 20
    iput-object p5, p0, LD6/o;->e:Ljava/lang/Object;

    .line 21
    iput-object p6, p0, LD6/o;->f:Ljava/lang/Object;

    .line 22
    iput-object p7, p0, LD6/o;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;Laa/h;Laa/c;Ljava/util/LinkedHashSet;Laa/m;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LD6/o;->b:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, LD6/o;->c:Ljava/lang/Object;

    .line 10
    iput-object p3, p0, LD6/o;->d:Ljava/lang/Object;

    .line 11
    iput-object p4, p0, LD6/o;->a:Ljava/lang/Object;

    .line 12
    iput-object p5, p0, LD6/o;->e:Ljava/lang/Object;

    .line 13
    iput-object p6, p0, LD6/o;->f:Ljava/lang/Object;

    .line 14
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, LD6/o;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly4/a;Lx4/c;Lx4/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LD6/o;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LD6/o;->b:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, LD6/o;->c:Ljava/lang/Object;

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LD6/o;->d:Ljava/lang/Object;

    return-void
.end method

.method public static a(LU8/Q;LT8/e;LX8/c;)LU8/Q;
    .locals 9

    .line 1
    invoke-virtual {p0}, LU8/Q;->a()LU8/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p1, p1, LT8/e;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, LT8/c;

    .line 8
    .line 9
    invoke-interface {p1}, LT8/c;->b()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance v1, LU8/e0;

    .line 16
    .line 17
    invoke-direct {v1, p1}, LU8/e0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, LU8/P;->e:LU8/e0;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x2

    .line 24
    const-string v1, "FirebaseCrashlytics"

    .line 25
    .line 26
    invoke-static {v1, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const-string p1, "No log data to include with this event."

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v1, p1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object p1, p2, LX8/c;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LA7/b0;

    .line 41
    .line 42
    iget-object p1, p1, LA7/b0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, LT8/d;

    .line 51
    .line 52
    invoke-virtual {p1}, LT8/d;->a()Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, LD6/o;->e(Ljava/util/Map;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object p1, p2, LX8/c;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, LA7/b0;

    .line 63
    .line 64
    iget-object p1, p1, LA7/b0;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, LT8/d;

    .line 73
    .line 74
    invoke-virtual {p1}, LT8/d;->a()Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, LD6/o;->e(Ljava/util/Map;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_3

    .line 93
    .line 94
    :cond_2
    iget-object p0, p0, LU8/Q;->c:LU8/S;

    .line 95
    .line 96
    iget-object v2, p0, LU8/S;->a:LU8/T;

    .line 97
    .line 98
    new-instance v1, LU8/S;

    .line 99
    .line 100
    iget-object v7, p0, LU8/S;->f:Ljava/util/List;

    .line 101
    .line 102
    iget v8, p0, LU8/S;->g:I

    .line 103
    .line 104
    iget-object v5, p0, LU8/S;->d:Ljava/lang/Boolean;

    .line 105
    .line 106
    iget-object v6, p0, LU8/S;->e:LU8/E0;

    .line 107
    .line 108
    invoke-direct/range {v1 .. v8}, LU8/S;-><init>(LU8/T;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;LU8/E0;Ljava/util/List;I)V

    .line 109
    .line 110
    .line 111
    iput-object v1, v0, LU8/P;->c:LU8/S;

    .line 112
    .line 113
    :cond_3
    invoke-virtual {v0}, LU8/P;->a()LU8/Q;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public static b(LU8/Q;LX8/c;)LU8/L0;
    .locals 7

    .line 1
    iget-object p1, p1, LX8/c;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LI9/a;

    .line 4
    .line 5
    invoke-virtual {p1}, LI9/a;->b()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_4

    .line 20
    .line 21
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, LT8/m;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v3, LU8/f0;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    check-cast v2, LT8/b;

    .line 36
    .line 37
    iget-object v4, v2, LT8/b;->e:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    iget-object v5, v2, LT8/b;->b:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    new-instance v6, LU8/h0;

    .line 46
    .line 47
    invoke-direct {v6, v5, v4}, LU8/h0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput-object v6, v3, LU8/f0;->a:LU8/h0;

    .line 51
    .line 52
    iget-object v4, v2, LT8/b;->c:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    iput-object v4, v3, LU8/f0;->b:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, v2, LT8/b;->d:Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    iput-object v4, v3, LU8/f0;->c:Ljava/lang/String;

    .line 63
    .line 64
    iget-wide v4, v2, LT8/b;->f:J

    .line 65
    .line 66
    iput-wide v4, v3, LU8/f0;->d:J

    .line 67
    .line 68
    iget-byte v2, v3, LU8/f0;->e:B

    .line 69
    .line 70
    or-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    int-to-byte v2, v2

    .line 73
    iput-byte v2, v3, LU8/f0;->e:B

    .line 74
    .line 75
    invoke-virtual {v3}, LU8/f0;->a()LU8/g0;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 86
    .line 87
    const-string p1, "Null parameterValue"

    .line 88
    .line 89
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0

    .line 93
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 94
    .line 95
    const-string p1, "Null parameterKey"

    .line 96
    .line 97
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 102
    .line 103
    const-string p1, "Null rolloutId"

    .line 104
    .line 105
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0

    .line 109
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    .line 110
    .line 111
    const-string p1, "Null variantId"

    .line 112
    .line 113
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_5
    invoke-virtual {p0}, LU8/Q;->a()LU8/P;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    new-instance p1, LU8/i0;

    .line 129
    .line 130
    invoke-direct {p1, v0}, LU8/i0;-><init>(Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, LU8/P;->f:LU8/i0;

    .line 134
    .line 135
    invoke-virtual {p0}, LU8/P;->a()LU8/Q;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
.end method

.method public static d(Landroid/content/Context;LR8/z;LX8/c;LR8/a;LT8/e;LX8/c;LY2/B;LK3/r;LS3/s;LR8/j;LS8/f;)LD6/o;
    .locals 8

    .line 1
    new-instance v0, LR8/t;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p6

    .line 7
    move-object v5, p7

    .line 8
    invoke-direct/range {v0 .. v5}, LR8/t;-><init>(Landroid/content/Context;LR8/z;LR8/a;LY2/B;LK3/r;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, LX8/a;

    .line 12
    .line 13
    move-object/from16 p3, p9

    .line 14
    .line 15
    invoke-direct {v2, p2, p7, p3}, LX8/a;-><init>(LX8/c;LK3/r;LR8/j;)V

    .line 16
    .line 17
    .line 18
    sget-object p2, LY8/a;->b:LV8/a;

    .line 19
    .line 20
    invoke-static {p0}, Lt5/r;->b(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lt5/r;->a()Lt5/r;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance p2, Lr5/a;

    .line 28
    .line 29
    sget-object p3, LY8/a;->c:Ljava/lang/String;

    .line 30
    .line 31
    sget-object p6, LY8/a;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {p2, p3, p6}, Lr5/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lt5/r;->c(Lr5/a;)Lt5/p;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p2, Lq5/c;

    .line 41
    .line 42
    const-string p3, "json"

    .line 43
    .line 44
    invoke-direct {p2, p3}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object p3, LY8/a;->e:LV1/c;

    .line 48
    .line 49
    const-string p6, "FIREBASE_CRASHLYTICS_REPORT"

    .line 50
    .line 51
    invoke-virtual {p0, p6, p2, p3}, Lt5/p;->a(Ljava/lang/String;Lq5/c;Lq5/f;)Lt5/q;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance p2, LY8/c;

    .line 56
    .line 57
    invoke-virtual {p7}, LK3/r;->c()LZ8/a;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    move-object/from16 p6, p8

    .line 62
    .line 63
    invoke-direct {p2, p0, p3, p6}, LY8/c;-><init>(Lt5/q;LZ8/a;LS3/s;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, LY8/a;

    .line 67
    .line 68
    invoke-direct {v3, p2}, LY8/a;-><init>(LY8/c;)V

    .line 69
    .line 70
    .line 71
    move-object v1, v0

    .line 72
    new-instance v0, LD6/o;

    .line 73
    .line 74
    move-object v6, p1

    .line 75
    move-object v4, p4

    .line 76
    move-object v5, p5

    .line 77
    move-object/from16 v7, p10

    .line 78
    .line 79
    invoke-direct/range {v0 .. v7}, LD6/o;-><init>(LR8/t;LX8/a;LY8/a;LT8/e;LX8/c;LR8/z;LS8/f;)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method public static e(Ljava/util/Map;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    new-instance v3, LU8/G;

    .line 50
    .line 51
    invoke-direct {v3, v2, v1}, LU8/G;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 59
    .line 60
    const-string v0, "Null value"

    .line 61
    .line 62
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 67
    .line 68
    const-string v0, "Null key"

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_2
    new-instance p0, LA0/f;

    .line 75
    .line 76
    const/4 v1, 0x5

    .line 77
    invoke-direct {p0, v1}, LA0/f;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "action"

    .line 7
    .line 8
    const-string v2, "no_ads_fallback"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "flow"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, LD6/q;->g:LD6/q;

    .line 19
    .line 20
    iget-object v1, p1, LD6/q;->a:LH6/f;

    .line 21
    .line 22
    iget-object p1, p1, LD6/q;->d:LH6/a;

    .line 23
    .line 24
    iget-object p1, p1, LH6/a;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, LS3/e;

    .line 30
    .line 31
    const/4 v3, 0x6

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v2, v1, v4, p0, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p1, v0, v2}, LH6/f;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;LH6/e;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public c(IJ)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, LZ9/h;

    .line 4
    .line 5
    const-string p2, "Unable to fetch the latest version of the template."

    .line 6
    .line 7
    invoke-direct {p1, p2}, LZ9/h;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, LD6/o;->i(LZ9/f;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, LD6/o;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/Random;

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Laa/b;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1, p2, p3}, Laa/b;-><init>(LD6/o;IJ)V

    .line 26
    .line 27
    .line 28
    int-to-long p1, v0

    .line 29
    sget-object p3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 30
    .line 31
    iget-object v0, p0, LD6/o;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 34
    .line 35
    invoke-interface {v0, v1, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public f(Ljava/io/InputStream;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    const-string v2, "utf-8"

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 11
    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_8

    .line 20
    .line 21
    invoke-static {v1, v2}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v3, "}"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const/16 v2, 0x7b

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/16 v3, 0x7d

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const-string v4, ""

    .line 46
    .line 47
    if-ltz v2, :cond_2

    .line 48
    .line 49
    if-gez v3, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    if-lt v2, v3, :cond_3

    .line 53
    .line 54
    :cond_2
    :goto_1
    move-object v1, v4

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 70
    .line 71
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v1, "featureDisabled"

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    const-string v1, "featureDisabled"

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    iget-object v1, p0, LD6/o;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Laa/m;

    .line 93
    .line 94
    new-instance v2, LZ9/h;

    .line 95
    .line 96
    const-string v3, "The server is temporarily unavailable. Try again in a few minutes."

    .line 97
    .line 98
    invoke-direct {v2, v3}, LZ9/h;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, Laa/m;->b(LZ9/f;)V

    .line 102
    .line 103
    .line 104
    goto :goto_5

    .line 105
    :catch_0
    move-exception v1

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    monitor-enter p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    :try_start_1
    iget-object v1, p0, LD6/o;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    :try_start_2
    monitor-exit p0

    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_6
    const-string v1, "latestTemplateVersionNumber"

    .line 121
    .line 122
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    iget-object v1, p0, LD6/o;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Laa/h;

    .line 131
    .line 132
    iget-object v1, v1, Laa/h;->g:Laa/k;

    .line 133
    .line 134
    iget-object v1, v1, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 135
    .line 136
    const-string v3, "last_template_version"

    .line 137
    .line 138
    const-wide/16 v4, 0x0

    .line 139
    .line 140
    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v3

    .line 144
    const-string v1, "latestTemplateVersionNumber"

    .line 145
    .line 146
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    cmp-long v3, v1, v3

    .line 151
    .line 152
    if-lez v3, :cond_7

    .line 153
    .line 154
    const/4 v3, 0x3

    .line 155
    invoke-virtual {p0, v3, v1, v2}, LD6/o;->c(IJ)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :catchall_0
    move-exception v1

    .line 160
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 161
    :try_start_4
    throw v1
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 162
    :goto_3
    new-instance v2, LZ9/e;

    .line 163
    .line 164
    const-string v3, "Unable to parse config update message."

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-direct {v2, v3, v4}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v2}, LD6/o;->i(LZ9/f;)V

    .line 174
    .line 175
    .line 176
    const-string v2, "FirebaseRemoteConfig"

    .line 177
    .line 178
    const-string v3, "Unable to parse latest config update message."

    .line 179
    .line 180
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 181
    .line 182
    .line 183
    :cond_7
    :goto_4
    const-string v1, ""

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_8
    :goto_5
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public g()V
    .locals 4

    .line 1
    iget-object v0, p0, LD6/o;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v1}, LD6/o;->f(Ljava/io/InputStream;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v1

    .line 22
    :try_start_1
    const-string v2, "FirebaseRemoteConfig"

    .line 23
    .line 24
    const-string v3, "Stream was cancelled due to an exception. Retrying the connection..."

    .line 25
    .line 26
    invoke-static {v2, v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 34
    .line 35
    .line 36
    throw v1
.end method

.method public h(JLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    const-string v2, "crash"

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    iget-object v2, v1, LD6/o;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, LR8/t;

    .line 14
    .line 15
    iget-object v3, v2, LR8/t;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget v13, v5, Landroid/content/res/Configuration;->orientation:I

    .line 26
    .line 27
    new-instance v5, Ljava/util/Stack;

    .line 28
    .line 29
    invoke-direct {v5}, Ljava/util/Stack;-><init>()V

    .line 30
    .line 31
    .line 32
    move-object/from16 v6, p4

    .line 33
    .line 34
    :goto_0
    if-eqz v6, :cond_0

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v6, 0x0

    .line 45
    move-object v7, v6

    .line 46
    :goto_1
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    iget-object v9, v2, LR8/t;->d:LY2/B;

    .line 51
    .line 52
    if-nez v8, :cond_1

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    check-cast v8, Ljava/lang/Throwable;

    .line 59
    .line 60
    new-instance v10, LVa/X7;

    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-virtual {v8}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v9, v8}, LY2/B;->f([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-direct {v10, v11, v8, v7, v12}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v7, v10

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    new-instance v5, LU8/P;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v0, v5, LU8/P;->b:Ljava/lang/String;

    .line 93
    .line 94
    move-wide/from16 v10, p1

    .line 95
    .line 96
    iput-wide v10, v5, LU8/P;->a:J

    .line 97
    .line 98
    iget-byte v0, v5, LU8/P;->g:B

    .line 99
    .line 100
    const/4 v8, 0x1

    .line 101
    or-int/2addr v0, v8

    .line 102
    int-to-byte v0, v0

    .line 103
    iput-byte v0, v5, LU8/P;->g:B

    .line 104
    .line 105
    sget-object v0, LO8/c;->b:LO8/c;

    .line 106
    .line 107
    invoke-virtual {v0, v3}, LO8/c;->e(Landroid/content/Context;)LU8/E0;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    move-object v0, v11

    .line 112
    check-cast v0, LU8/b0;

    .line 113
    .line 114
    iget v0, v0, LU8/b0;->c:I

    .line 115
    .line 116
    if-lez v0, :cond_3

    .line 117
    .line 118
    const/16 v6, 0x64

    .line 119
    .line 120
    if-eq v0, v6, :cond_2

    .line 121
    .line 122
    move v0, v8

    .line 123
    goto :goto_2

    .line 124
    :cond_2
    const/4 v0, 0x0

    .line 125
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    :cond_3
    invoke-static {v3}, LO8/c;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    int-to-byte v0, v8

    .line 134
    new-instance v3, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    iget-object v14, v7, LVa/X7;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v14, [Ljava/lang/StackTraceElement;

    .line 142
    .line 143
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    const-string v10, "Null name"

    .line 148
    .line 149
    if-eqz v15, :cond_11

    .line 150
    .line 151
    move/from16 v16, v4

    .line 152
    .line 153
    int-to-byte v4, v8

    .line 154
    const/4 v8, 0x4

    .line 155
    invoke-static {v14, v8}, LR8/t;->d([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    const-string v8, "Null frames"

    .line 160
    .line 161
    if-eqz v14, :cond_10

    .line 162
    .line 163
    move-object/from16 p6, v6

    .line 164
    .line 165
    const-string v6, " importance"

    .line 166
    .line 167
    move-object/from16 v17, v11

    .line 168
    .line 169
    const-string v11, "Missing required properties:"

    .line 170
    .line 171
    move-object/from16 v18, v12

    .line 172
    .line 173
    const/4 v12, 0x1

    .line 174
    if-ne v4, v12, :cond_e

    .line 175
    .line 176
    new-instance v12, LU8/X;

    .line 177
    .line 178
    move/from16 v19, v13

    .line 179
    .line 180
    const/4 v13, 0x4

    .line 181
    invoke-direct {v12, v13, v14, v15}, LU8/X;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    if-eqz p7, :cond_9

    .line 188
    .line 189
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v12

    .line 201
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    if-eqz v13, :cond_9

    .line 206
    .line 207
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    check-cast v13, Ljava/util/Map$Entry;

    .line 212
    .line 213
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    check-cast v14, Ljava/lang/Thread;

    .line 218
    .line 219
    move-object/from16 v15, p3

    .line 220
    .line 221
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v20

    .line 225
    if-nez v20, :cond_8

    .line 226
    .line 227
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    check-cast v13, [Ljava/lang/StackTraceElement;

    .line 232
    .line 233
    invoke-virtual {v9, v13}, LY2/B;->f([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    invoke-virtual {v14}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    if-eqz v14, :cond_7

    .line 242
    .line 243
    move-object/from16 v20, v9

    .line 244
    .line 245
    const/4 v9, 0x0

    .line 246
    invoke-static {v13, v9}, LR8/t;->d([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    if-eqz v13, :cond_6

    .line 251
    .line 252
    const/4 v9, 0x1

    .line 253
    if-ne v4, v9, :cond_4

    .line 254
    .line 255
    new-instance v9, LU8/X;

    .line 256
    .line 257
    move/from16 p4, v4

    .line 258
    .line 259
    const/4 v4, 0x0

    .line 260
    invoke-direct {v9, v4, v13, v14}, LU8/X;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_4
    move/from16 p4, v4

    .line 268
    .line 269
    new-instance v0, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    .line 273
    .line 274
    if-nez p4, :cond_5

    .line 275
    .line 276
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    :cond_5
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 280
    .line 281
    invoke-static {v11, v0}, LN0/a;->i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v2

    .line 289
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 290
    .line 291
    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    .line 296
    .line 297
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v0

    .line 301
    :cond_8
    move/from16 p4, v4

    .line 302
    .line 303
    move-object/from16 v20, v9

    .line 304
    .line 305
    :goto_4
    move/from16 v4, p4

    .line 306
    .line 307
    move-object/from16 v9, v20

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_9
    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v21

    .line 314
    const/4 v9, 0x0

    .line 315
    invoke-static {v7, v9}, LR8/t;->c(LVa/X7;I)LU8/V;

    .line 316
    .line 317
    .line 318
    move-result-object v22

    .line 319
    invoke-static {}, LR8/t;->e()LU8/W;

    .line 320
    .line 321
    .line 322
    move-result-object v24

    .line 323
    invoke-virtual {v2}, LR8/t;->a()Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v25

    .line 327
    if-eqz v25, :cond_d

    .line 328
    .line 329
    new-instance v20, LU8/T;

    .line 330
    .line 331
    const/16 v23, 0x0

    .line 332
    .line 333
    invoke-direct/range {v20 .. v25}, LU8/T;-><init>(Ljava/util/List;LU8/V;LU8/r0;LU8/W;Ljava/util/List;)V

    .line 334
    .line 335
    .line 336
    const/4 v9, 0x1

    .line 337
    if-ne v0, v9, :cond_b

    .line 338
    .line 339
    new-instance v6, LU8/S;

    .line 340
    .line 341
    const/4 v9, 0x0

    .line 342
    const/4 v8, 0x0

    .line 343
    move-object/from16 v10, p6

    .line 344
    .line 345
    move-object/from16 v11, v17

    .line 346
    .line 347
    move-object/from16 v12, v18

    .line 348
    .line 349
    move/from16 v13, v19

    .line 350
    .line 351
    move-object/from16 v7, v20

    .line 352
    .line 353
    invoke-direct/range {v6 .. v13}, LU8/S;-><init>(LU8/T;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;LU8/E0;Ljava/util/List;I)V

    .line 354
    .line 355
    .line 356
    iput-object v6, v5, LU8/P;->c:LU8/S;

    .line 357
    .line 358
    invoke-virtual {v2, v13}, LR8/t;->b(I)LU8/d0;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    iput-object v0, v5, LU8/P;->d:LU8/d0;

    .line 363
    .line 364
    invoke-virtual {v5}, LU8/P;->a()LU8/Q;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v2, v1, LD6/o;->d:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v2, LT8/e;

    .line 371
    .line 372
    iget-object v3, v1, LD6/o;->e:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v3, LX8/c;

    .line 375
    .line 376
    invoke-static {v0, v2, v3}, LD6/o;->a(LU8/Q;LT8/e;LX8/c;)LU8/Q;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v0, v3}, LD6/o;->b(LU8/Q;LX8/c;)LU8/L0;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    if-nez p7, :cond_a

    .line 385
    .line 386
    iget-object v0, v1, LD6/o;->g:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v0, LS8/f;

    .line 389
    .line 390
    iget-object v6, v0, LS8/f;->b:LS8/c;

    .line 391
    .line 392
    new-instance v0, LDb/b;

    .line 393
    .line 394
    const/4 v5, 0x1

    .line 395
    move-object/from16 v3, p5

    .line 396
    .line 397
    move/from16 v4, v16

    .line 398
    .line 399
    invoke-direct/range {v0 .. v5}, LDb/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ZI)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v6, v0}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :cond_a
    move/from16 v4, v16

    .line 407
    .line 408
    iget-object v0, v1, LD6/o;->b:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, LX8/a;

    .line 411
    .line 412
    move-object/from16 v3, p5

    .line 413
    .line 414
    invoke-virtual {v0, v2, v3, v4}, LX8/a;->d(LU8/L0;Ljava/lang/String;Z)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    if-nez v0, :cond_c

    .line 424
    .line 425
    const-string v0, " uiOrientation"

    .line 426
    .line 427
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 431
    .line 432
    invoke-static {v11, v2}, LN0/a;->i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :cond_d
    new-instance v0, Ljava/lang/NullPointerException;

    .line 441
    .line 442
    const-string v2, "Null binaries"

    .line 443
    .line 444
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v0

    .line 448
    :cond_e
    move/from16 p4, v4

    .line 449
    .line 450
    new-instance v0, Ljava/lang/StringBuilder;

    .line 451
    .line 452
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 453
    .line 454
    .line 455
    if-nez p4, :cond_f

    .line 456
    .line 457
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    :cond_f
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 461
    .line 462
    invoke-static {v11, v0}, LN0/a;->i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw v2

    .line 470
    :cond_10
    new-instance v0, Ljava/lang/NullPointerException;

    .line 471
    .line 472
    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    throw v0

    .line 476
    :cond_11
    new-instance v0, Ljava/lang/NullPointerException;

    .line 477
    .line 478
    invoke-direct {v0, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v0
.end method

.method public declared-synchronized i(LZ9/f;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LD6/o;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LZ9/b;

    .line 21
    .line 22
    invoke-interface {v1, p1}, LZ9/b;->b(LZ9/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1
.end method

.method public j(Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, LD6/o;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LX8/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LX8/a;->b()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v5, v0

    .line 33
    check-cast v5, Ljava/io/File;

    .line 34
    .line 35
    :try_start_0
    sget-object v0, LX8/a;->g:LV8/a;

    .line 36
    .line 37
    invoke-static {v5}, LX8/a;->e(Ljava/io/File;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v6}, LV8/a;->i(Ljava/lang/String;)LU8/C;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    new-instance v7, LR8/b;

    .line 53
    .line 54
    invoke-direct {v7, v0, v6, v5}, LR8/b;-><init>(LU8/C;Ljava/lang/String;Ljava/io/File;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    new-instance v6, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v7, "Could not load report file "

    .line 65
    .line 66
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v7, "; deleting"

    .line 73
    .line 74
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const-string v7, "FirebaseCrashlytics"

    .line 82
    .line 83
    invoke-static {v7, v6, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_a

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, LR8/b;

    .line 110
    .line 111
    if-eqz v2, :cond_2

    .line 112
    .line 113
    iget-object v5, v4, LR8/b;->b:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_1
    move-object/from16 v6, p2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    :goto_2
    iget-object v5, v1, LD6/o;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v5, LY8/a;

    .line 128
    .line 129
    iget-object v6, v4, LR8/b;->a:LU8/C;

    .line 130
    .line 131
    iget-object v7, v6, LU8/C;->f:Ljava/lang/String;

    .line 132
    .line 133
    const/4 v8, 0x1

    .line 134
    if-eqz v7, :cond_3

    .line 135
    .line 136
    iget-object v6, v6, LU8/C;->g:Ljava/lang/String;

    .line 137
    .line 138
    if-nez v6, :cond_4

    .line 139
    .line 140
    :cond_3
    iget-object v6, v1, LD6/o;->f:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v6, LR8/z;

    .line 143
    .line 144
    invoke-virtual {v6, v8}, LR8/z;->b(Z)LR8/y;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    iget-object v7, v4, LR8/b;->a:LU8/C;

    .line 149
    .line 150
    invoke-virtual {v7}, LU8/C;->a()LU8/B;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    iget-object v9, v6, LR8/y;->a:Ljava/lang/String;

    .line 155
    .line 156
    iput-object v9, v7, LU8/B;->e:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v7}, LU8/B;->a()LU8/C;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {v7}, LU8/C;->a()LU8/B;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    iget-object v6, v6, LR8/y;->b:Ljava/lang/String;

    .line 167
    .line 168
    iput-object v6, v7, LU8/B;->f:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v7}, LU8/B;->a()LU8/C;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    new-instance v7, LR8/b;

    .line 175
    .line 176
    iget-object v9, v4, LR8/b;->b:Ljava/lang/String;

    .line 177
    .line 178
    iget-object v4, v4, LR8/b;->c:Ljava/io/File;

    .line 179
    .line 180
    invoke-direct {v7, v6, v9, v4}, LR8/b;-><init>(LU8/C;Ljava/lang/String;Ljava/io/File;)V

    .line 181
    .line 182
    .line 183
    move-object v4, v7

    .line 184
    :cond_4
    const/4 v6, 0x0

    .line 185
    if-eqz v2, :cond_5

    .line 186
    .line 187
    move v7, v8

    .line 188
    goto :goto_3

    .line 189
    :cond_5
    move v7, v6

    .line 190
    :goto_3
    iget-object v5, v5, LY8/a;->a:LY8/c;

    .line 191
    .line 192
    const-string v9, "Dropping report due to queue being full: "

    .line 193
    .line 194
    const-string v10, "Closing task for report: "

    .line 195
    .line 196
    const-string v11, "Queue size: "

    .line 197
    .line 198
    const-string v12, "Enqueueing report: "

    .line 199
    .line 200
    iget-object v13, v5, LY8/c;->f:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 201
    .line 202
    monitor-enter v13

    .line 203
    :try_start_1
    new-instance v14, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 204
    .line 205
    invoke-direct {v14}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 206
    .line 207
    .line 208
    if-eqz v7, :cond_9

    .line 209
    .line 210
    iget-object v7, v5, LY8/c;->i:LS3/s;

    .line 211
    .line 212
    iget-object v7, v7, LS3/s;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 215
    .line 216
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 217
    .line 218
    .line 219
    iget-object v7, v5, LY8/c;->f:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 220
    .line 221
    invoke-virtual {v7}, Ljava/util/concurrent/ArrayBlockingQueue;->size()I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    iget v15, v5, LY8/c;->e:I

    .line 226
    .line 227
    if-ge v7, v15, :cond_6

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_6
    move v8, v6

    .line 231
    :goto_4
    if-eqz v8, :cond_7

    .line 232
    .line 233
    sget-object v6, LO8/c;->a:LO8/c;

    .line 234
    .line 235
    new-instance v7, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    iget-object v8, v4, LR8/b;->b:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v6, v7}, LO8/c;->c(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    new-instance v7, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iget-object v8, v5, LY8/c;->f:Ljava/util/concurrent/ArrayBlockingQueue;

    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/util/concurrent/ArrayBlockingQueue;->size()I

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-virtual {v6, v7}, LO8/c;->c(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v7, v5, LY8/c;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 274
    .line 275
    new-instance v8, LA7/w0;

    .line 276
    .line 277
    const/16 v9, 0x13

    .line 278
    .line 279
    invoke-direct {v8, v5, v4, v14, v9}, LA7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v7, v8}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 283
    .line 284
    .line 285
    new-instance v5, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object v7, v4, LR8/b;->b:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-virtual {v6, v5}, LO8/c;->c(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v14, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    monitor-exit v13

    .line 306
    goto :goto_5

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    goto :goto_6

    .line 309
    :cond_7
    invoke-virtual {v5}, LY8/c;->a()I

    .line 310
    .line 311
    .line 312
    new-instance v6, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    iget-object v7, v4, LR8/b;->b:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    const-string v7, "FirebaseCrashlytics"

    .line 327
    .line 328
    const/4 v8, 0x3

    .line 329
    invoke-static {v7, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 330
    .line 331
    .line 332
    move-result v7

    .line 333
    if-eqz v7, :cond_8

    .line 334
    .line 335
    const-string v7, "FirebaseCrashlytics"

    .line 336
    .line 337
    const/4 v8, 0x0

    .line 338
    invoke-static {v7, v6, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 339
    .line 340
    .line 341
    :cond_8
    iget-object v5, v5, LY8/c;->i:LS3/s;

    .line 342
    .line 343
    iget-object v5, v5, LS3/s;->c:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 348
    .line 349
    .line 350
    invoke-virtual {v14, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    monitor-exit v13

    .line 354
    goto :goto_5

    .line 355
    :cond_9
    invoke-virtual {v5, v4, v14}, LY8/c;->b(LR8/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 356
    .line 357
    .line 358
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 359
    :goto_5
    invoke-virtual {v14}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    new-instance v5, LPc/b;

    .line 364
    .line 365
    const/16 v6, 0x1b

    .line 366
    .line 367
    invoke-direct {v5, v1, v6}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v6, p2

    .line 371
    .line 372
    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    goto/16 :goto_1

    .line 380
    .line 381
    :goto_6
    :try_start_2
    monitor-exit v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 382
    throw v0

    .line 383
    :cond_a
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    return-object v0
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v3, 0x7

    .line 6
    const/4 v4, 0x6

    .line 7
    iget-object v5, v0, Luc/o;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v6, v1, LD6/o;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v6, Ljava/util/HashMap;

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    const-string v10, "forceLocationManager"

    .line 18
    .line 19
    const-string v14, "android.intent.category.DEFAULT"

    .line 20
    .line 21
    const-string v15, "requestId"

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iget-object v11, v1, LD6/o;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v11, Lx4/c;

    .line 27
    .line 28
    const/16 v16, 0x5

    .line 29
    .line 30
    const/16 v17, 0x4

    .line 31
    .line 32
    iget-object v12, v1, LD6/o;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v12, Ly4/a;

    .line 35
    .line 36
    const/4 v13, 0x0

    .line 37
    iget-object v9, v0, Luc/o;->b:Ljava/lang/Object;

    .line 38
    .line 39
    const/16 v19, -0x1

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v20

    .line 45
    sparse-switch v20, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :sswitch_0
    const-string v8, "cancelGetCurrentPosition"

    .line 51
    .line 52
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_0

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_0
    const/16 v19, 0x8

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :sswitch_1
    const-string v8, "getLocationAccuracy"

    .line 65
    .line 66
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-nez v5, :cond_1

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_1
    move/from16 v19, v3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :sswitch_2
    const-string v8, "requestPermission"

    .line 78
    .line 79
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-nez v5, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    move/from16 v19, v4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :sswitch_3
    const-string v8, "checkPermission"

    .line 90
    .line 91
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    move/from16 v19, v16

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :sswitch_4
    const-string v8, "isLocationServiceEnabled"

    .line 102
    .line 103
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_4

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    move/from16 v19, v17

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :sswitch_5
    const-string v8, "openAppSettings"

    .line 114
    .line 115
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-nez v5, :cond_5

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_5
    const/16 v19, 0x3

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :sswitch_6
    const-string v8, "openLocationSettings"

    .line 126
    .line 127
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-nez v5, :cond_6

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_6
    move/from16 v19, v7

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :sswitch_7
    const-string v8, "getLastKnownPosition"

    .line 138
    .line 139
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-nez v5, :cond_7

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_7
    move/from16 v19, v2

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :sswitch_8
    const-string v8, "getCurrentPosition"

    .line 150
    .line 151
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-nez v5, :cond_8

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_8
    const/16 v19, 0x0

    .line 159
    .line 160
    :goto_0
    packed-switch v19, :pswitch_data_0

    .line 161
    .line 162
    .line 163
    move-object/from16 v0, p2

    .line 164
    .line 165
    check-cast v0, Ltc/g;

    .line 166
    .line 167
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :pswitch_0
    check-cast v9, Ljava/util/Map;

    .line 172
    .line 173
    invoke-interface {v9, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lx4/e;

    .line 184
    .line 185
    if-eqz v2, :cond_9

    .line 186
    .line 187
    invoke-interface {v2}, Lx4/e;->e()V

    .line 188
    .line 189
    .line 190
    :cond_9
    invoke-virtual {v6, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-object/from16 v0, p2

    .line 194
    .line 195
    check-cast v0, Ltc/g;

    .line 196
    .line 197
    invoke-virtual {v0, v13}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_1
    iget-object v0, v1, LD6/o;->e:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Landroid/content/Context;

    .line 204
    .line 205
    iget-object v3, v1, LD6/o;->c:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v3, Lx4/d;

    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    .line 213
    .line 214
    invoke-static {v0, v3}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-nez v3, :cond_a

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_a
    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    .line 222
    .line 223
    invoke-static {v0, v3}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_b

    .line 228
    .line 229
    move v7, v2

    .line 230
    goto :goto_1

    .line 231
    :cond_b
    invoke-static/range {v16 .. v16}, Lpd/f;->h(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static/range {v16 .. v16}, Lpd/f;->g(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    move-object/from16 v3, p2

    .line 240
    .line 241
    check-cast v3, Ltc/g;

    .line 242
    .line 243
    invoke-virtual {v3, v0, v2, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    :goto_1
    if-eqz v7, :cond_19

    .line 248
    .line 249
    invoke-static {v7}, LA/f;->f(I)I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    move-object/from16 v2, p2

    .line 258
    .line 259
    check-cast v2, Ltc/g;

    .line 260
    .line 261
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_2
    :try_start_0
    iget-object v0, v1, LD6/o;->f:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Landroid/app/Activity;

    .line 268
    .line 269
    new-instance v2, LKa/b;

    .line 270
    .line 271
    move-object/from16 v5, p2

    .line 272
    .line 273
    check-cast v5, Ltc/g;

    .line 274
    .line 275
    invoke-direct {v2, v5, v4}, LKa/b;-><init>(Ltc/g;I)V

    .line 276
    .line 277
    .line 278
    new-instance v4, LKa/b;

    .line 279
    .line 280
    move-object/from16 v5, p2

    .line 281
    .line 282
    check-cast v5, Ltc/g;

    .line 283
    .line 284
    invoke-direct {v4, v5, v3}, LKa/b;-><init>(Ltc/g;I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v2, v4}, Ly4/a;->c(Landroid/app/Activity;LKa/b;LKa/b;)V
    :try_end_0
    .catch Lw4/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    .line 289
    .line 290
    goto/16 :goto_d

    .line 291
    .line 292
    :catch_0
    invoke-static/range {v17 .. v17}, Lpd/f;->h(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static/range {v17 .. v17}, Lpd/f;->g(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    move-object/from16 v3, p2

    .line 301
    .line 302
    check-cast v3, Ltc/g;

    .line 303
    .line 304
    invoke-virtual {v3, v0, v2, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_d

    .line 308
    .line 309
    :pswitch_3
    :try_start_1
    iget-object v0, v1, LD6/o;->e:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Landroid/content/Context;

    .line 312
    .line 313
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {v0}, Ly4/a;->a(Landroid/content/Context;)I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    invoke-static {v0}, LA/f;->f(I)I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_e

    .line 325
    .line 326
    if-eq v0, v2, :cond_d

    .line 327
    .line 328
    if-eq v0, v7, :cond_f

    .line 329
    .line 330
    const/4 v2, 0x3

    .line 331
    if-ne v0, v2, :cond_c

    .line 332
    .line 333
    const/4 v7, 0x3

    .line 334
    goto :goto_2

    .line 335
    :cond_c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 336
    .line 337
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 338
    .line 339
    .line 340
    throw v0

    .line 341
    :cond_d
    move v7, v2

    .line 342
    goto :goto_2

    .line 343
    :cond_e
    const/4 v7, 0x0

    .line 344
    :cond_f
    :goto_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    move-object/from16 v2, p2

    .line 349
    .line 350
    check-cast v2, Ltc/g;

    .line 351
    .line 352
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Lw4/b; {:try_start_1 .. :try_end_1} :catch_1

    .line 353
    .line 354
    .line 355
    goto/16 :goto_d

    .line 356
    .line 357
    :catch_1
    invoke-static/range {v17 .. v17}, Lpd/f;->h(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-static/range {v17 .. v17}, Lpd/f;->g(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    move-object/from16 v3, p2

    .line 366
    .line 367
    check-cast v3, Ltc/g;

    .line 368
    .line 369
    invoke-virtual {v3, v0, v2, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_d

    .line 373
    .line 374
    :pswitch_4
    iget-object v0, v1, LD6/o;->e:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Landroid/content/Context;

    .line 377
    .line 378
    new-instance v2, Lcom/google/android/gms/ads/nativead/l;

    .line 379
    .line 380
    const/16 v3, 0x1a

    .line 381
    .line 382
    const/4 v4, 0x0

    .line 383
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/ads/nativead/l;-><init>(IZ)V

    .line 384
    .line 385
    .line 386
    move-object/from16 v3, p2

    .line 387
    .line 388
    check-cast v3, Ltc/g;

    .line 389
    .line 390
    iput-object v3, v2, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 391
    .line 392
    if-nez v0, :cond_10

    .line 393
    .line 394
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    const/16 v20, 0x3

    .line 398
    .line 399
    invoke-static/range {v20 .. v20}, Lpd/f;->h(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-static/range {v20 .. v20}, Lpd/f;->g(I)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    iget-object v5, v2, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v5, Ltc/g;

    .line 410
    .line 411
    invoke-virtual {v5, v3, v4, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    :cond_10
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    const/4 v4, 0x0

    .line 418
    invoke-static {v0, v4, v13}, Lx4/c;->a(Landroid/content/Context;ZLx4/h;)Lx4/e;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-interface {v0, v2}, Lx4/e;->c(Lcom/google/android/gms/ads/nativead/l;)V

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :pswitch_5
    iget-object v0, v1, LD6/o;->e:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v0, Landroid/content/Context;

    .line 429
    .line 430
    const-string v3, "package:"

    .line 431
    .line 432
    :try_start_2
    new-instance v4, Landroid/content/Intent;

    .line 433
    .line 434
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 435
    .line 436
    .line 437
    const-string v5, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 438
    .line 439
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v4, v14}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 443
    .line 444
    .line 445
    new-instance v5, Ljava/lang/StringBuilder;

    .line 446
    .line 447
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-virtual {v4, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 466
    .line 467
    .line 468
    const/high16 v3, 0x10000000

    .line 469
    .line 470
    invoke-virtual {v4, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 471
    .line 472
    .line 473
    const/high16 v3, 0x40000000    # 2.0f

    .line 474
    .line 475
    invoke-virtual {v4, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 476
    .line 477
    .line 478
    const/high16 v3, 0x800000

    .line 479
    .line 480
    invoke-virtual {v4, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 484
    .line 485
    .line 486
    move v9, v2

    .line 487
    goto :goto_3

    .line 488
    :catch_2
    const/4 v9, 0x0

    .line 489
    :goto_3
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    move-object/from16 v2, p2

    .line 494
    .line 495
    check-cast v2, Ltc/g;

    .line 496
    .line 497
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    goto/16 :goto_d

    .line 501
    .line 502
    :pswitch_6
    iget-object v0, v1, LD6/o;->e:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v0, Landroid/content/Context;

    .line 505
    .line 506
    :try_start_3
    new-instance v3, Landroid/content/Intent;

    .line 507
    .line 508
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 509
    .line 510
    .line 511
    const-string v4, "android.settings.LOCATION_SOURCE_SETTINGS"

    .line 512
    .line 513
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3, v14}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x10000000

    .line 520
    .line 521
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 522
    .line 523
    .line 524
    const/high16 v4, 0x40000000    # 2.0f

    .line 525
    .line 526
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 527
    .line 528
    .line 529
    const/high16 v4, 0x800000

    .line 530
    .line 531
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 535
    .line 536
    .line 537
    move v9, v2

    .line 538
    goto :goto_4

    .line 539
    :catch_3
    const/4 v9, 0x0

    .line 540
    :goto_4
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    move-object/from16 v2, p2

    .line 545
    .line 546
    check-cast v2, Ltc/g;

    .line 547
    .line 548
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_d

    .line 552
    .line 553
    :pswitch_7
    :try_start_4
    iget-object v3, v1, LD6/o;->e:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v3, Landroid/content/Context;

    .line 556
    .line 557
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-static {v3}, Ly4/a;->a(Landroid/content/Context;)I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    const/4 v4, 0x3

    .line 565
    if-eq v3, v4, :cond_12

    .line 566
    .line 567
    move/from16 v4, v17

    .line 568
    .line 569
    if-ne v3, v4, :cond_11

    .line 570
    .line 571
    goto :goto_5

    .line 572
    :cond_11
    const/4 v4, 0x0

    .line 573
    goto :goto_6

    .line 574
    :cond_12
    :goto_5
    move v4, v2

    .line 575
    :goto_6
    if-nez v4, :cond_13

    .line 576
    .line 577
    invoke-static/range {v16 .. v16}, Lpd/f;->h(I)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-static/range {v16 .. v16}, Lpd/f;->g(I)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    move-object/from16 v3, p2

    .line 586
    .line 587
    check-cast v3, Ltc/g;

    .line 588
    .line 589
    invoke-virtual {v3, v0, v2, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Lw4/b; {:try_start_4 .. :try_end_4} :catch_4

    .line 590
    .line 591
    .line 592
    goto/16 :goto_d

    .line 593
    .line 594
    :catch_4
    const/16 v17, 0x4

    .line 595
    .line 596
    goto :goto_8

    .line 597
    :cond_13
    invoke-virtual {v0, v10}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    check-cast v0, Ljava/lang/Boolean;

    .line 602
    .line 603
    iget-object v3, v1, LD6/o;->e:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v3, Landroid/content/Context;

    .line 606
    .line 607
    if-eqz v0, :cond_14

    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_14

    .line 614
    .line 615
    move v9, v2

    .line 616
    goto :goto_7

    .line 617
    :cond_14
    const/4 v9, 0x0

    .line 618
    :goto_7
    new-instance v0, LKa/b;

    .line 619
    .line 620
    move-object/from16 v2, p2

    .line 621
    .line 622
    check-cast v2, Ltc/g;

    .line 623
    .line 624
    const/16 v4, 0x8

    .line 625
    .line 626
    invoke-direct {v0, v2, v4}, LKa/b;-><init>(Ltc/g;I)V

    .line 627
    .line 628
    .line 629
    new-instance v4, LKa/b;

    .line 630
    .line 631
    const/16 v5, 0x9

    .line 632
    .line 633
    invoke-direct {v4, v2, v5}, LKa/b;-><init>(Ltc/g;I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-static {v3, v9, v13}, Lx4/c;->a(Landroid/content/Context;ZLx4/h;)Lx4/e;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    invoke-interface {v2, v0, v4}, Lx4/e;->b(LKa/b;LKa/b;)V

    .line 644
    .line 645
    .line 646
    goto/16 :goto_d

    .line 647
    .line 648
    :goto_8
    invoke-static/range {v17 .. v17}, Lpd/f;->h(I)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-static/range {v17 .. v17}, Lpd/f;->g(I)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    move-object/from16 v3, p2

    .line 657
    .line 658
    check-cast v3, Ltc/g;

    .line 659
    .line 660
    invoke-virtual {v3, v0, v2, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    goto/16 :goto_d

    .line 664
    .line 665
    :pswitch_8
    :try_start_5
    iget-object v0, v1, LD6/o;->e:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v0, Landroid/content/Context;

    .line 668
    .line 669
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    invoke-static {v0}, Ly4/a;->a(Landroid/content/Context;)I

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    const/4 v4, 0x3

    .line 677
    if-eq v0, v4, :cond_16

    .line 678
    .line 679
    const/4 v4, 0x4

    .line 680
    if-ne v0, v4, :cond_15

    .line 681
    .line 682
    goto :goto_9

    .line 683
    :cond_15
    const/4 v4, 0x0

    .line 684
    goto :goto_a

    .line 685
    :cond_16
    :goto_9
    move v4, v2

    .line 686
    :goto_a
    if-nez v4, :cond_17

    .line 687
    .line 688
    invoke-static/range {v16 .. v16}, Lpd/f;->h(I)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-static/range {v16 .. v16}, Lpd/f;->g(I)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    move-object/from16 v3, p2

    .line 697
    .line 698
    check-cast v3, Ltc/g;

    .line 699
    .line 700
    invoke-virtual {v3, v0, v2, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catch Lw4/b; {:try_start_5 .. :try_end_5} :catch_5

    .line 701
    .line 702
    .line 703
    goto :goto_d

    .line 704
    :catch_5
    const/16 v17, 0x4

    .line 705
    .line 706
    goto :goto_c

    .line 707
    :cond_17
    check-cast v9, Ljava/util/Map;

    .line 708
    .line 709
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    if-eqz v0, :cond_18

    .line 714
    .line 715
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    check-cast v0, Ljava/lang/Boolean;

    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    goto :goto_b

    .line 726
    :cond_18
    const/4 v4, 0x0

    .line 727
    :goto_b
    invoke-static {v9}, Lx4/h;->a(Ljava/util/Map;)Lx4/h;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-interface {v9, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    check-cast v3, Ljava/lang/String;

    .line 736
    .line 737
    new-array v2, v2, [Z

    .line 738
    .line 739
    const/16 v18, 0x0

    .line 740
    .line 741
    aput-boolean v18, v2, v18

    .line 742
    .line 743
    iget-object v5, v1, LD6/o;->e:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v5, Landroid/content/Context;

    .line 746
    .line 747
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    invoke-static {v5, v4, v0}, Lx4/c;->a(Landroid/content/Context;ZLx4/h;)Lx4/e;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v6, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    iget-object v4, v1, LD6/o;->f:Ljava/lang/Object;

    .line 758
    .line 759
    move-object v6, v4

    .line 760
    check-cast v6, Landroid/app/Activity;

    .line 761
    .line 762
    move-object v4, v3

    .line 763
    move-object v3, v0

    .line 764
    new-instance v0, Lv4/c;

    .line 765
    .line 766
    move-object/from16 v5, p2

    .line 767
    .line 768
    check-cast v5, Ltc/g;

    .line 769
    .line 770
    invoke-direct/range {v0 .. v5}, Lv4/c;-><init>(LD6/o;[ZLx4/e;Ljava/lang/String;Ltc/g;)V

    .line 771
    .line 772
    .line 773
    move-object v7, v0

    .line 774
    new-instance v0, Lv4/c;

    .line 775
    .line 776
    move-object/from16 v1, p0

    .line 777
    .line 778
    invoke-direct/range {v0 .. v5}, Lv4/c;-><init>(LD6/o;[ZLx4/e;Ljava/lang/String;Ltc/g;)V

    .line 779
    .line 780
    .line 781
    iget-object v1, v11, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 782
    .line 783
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    invoke-interface {v3, v6, v7, v0}, Lx4/e;->a(Landroid/app/Activity;Lx4/l;Lw4/a;)V

    .line 787
    .line 788
    .line 789
    goto :goto_d

    .line 790
    :goto_c
    invoke-static/range {v17 .. v17}, Lpd/f;->h(I)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    invoke-static/range {v17 .. v17}, Lpd/f;->g(I)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    move-object/from16 v2, p2

    .line 799
    .line 800
    check-cast v2, Ltc/g;

    .line 801
    .line 802
    invoke-virtual {v2, v0, v1, v13}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 803
    .line 804
    .line 805
    :cond_19
    :goto_d
    return-void

    .line 806
    nop

    .line 807
    :sswitch_data_0
    .sparse-switch
        -0x68b9fc74 -> :sswitch_8
        -0x44f2ea20 -> :sswitch_7
        -0x30f92e9e -> :sswitch_6
        0x14b278ba -> :sswitch_5
        0x1538bfab -> :sswitch_4
        0x28e6dcf7 -> :sswitch_3
        0x2c7fedbe -> :sswitch_2
        0x34469f44 -> :sswitch_1
        0x69c703a6 -> :sswitch_0
    .end sparse-switch

    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
