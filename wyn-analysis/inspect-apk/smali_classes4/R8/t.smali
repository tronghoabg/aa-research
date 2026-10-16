.class public final LR8/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/HashMap;

.field public static final g:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LR8/z;

.field public final c:LR8/a;

.field public final d:LY2/B;

.field public final e:LK3/r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR8/t;->f:Ljava/util/HashMap;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    const-string v2, "armeabi"

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    const-string v4, "armeabi-v7a"

    .line 13
    .line 14
    invoke-static {v1, v0, v2, v3, v4}, LN0/a;->p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x9

    .line 18
    .line 19
    const-string v2, "arm64-v8a"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const-string v4, "x86"

    .line 23
    .line 24
    invoke-static {v1, v0, v2, v3, v4}, LN0/a;->p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "x86_64"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 38
    .line 39
    const-string v0, "Crashlytics Android SDK/19.3.0"

    .line 40
    .line 41
    sput-object v0, LR8/t;->g:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LR8/z;LR8/a;LY2/B;LK3/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/t;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, LR8/t;->b:LR8/z;

    .line 7
    .line 8
    iput-object p3, p0, LR8/t;->c:LR8/a;

    .line 9
    .line 10
    iput-object p4, p0, LR8/t;->d:LY2/B;

    .line 11
    .line 12
    iput-object p5, p0, LR8/t;->e:LK3/r;

    .line 13
    .line 14
    return-void
.end method

.method public static c(LVa/X7;I)LU8/V;
    .locals 7

    .line 1
    iget-object v0, p0, LVa/X7;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LVa/X7;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [Ljava/lang/StackTraceElement;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-array v1, v0, [Ljava/lang/StackTraceElement;

    .line 15
    .line 16
    :goto_0
    const/16 v3, 0x8

    .line 17
    .line 18
    iget-object v4, p0, LVa/X7;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, LVa/X7;

    .line 21
    .line 22
    if-lt p1, v3, :cond_1

    .line 23
    .line 24
    move-object v3, v4

    .line 25
    :goto_1
    if-eqz v3, :cond_1

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iget-object v3, v3, LVa/X7;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, LVa/X7;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v6, v0

    .line 35
    const/4 v0, 0x4

    .line 36
    invoke-static {v1, v0}, LR8/t;->d([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_5

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    const/4 v3, 0x1

    .line 44
    or-int/2addr v1, v3

    .line 45
    int-to-byte v1, v1

    .line 46
    const/4 v5, 0x0

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    add-int/2addr p1, v3

    .line 52
    invoke-static {v4, p1}, LR8/t;->c(LVa/X7;I)LU8/V;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    :cond_2
    if-ne v1, v3, :cond_3

    .line 57
    .line 58
    new-instance v1, LU8/V;

    .line 59
    .line 60
    iget-object p0, p0, LVa/X7;->a:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v3, p0

    .line 63
    check-cast v3, Ljava/lang/String;

    .line 64
    .line 65
    move-object v4, v0

    .line 66
    invoke-direct/range {v1 .. v6}, LU8/V;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LU8/z0;I)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    and-int/lit8 p1, v1, 0x1

    .line 76
    .line 77
    if-nez p1, :cond_4

    .line 78
    .line 79
    const-string p1, " overflowCount"

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v0, "Missing required properties:"

    .line 87
    .line 88
    invoke-static {v0, p0}, LN0/a;->i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 97
    .line 98
    const-string p1, "Null frames"

    .line 99
    .line 100
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0
.end method

.method public static d([Ljava/lang/StackTraceElement;I)Ljava/util/List;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_3

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    new-instance v4, LU8/Y;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput p1, v4, LU8/Y;->e:I

    .line 18
    .line 19
    iget-byte v5, v4, LU8/Y;->f:B

    .line 20
    .line 21
    or-int/lit8 v5, v5, 0x4

    .line 22
    .line 23
    int-to-byte v5, v5

    .line 24
    iput-byte v5, v4, LU8/Y;->f:B

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    int-to-long v8, v5

    .line 39
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move-wide v8, v6

    .line 45
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v10, "."

    .line 58
    .line 59
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-nez v11, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    if-lez v11, :cond_1

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    int-to-long v6, v3

    .line 94
    :cond_1
    iput-wide v8, v4, LU8/Y;->a:J

    .line 95
    .line 96
    iget-byte v3, v4, LU8/Y;->f:B

    .line 97
    .line 98
    or-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    int-to-byte v3, v3

    .line 101
    iput-byte v3, v4, LU8/Y;->f:B

    .line 102
    .line 103
    if-eqz v5, :cond_2

    .line 104
    .line 105
    iput-object v5, v4, LU8/Y;->b:Ljava/lang/String;

    .line 106
    .line 107
    iput-object v10, v4, LU8/Y;->c:Ljava/lang/String;

    .line 108
    .line 109
    iput-wide v6, v4, LU8/Y;->d:J

    .line 110
    .line 111
    or-int/lit8 v3, v3, 0x2

    .line 112
    .line 113
    int-to-byte v3, v3

    .line 114
    iput-byte v3, v4, LU8/Y;->f:B

    .line 115
    .line 116
    invoke-virtual {v4}, LU8/Y;->a()LU8/Z;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    add-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 127
    .line 128
    const-string p1, "Null symbol"

    .line 129
    .line 130
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p0

    .line 134
    :cond_3
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0
.end method

.method public static e()LU8/W;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-byte v1, v0

    .line 3
    if-ne v1, v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LU8/W;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const-string v3, "0"

    .line 10
    .line 11
    invoke-direct {v0, v3, v3, v1, v2}, LU8/W;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string v1, " address"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v2, "Missing required properties:"

    .line 30
    .line 31
    invoke-static {v2, v0}, LN0/a;->i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    or-int/lit8 v0, v0, 0x1

    .line 3
    .line 4
    int-to-byte v0, v0

    .line 5
    or-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    int-to-byte v0, v0

    .line 8
    iget-object v1, p0, LR8/t;->c:LR8/a;

    .line 9
    .line 10
    iget-object v2, v1, LR8/a;->d:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, v2

    .line 13
    check-cast v4, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v4, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    new-instance v3, LU8/U;

    .line 21
    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    iget-object v0, v1, LR8/a;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, v0

    .line 27
    check-cast v5, Ljava/lang/String;

    .line 28
    .line 29
    move-wide v8, v6

    .line 30
    invoke-direct/range {v3 .. v9}, LU8/U;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    and-int/lit8 v2, v0, 0x1

    .line 44
    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    const-string v2, " baseAddress"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :cond_1
    and-int/lit8 v0, v0, 0x2

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    const-string v0, " size"

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "Missing required properties:"

    .line 64
    .line 65
    invoke-static {v2, v1}, LN0/a;->i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 74
    .line 75
    const-string v1, "Null name"

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method

.method public final b(I)LU8/d0;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, LR8/t;->a:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v6, 0x0

    .line 8
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    .line 9
    .line 10
    const-string v7, "android.intent.action.BATTERY_CHANGED"

    .line 11
    .line 12
    invoke-direct {v0, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v5, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    const-string v7, "status"

    .line 22
    .line 23
    const/4 v8, -0x1

    .line 24
    invoke-virtual {v0, v7, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v7
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 28
    if-ne v7, v8, :cond_1

    .line 29
    .line 30
    :cond_0
    move v7, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-eq v7, v4, :cond_2

    .line 33
    .line 34
    const/4 v9, 0x5

    .line 35
    if-ne v7, v9, :cond_0

    .line 36
    .line 37
    :cond_2
    const/4 v7, 0x1

    .line 38
    :goto_0
    :try_start_1
    const-string v9, "level"

    .line 39
    .line 40
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    const-string v10, "scale"

    .line 45
    .line 46
    invoke-virtual {v0, v10, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eq v9, v8, :cond_5

    .line 51
    .line 52
    if-ne v0, v8, :cond_3

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    int-to-float v8, v9

    .line 56
    int-to-float v0, v0

    .line 57
    div-float/2addr v8, v0

    .line 58
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 62
    goto :goto_4

    .line 63
    :catch_0
    move-exception v0

    .line 64
    goto :goto_2

    .line 65
    :goto_1
    move v7, v6

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-object v0, v5

    .line 68
    move v7, v6

    .line 69
    goto :goto_4

    .line 70
    :catch_1
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    const-string v8, "FirebaseCrashlytics"

    .line 73
    .line 74
    const-string v9, "An error occurred getting battery state."

    .line 75
    .line 76
    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 77
    .line 78
    .line 79
    :cond_5
    :goto_3
    move-object v0, v5

    .line 80
    :goto_4
    if-eqz v0, :cond_6

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    :cond_6
    if-eqz v7, :cond_9

    .line 91
    .line 92
    if-nez v0, :cond_7

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    float-to-double v7, v0

    .line 100
    const-wide v9, 0x3fefae147ae147aeL    # 0.99

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    cmpg-double v0, v7, v9

    .line 106
    .line 107
    if-gez v0, :cond_8

    .line 108
    .line 109
    move v0, v4

    .line 110
    goto :goto_6

    .line 111
    :cond_8
    const/4 v0, 0x3

    .line 112
    goto :goto_6

    .line 113
    :cond_9
    :goto_5
    const/4 v0, 0x1

    .line 114
    :goto_6
    invoke-static {}, LR8/g;->f()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    const/16 v8, 0x8

    .line 119
    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_a
    const-string v7, "sensor"

    .line 124
    .line 125
    invoke-virtual {v2, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    check-cast v7, Landroid/hardware/SensorManager;

    .line 130
    .line 131
    invoke-virtual {v7, v8}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    if-eqz v7, :cond_b

    .line 136
    .line 137
    const/4 v6, 0x1

    .line 138
    :cond_b
    :goto_7
    invoke-static {v2}, LR8/g;->a(Landroid/content/Context;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v9

    .line 142
    new-instance v7, Landroid/app/ActivityManager$MemoryInfo;

    .line 143
    .line 144
    invoke-direct {v7}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v11, "activity"

    .line 148
    .line 149
    invoke-virtual {v2, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Landroid/app/ActivityManager;

    .line 154
    .line 155
    invoke-virtual {v2, v7}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 156
    .line 157
    .line 158
    iget-wide v11, v7, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 159
    .line 160
    sub-long/2addr v9, v11

    .line 161
    const-wide/16 v11, 0x0

    .line 162
    .line 163
    cmp-long v2, v9, v11

    .line 164
    .line 165
    if-lez v2, :cond_c

    .line 166
    .line 167
    goto :goto_8

    .line 168
    :cond_c
    move-wide v9, v11

    .line 169
    :goto_8
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    new-instance v7, Landroid/os/StatFs;

    .line 178
    .line 179
    invoke-direct {v7, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSize()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    int-to-long v11, v2

    .line 187
    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockCount()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    int-to-long v13, v2

    .line 192
    mul-long/2addr v13, v11

    .line 193
    invoke-virtual {v7}, Landroid/os/StatFs;->getAvailableBlocks()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    move v15, v4

    .line 198
    const/4 v7, 0x1

    .line 199
    int-to-long v3, v2

    .line 200
    mul-long/2addr v11, v3

    .line 201
    sub-long/2addr v13, v11

    .line 202
    new-instance v2, LU8/c0;

    .line 203
    .line 204
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 205
    .line 206
    .line 207
    iput-object v5, v2, LU8/c0;->a:Ljava/lang/Double;

    .line 208
    .line 209
    iput v0, v2, LU8/c0;->b:I

    .line 210
    .line 211
    iget-byte v0, v2, LU8/c0;->g:B

    .line 212
    .line 213
    or-int/2addr v0, v7

    .line 214
    int-to-byte v0, v0

    .line 215
    iput-boolean v6, v2, LU8/c0;->c:Z

    .line 216
    .line 217
    or-int/2addr v0, v15

    .line 218
    int-to-byte v0, v0

    .line 219
    move/from16 v3, p1

    .line 220
    .line 221
    iput v3, v2, LU8/c0;->d:I

    .line 222
    .line 223
    or-int/lit8 v0, v0, 0x4

    .line 224
    .line 225
    int-to-byte v0, v0

    .line 226
    iput-wide v9, v2, LU8/c0;->e:J

    .line 227
    .line 228
    or-int/2addr v0, v8

    .line 229
    int-to-byte v0, v0

    .line 230
    iput-wide v13, v2, LU8/c0;->f:J

    .line 231
    .line 232
    or-int/lit8 v0, v0, 0x10

    .line 233
    .line 234
    int-to-byte v0, v0

    .line 235
    iput-byte v0, v2, LU8/c0;->g:B

    .line 236
    .line 237
    invoke-virtual {v2}, LU8/c0;->a()LU8/d0;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    return-object v0
.end method
