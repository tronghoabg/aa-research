.class public final LR8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final t:LR8/h;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LR0/e;

.field public final c:LS3/e;

.field public final d:LX8/c;

.field public final e:LS8/f;

.field public final f:LR8/z;

.field public final g:LX8/c;

.field public final h:LR8/a;

.field public final i:LT8/e;

.field public final j:LO8/a;

.field public final k:LN8/a;

.field public final l:LR8/j;

.field public final m:LD6/o;

.field public n:LR8/u;

.field public o:LK3/r;

.field public final p:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final q:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final r:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final s:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR8/h;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LR8/h;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LR8/m;->t:LR8/h;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LR8/z;LR0/e;LX8/c;LS3/e;LR8/a;LX8/c;LT8/e;LD6/o;LO8/a;LN8/a;LR8/j;LS8/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LR8/m;->o:LK3/r;

    .line 3
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, LR8/m;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, LR8/m;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 5
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, LR8/m;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LR8/m;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    iput-object p1, p0, LR8/m;->a:Landroid/content/Context;

    .line 8
    iput-object p2, p0, LR8/m;->f:LR8/z;

    .line 9
    iput-object p3, p0, LR8/m;->b:LR0/e;

    .line 10
    iput-object p4, p0, LR8/m;->g:LX8/c;

    .line 11
    iput-object p5, p0, LR8/m;->c:LS3/e;

    .line 12
    iput-object p6, p0, LR8/m;->h:LR8/a;

    .line 13
    iput-object p7, p0, LR8/m;->d:LX8/c;

    .line 14
    iput-object p8, p0, LR8/m;->i:LT8/e;

    .line 15
    iput-object p10, p0, LR8/m;->j:LO8/a;

    .line 16
    iput-object p11, p0, LR8/m;->k:LN8/a;

    .line 17
    iput-object p12, p0, LR8/m;->l:LR8/j;

    .line 18
    iput-object p9, p0, LR8/m;->m:LD6/o;

    .line 19
    iput-object p13, p0, LR8/m;->e:LS8/f;

    return-void
.end method

.method public static a(LR8/m;)Lcom/google/android/gms/tasks/Task;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "FirebaseCrashlytics"

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v2, LR8/m;->t:LR8/h;

    .line 12
    .line 13
    iget-object v3, p0, LR8/m;->g:LX8/c;

    .line 14
    .line 15
    iget-object v3, v3, LX8/c;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/io/File;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, LX8/c;->h([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/io/File;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const/4 v6, 0x3

    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 57
    :try_start_1
    const-string v5, "com.google.firebase.crash.FirebaseCrash"

    .line 58
    .line 59
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    .line 61
    .line 62
    :try_start_2
    const-string v5, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    .line 63
    .line 64
    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    invoke-static {v4}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    goto :goto_1

    .line 72
    :catch_0
    invoke-static {v0, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    const-string v5, "Logging app exception event to Firebase Analytics"

    .line 79
    .line 80
    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    .line 83
    :cond_0
    new-instance v5, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    invoke-direct {v5, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    .line 87
    .line 88
    .line 89
    new-instance v6, LR8/l;

    .line 90
    .line 91
    invoke-direct {v6, p0, v7, v8}, LR8/l;-><init>(LR8/m;J)V

    .line 92
    .line 93
    .line 94
    invoke-static {v5, v6}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catch_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v6, "Could not parse app exception timestamp from file "

    .line 105
    .line 106
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method

.method public static f()Ljava/lang/String;
    .locals 6

    .line 1
    const-class v0, LR8/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "FirebaseCrashlytics"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "Couldn\'t get Class Loader"

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 15
    .line 16
    .line 17
    :goto_0
    move-object v0, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const-string v3, "META-INF/version-control-info.textproto"

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "No version control information found"

    .line 28
    .line 29
    invoke-static {v2, v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_2
    const/4 v3, 0x3

    .line 37
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    const-string v3, "Read version control info"

    .line 44
    .line 45
    invoke-static {v2, v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 46
    .line 47
    .line 48
    :cond_3
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 51
    .line 52
    .line 53
    const/16 v2, 0x400

    .line 54
    .line 55
    new-array v2, v2, [B

    .line 56
    .line 57
    :goto_2
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v4, -0x1

    .line 62
    const/4 v5, 0x0

    .line 63
    if-eq v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1, v2, v5, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0
.end method


# virtual methods
.method public final b(ZLK3/r;Z)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    invoke-static {}, LS8/f;->a()V

    .line 6
    .line 7
    .line 8
    new-instance v3, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v4, v1, LR8/m;->m:LD6/o;

    .line 11
    .line 12
    iget-object v0, v4, LD6/o;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LX8/a;

    .line 15
    .line 16
    invoke-virtual {v0}, LX8/a;->c()Ljava/util/NavigableSet;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v5, "FirebaseCrashlytics"

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x2

    .line 31
    if-gt v0, v2, :cond_0

    .line 32
    .line 33
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_37

    .line 38
    .line 39
    const-string v0, "No open sessions to be closed."

    .line 40
    .line 41
    invoke-static {v5, v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v8, v0

    .line 50
    check-cast v8, Ljava/lang/String;

    .line 51
    .line 52
    const/4 v11, 0x1

    .line 53
    const/4 v12, 0x3

    .line 54
    const/4 v13, 0x0

    .line 55
    if-eqz p3, :cond_1b

    .line 56
    .line 57
    invoke-virtual/range {p2 .. p2}, LK3/r;->c()LZ8/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v0, v0, LZ8/a;->b:LE4/j;

    .line 62
    .line 63
    iget-boolean v0, v0, LE4/j;->b:Z

    .line 64
    .line 65
    if-eqz v0, :cond_1b

    .line 66
    .line 67
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v14, 0x1e

    .line 70
    .line 71
    if-lt v0, v14, :cond_1a

    .line 72
    .line 73
    iget-object v0, v1, LR8/m;->a:Landroid/content/Context;

    .line 74
    .line 75
    const-string v14, "activity"

    .line 76
    .line 77
    invoke-virtual {v0, v14}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroid/app/ActivityManager;

    .line 82
    .line 83
    invoke-static {v0}, LA7/N0;->o(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v14

    .line 87
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_18

    .line 92
    .line 93
    new-instance v15, LT8/e;

    .line 94
    .line 95
    iget-object v0, v1, LR8/m;->g:LX8/c;

    .line 96
    .line 97
    invoke-direct {v15, v0}, LT8/e;-><init>(LX8/c;)V

    .line 98
    .line 99
    .line 100
    const/16 v16, 0x4

    .line 101
    .line 102
    sget-object v10, LT8/e;->c:Lza/a;

    .line 103
    .line 104
    iput-object v10, v15, LT8/e;->b:Ljava/lang/Object;

    .line 105
    .line 106
    if-nez v8, :cond_1

    .line 107
    .line 108
    const/16 v17, 0x8

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const-string v10, "userlog"

    .line 112
    .line 113
    invoke-virtual {v0, v8, v10}, LX8/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    const/16 v17, 0x8

    .line 118
    .line 119
    new-instance v9, LT8/l;

    .line 120
    .line 121
    invoke-direct {v9, v10}, LT8/l;-><init>(Ljava/io/File;)V

    .line 122
    .line 123
    .line 124
    iput-object v9, v15, LT8/e;->b:Ljava/lang/Object;

    .line 125
    .line 126
    :goto_0
    new-instance v9, LT8/g;

    .line 127
    .line 128
    invoke-direct {v9, v0}, LT8/g;-><init>(LX8/c;)V

    .line 129
    .line 130
    .line 131
    new-instance v10, LX8/c;

    .line 132
    .line 133
    iget-object v7, v1, LR8/m;->e:LS8/f;

    .line 134
    .line 135
    invoke-direct {v10, v8, v0, v7}, LX8/c;-><init>(Ljava/lang/String;LX8/c;LS8/f;)V

    .line 136
    .line 137
    .line 138
    iget-object v7, v10, LX8/c;->d:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v7, LA7/b0;

    .line 141
    .line 142
    iget-object v7, v7, LA7/b0;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v7, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 145
    .line 146
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    check-cast v7, LT8/d;

    .line 151
    .line 152
    invoke-virtual {v9, v8, v13}, LT8/g;->c(Ljava/lang/String;Z)Ljava/util/Map;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v7, v6}, LT8/d;->d(Ljava/util/Map;)V

    .line 157
    .line 158
    .line 159
    iget-object v6, v10, LX8/c;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v6, LA7/b0;

    .line 162
    .line 163
    iget-object v6, v6, LA7/b0;->c:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v6, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 166
    .line 167
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    check-cast v6, LT8/d;

    .line 172
    .line 173
    invoke-virtual {v9, v8, v11}, LT8/g;->c(Ljava/lang/String;Z)Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v6, v7}, LT8/d;->d(Ljava/util/Map;)V

    .line 178
    .line 179
    .line 180
    iget-object v6, v10, LX8/c;->g:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v6, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 183
    .line 184
    invoke-virtual {v9, v8}, LT8/g;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-virtual {v6, v7, v13}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 189
    .line 190
    .line 191
    const-string v6, "Failed to close rollouts state file."

    .line 192
    .line 193
    const-string v7, "Loaded rollouts state:\n"

    .line 194
    .line 195
    const-string v9, "rollouts-state"

    .line 196
    .line 197
    invoke-virtual {v0, v8, v9}, LX8/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_2

    .line 206
    .line 207
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 208
    .line 209
    .line 210
    move-result-wide v20

    .line 211
    const-wide/16 v22, 0x0

    .line 212
    .line 213
    cmp-long v0, v20, v22

    .line 214
    .line 215
    if-nez v0, :cond_3

    .line 216
    .line 217
    :cond_2
    move/from16 v20, v11

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_3
    move/from16 v20, v11

    .line 221
    .line 222
    :try_start_0
    new-instance v11, Ljava/io/FileInputStream;

    .line 223
    .line 224
    invoke-direct {v11, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 225
    .line 226
    .line 227
    :try_start_1
    invoke-static {v11}, LR8/g;->i(Ljava/io/FileInputStream;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, LT8/g;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v13, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v13, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v7, "\nfor session "

    .line 244
    .line 245
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-static {v5, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-eqz v13, :cond_4

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    invoke-static {v5, v7, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    .line 264
    .line 265
    :cond_4
    invoke-static {v11, v6}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :catchall_0
    move-exception v0

    .line 270
    goto :goto_2

    .line 271
    :catch_0
    move-exception v0

    .line 272
    goto :goto_1

    .line 273
    :catchall_1
    move-exception v0

    .line 274
    const/4 v11, 0x0

    .line 275
    goto :goto_2

    .line 276
    :catch_1
    move-exception v0

    .line 277
    const/4 v11, 0x0

    .line 278
    :goto_1
    :try_start_2
    const-string v7, "Error deserializing rollouts state."

    .line 279
    .line 280
    invoke-static {v5, v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 281
    .line 282
    .line 283
    invoke-static {v9}, LT8/g;->f(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 284
    .line 285
    .line 286
    invoke-static {v11, v6}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :goto_2
    invoke-static {v11, v6}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    const-string v6, "The file has a length of zero for session: "

    .line 299
    .line 300
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v9, v0}, LT8/g;->g(Ljava/io/File;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 314
    .line 315
    :goto_4
    iget-object v6, v10, LX8/c;->f:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v6, LI9/a;

    .line 318
    .line 319
    invoke-virtual {v6, v0}, LI9/a;->c(Ljava/util/List;)Z

    .line 320
    .line 321
    .line 322
    iget-object v0, v4, LD6/o;->b:Ljava/lang/Object;

    .line 323
    .line 324
    move-object v6, v0

    .line 325
    check-cast v6, LX8/a;

    .line 326
    .line 327
    iget-object v0, v6, LX8/a;->b:LX8/c;

    .line 328
    .line 329
    const-string v7, "start-time"

    .line 330
    .line 331
    invoke-virtual {v0, v8, v7}, LX8/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 336
    .line 337
    .line 338
    move-result-wide v22

    .line 339
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-eqz v7, :cond_5

    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    invoke-static {v7}, LA7/N0;->e(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-static {v7}, LA7/N0;->d(Landroid/app/ApplicationExitInfo;)J

    .line 358
    .line 359
    .line 360
    move-result-wide v13

    .line 361
    cmp-long v9, v13, v22

    .line 362
    .line 363
    if-gez v9, :cond_6

    .line 364
    .line 365
    :cond_5
    const/4 v7, 0x0

    .line 366
    goto :goto_6

    .line 367
    :cond_6
    invoke-static {v7}, LA7/N0;->b(Landroid/app/ApplicationExitInfo;)I

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    const/4 v11, 0x6

    .line 372
    if-eq v9, v11, :cond_7

    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_7
    :goto_6
    if-nez v7, :cond_9

    .line 376
    .line 377
    const-string v0, "No relevant ApplicationExitInfo occurred during session: "

    .line 378
    .line 379
    invoke-static {v0, v8}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    const/4 v6, 0x2

    .line 384
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    if-eqz v7, :cond_8

    .line 389
    .line 390
    const/4 v13, 0x0

    .line 391
    invoke-static {v5, v0, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 392
    .line 393
    .line 394
    :cond_8
    move-object/from16 v31, v3

    .line 395
    .line 396
    move-object/from16 v30, v4

    .line 397
    .line 398
    move/from16 v4, v20

    .line 399
    .line 400
    goto/16 :goto_c

    .line 401
    .line 402
    :cond_9
    :try_start_3
    invoke-static {v7}, LA7/N0;->k(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    if-eqz v0, :cond_b

    .line 407
    .line 408
    new-instance v9, Ljava/io/ByteArrayOutputStream;

    .line 409
    .line 410
    invoke-direct {v9}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 411
    .line 412
    .line 413
    const/16 v11, 0x2000

    .line 414
    .line 415
    new-array v11, v11, [B

    .line 416
    .line 417
    :goto_7
    invoke-virtual {v0, v11}, Ljava/io/InputStream;->read([B)I

    .line 418
    .line 419
    .line 420
    move-result v13

    .line 421
    const/4 v14, -0x1

    .line 422
    if-eq v13, v14, :cond_a

    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    invoke-virtual {v9, v11, v14, v13}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 426
    .line 427
    .line 428
    goto :goto_7

    .line 429
    :cond_a
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v9, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 439
    goto :goto_8

    .line 440
    :catch_2
    move-exception v0

    .line 441
    new-instance v9, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    const-string v11, "Could not get input trace in application exit info: "

    .line 444
    .line 445
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-static {v7}, LA7/N0;->l(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v11

    .line 452
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    const-string v11, " Error: "

    .line 456
    .line 457
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    const/4 v13, 0x0

    .line 468
    invoke-static {v5, v0, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 469
    .line 470
    .line 471
    :cond_b
    const/4 v0, 0x0

    .line 472
    :goto_8
    new-instance v9, LU8/D;

    .line 473
    .line 474
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 475
    .line 476
    .line 477
    invoke-static {v7}, LA7/N0;->A(Landroid/app/ApplicationExitInfo;)I

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    iput v11, v9, LU8/D;->d:I

    .line 482
    .line 483
    iget-byte v11, v9, LU8/D;->j:B

    .line 484
    .line 485
    or-int/lit8 v11, v11, 0x4

    .line 486
    .line 487
    int-to-byte v11, v11

    .line 488
    iput-byte v11, v9, LU8/D;->j:B

    .line 489
    .line 490
    invoke-static {v7}, LA7/N0;->y(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v11

    .line 494
    if-eqz v11, :cond_17

    .line 495
    .line 496
    iput-object v11, v9, LU8/D;->b:Ljava/lang/String;

    .line 497
    .line 498
    invoke-static {v7}, LA7/N0;->b(Landroid/app/ApplicationExitInfo;)I

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    iput v11, v9, LU8/D;->c:I

    .line 503
    .line 504
    iget-byte v11, v9, LU8/D;->j:B

    .line 505
    .line 506
    const/16 v18, 0x2

    .line 507
    .line 508
    or-int/lit8 v11, v11, 0x2

    .line 509
    .line 510
    int-to-byte v11, v11

    .line 511
    iput-byte v11, v9, LU8/D;->j:B

    .line 512
    .line 513
    invoke-static {v7}, LA7/N0;->d(Landroid/app/ApplicationExitInfo;)J

    .line 514
    .line 515
    .line 516
    move-result-wide v13

    .line 517
    iput-wide v13, v9, LU8/D;->g:J

    .line 518
    .line 519
    iget-byte v11, v9, LU8/D;->j:B

    .line 520
    .line 521
    or-int/lit8 v11, v11, 0x20

    .line 522
    .line 523
    int-to-byte v11, v11

    .line 524
    iput-byte v11, v9, LU8/D;->j:B

    .line 525
    .line 526
    invoke-static {v7}, LA7/N0;->C(Landroid/app/ApplicationExitInfo;)I

    .line 527
    .line 528
    .line 529
    move-result v11

    .line 530
    iput v11, v9, LU8/D;->a:I

    .line 531
    .line 532
    iget-byte v11, v9, LU8/D;->j:B

    .line 533
    .line 534
    or-int/lit8 v11, v11, 0x1

    .line 535
    .line 536
    int-to-byte v11, v11

    .line 537
    iput-byte v11, v9, LU8/D;->j:B

    .line 538
    .line 539
    invoke-static {v7}, LA7/N0;->w(Landroid/app/ApplicationExitInfo;)J

    .line 540
    .line 541
    .line 542
    move-result-wide v13

    .line 543
    iput-wide v13, v9, LU8/D;->e:J

    .line 544
    .line 545
    iget-byte v11, v9, LU8/D;->j:B

    .line 546
    .line 547
    or-int/lit8 v11, v11, 0x8

    .line 548
    .line 549
    int-to-byte v11, v11

    .line 550
    iput-byte v11, v9, LU8/D;->j:B

    .line 551
    .line 552
    invoke-static {v7}, LA7/N0;->B(Landroid/app/ApplicationExitInfo;)J

    .line 553
    .line 554
    .line 555
    move-result-wide v13

    .line 556
    iput-wide v13, v9, LU8/D;->f:J

    .line 557
    .line 558
    iget-byte v7, v9, LU8/D;->j:B

    .line 559
    .line 560
    or-int/lit8 v7, v7, 0x10

    .line 561
    .line 562
    int-to-byte v7, v7

    .line 563
    iput-byte v7, v9, LU8/D;->j:B

    .line 564
    .line 565
    iput-object v0, v9, LU8/D;->h:Ljava/lang/String;

    .line 566
    .line 567
    invoke-virtual {v9}, LU8/D;->a()LU8/E;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iget-object v7, v4, LD6/o;->a:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v7, LR8/t;

    .line 574
    .line 575
    iget-object v9, v7, LR8/t;->a:Landroid/content/Context;

    .line 576
    .line 577
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 578
    .line 579
    .line 580
    move-result-object v9

    .line 581
    invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 582
    .line 583
    .line 584
    move-result-object v9

    .line 585
    iget v9, v9, Landroid/content/res/Configuration;->orientation:I

    .line 586
    .line 587
    new-instance v11, LU8/P;

    .line 588
    .line 589
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 590
    .line 591
    .line 592
    const-string v13, "anr"

    .line 593
    .line 594
    iput-object v13, v11, LU8/P;->b:Ljava/lang/String;

    .line 595
    .line 596
    iget-wide v13, v0, LU8/E;->g:J

    .line 597
    .line 598
    iput-wide v13, v11, LU8/P;->a:J

    .line 599
    .line 600
    iget-byte v12, v11, LU8/P;->g:B

    .line 601
    .line 602
    or-int/lit8 v12, v12, 0x1

    .line 603
    .line 604
    int-to-byte v12, v12

    .line 605
    iput-byte v12, v11, LU8/P;->g:B

    .line 606
    .line 607
    iget-object v12, v7, LR8/t;->e:LK3/r;

    .line 608
    .line 609
    invoke-virtual {v12}, LK3/r;->c()LZ8/a;

    .line 610
    .line 611
    .line 612
    move-result-object v12

    .line 613
    iget-object v12, v12, LZ8/a;->b:LE4/j;

    .line 614
    .line 615
    iget-boolean v12, v12, LE4/j;->c:Z

    .line 616
    .line 617
    if-eqz v12, :cond_10

    .line 618
    .line 619
    iget-object v12, v7, LR8/t;->c:LR8/a;

    .line 620
    .line 621
    iget-object v2, v12, LR8/a;->g:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v2, Ljava/util/ArrayList;

    .line 624
    .line 625
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    if-lez v2, :cond_10

    .line 630
    .line 631
    new-instance v2, Ljava/util/ArrayList;

    .line 632
    .line 633
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 634
    .line 635
    .line 636
    iget-object v12, v12, LR8/a;->g:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v12, Ljava/util/ArrayList;

    .line 639
    .line 640
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 641
    .line 642
    .line 643
    move-result-object v12

    .line 644
    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 645
    .line 646
    .line 647
    move-result v22

    .line 648
    if-eqz v22, :cond_f

    .line 649
    .line 650
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v22

    .line 654
    move/from16 v29, v9

    .line 655
    .line 656
    move-object/from16 v9, v22

    .line 657
    .line 658
    check-cast v9, LR8/d;

    .line 659
    .line 660
    move-object/from16 p2, v12

    .line 661
    .line 662
    iget-object v12, v9, LR8/d;->a:Ljava/lang/String;

    .line 663
    .line 664
    if-eqz v12, :cond_e

    .line 665
    .line 666
    move-object/from16 v30, v4

    .line 667
    .line 668
    iget-object v4, v9, LR8/d;->b:Ljava/lang/String;

    .line 669
    .line 670
    if-eqz v4, :cond_d

    .line 671
    .line 672
    iget-object v9, v9, LR8/d;->c:Ljava/lang/String;

    .line 673
    .line 674
    if-eqz v9, :cond_c

    .line 675
    .line 676
    move-object/from16 v31, v3

    .line 677
    .line 678
    new-instance v3, LU8/F;

    .line 679
    .line 680
    invoke-direct {v3, v4, v12, v9}, LU8/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-object/from16 v12, p2

    .line 687
    .line 688
    move/from16 v9, v29

    .line 689
    .line 690
    move-object/from16 v4, v30

    .line 691
    .line 692
    move-object/from16 v3, v31

    .line 693
    .line 694
    goto :goto_9

    .line 695
    :cond_c
    new-instance v0, Ljava/lang/NullPointerException;

    .line 696
    .line 697
    const-string v2, "Null buildId"

    .line 698
    .line 699
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    throw v0

    .line 703
    :cond_d
    new-instance v0, Ljava/lang/NullPointerException;

    .line 704
    .line 705
    const-string v2, "Null arch"

    .line 706
    .line 707
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    throw v0

    .line 711
    :cond_e
    new-instance v0, Ljava/lang/NullPointerException;

    .line 712
    .line 713
    const-string v2, "Null libraryName"

    .line 714
    .line 715
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    throw v0

    .line 719
    :cond_f
    move-object/from16 v31, v3

    .line 720
    .line 721
    move-object/from16 v30, v4

    .line 722
    .line 723
    move/from16 v29, v9

    .line 724
    .line 725
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    goto :goto_a

    .line 730
    :cond_10
    move-object/from16 v31, v3

    .line 731
    .line 732
    move-object/from16 v30, v4

    .line 733
    .line 734
    move/from16 v29, v9

    .line 735
    .line 736
    const/4 v2, 0x0

    .line 737
    :goto_a
    new-instance v3, LU8/D;

    .line 738
    .line 739
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 740
    .line 741
    .line 742
    iget v4, v0, LU8/E;->d:I

    .line 743
    .line 744
    iput v4, v3, LU8/D;->d:I

    .line 745
    .line 746
    iget-byte v4, v3, LU8/D;->j:B

    .line 747
    .line 748
    or-int/lit8 v4, v4, 0x4

    .line 749
    .line 750
    int-to-byte v4, v4

    .line 751
    iput-byte v4, v3, LU8/D;->j:B

    .line 752
    .line 753
    iget-object v9, v0, LU8/E;->b:Ljava/lang/String;

    .line 754
    .line 755
    if-eqz v9, :cond_16

    .line 756
    .line 757
    iput-object v9, v3, LU8/D;->b:Ljava/lang/String;

    .line 758
    .line 759
    iget v9, v0, LU8/E;->c:I

    .line 760
    .line 761
    iput v9, v3, LU8/D;->c:I

    .line 762
    .line 763
    const/16 v18, 0x2

    .line 764
    .line 765
    or-int/lit8 v4, v4, 0x2

    .line 766
    .line 767
    int-to-byte v4, v4

    .line 768
    iput-wide v13, v3, LU8/D;->g:J

    .line 769
    .line 770
    or-int/lit8 v4, v4, 0x20

    .line 771
    .line 772
    int-to-byte v4, v4

    .line 773
    iget v9, v0, LU8/E;->a:I

    .line 774
    .line 775
    iput v9, v3, LU8/D;->a:I

    .line 776
    .line 777
    or-int/lit8 v4, v4, 0x1

    .line 778
    .line 779
    int-to-byte v4, v4

    .line 780
    iget-wide v12, v0, LU8/E;->e:J

    .line 781
    .line 782
    iput-wide v12, v3, LU8/D;->e:J

    .line 783
    .line 784
    or-int/lit8 v4, v4, 0x8

    .line 785
    .line 786
    int-to-byte v4, v4

    .line 787
    iget-wide v12, v0, LU8/E;->f:J

    .line 788
    .line 789
    iput-wide v12, v3, LU8/D;->f:J

    .line 790
    .line 791
    or-int/lit8 v4, v4, 0x10

    .line 792
    .line 793
    int-to-byte v4, v4

    .line 794
    iput-byte v4, v3, LU8/D;->j:B

    .line 795
    .line 796
    iget-object v0, v0, LU8/E;->h:Ljava/lang/String;

    .line 797
    .line 798
    iput-object v0, v3, LU8/D;->h:Ljava/lang/String;

    .line 799
    .line 800
    iput-object v2, v3, LU8/D;->i:Ljava/util/List;

    .line 801
    .line 802
    invoke-virtual {v3}, LU8/D;->a()LU8/E;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    const/16 v2, 0x64

    .line 807
    .line 808
    iget v3, v0, LU8/E;->d:I

    .line 809
    .line 810
    if-eq v3, v2, :cond_11

    .line 811
    .line 812
    move/from16 v2, v20

    .line 813
    .line 814
    goto :goto_b

    .line 815
    :cond_11
    const/4 v2, 0x0

    .line 816
    :goto_b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    sget-object v3, LO8/c;->b:LO8/c;

    .line 821
    .line 822
    const-string v4, "processName"

    .line 823
    .line 824
    iget-object v9, v0, LU8/E;->b:Ljava/lang/String;

    .line 825
    .line 826
    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    iget v4, v0, LU8/E;->d:I

    .line 830
    .line 831
    iget v12, v0, LU8/E;->a:I

    .line 832
    .line 833
    move/from16 v13, v17

    .line 834
    .line 835
    invoke-static {v3, v9, v12, v4, v13}, LO8/c;->a(LO8/c;Ljava/lang/String;III)LU8/b0;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    move/from16 v4, v20

    .line 840
    .line 841
    int-to-byte v9, v4

    .line 842
    invoke-static {}, LR8/t;->e()LU8/W;

    .line 843
    .line 844
    .line 845
    move-result-object v26

    .line 846
    invoke-virtual {v7}, LR8/t;->a()Ljava/util/List;

    .line 847
    .line 848
    .line 849
    move-result-object v27

    .line 850
    if-eqz v27, :cond_15

    .line 851
    .line 852
    new-instance v22, LU8/T;

    .line 853
    .line 854
    const/16 v24, 0x0

    .line 855
    .line 856
    const/16 v23, 0x0

    .line 857
    .line 858
    move-object/from16 v25, v0

    .line 859
    .line 860
    invoke-direct/range {v22 .. v27}, LU8/T;-><init>(Ljava/util/List;LU8/V;LU8/r0;LU8/W;Ljava/util/List;)V

    .line 861
    .line 862
    .line 863
    const/4 v4, 0x1

    .line 864
    if-ne v9, v4, :cond_13

    .line 865
    .line 866
    move-object/from16 v23, v22

    .line 867
    .line 868
    new-instance v22, LU8/S;

    .line 869
    .line 870
    const/16 v25, 0x0

    .line 871
    .line 872
    const/16 v28, 0x0

    .line 873
    .line 874
    const/16 v24, 0x0

    .line 875
    .line 876
    move-object/from16 v26, v2

    .line 877
    .line 878
    move-object/from16 v27, v3

    .line 879
    .line 880
    invoke-direct/range {v22 .. v29}, LU8/S;-><init>(LU8/T;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;LU8/E0;Ljava/util/List;I)V

    .line 881
    .line 882
    .line 883
    move-object/from16 v2, v22

    .line 884
    .line 885
    move/from16 v0, v29

    .line 886
    .line 887
    iput-object v2, v11, LU8/P;->c:LU8/S;

    .line 888
    .line 889
    invoke-virtual {v7, v0}, LR8/t;->b(I)LU8/d0;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    iput-object v0, v11, LU8/P;->d:LU8/d0;

    .line 894
    .line 895
    invoke-virtual {v11}, LU8/P;->a()LU8/Q;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    const-string v2, "Persisting anr for session "

    .line 900
    .line 901
    invoke-static {v2, v8}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    const/4 v3, 0x3

    .line 906
    invoke-static {v5, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 907
    .line 908
    .line 909
    move-result v4

    .line 910
    if-eqz v4, :cond_12

    .line 911
    .line 912
    const/4 v13, 0x0

    .line 913
    invoke-static {v5, v2, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 914
    .line 915
    .line 916
    :cond_12
    invoke-static {v0, v15, v10}, LD6/o;->a(LU8/Q;LT8/e;LX8/c;)LU8/Q;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-static {v0, v10}, LD6/o;->b(LU8/Q;LX8/c;)LU8/L0;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    const/4 v4, 0x1

    .line 925
    invoke-virtual {v6, v0, v8, v4}, LX8/a;->d(LU8/L0;Ljava/lang/String;Z)V

    .line 926
    .line 927
    .line 928
    :goto_c
    const/4 v6, 0x2

    .line 929
    goto :goto_d

    .line 930
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 931
    .line 932
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 933
    .line 934
    .line 935
    if-nez v9, :cond_14

    .line 936
    .line 937
    const-string v2, " uiOrientation"

    .line 938
    .line 939
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 940
    .line 941
    .line 942
    :cond_14
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 943
    .line 944
    const-string v3, "Missing required properties:"

    .line 945
    .line 946
    invoke-static {v3, v0}, LN0/a;->i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    throw v2

    .line 954
    :cond_15
    new-instance v0, Ljava/lang/NullPointerException;

    .line 955
    .line 956
    const-string v2, "Null binaries"

    .line 957
    .line 958
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    throw v0

    .line 962
    :cond_16
    new-instance v0, Ljava/lang/NullPointerException;

    .line 963
    .line 964
    const-string v2, "Null processName"

    .line 965
    .line 966
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    throw v0

    .line 970
    :cond_17
    new-instance v0, Ljava/lang/NullPointerException;

    .line 971
    .line 972
    const-string v2, "Null processName"

    .line 973
    .line 974
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    throw v0

    .line 978
    :cond_18
    move-object/from16 v31, v3

    .line 979
    .line 980
    move-object/from16 v30, v4

    .line 981
    .line 982
    move v4, v11

    .line 983
    const/16 v16, 0x4

    .line 984
    .line 985
    const-string v0, "No ApplicationExitInfo available. Session: "

    .line 986
    .line 987
    invoke-static {v0, v8}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    const/4 v6, 0x2

    .line 992
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 993
    .line 994
    .line 995
    move-result v2

    .line 996
    if-eqz v2, :cond_19

    .line 997
    .line 998
    const/4 v13, 0x0

    .line 999
    invoke-static {v5, v0, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1000
    .line 1001
    .line 1002
    goto :goto_e

    .line 1003
    :cond_19
    :goto_d
    const/4 v13, 0x0

    .line 1004
    goto :goto_e

    .line 1005
    :cond_1a
    move-object/from16 v31, v3

    .line 1006
    .line 1007
    move-object/from16 v30, v4

    .line 1008
    .line 1009
    move-object v13, v6

    .line 1010
    move v6, v7

    .line 1011
    move v4, v11

    .line 1012
    const/16 v16, 0x4

    .line 1013
    .line 1014
    const-string v2, "ANR feature enabled, but device is API "

    .line 1015
    .line 1016
    invoke-static {v0, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1021
    .line 1022
    .line 1023
    move-result v2

    .line 1024
    if-eqz v2, :cond_1c

    .line 1025
    .line 1026
    invoke-static {v5, v0, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1027
    .line 1028
    .line 1029
    goto :goto_e

    .line 1030
    :cond_1b
    move-object/from16 v31, v3

    .line 1031
    .line 1032
    move-object/from16 v30, v4

    .line 1033
    .line 1034
    move-object v13, v6

    .line 1035
    move v6, v7

    .line 1036
    move v4, v11

    .line 1037
    const/16 v16, 0x4

    .line 1038
    .line 1039
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v0

    .line 1043
    if-eqz v0, :cond_1c

    .line 1044
    .line 1045
    const-string v0, "ANR feature disabled."

    .line 1046
    .line 1047
    invoke-static {v5, v0, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1048
    .line 1049
    .line 1050
    :cond_1c
    :goto_e
    if-eqz p3, :cond_1e

    .line 1051
    .line 1052
    iget-object v0, v1, LR8/m;->j:LO8/a;

    .line 1053
    .line 1054
    invoke-virtual {v0, v8}, LO8/a;->c(Ljava/lang/String;)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    if-eqz v2, :cond_1e

    .line 1059
    .line 1060
    const-string v2, "Finalizing native report for session "

    .line 1061
    .line 1062
    invoke-static {v2, v8}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v2

    .line 1066
    const/4 v6, 0x2

    .line 1067
    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v3

    .line 1071
    if-eqz v3, :cond_1d

    .line 1072
    .line 1073
    const/4 v13, 0x0

    .line 1074
    invoke-static {v5, v2, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1075
    .line 1076
    .line 1077
    :cond_1d
    invoke-virtual {v0, v8}, LO8/a;->a(Ljava/lang/String;)LO8/c;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    const-string v2, "No minidump data found for session "

    .line 1087
    .line 1088
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    const/4 v13, 0x0

    .line 1099
    invoke-static {v5, v0, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1100
    .line 1101
    .line 1102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1103
    .line 1104
    const-string v2, "No Tombstones data found for session "

    .line 1105
    .line 1106
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    invoke-static {v5, v0, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1117
    .line 1118
    .line 1119
    const-string v0, "No native core present"

    .line 1120
    .line 1121
    invoke-static {v5, v0, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1122
    .line 1123
    .line 1124
    goto :goto_f

    .line 1125
    :cond_1e
    const/4 v13, 0x0

    .line 1126
    :goto_f
    if-eqz p1, :cond_1f

    .line 1127
    .line 1128
    move-object/from16 v2, v31

    .line 1129
    .line 1130
    const/4 v14, 0x0

    .line 1131
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    move-object/from16 v19, v0

    .line 1136
    .line 1137
    check-cast v19, Ljava/lang/String;

    .line 1138
    .line 1139
    move-object/from16 v0, v19

    .line 1140
    .line 1141
    goto :goto_10

    .line 1142
    :cond_1f
    const/4 v14, 0x0

    .line 1143
    iget-object v0, v1, LR8/m;->l:LR8/j;

    .line 1144
    .line 1145
    invoke-virtual {v0, v13}, LR8/j;->a(Ljava/lang/String;)V

    .line 1146
    .line 1147
    .line 1148
    const/4 v0, 0x0

    .line 1149
    :goto_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1150
    .line 1151
    .line 1152
    move-result-wide v2

    .line 1153
    const-wide/16 v6, 0x3e8

    .line 1154
    .line 1155
    div-long/2addr v2, v6

    .line 1156
    move-object/from16 v6, v30

    .line 1157
    .line 1158
    iget-object v6, v6, LD6/o;->b:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v6, LX8/a;

    .line 1161
    .line 1162
    iget-object v7, v6, LX8/a;->b:LX8/c;

    .line 1163
    .line 1164
    const-string v8, ".com.google.firebase.crashlytics"

    .line 1165
    .line 1166
    invoke-virtual {v7, v8}, LX8/c;->c(Ljava/lang/String;)V

    .line 1167
    .line 1168
    .line 1169
    const-string v8, ".com.google.firebase.crashlytics-ndk"

    .line 1170
    .line 1171
    invoke-virtual {v7, v8}, LX8/c;->c(Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    iget-object v8, v7, LX8/c;->a:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v8, Ljava/lang/String;

    .line 1177
    .line 1178
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 1179
    .line 1180
    .line 1181
    move-result v8

    .line 1182
    if-nez v8, :cond_20

    .line 1183
    .line 1184
    const-string v8, ".com.google.firebase.crashlytics.files.v1"

    .line 1185
    .line 1186
    invoke-virtual {v7, v8}, LX8/c;->c(Ljava/lang/String;)V

    .line 1187
    .line 1188
    .line 1189
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1190
    .line 1191
    const-string v9, ".com.google.firebase.crashlytics.files.v2"

    .line 1192
    .line 1193
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1194
    .line 1195
    .line 1196
    sget-object v9, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    .line 1197
    .line 1198
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v8

    .line 1205
    iget-object v9, v7, LX8/c;->b:Ljava/lang/Object;

    .line 1206
    .line 1207
    check-cast v9, Ljava/io/File;

    .line 1208
    .line 1209
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v10

    .line 1213
    if-eqz v10, :cond_20

    .line 1214
    .line 1215
    new-instance v10, LX8/b;

    .line 1216
    .line 1217
    invoke-direct {v10, v8}, LX8/b;-><init>(Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v9, v10}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v8

    .line 1224
    if-eqz v8, :cond_20

    .line 1225
    .line 1226
    array-length v9, v8

    .line 1227
    move v10, v14

    .line 1228
    :goto_11
    if-ge v10, v9, :cond_20

    .line 1229
    .line 1230
    aget-object v11, v8, v10

    .line 1231
    .line 1232
    invoke-virtual {v7, v11}, LX8/c;->c(Ljava/lang/String;)V

    .line 1233
    .line 1234
    .line 1235
    add-int/lit8 v10, v10, 0x1

    .line 1236
    .line 1237
    goto :goto_11

    .line 1238
    :cond_20
    invoke-virtual {v6}, LX8/a;->c()Ljava/util/NavigableSet;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v8

    .line 1242
    if-eqz v0, :cond_21

    .line 1243
    .line 1244
    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1245
    .line 1246
    .line 1247
    :cond_21
    invoke-interface {v8}, Ljava/util/Set;->size()I

    .line 1248
    .line 1249
    .line 1250
    move-result v0

    .line 1251
    const/16 v13, 0x8

    .line 1252
    .line 1253
    if-gt v0, v13, :cond_22

    .line 1254
    .line 1255
    goto :goto_13

    .line 1256
    :cond_22
    :goto_12
    invoke-interface {v8}, Ljava/util/Set;->size()I

    .line 1257
    .line 1258
    .line 1259
    move-result v0

    .line 1260
    if-le v0, v13, :cond_24

    .line 1261
    .line 1262
    invoke-interface {v8}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    check-cast v0, Ljava/lang/String;

    .line 1267
    .line 1268
    const-string v9, "Removing session over cap: "

    .line 1269
    .line 1270
    invoke-static {v9, v0}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v9

    .line 1274
    const/4 v10, 0x3

    .line 1275
    invoke-static {v5, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1276
    .line 1277
    .line 1278
    move-result v11

    .line 1279
    if-eqz v11, :cond_23

    .line 1280
    .line 1281
    const/4 v10, 0x0

    .line 1282
    invoke-static {v5, v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1283
    .line 1284
    .line 1285
    :cond_23
    new-instance v9, Ljava/io/File;

    .line 1286
    .line 1287
    iget-object v10, v7, LX8/c;->d:Ljava/lang/Object;

    .line 1288
    .line 1289
    check-cast v10, Ljava/io/File;

    .line 1290
    .line 1291
    invoke-direct {v9, v10, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    invoke-static {v9}, LX8/c;->g(Ljava/io/File;)Z

    .line 1295
    .line 1296
    .line 1297
    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1298
    .line 1299
    .line 1300
    goto :goto_12

    .line 1301
    :cond_24
    :goto_13
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v8

    .line 1305
    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1306
    .line 1307
    .line 1308
    move-result v0

    .line 1309
    if-eqz v0, :cond_35

    .line 1310
    .line 1311
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    move-object v9, v0

    .line 1316
    check-cast v9, Ljava/lang/String;

    .line 1317
    .line 1318
    const-string v0, "Finalizing report for session "

    .line 1319
    .line 1320
    invoke-static {v0, v9}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    const/4 v10, 0x2

    .line 1325
    invoke-static {v5, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v11

    .line 1329
    if-eqz v11, :cond_25

    .line 1330
    .line 1331
    const/4 v13, 0x0

    .line 1332
    invoke-static {v5, v0, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1333
    .line 1334
    .line 1335
    :cond_25
    sget-object v0, LX8/a;->i:LR8/h;

    .line 1336
    .line 1337
    new-instance v10, Ljava/io/File;

    .line 1338
    .line 1339
    iget-object v11, v7, LX8/c;->d:Ljava/lang/Object;

    .line 1340
    .line 1341
    check-cast v11, Ljava/io/File;

    .line 1342
    .line 1343
    invoke-direct {v10, v11, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v10, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    invoke-static {v0}, LX8/c;->h([Ljava/lang/Object;)Ljava/util/List;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v0

    .line 1357
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1358
    .line 1359
    .line 1360
    move-result v10

    .line 1361
    if-eqz v10, :cond_27

    .line 1362
    .line 1363
    const-string v0, "Session "

    .line 1364
    .line 1365
    const-string v10, " has no events."

    .line 1366
    .line 1367
    invoke-static {v0, v9, v10}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    const/4 v10, 0x2

    .line 1372
    invoke-static {v5, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v11

    .line 1376
    if-eqz v11, :cond_26

    .line 1377
    .line 1378
    const/4 v13, 0x0

    .line 1379
    invoke-static {v5, v0, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1380
    .line 1381
    .line 1382
    :cond_26
    :goto_15
    const/4 v11, 0x3

    .line 1383
    const/4 v13, 0x0

    .line 1384
    const/16 v18, 0x2

    .line 1385
    .line 1386
    goto/16 :goto_25

    .line 1387
    .line 1388
    :cond_27
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1389
    .line 1390
    .line 1391
    new-instance v10, Ljava/util/ArrayList;

    .line 1392
    .line 1393
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1394
    .line 1395
    .line 1396
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v11

    .line 1400
    move v12, v14

    .line 1401
    :goto_16
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1402
    .line 1403
    .line 1404
    move-result v0

    .line 1405
    sget-object v13, LX8/a;->g:LV8/a;

    .line 1406
    .line 1407
    if-eqz v0, :cond_2a

    .line 1408
    .line 1409
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    move-object v15, v0

    .line 1414
    check-cast v15, Ljava/io/File;

    .line 1415
    .line 1416
    :try_start_4
    invoke-static {v15}, LX8/a;->e(Ljava/io/File;)Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v0

    .line 1420
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1421
    .line 1422
    .line 1423
    :try_start_5
    new-instance v13, Landroid/util/JsonReader;

    .line 1424
    .line 1425
    new-instance v4, Ljava/io/StringReader;

    .line 1426
    .line 1427
    invoke-direct {v4, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 1428
    .line 1429
    .line 1430
    invoke-direct {v13, v4}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 1431
    .line 1432
    .line 1433
    :try_start_6
    invoke-static {v13}, LV8/a;->e(Landroid/util/JsonReader;)LU8/Q;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1437
    :try_start_7
    invoke-virtual {v13}, Landroid/util/JsonReader;->close()V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 1438
    .line 1439
    .line 1440
    :try_start_8
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    if-nez v12, :cond_29

    .line 1444
    .line 1445
    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    const-string v4, "event"

    .line 1450
    .line 1451
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1452
    .line 1453
    .line 1454
    move-result v4

    .line 1455
    if-eqz v4, :cond_28

    .line 1456
    .line 1457
    const-string v4, "_"

    .line 1458
    .line 1459
    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1460
    .line 1461
    .line 1462
    move-result v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 1463
    if-eqz v0, :cond_28

    .line 1464
    .line 1465
    goto :goto_17

    .line 1466
    :cond_28
    move v0, v14

    .line 1467
    goto :goto_18

    .line 1468
    :catch_3
    move-exception v0

    .line 1469
    goto :goto_1b

    .line 1470
    :cond_29
    :goto_17
    const/4 v0, 0x1

    .line 1471
    :goto_18
    move v12, v0

    .line 1472
    goto :goto_1c

    .line 1473
    :catch_4
    move-exception v0

    .line 1474
    goto :goto_1a

    .line 1475
    :catchall_2
    move-exception v0

    .line 1476
    move-object v4, v0

    .line 1477
    :try_start_9
    invoke-virtual {v13}, Landroid/util/JsonReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1478
    .line 1479
    .line 1480
    goto :goto_19

    .line 1481
    :catchall_3
    move-exception v0

    .line 1482
    :try_start_a
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1483
    .line 1484
    .line 1485
    :goto_19
    throw v4
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    .line 1486
    :goto_1a
    :try_start_b
    new-instance v4, Ljava/io/IOException;

    .line 1487
    .line 1488
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1489
    .line 1490
    .line 1491
    throw v4
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    .line 1492
    :goto_1b
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1493
    .line 1494
    const-string v13, "Could not add event to report for "

    .line 1495
    .line 1496
    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v4

    .line 1506
    invoke-static {v5, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1507
    .line 1508
    .line 1509
    :goto_1c
    const/4 v4, 0x1

    .line 1510
    goto :goto_16

    .line 1511
    :cond_2a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1512
    .line 1513
    .line 1514
    move-result v0

    .line 1515
    if-eqz v0, :cond_2b

    .line 1516
    .line 1517
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1518
    .line 1519
    const-string v4, "Could not parse event files for session "

    .line 1520
    .line 1521
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v0

    .line 1531
    const/4 v13, 0x0

    .line 1532
    invoke-static {v5, v0, v13}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1533
    .line 1534
    .line 1535
    goto/16 :goto_15

    .line 1536
    .line 1537
    :cond_2b
    new-instance v0, LT8/g;

    .line 1538
    .line 1539
    invoke-direct {v0, v7}, LT8/g;-><init>(LX8/c;)V

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v0, v9}, LT8/g;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    iget-object v4, v6, LX8/a;->d:LR8/j;

    .line 1547
    .line 1548
    iget-object v4, v4, LR8/j;->b:LR8/i;

    .line 1549
    .line 1550
    monitor-enter v4

    .line 1551
    :try_start_c
    iget-object v11, v4, LR8/i;->b:Ljava/lang/String;

    .line 1552
    .line 1553
    invoke-static {v11, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1554
    .line 1555
    .line 1556
    move-result v11

    .line 1557
    if-eqz v11, :cond_2c

    .line 1558
    .line 1559
    iget-object v11, v4, LR8/i;->c:Ljava/lang/String;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 1560
    .line 1561
    monitor-exit v4

    .line 1562
    goto :goto_1e

    .line 1563
    :catchall_4
    move-exception v0

    .line 1564
    goto/16 :goto_26

    .line 1565
    .line 1566
    :cond_2c
    :try_start_d
    iget-object v11, v4, LR8/i;->a:LX8/c;

    .line 1567
    .line 1568
    sget-object v15, LR8/i;->d:LR8/h;

    .line 1569
    .line 1570
    new-instance v14, Ljava/io/File;

    .line 1571
    .line 1572
    iget-object v11, v11, LX8/c;->d:Ljava/lang/Object;

    .line 1573
    .line 1574
    check-cast v11, Ljava/io/File;

    .line 1575
    .line 1576
    invoke-direct {v14, v11, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v14}, Ljava/io/File;->mkdirs()Z

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v14, v15}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v11

    .line 1586
    invoke-static {v11}, LX8/c;->h([Ljava/lang/Object;)Ljava/util/List;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v11

    .line 1590
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1591
    .line 1592
    .line 1593
    move-result v14

    .line 1594
    if-eqz v14, :cond_2d

    .line 1595
    .line 1596
    const-string v11, "FirebaseCrashlytics"

    .line 1597
    .line 1598
    const-string v14, "Unable to read App Quality Sessions session id."

    .line 1599
    .line 1600
    const/4 v15, 0x0

    .line 1601
    invoke-static {v11, v14, v15}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1602
    .line 1603
    .line 1604
    const/4 v11, 0x0

    .line 1605
    goto :goto_1d

    .line 1606
    :cond_2d
    sget-object v14, LR8/i;->e:LA0/f;

    .line 1607
    .line 1608
    invoke-static {v11, v14}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v11

    .line 1612
    check-cast v11, Ljava/io/File;

    .line 1613
    .line 1614
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v11

    .line 1618
    move/from16 v14, v16

    .line 1619
    .line 1620
    invoke-virtual {v11, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v11
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 1624
    :goto_1d
    monitor-exit v4

    .line 1625
    :goto_1e
    const-string v4, "report"

    .line 1626
    .line 1627
    invoke-virtual {v7, v9, v4}, LX8/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v4

    .line 1631
    const-string v14, "appQualitySessionId: "

    .line 1632
    .line 1633
    :try_start_e
    invoke-static {v4}, LX8/a;->e(Ljava/io/File;)Ljava/lang/String;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v15

    .line 1637
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1638
    .line 1639
    .line 1640
    invoke-static {v15}, LV8/a;->i(Ljava/lang/String;)LU8/C;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v13

    .line 1644
    invoke-virtual {v13}, LU8/C;->a()LU8/B;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v15

    .line 1648
    iget-object v13, v13, LU8/C;->k:LU8/K;
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_9

    .line 1649
    .line 1650
    if-eqz v13, :cond_2f

    .line 1651
    .line 1652
    :try_start_f
    invoke-virtual {v13}, LU8/K;->a()LU8/J;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v13

    .line 1656
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v1

    .line 1660
    iput-object v1, v13, LU8/J;->e:Ljava/lang/Long;

    .line 1661
    .line 1662
    iput-boolean v12, v13, LU8/J;->f:Z

    .line 1663
    .line 1664
    iget-byte v1, v13, LU8/J;->m:B
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5

    .line 1665
    .line 1666
    const/16 v18, 0x2

    .line 1667
    .line 1668
    or-int/lit8 v1, v1, 0x2

    .line 1669
    .line 1670
    int-to-byte v1, v1

    .line 1671
    :try_start_10
    iput-byte v1, v13, LU8/J;->m:B

    .line 1672
    .line 1673
    if-eqz v0, :cond_2e

    .line 1674
    .line 1675
    new-instance v1, LU8/l0;

    .line 1676
    .line 1677
    invoke-direct {v1, v0}, LU8/l0;-><init>(Ljava/lang/String;)V

    .line 1678
    .line 1679
    .line 1680
    iput-object v1, v13, LU8/J;->h:LU8/l0;

    .line 1681
    .line 1682
    :cond_2e
    invoke-virtual {v13}, LU8/J;->a()LU8/K;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    iput-object v0, v15, LU8/B;->j:LU8/K;

    .line 1687
    .line 1688
    goto :goto_1f

    .line 1689
    :catch_5
    move-exception v0

    .line 1690
    const/16 v18, 0x2

    .line 1691
    .line 1692
    goto/16 :goto_22

    .line 1693
    .line 1694
    :cond_2f
    const/16 v18, 0x2

    .line 1695
    .line 1696
    :goto_1f
    invoke-virtual {v15}, LU8/B;->a()LU8/C;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v0

    .line 1700
    invoke-virtual {v0}, LU8/C;->a()LU8/B;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v1

    .line 1704
    iput-object v11, v1, LU8/B;->g:Ljava/lang/String;

    .line 1705
    .line 1706
    iget-object v0, v0, LU8/C;->k:LU8/K;

    .line 1707
    .line 1708
    if-eqz v0, :cond_30

    .line 1709
    .line 1710
    invoke-virtual {v0}, LU8/K;->a()LU8/J;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v0

    .line 1714
    iput-object v11, v0, LU8/J;->c:Ljava/lang/String;

    .line 1715
    .line 1716
    invoke-virtual {v0}, LU8/J;->a()LU8/K;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v0

    .line 1720
    iput-object v0, v1, LU8/B;->j:LU8/K;

    .line 1721
    .line 1722
    :cond_30
    invoke-virtual {v1}, LU8/B;->a()LU8/C;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    iget-object v1, v0, LU8/C;->k:LU8/K;

    .line 1727
    .line 1728
    if-eqz v1, :cond_34

    .line 1729
    .line 1730
    invoke-virtual {v0}, LU8/C;->a()LU8/B;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v0

    .line 1734
    invoke-virtual {v1}, LU8/K;->a()LU8/J;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v1

    .line 1738
    iput-object v10, v1, LU8/J;->k:Ljava/util/List;

    .line 1739
    .line 1740
    invoke-virtual {v1}, LU8/J;->a()LU8/K;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v1

    .line 1744
    iput-object v1, v0, LU8/B;->j:LU8/K;

    .line 1745
    .line 1746
    invoke-virtual {v0}, LU8/B;->a()LU8/C;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v0

    .line 1750
    iget-object v1, v0, LU8/C;->k:LU8/K;

    .line 1751
    .line 1752
    if-nez v1, :cond_31

    .line 1753
    .line 1754
    const/4 v11, 0x3

    .line 1755
    const/4 v13, 0x0

    .line 1756
    goto :goto_25

    .line 1757
    :cond_31
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1758
    .line 1759
    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v10
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8

    .line 1769
    const/4 v11, 0x3

    .line 1770
    :try_start_11
    invoke-static {v5, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1771
    .line 1772
    .line 1773
    move-result v13
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_7

    .line 1774
    if-eqz v13, :cond_32

    .line 1775
    .line 1776
    const/4 v13, 0x0

    .line 1777
    :try_start_12
    invoke-static {v5, v10, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1778
    .line 1779
    .line 1780
    goto :goto_20

    .line 1781
    :cond_32
    const/4 v13, 0x0

    .line 1782
    :goto_20
    if-eqz v12, :cond_33

    .line 1783
    .line 1784
    iget-object v1, v1, LU8/K;->b:Ljava/lang/String;

    .line 1785
    .line 1786
    new-instance v10, Ljava/io/File;

    .line 1787
    .line 1788
    iget-object v12, v7, LX8/c;->f:Ljava/lang/Object;

    .line 1789
    .line 1790
    check-cast v12, Ljava/io/File;

    .line 1791
    .line 1792
    invoke-direct {v10, v12, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1793
    .line 1794
    .line 1795
    goto :goto_21

    .line 1796
    :cond_33
    iget-object v1, v1, LU8/K;->b:Ljava/lang/String;

    .line 1797
    .line 1798
    new-instance v10, Ljava/io/File;

    .line 1799
    .line 1800
    iget-object v12, v7, LX8/c;->e:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v12, Ljava/io/File;

    .line 1803
    .line 1804
    invoke-direct {v10, v12, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1805
    .line 1806
    .line 1807
    :goto_21
    sget-object v1, LV8/a;->a:Lad/L;

    .line 1808
    .line 1809
    invoke-virtual {v1, v0}, Lad/L;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    invoke-static {v10, v0}, LX8/a;->f(Ljava/io/File;Ljava/lang/String;)V

    .line 1814
    .line 1815
    .line 1816
    goto :goto_25

    .line 1817
    :catch_6
    move-exception v0

    .line 1818
    goto :goto_24

    .line 1819
    :catch_7
    move-exception v0

    .line 1820
    goto :goto_23

    .line 1821
    :catch_8
    move-exception v0

    .line 1822
    :goto_22
    const/4 v11, 0x3

    .line 1823
    :goto_23
    const/4 v13, 0x0

    .line 1824
    goto :goto_24

    .line 1825
    :cond_34
    const/4 v11, 0x3

    .line 1826
    const/4 v13, 0x0

    .line 1827
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1828
    .line 1829
    const-string v1, "Reports without sessions cannot have events added to them."

    .line 1830
    .line 1831
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1832
    .line 1833
    .line 1834
    throw v0
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_6

    .line 1835
    :catch_9
    move-exception v0

    .line 1836
    const/4 v11, 0x3

    .line 1837
    const/4 v13, 0x0

    .line 1838
    const/16 v18, 0x2

    .line 1839
    .line 1840
    :goto_24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1841
    .line 1842
    const-string v10, "Could not synthesize final report file for "

    .line 1843
    .line 1844
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1845
    .line 1846
    .line 1847
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1848
    .line 1849
    .line 1850
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v1

    .line 1854
    invoke-static {v5, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1855
    .line 1856
    .line 1857
    :goto_25
    new-instance v0, Ljava/io/File;

    .line 1858
    .line 1859
    iget-object v1, v7, LX8/c;->d:Ljava/lang/Object;

    .line 1860
    .line 1861
    check-cast v1, Ljava/io/File;

    .line 1862
    .line 1863
    invoke-direct {v0, v1, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1864
    .line 1865
    .line 1866
    invoke-static {v0}, LX8/c;->g(Ljava/io/File;)Z

    .line 1867
    .line 1868
    .line 1869
    move-object/from16 v1, p0

    .line 1870
    .line 1871
    const/4 v4, 0x1

    .line 1872
    const/4 v14, 0x0

    .line 1873
    const/16 v16, 0x4

    .line 1874
    .line 1875
    goto/16 :goto_14

    .line 1876
    .line 1877
    :goto_26
    :try_start_13
    monitor-exit v4
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 1878
    throw v0

    .line 1879
    :cond_35
    iget-object v0, v6, LX8/a;->c:LK3/r;

    .line 1880
    .line 1881
    invoke-virtual {v0}, LK3/r;->c()LZ8/a;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v0

    .line 1885
    iget-object v0, v0, LZ8/a;->a:LR1/i;

    .line 1886
    .line 1887
    invoke-virtual {v6}, LX8/a;->b()Ljava/util/ArrayList;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1892
    .line 1893
    .line 1894
    move-result v1

    .line 1895
    const/4 v14, 0x4

    .line 1896
    if-gt v1, v14, :cond_36

    .line 1897
    .line 1898
    goto :goto_28

    .line 1899
    :cond_36
    invoke-virtual {v0, v14, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v0

    .line 1903
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v0

    .line 1907
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1908
    .line 1909
    .line 1910
    move-result v1

    .line 1911
    if-eqz v1, :cond_37

    .line 1912
    .line 1913
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v1

    .line 1917
    check-cast v1, Ljava/io/File;

    .line 1918
    .line 1919
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1920
    .line 1921
    .line 1922
    goto :goto_27

    .line 1923
    :cond_37
    :goto_28
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const-wide/16 v8, 0x3e8

    .line 10
    .line 11
    div-long v10, v2, v8

    .line 12
    .line 13
    const-string v0, "Opening a new session with ID "

    .line 14
    .line 15
    invoke-static {v0, v4}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v2, "FirebaseCrashlytics"

    .line 20
    .line 21
    const/4 v12, 0x3

    .line 22
    invoke-static {v2, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v13, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const-string v2, "FirebaseCrashlytics"

    .line 30
    .line 31
    invoke-static {v2, v0, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 35
    .line 36
    iget-object v2, v1, LR8/m;->f:LR8/z;

    .line 37
    .line 38
    iget-object v3, v1, LR8/m;->h:LR8/a;

    .line 39
    .line 40
    iget-object v15, v2, LR8/z;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v5, v3, LR8/a;->e:Ljava/lang/Object;

    .line 43
    .line 44
    move-object/from16 v16, v5

    .line 45
    .line 46
    check-cast v16, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2}, LR8/z;->c()LR8/c;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v2, v2, LR8/c;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v5, v3, LR8/a;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, Ljava/lang/String;

    .line 57
    .line 58
    const/16 v21, 0x1

    .line 59
    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    const/4 v5, 0x4

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move/from16 v5, v21

    .line 65
    .line 66
    :goto_0
    new-instance v14, LU8/n0;

    .line 67
    .line 68
    iget-object v7, v3, LR8/a;->f:Ljava/lang/Object;

    .line 69
    .line 70
    move-object/from16 v17, v7

    .line 71
    .line 72
    check-cast v17, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v5}, LR8/v;->b(I)I

    .line 75
    .line 76
    .line 77
    move-result v19

    .line 78
    iget-object v3, v3, LR8/a;->h:Ljava/lang/Object;

    .line 79
    .line 80
    move-object/from16 v20, v3

    .line 81
    .line 82
    check-cast v20, LS3/s;

    .line 83
    .line 84
    move-object/from16 v18, v2

    .line 85
    .line 86
    invoke-direct/range {v14 .. v20}, LU8/n0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILS3/s;)V

    .line 87
    .line 88
    .line 89
    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v2, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {}, LR8/g;->g()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    new-instance v5, LU8/p0;

    .line 98
    .line 99
    invoke-direct {v5, v3}, LU8/p0;-><init>(Z)V

    .line 100
    .line 101
    .line 102
    iget-object v3, v1, LR8/m;->a:Landroid/content/Context;

    .line 103
    .line 104
    new-instance v7, Landroid/os/StatFs;

    .line 105
    .line 106
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-direct {v7, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockCount()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    move-wide/from16 v18, v8

    .line 122
    .line 123
    int-to-long v8, v6

    .line 124
    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSize()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    int-to-long v6, v6

    .line 129
    mul-long v27, v8, v6

    .line 130
    .line 131
    sget-object v6, LR8/f;->a:LR8/f;

    .line 132
    .line 133
    sget-object v8, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    sget-object v7, LR8/f;->a:LR8/f;

    .line 140
    .line 141
    const/4 v9, 0x2

    .line 142
    if-eqz v6, :cond_3

    .line 143
    .line 144
    const-string v6, "FirebaseCrashlytics"

    .line 145
    .line 146
    invoke-static {v6, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 147
    .line 148
    .line 149
    move-result v16

    .line 150
    if-eqz v16, :cond_2

    .line 151
    .line 152
    move/from16 v16, v9

    .line 153
    .line 154
    const-string v9, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    .line 155
    .line 156
    invoke-static {v6, v9, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    move/from16 v16, v9

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    move/from16 v16, v9

    .line 164
    .line 165
    invoke-virtual {v8, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    sget-object v9, LR8/f;->b:Ljava/util/HashMap;

    .line 170
    .line 171
    invoke-virtual {v9, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    check-cast v6, LR8/f;

    .line 176
    .line 177
    if-nez v6, :cond_4

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_4
    move-object v7, v6

    .line 181
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 182
    .line 183
    .line 184
    move-result v23

    .line 185
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-virtual {v6}, Ljava/lang/Runtime;->availableProcessors()I

    .line 192
    .line 193
    .line 194
    move-result v24

    .line 195
    invoke-static {v3}, LR8/g;->a(Landroid/content/Context;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v25

    .line 199
    invoke-static {}, LR8/g;->f()Z

    .line 200
    .line 201
    .line 202
    move-result v29

    .line 203
    invoke-static {}, LR8/g;->c()I

    .line 204
    .line 205
    .line 206
    move-result v30

    .line 207
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 208
    .line 209
    sget-object v6, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 210
    .line 211
    new-instance v22, LU8/o0;

    .line 212
    .line 213
    invoke-direct/range {v22 .. v30}, LU8/o0;-><init>(IIJJZI)V

    .line 214
    .line 215
    .line 216
    move-object/from16 v7, v22

    .line 217
    .line 218
    iget-object v13, v1, LR8/m;->j:LO8/a;

    .line 219
    .line 220
    new-instance v12, LU8/m0;

    .line 221
    .line 222
    invoke-direct {v12, v14, v5, v7}, LU8/m0;-><init>(LU8/n0;LU8/p0;LU8/o0;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v4, v10, v11, v12}, LO8/a;->d(Ljava/lang/String;JLU8/m0;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-eqz v5, :cond_5

    .line 233
    .line 234
    if-eqz v4, :cond_5

    .line 235
    .line 236
    move-object v5, v3

    .line 237
    iget-object v3, v1, LR8/m;->d:LX8/c;

    .line 238
    .line 239
    iget-object v7, v3, LX8/c;->a:Ljava/lang/Object;

    .line 240
    .line 241
    move-object v12, v7

    .line 242
    check-cast v12, Ljava/lang/String;

    .line 243
    .line 244
    monitor-enter v12

    .line 245
    :try_start_0
    iput-object v4, v3, LX8/c;->a:Ljava/lang/Object;

    .line 246
    .line 247
    iget-object v7, v3, LX8/c;->d:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v7, LA7/b0;

    .line 250
    .line 251
    iget-object v7, v7, LA7/b0;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v7, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 254
    .line 255
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    check-cast v7, LT8/d;

    .line 260
    .line 261
    invoke-virtual {v7}, LT8/d;->a()Ljava/util/Map;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    iget-object v13, v3, LX8/c;->f:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v13, LI9/a;

    .line 268
    .line 269
    invoke-virtual {v13}, LI9/a;->b()Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    iget-object v14, v3, LX8/c;->c:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v14, LS8/f;

    .line 276
    .line 277
    iget-object v14, v14, LS8/f;->b:LS8/c;

    .line 278
    .line 279
    move-object/from16 v23, v2

    .line 280
    .line 281
    new-instance v2, LCb/a;

    .line 282
    .line 283
    move-object/from16 v24, v5

    .line 284
    .line 285
    move-object v5, v7

    .line 286
    const/4 v7, 0x5

    .line 287
    move-object/from16 v33, v6

    .line 288
    .line 289
    move-object v6, v13

    .line 290
    move-object/from16 v31, v23

    .line 291
    .line 292
    move-object/from16 v32, v24

    .line 293
    .line 294
    const/4 v13, 0x4

    .line 295
    invoke-direct/range {v2 .. v7}, LCb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v14, v2}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 299
    .line 300
    .line 301
    monitor-exit v12

    .line 302
    goto :goto_2

    .line 303
    :catchall_0
    move-exception v0

    .line 304
    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    throw v0

    .line 306
    :cond_5
    move-object/from16 v31, v2

    .line 307
    .line 308
    move-object/from16 v32, v3

    .line 309
    .line 310
    move-object/from16 v33, v6

    .line 311
    .line 312
    const/4 v13, 0x4

    .line 313
    :goto_2
    iget-object v2, v1, LR8/m;->i:LT8/e;

    .line 314
    .line 315
    iget-object v3, v2, LT8/e;->b:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v3, LT8/c;

    .line 318
    .line 319
    invoke-interface {v3}, LT8/c;->a()V

    .line 320
    .line 321
    .line 322
    sget-object v3, LT8/e;->c:Lza/a;

    .line 323
    .line 324
    iput-object v3, v2, LT8/e;->b:Ljava/lang/Object;

    .line 325
    .line 326
    if-nez v4, :cond_6

    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_6
    iget-object v3, v2, LT8/e;->a:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v3, LX8/c;

    .line 332
    .line 333
    const-string v5, "userlog"

    .line 334
    .line 335
    invoke-virtual {v3, v4, v5}, LX8/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    new-instance v5, LT8/l;

    .line 340
    .line 341
    invoke-direct {v5, v3}, LT8/l;-><init>(Ljava/io/File;)V

    .line 342
    .line 343
    .line 344
    iput-object v5, v2, LT8/e;->b:Ljava/lang/Object;

    .line 345
    .line 346
    :goto_3
    iget-object v2, v1, LR8/m;->l:LR8/j;

    .line 347
    .line 348
    invoke-virtual {v2, v4}, LR8/j;->a(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    iget-object v2, v1, LR8/m;->m:LD6/o;

    .line 352
    .line 353
    iget-object v3, v2, LD6/o;->a:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v3, LR8/t;

    .line 356
    .line 357
    sget-object v5, LU8/P0;->a:Ljava/nio/charset/Charset;

    .line 358
    .line 359
    new-instance v5, LU8/B;

    .line 360
    .line 361
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 362
    .line 363
    .line 364
    const-string v6, "19.3.0"

    .line 365
    .line 366
    iput-object v6, v5, LU8/B;->a:Ljava/lang/String;

    .line 367
    .line 368
    iget-object v6, v3, LR8/t;->c:LR8/a;

    .line 369
    .line 370
    iget-object v7, v6, LR8/a;->a:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v7, Ljava/lang/String;

    .line 373
    .line 374
    if-eqz v7, :cond_18

    .line 375
    .line 376
    iput-object v7, v5, LU8/B;->b:Ljava/lang/String;

    .line 377
    .line 378
    iget-object v7, v3, LR8/t;->b:LR8/z;

    .line 379
    .line 380
    invoke-virtual {v7}, LR8/z;->c()LR8/c;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    iget-object v12, v12, LR8/c;->a:Ljava/lang/String;

    .line 385
    .line 386
    if-eqz v12, :cond_17

    .line 387
    .line 388
    iput-object v12, v5, LU8/B;->d:Ljava/lang/String;

    .line 389
    .line 390
    invoke-virtual {v7}, LR8/z;->c()LR8/c;

    .line 391
    .line 392
    .line 393
    move-result-object v12

    .line 394
    iget-object v12, v12, LR8/c;->b:Ljava/lang/String;

    .line 395
    .line 396
    iput-object v12, v5, LU8/B;->e:Ljava/lang/String;

    .line 397
    .line 398
    invoke-virtual {v7}, LR8/z;->c()LR8/c;

    .line 399
    .line 400
    .line 401
    move-result-object v12

    .line 402
    iget-object v12, v12, LR8/c;->c:Ljava/lang/String;

    .line 403
    .line 404
    iput-object v12, v5, LU8/B;->f:Ljava/lang/String;

    .line 405
    .line 406
    iget-object v12, v6, LR8/a;->e:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v12, Ljava/lang/String;

    .line 409
    .line 410
    if-eqz v12, :cond_16

    .line 411
    .line 412
    iput-object v12, v5, LU8/B;->h:Ljava/lang/String;

    .line 413
    .line 414
    iget-object v14, v6, LR8/a;->f:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v14, Ljava/lang/String;

    .line 417
    .line 418
    if-eqz v14, :cond_15

    .line 419
    .line 420
    iput-object v14, v5, LU8/B;->i:Ljava/lang/String;

    .line 421
    .line 422
    iput v13, v5, LU8/B;->c:I

    .line 423
    .line 424
    move/from16 v17, v13

    .line 425
    .line 426
    iget-byte v13, v5, LU8/B;->m:B

    .line 427
    .line 428
    or-int/lit8 v13, v13, 0x1

    .line 429
    .line 430
    int-to-byte v13, v13

    .line 431
    iput-byte v13, v5, LU8/B;->m:B

    .line 432
    .line 433
    new-instance v13, LU8/J;

    .line 434
    .line 435
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 436
    .line 437
    .line 438
    const/4 v1, 0x0

    .line 439
    iput-boolean v1, v13, LU8/J;->f:Z

    .line 440
    .line 441
    iget-byte v1, v13, LU8/J;->m:B

    .line 442
    .line 443
    or-int/lit8 v1, v1, 0x2

    .line 444
    .line 445
    int-to-byte v1, v1

    .line 446
    iput-wide v10, v13, LU8/J;->d:J

    .line 447
    .line 448
    or-int/lit8 v1, v1, 0x1

    .line 449
    .line 450
    int-to-byte v1, v1

    .line 451
    iput-byte v1, v13, LU8/J;->m:B

    .line 452
    .line 453
    if-eqz v4, :cond_14

    .line 454
    .line 455
    iput-object v4, v13, LU8/J;->b:Ljava/lang/String;

    .line 456
    .line 457
    sget-object v1, LR8/t;->g:Ljava/lang/String;

    .line 458
    .line 459
    if-eqz v1, :cond_13

    .line 460
    .line 461
    iput-object v1, v13, LU8/J;->a:Ljava/lang/String;

    .line 462
    .line 463
    iget-object v1, v7, LR8/z;->c:Ljava/lang/String;

    .line 464
    .line 465
    if-eqz v1, :cond_12

    .line 466
    .line 467
    invoke-virtual {v7}, LR8/z;->c()LR8/c;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    iget-object v4, v4, LR8/c;->a:Ljava/lang/String;

    .line 472
    .line 473
    iget-object v6, v6, LR8/a;->h:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v6, LS3/s;

    .line 476
    .line 477
    iget-object v7, v6, LS3/s;->c:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v7, LG6/S;

    .line 480
    .line 481
    if-nez v7, :cond_7

    .line 482
    .line 483
    new-instance v7, LG6/S;

    .line 484
    .line 485
    invoke-direct {v7, v6}, LG6/S;-><init>(LS3/s;)V

    .line 486
    .line 487
    .line 488
    iput-object v7, v6, LS3/s;->c:Ljava/lang/Object;

    .line 489
    .line 490
    :cond_7
    iget-object v7, v6, LS3/s;->c:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v7, LG6/S;

    .line 493
    .line 494
    iget-object v10, v7, LG6/S;->a:Ljava/lang/String;

    .line 495
    .line 496
    if-nez v7, :cond_8

    .line 497
    .line 498
    new-instance v7, LG6/S;

    .line 499
    .line 500
    invoke-direct {v7, v6}, LG6/S;-><init>(LS3/s;)V

    .line 501
    .line 502
    .line 503
    iput-object v7, v6, LS3/s;->c:Ljava/lang/Object;

    .line 504
    .line 505
    :cond_8
    iget-object v6, v6, LS3/s;->c:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v6, LG6/S;

    .line 508
    .line 509
    iget-object v6, v6, LG6/S;->b:Ljava/lang/String;

    .line 510
    .line 511
    new-instance v23, LU8/L;

    .line 512
    .line 513
    move-object/from16 v24, v1

    .line 514
    .line 515
    move-object/from16 v27, v4

    .line 516
    .line 517
    move-object/from16 v29, v6

    .line 518
    .line 519
    move-object/from16 v28, v10

    .line 520
    .line 521
    move-object/from16 v25, v12

    .line 522
    .line 523
    move-object/from16 v26, v14

    .line 524
    .line 525
    invoke-direct/range {v23 .. v29}, LU8/L;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    move-object/from16 v1, v23

    .line 529
    .line 530
    iput-object v1, v13, LU8/J;->g:LU8/L;

    .line 531
    .line 532
    new-instance v1, LU8/j0;

    .line 533
    .line 534
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 535
    .line 536
    .line 537
    const/4 v4, 0x3

    .line 538
    iput v4, v1, LU8/j0;->a:I

    .line 539
    .line 540
    iget-byte v4, v1, LU8/j0;->e:B

    .line 541
    .line 542
    or-int/lit8 v4, v4, 0x1

    .line 543
    .line 544
    int-to-byte v4, v4

    .line 545
    iput-byte v4, v1, LU8/j0;->e:B

    .line 546
    .line 547
    if-eqz v15, :cond_11

    .line 548
    .line 549
    iput-object v15, v1, LU8/j0;->b:Ljava/lang/String;

    .line 550
    .line 551
    move-object/from16 v4, v31

    .line 552
    .line 553
    if-eqz v4, :cond_10

    .line 554
    .line 555
    iput-object v4, v1, LU8/j0;->c:Ljava/lang/String;

    .line 556
    .line 557
    invoke-static {}, LR8/g;->g()Z

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    iput-boolean v4, v1, LU8/j0;->d:Z

    .line 562
    .line 563
    iget-byte v4, v1, LU8/j0;->e:B

    .line 564
    .line 565
    or-int/lit8 v4, v4, 0x2

    .line 566
    .line 567
    int-to-byte v4, v4

    .line 568
    iput-byte v4, v1, LU8/j0;->e:B

    .line 569
    .line 570
    invoke-virtual {v1}, LU8/j0;->a()LU8/k0;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    iput-object v1, v13, LU8/J;->i:LU8/k0;

    .line 575
    .line 576
    new-instance v1, Landroid/os/StatFs;

    .line 577
    .line 578
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    invoke-direct {v1, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    const/4 v6, 0x7

    .line 594
    if-eqz v4, :cond_9

    .line 595
    .line 596
    goto :goto_4

    .line 597
    :cond_9
    sget-object v4, LR8/t;->f:Ljava/util/HashMap;

    .line 598
    .line 599
    invoke-virtual {v8, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    check-cast v0, Ljava/lang/Integer;

    .line 608
    .line 609
    if-nez v0, :cond_a

    .line 610
    .line 611
    goto :goto_4

    .line 612
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 613
    .line 614
    .line 615
    move-result v6

    .line 616
    :goto_4
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    iget-object v3, v3, LR8/t;->a:Landroid/content/Context;

    .line 625
    .line 626
    invoke-static {v3}, LR8/g;->a(Landroid/content/Context;)J

    .line 627
    .line 628
    .line 629
    move-result-wide v3

    .line 630
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    .line 631
    .line 632
    .line 633
    move-result v7

    .line 634
    int-to-long v7, v7

    .line 635
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    int-to-long v10, v1

    .line 640
    mul-long/2addr v7, v10

    .line 641
    invoke-static {}, LR8/g;->f()Z

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    invoke-static {}, LR8/g;->c()I

    .line 646
    .line 647
    .line 648
    move-result v10

    .line 649
    new-instance v11, LU8/N;

    .line 650
    .line 651
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 652
    .line 653
    .line 654
    iput v6, v11, LU8/N;->a:I

    .line 655
    .line 656
    iget-byte v6, v11, LU8/N;->j:B

    .line 657
    .line 658
    or-int/lit8 v6, v6, 0x1

    .line 659
    .line 660
    int-to-byte v6, v6

    .line 661
    iput-byte v6, v11, LU8/N;->j:B

    .line 662
    .line 663
    if-eqz v9, :cond_f

    .line 664
    .line 665
    iput-object v9, v11, LU8/N;->b:Ljava/lang/String;

    .line 666
    .line 667
    iput v0, v11, LU8/N;->c:I

    .line 668
    .line 669
    or-int/lit8 v0, v6, 0x2

    .line 670
    .line 671
    int-to-byte v0, v0

    .line 672
    iput-wide v3, v11, LU8/N;->d:J

    .line 673
    .line 674
    or-int/lit8 v0, v0, 0x4

    .line 675
    .line 676
    int-to-byte v0, v0

    .line 677
    iput-wide v7, v11, LU8/N;->e:J

    .line 678
    .line 679
    or-int/lit8 v0, v0, 0x8

    .line 680
    .line 681
    int-to-byte v0, v0

    .line 682
    iput-boolean v1, v11, LU8/N;->f:Z

    .line 683
    .line 684
    or-int/lit8 v0, v0, 0x10

    .line 685
    .line 686
    int-to-byte v0, v0

    .line 687
    iput v10, v11, LU8/N;->g:I

    .line 688
    .line 689
    or-int/lit8 v0, v0, 0x20

    .line 690
    .line 691
    int-to-byte v0, v0

    .line 692
    iput-byte v0, v11, LU8/N;->j:B

    .line 693
    .line 694
    move-object/from16 v0, v32

    .line 695
    .line 696
    if-eqz v0, :cond_e

    .line 697
    .line 698
    iput-object v0, v11, LU8/N;->h:Ljava/lang/String;

    .line 699
    .line 700
    move-object/from16 v0, v33

    .line 701
    .line 702
    if-eqz v0, :cond_d

    .line 703
    .line 704
    iput-object v0, v11, LU8/N;->i:Ljava/lang/String;

    .line 705
    .line 706
    invoke-virtual {v11}, LU8/N;->a()LU8/O;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    iput-object v0, v13, LU8/J;->j:LU8/O;

    .line 711
    .line 712
    const/4 v4, 0x3

    .line 713
    iput v4, v13, LU8/J;->l:I

    .line 714
    .line 715
    iget-byte v0, v13, LU8/J;->m:B

    .line 716
    .line 717
    or-int/lit8 v0, v0, 0x4

    .line 718
    .line 719
    int-to-byte v0, v0

    .line 720
    iput-byte v0, v13, LU8/J;->m:B

    .line 721
    .line 722
    invoke-virtual {v13}, LU8/J;->a()LU8/K;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    iput-object v0, v5, LU8/B;->j:LU8/K;

    .line 727
    .line 728
    invoke-virtual {v5}, LU8/B;->a()LU8/C;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    iget-object v1, v2, LD6/o;->b:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v1, LX8/a;

    .line 735
    .line 736
    iget-object v1, v1, LX8/a;->b:LX8/c;

    .line 737
    .line 738
    iget-object v2, v0, LU8/C;->k:LU8/K;

    .line 739
    .line 740
    const-string v3, "FirebaseCrashlytics"

    .line 741
    .line 742
    if-nez v2, :cond_b

    .line 743
    .line 744
    const/4 v4, 0x3

    .line 745
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    if-eqz v0, :cond_c

    .line 750
    .line 751
    const-string v0, "Could not get session for report"

    .line 752
    .line 753
    const/4 v1, 0x0

    .line 754
    invoke-static {v3, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 755
    .line 756
    .line 757
    return-void

    .line 758
    :cond_b
    iget-object v4, v2, LU8/K;->b:Ljava/lang/String;

    .line 759
    .line 760
    :try_start_1
    sget-object v5, LX8/a;->g:LV8/a;

    .line 761
    .line 762
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    sget-object v5, LV8/a;->a:Lad/L;

    .line 766
    .line 767
    invoke-virtual {v5, v0}, Lad/L;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    const-string v5, "report"

    .line 772
    .line 773
    invoke-virtual {v1, v4, v5}, LX8/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    invoke-static {v5, v0}, LX8/a;->f(Ljava/io/File;Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    const-string v0, "start-time"

    .line 781
    .line 782
    invoke-virtual {v1, v4, v0}, LX8/c;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    const-string v1, ""

    .line 787
    .line 788
    iget-wide v5, v2, LU8/K;->d:J

    .line 789
    .line 790
    new-instance v2, Ljava/io/OutputStreamWriter;

    .line 791
    .line 792
    new-instance v7, Ljava/io/FileOutputStream;

    .line 793
    .line 794
    invoke-direct {v7, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 795
    .line 796
    .line 797
    sget-object v8, LX8/a;->e:Ljava/nio/charset/Charset;

    .line 798
    .line 799
    invoke-direct {v2, v7, v8}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 800
    .line 801
    .line 802
    :try_start_2
    invoke-virtual {v2, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    mul-long v5, v5, v18

    .line 806
    .line 807
    invoke-virtual {v0, v5, v6}, Ljava/io/File;->setLastModified(J)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 808
    .line 809
    .line 810
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 811
    .line 812
    .line 813
    return-void

    .line 814
    :catchall_1
    move-exception v0

    .line 815
    move-object v1, v0

    .line 816
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 817
    .line 818
    .line 819
    goto :goto_5

    .line 820
    :catchall_2
    move-exception v0

    .line 821
    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 822
    .line 823
    .line 824
    :goto_5
    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 825
    :catch_0
    move-exception v0

    .line 826
    const-string v1, "Could not persist report for session "

    .line 827
    .line 828
    invoke-static {v1, v4}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    const/4 v4, 0x3

    .line 833
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    if-eqz v2, :cond_c

    .line 838
    .line 839
    invoke-static {v3, v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 840
    .line 841
    .line 842
    :cond_c
    return-void

    .line 843
    :cond_d
    new-instance v0, Ljava/lang/NullPointerException;

    .line 844
    .line 845
    const-string v1, "Null modelClass"

    .line 846
    .line 847
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    throw v0

    .line 851
    :cond_e
    new-instance v0, Ljava/lang/NullPointerException;

    .line 852
    .line 853
    const-string v1, "Null manufacturer"

    .line 854
    .line 855
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    throw v0

    .line 859
    :cond_f
    new-instance v0, Ljava/lang/NullPointerException;

    .line 860
    .line 861
    const-string v1, "Null model"

    .line 862
    .line 863
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    throw v0

    .line 867
    :cond_10
    new-instance v0, Ljava/lang/NullPointerException;

    .line 868
    .line 869
    const-string v1, "Null buildVersion"

    .line 870
    .line 871
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v0

    .line 875
    :cond_11
    new-instance v0, Ljava/lang/NullPointerException;

    .line 876
    .line 877
    const-string v1, "Null version"

    .line 878
    .line 879
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    throw v0

    .line 883
    :cond_12
    new-instance v0, Ljava/lang/NullPointerException;

    .line 884
    .line 885
    const-string v1, "Null identifier"

    .line 886
    .line 887
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    throw v0

    .line 891
    :cond_13
    new-instance v0, Ljava/lang/NullPointerException;

    .line 892
    .line 893
    const-string v1, "Null generator"

    .line 894
    .line 895
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    throw v0

    .line 899
    :cond_14
    new-instance v0, Ljava/lang/NullPointerException;

    .line 900
    .line 901
    const-string v1, "Null identifier"

    .line 902
    .line 903
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    throw v0

    .line 907
    :cond_15
    new-instance v0, Ljava/lang/NullPointerException;

    .line 908
    .line 909
    const-string v1, "Null displayVersion"

    .line 910
    .line 911
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    throw v0

    .line 915
    :cond_16
    new-instance v0, Ljava/lang/NullPointerException;

    .line 916
    .line 917
    const-string v1, "Null buildVersion"

    .line 918
    .line 919
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    throw v0

    .line 923
    :cond_17
    new-instance v0, Ljava/lang/NullPointerException;

    .line 924
    .line 925
    const-string v1, "Null installationUuid"

    .line 926
    .line 927
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    throw v0

    .line 931
    :cond_18
    new-instance v0, Ljava/lang/NullPointerException;

    .line 932
    .line 933
    const-string v1, "Null gmpAppId"

    .line 934
    .line 935
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    throw v0
.end method

.method public final d(LK3/r;)Z
    .locals 6

    .line 1
    invoke-static {}, LS8/f;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LR8/m;->n:LR8/u;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, LR8/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    const/4 v3, 0x0

    .line 22
    const-string v4, "FirebaseCrashlytics"

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const-string p1, "Skipping session finalization because a crash has already occurred."

    .line 27
    .line 28
    invoke-static {v4, p1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    const/4 v0, 0x2

    .line 33
    invoke-static {v4, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    const-string v5, "Finalizing previously open sessions."

    .line 40
    .line 41
    invoke-static {v4, v5, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    :cond_2
    :try_start_0
    invoke-virtual {p0, v2, p1, v2}, LR8/m;->b(ZLK3/r;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    invoke-static {v4, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    const-string p1, "Closed all previously open sessions."

    .line 54
    .line 55
    invoke-static {v4, p1, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :cond_3
    return v2

    .line 59
    :catch_0
    move-exception p1

    .line 60
    const-string v0, "Unable to finalize previously open sessions."

    .line 61
    .line 62
    invoke-static {v4, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    return v1
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LR8/m;->m:LD6/o;

    .line 2
    .line 3
    iget-object v0, v0, LD6/o;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LX8/a;

    .line 6
    .line 7
    invoke-virtual {v0}, LX8/a;->c()Ljava/util/NavigableSet;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public final declared-synchronized g(LK3/r;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
    .locals 11

    .line 1
    const-string v0, "Handling uncaught exception \""

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v0, "\" from thread "

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "FirebaseCrashlytics"

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 32
    .line 33
    .line 34
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    :try_start_1
    const-string v1, "FirebaseCrashlytics"

    .line 39
    .line 40
    invoke-static {v1, v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    move-object v4, p0

    .line 47
    goto :goto_3

    .line 48
    :cond_0
    :goto_0
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    iget-object v0, p0, LR8/m;->e:LS8/f;

    .line 53
    .line 54
    iget-object v0, v0, LS8/f;->a:LS8/c;

    .line 55
    .line 56
    new-instance v3, LR8/k;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 57
    .line 58
    move-object v4, p0

    .line 59
    move-object v9, p1

    .line 60
    move-object v8, p2

    .line 61
    move-object v7, p3

    .line 62
    move v10, p4

    .line 63
    :try_start_3
    invoke-direct/range {v3 .. v10}, LR8/k;-><init>(LR8/m;JLjava/lang/Throwable;Ljava/lang/Thread;LK3/r;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v3}, LS8/c;->c(LR8/k;)Lcom/google/android/gms/tasks/Task;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 70
    if-nez v10, :cond_1

    .line 71
    .line 72
    :try_start_4
    invoke-static {p1}, LR8/A;->a(Lcom/google/android/gms/tasks/Task;)V
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catchall_1
    move-exception v0

    .line 77
    :goto_1
    move-object p1, v0

    .line 78
    goto :goto_3

    .line 79
    :catch_0
    move-exception v0

    .line 80
    move-object p1, v0

    .line 81
    :try_start_5
    const-string p2, "Error handling uncaught exception"

    .line 82
    .line 83
    const-string p3, "FirebaseCrashlytics"

    .line 84
    .line 85
    invoke-static {p3, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catch_1
    const-string p1, "Cannot send reports. Timed out while fetching settings."

    .line 90
    .line 91
    const-string p2, "FirebaseCrashlytics"

    .line 92
    .line 93
    invoke-static {p2, p1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 94
    .line 95
    .line 96
    :cond_1
    :goto_2
    monitor-exit p0

    .line 97
    return-void

    .line 98
    :catchall_2
    move-exception v0

    .line 99
    move-object v4, p0

    .line 100
    goto :goto_1

    .line 101
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 102
    throw p1
.end method

.method public final h()V
    .locals 3

    .line 1
    const-string v0, "FirebaseCrashlytics"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, LR8/m;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v2, "com.crashlytics.version-control-info"

    .line 10
    .line 11
    invoke-virtual {p0, v2, v1}, LR8/m;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "Saved version control info"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v1

    .line 22
    const-string v2, "Unable to save version control info"

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LR8/m;->d:LX8/c;

    .line 2
    .line 3
    iget-object v0, v0, LX8/c;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LA7/b0;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LA7/b0;->s(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception p1

    .line 12
    iget-object p2, p0, LR8/m;->a:Landroid/content/Context;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget p2, p2, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 21
    .line 22
    and-int/lit8 p2, p2, 0x2

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    throw p1

    .line 28
    :cond_1
    :goto_0
    const-string p1, "Attempting to set custom attribute with null key, ignoring."

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    const-string v0, "FirebaseCrashlytics"

    .line 32
    .line 33
    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final j(Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    .line 1
    iget-object v0, p0, LR8/m;->m:LD6/o;

    .line 2
    .line 3
    iget-object v0, v0, LD6/o;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LX8/a;

    .line 6
    .line 7
    iget-object v0, v0, LX8/a;->b:LX8/c;

    .line 8
    .line 9
    iget-object v1, v0, LX8/c;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, LX8/c;->h([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, LR8/m;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 26
    .line 27
    const-string v3, "FirebaseCrashlytics"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, v0, LX8/c;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, LX8/c;->h([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    iget-object v0, v0, LX8/c;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/io/File;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, LX8/c;->h([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const/4 p1, 0x2

    .line 70
    invoke-static {v3, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    const-string p1, "No crash reports are available to be sent."

    .line 77
    .line 78
    invoke-static {v3, p1, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    :goto_0
    sget-object v0, LO8/c;->a:LO8/c;

    .line 88
    .line 89
    const-string v1, "Crash reports are available to be sent."

    .line 90
    .line 91
    invoke-virtual {v0, v1}, LO8/c;->f(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, LR8/m;->b:LR0/e;

    .line 95
    .line 96
    invoke-virtual {v1}, LR0/e;->f()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_4

    .line 101
    .line 102
    const/4 v0, 0x3

    .line 103
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    const-string v0, "Automatic data collection is enabled. Allowing upload."

    .line 110
    .line 111
    invoke-static {v3, v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    .line 113
    .line 114
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const-string v3, "Automatic data collection is disabled."

    .line 127
    .line 128
    invoke-virtual {v0, v3}, LO8/c;->c(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v3, "Notifying that unsent reports are available."

    .line 132
    .line 133
    invoke-virtual {v0, v3}, LO8/c;->f(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iget-object v2, v1, LR0/e;->f:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter v2

    .line 144
    :try_start_0
    iget-object v1, v1, LR0/e;->g:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 147
    .line 148
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    new-instance v2, Lc8/e;

    .line 154
    .line 155
    const/16 v3, 0x1a

    .line 156
    .line 157
    invoke-direct {v2, v3}, Lc8/e;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    const-string v2, "Waiting for send/deleteUnsentReports to be called."

    .line 165
    .line 166
    invoke-virtual {v0, v2}, LO8/c;->c(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, LR8/m;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v1, v0}, LS8/a;->a(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :goto_1
    iget-object v1, p0, LR8/m;->e:LS8/f;

    .line 180
    .line 181
    iget-object v1, v1, LS8/f;->a:LS8/c;

    .line 182
    .line 183
    new-instance v2, LS3/c;

    .line 184
    .line 185
    const/16 v3, 0x13

    .line 186
    .line 187
    invoke-direct {v2, v3, p0, p1}, LS3/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :catchall_0
    move-exception p1

    .line 195
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    throw p1
.end method
