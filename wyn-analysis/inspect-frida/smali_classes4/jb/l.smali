.class public Ljb/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Luc/p;


# static fields
.field public static final c:Ljava/util/HashMap;

.field public static final d:Ljava/util/HashMap;

.field public static final e:Ljava/lang/Object;

.field public static final f:Ljava/lang/Object;

.field public static g:I

.field public static h:Ljava/lang/String;

.field public static i:I

.field public static j:I

.field public static k:I

.field public static l:Ljb/h;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Luc/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ljb/l;->d:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ljb/l;->e:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ljb/l;->f:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    sput v0, Ljb/l;->g:I

    .line 31
    .line 32
    sput v0, Ljb/l;->i:I

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    sput v1, Ljb/l;->j:I

    .line 36
    .line 37
    sput v0, Ljb/l;->k:I

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljb/l;Ljb/e;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    :try_start_0
    iget v0, p1, Ljb/e;->d:I

    .line 6
    .line 7
    if-lt v0, p0, :cond_0

    .line 8
    .line 9
    const-string v0, "Sqflite"

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljb/e;->h()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "closing database "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljb/e;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :goto_1
    const-string v1, "Sqflite"

    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "error "

    .line 47
    .line 48
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, " while closing database "

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    sget v0, Ljb/l;->k:I

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    :goto_2
    sget-object v0, Ljb/l;->e:Ljava/lang/Object;

    .line 72
    .line 73
    monitor-enter v0

    .line 74
    :try_start_1
    sget-object v1, Ljb/l;->d:Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    sget-object v1, Ljb/l;->l:Ljb/h;

    .line 83
    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    iget v1, p1, Ljb/e;->d:I

    .line 87
    .line 88
    if-lt v1, p0, :cond_1

    .line 89
    .line 90
    const-string p0, "Sqflite"

    .line 91
    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljb/e;->h()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, "stopping thread"

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    goto :goto_4

    .line 119
    :cond_1
    :goto_3
    sget-object p0, Ljb/l;->l:Ljb/h;

    .line 120
    .line 121
    invoke-interface {p0}, Ljb/h;->b()V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    sput-object p0, Ljb/l;->l:Ljb/h;

    .line 126
    .line 127
    :cond_2
    monitor-exit v0

    .line 128
    return-void

    .line 129
    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    throw p0
.end method

.method public static b(Luc/o;Ltc/g;)Ljb/e;
    .locals 2

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Ljb/l;->d:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljb/e;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v1, "database_closed "

    .line 27
    .line 28
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "sqlite_error"

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p1, v0, p0, v1}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v1
.end method

.method public static c(IZZ)Ljava/util/HashMap;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "id"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    const-string p1, "recovered"

    .line 20
    .line 21
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz p2, :cond_1

    .line 25
    .line 26
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    const-string p1, "recoveredInTransaction"

    .line 29
    .line 30
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final d(Luc/o;Ltc/g;)V
    .locals 5

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p1, p2}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget v2, p1, Ljb/e;->d:I

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-lt v2, v3, :cond_1

    .line 24
    .line 25
    const-string v2, "Sqflite"

    .line 26
    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljb/e;->h()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v4, "closing "

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, " "

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p1, Ljb/e;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object v1, p1, Ljb/e;->b:Ljava/lang/String;

    .line 65
    .line 66
    sget-object v2, Ljb/l;->e:Ljava/lang/Object;

    .line 67
    .line 68
    monitor-enter v2

    .line 69
    :try_start_0
    sget-object v3, Ljb/l;->d:Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-boolean v0, p1, Ljb/e;->a:Z

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    sget-object v0, Ljb/l;->l:Ljb/h;

    .line 88
    .line 89
    new-instance v1, LA7/w0;

    .line 90
    .line 91
    const/16 v2, 0x18

    .line 92
    .line 93
    invoke-direct {v1, p0, p1, p2, v2}, LA7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v0, p1, v1}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    throw p1
.end method

.method public final e(Luc/o;Ltc/g;)V
    .locals 8

    .line 1
    const-string v0, "Look for "

    .line 2
    .line 3
    const-string v1, "path"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    move-object v3, p1

    .line 10
    check-cast v3, Ljava/lang/String;

    .line 11
    .line 12
    sget-object p1, Ljb/l;->e:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter p1

    .line 15
    :try_start_0
    sget v1, Ljb/l;->g:I

    .line 16
    .line 17
    invoke-static {v1}, Ljb/a;->a(I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string v1, "Sqflite"

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " in "

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p2, v0

    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_0
    :goto_0
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/Integer;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    sget-object v2, Ljb/l;->d:Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljb/e;

    .line 76
    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    iget-object v5, v4, Ljb/e;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 80
    .line 81
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    sget v5, Ljb/l;->g:I

    .line 88
    .line 89
    invoke-static {v5}, Ljb/a;->a(I)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_2

    .line 94
    .line 95
    const-string v5, "Sqflite"

    .line 96
    .line 97
    new-instance v6, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ljb/e;->h()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v7, "found single instance "

    .line 110
    .line 111
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4}, Ljb/e;->j()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_1

    .line 119
    .line 120
    const-string v7, "(in transaction) "

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    const-string v7, ""

    .line 124
    .line 125
    :goto_1
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v7, " "

    .line 132
    .line 133
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :goto_2
    move-object v5, v4

    .line 153
    goto :goto_3

    .line 154
    :cond_3
    const/4 v4, 0x0

    .line 155
    goto :goto_2

    .line 156
    :goto_3
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    new-instance v1, LA7/W0;

    .line 158
    .line 159
    const/16 v2, 0x11

    .line 160
    .line 161
    move-object v4, p0

    .line 162
    move-object v6, p2

    .line 163
    invoke-direct/range {v1 .. v6}, LA7/W0;-><init>(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    sget-object p1, Ljb/l;->l:Ljb/h;

    .line 167
    .line 168
    if-eqz p1, :cond_4

    .line 169
    .line 170
    invoke-interface {p1, v5, v1}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_4
    invoke-virtual {v1}, LA7/W0;->run()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :goto_4
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    throw p2
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lqc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object v0, p0, Ljb/l;->a:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v0, Luc/r;

    .line 6
    .line 7
    sget-object v1, Luc/x;->b:Luc/x;

    .line 8
    .line 9
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 10
    .line 11
    invoke-interface {p1}, Luc/f;->b()Lab/b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "com.tekartik.sqflite"

    .line 16
    .line 17
    invoke-direct {v0, p1, v3, v1, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ljb/l;->b:Luc/r;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Ljb/l;->a:Landroid/content/Context;

    .line 3
    .line 4
    iget-object v0, p0, Ljb/l;->b:Luc/r;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Luc/r;->b(Luc/p;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ljb/l;->b:Luc/r;

    .line 10
    .line 11
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const/4 v0, 0x5

    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x2

    .line 8
    iget-object v4, v8, Luc/o;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v9, -0x1

    .line 17
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    sparse-switch v10, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :sswitch_0
    const-string v10, "getDatabasesPath"

    .line 27
    .line 28
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    const/16 v9, 0xf

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :sswitch_1
    const-string v10, "getPlatformVersion"

    .line 41
    .line 42
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_1
    const/16 v9, 0xe

    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :sswitch_2
    const-string v10, "queryCursorNext"

    .line 55
    .line 56
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :cond_2
    const/16 v9, 0xd

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :sswitch_3
    const-string v10, "databaseExists"

    .line 69
    .line 70
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :cond_3
    const/16 v9, 0xc

    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :sswitch_4
    const-string v10, "query"

    .line 83
    .line 84
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-nez v4, :cond_4

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :cond_4
    const/16 v9, 0xb

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :sswitch_5
    const-string v10, "debug"

    .line 97
    .line 98
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_5

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :cond_5
    const/16 v9, 0xa

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :sswitch_6
    const-string v10, "batch"

    .line 111
    .line 112
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_6

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_6
    const/16 v9, 0x9

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :sswitch_7
    const-string v10, "openDatabase"

    .line 125
    .line 126
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_7

    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_7
    const/16 v9, 0x8

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :sswitch_8
    const-string v10, "debugMode"

    .line 139
    .line 140
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v4, :cond_8

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_8
    const/4 v9, 0x7

    .line 148
    goto :goto_0

    .line 149
    :sswitch_9
    const-string v10, "deleteDatabase"

    .line 150
    .line 151
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_9

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_9
    const/4 v9, 0x6

    .line 159
    goto :goto_0

    .line 160
    :sswitch_a
    const-string v10, "androidSetLocale"

    .line 161
    .line 162
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_a

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_a
    move v9, v0

    .line 170
    goto :goto_0

    .line 171
    :sswitch_b
    const-string v10, "update"

    .line 172
    .line 173
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-nez v4, :cond_b

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_b
    move v9, v2

    .line 181
    goto :goto_0

    .line 182
    :sswitch_c
    const-string v10, "insert"

    .line 183
    .line 184
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_c

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_c
    const/4 v9, 0x3

    .line 192
    goto :goto_0

    .line 193
    :sswitch_d
    const-string v10, "options"

    .line 194
    .line 195
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-nez v4, :cond_d

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_d
    move v9, v3

    .line 203
    goto :goto_0

    .line 204
    :sswitch_e
    const-string v10, "closeDatabase"

    .line 205
    .line 206
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-nez v4, :cond_e

    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_e
    move v9, v6

    .line 214
    goto :goto_0

    .line 215
    :sswitch_f
    const-string v10, "execute"

    .line 216
    .line 217
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-nez v4, :cond_f

    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_f
    move v9, v7

    .line 225
    :goto_0
    packed-switch v9, :pswitch_data_0

    .line 226
    .line 227
    .line 228
    move-object/from16 v0, p2

    .line 229
    .line 230
    check-cast v0, Ltc/g;

    .line 231
    .line 232
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :pswitch_0
    sget-object v0, Ljb/l;->h:Ljava/lang/String;

    .line 237
    .line 238
    if-nez v0, :cond_10

    .line 239
    .line 240
    const-string v0, "tekartik_sqflite.db"

    .line 241
    .line 242
    iget-object v2, v1, Ljb/l;->a:Landroid/content/Context;

    .line 243
    .line 244
    invoke-virtual {v2, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    sput-object v0, Ljb/l;->h:Ljava/lang/String;

    .line 253
    .line 254
    :cond_10
    sget-object v0, Ljb/l;->h:Ljava/lang/String;

    .line 255
    .line 256
    move-object/from16 v2, p2

    .line 257
    .line 258
    check-cast v2, Ltc/g;

    .line 259
    .line 260
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string v2, "Android "

    .line 267
    .line 268
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    move-object/from16 v2, p2

    .line 281
    .line 282
    check-cast v2, Ltc/g;

    .line 283
    .line 284
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_2
    move-object/from16 v0, p2

    .line 289
    .line 290
    check-cast v0, Ltc/g;

    .line 291
    .line 292
    invoke-static {v8, v0}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    if-nez v2, :cond_11

    .line 297
    .line 298
    goto/16 :goto_e

    .line 299
    .line 300
    :cond_11
    sget-object v3, Ljb/l;->l:Ljb/h;

    .line 301
    .line 302
    new-instance v4, Ljb/j;

    .line 303
    .line 304
    invoke-direct {v4, v8, v0, v2, v7}, Ljb/j;-><init>(Luc/o;Ltc/g;Ljb/e;I)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v3, v2, v4}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :pswitch_3
    const-string v0, "path"

    .line 312
    .line 313
    invoke-virtual {v8, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, Ljava/lang/String;

    .line 318
    .line 319
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 320
    .line 321
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 325
    .line 326
    .line 327
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 328
    :catch_0
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    move-object/from16 v2, p2

    .line 333
    .line 334
    check-cast v2, Ltc/g;

    .line 335
    .line 336
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_e

    .line 340
    .line 341
    :pswitch_4
    move-object/from16 v0, p2

    .line 342
    .line 343
    check-cast v0, Ltc/g;

    .line 344
    .line 345
    invoke-static {v8, v0}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    if-nez v2, :cond_12

    .line 350
    .line 351
    goto/16 :goto_e

    .line 352
    .line 353
    :cond_12
    sget-object v4, Ljb/l;->l:Ljb/h;

    .line 354
    .line 355
    new-instance v5, Ljb/j;

    .line 356
    .line 357
    invoke-direct {v5, v8, v0, v2, v3}, Ljb/j;-><init>(Luc/o;Ltc/g;Ljb/e;I)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v4, v2, v5}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :pswitch_5
    const-string v0, "cmd"

    .line 365
    .line 366
    invoke-virtual {v8, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, Ljava/lang/String;

    .line 371
    .line 372
    new-instance v2, Ljava/util/HashMap;

    .line 373
    .line 374
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 375
    .line 376
    .line 377
    const-string v3, "get"

    .line 378
    .line 379
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_16

    .line 384
    .line 385
    sget v0, Ljb/l;->g:I

    .line 386
    .line 387
    const-string v3, "logLevel"

    .line 388
    .line 389
    if-lez v0, :cond_13

    .line 390
    .line 391
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    :cond_13
    sget-object v0, Ljb/l;->d:Ljava/util/HashMap;

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    if-nez v4, :cond_16

    .line 405
    .line 406
    new-instance v4, Ljava/util/HashMap;

    .line 407
    .line 408
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v5, :cond_15

    .line 424
    .line 425
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    check-cast v5, Ljava/util/Map$Entry;

    .line 430
    .line 431
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    check-cast v6, Ljb/e;

    .line 436
    .line 437
    new-instance v7, Ljava/util/HashMap;

    .line 438
    .line 439
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 440
    .line 441
    .line 442
    iget-object v8, v6, Ljb/e;->b:Ljava/lang/String;

    .line 443
    .line 444
    const-string v9, "path"

    .line 445
    .line 446
    invoke-virtual {v7, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    iget-boolean v8, v6, Ljb/e;->a:Z

    .line 450
    .line 451
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    const-string v9, "singleInstance"

    .line 456
    .line 457
    invoke-virtual {v7, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    iget v6, v6, Ljb/e;->d:I

    .line 461
    .line 462
    if-lez v6, :cond_14

    .line 463
    .line 464
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    invoke-virtual {v7, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    :cond_14
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    check-cast v5, Ljava/lang/Integer;

    .line 476
    .line 477
    invoke-virtual {v5}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    goto :goto_1

    .line 485
    :cond_15
    const-string v0, "databases"

    .line 486
    .line 487
    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    :cond_16
    move-object/from16 v0, p2

    .line 491
    .line 492
    check-cast v0, Ltc/g;

    .line 493
    .line 494
    invoke-virtual {v0, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    return-void

    .line 498
    :pswitch_6
    move-object/from16 v0, p2

    .line 499
    .line 500
    check-cast v0, Ltc/g;

    .line 501
    .line 502
    invoke-static {v8, v0}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    if-nez v2, :cond_17

    .line 507
    .line 508
    goto/16 :goto_e

    .line 509
    .line 510
    :cond_17
    sget-object v3, Ljb/l;->l:Ljb/h;

    .line 511
    .line 512
    new-instance v4, Ljb/j;

    .line 513
    .line 514
    invoke-direct {v4, v2, v8, v0}, Ljb/j;-><init>(Ljb/e;Luc/o;Ltc/g;)V

    .line 515
    .line 516
    .line 517
    invoke-interface {v3, v2, v4}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :pswitch_7
    const-string v0, "Look for "

    .line 522
    .line 523
    const-string v2, "path"

    .line 524
    .line 525
    invoke-virtual {v8, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    move-object v4, v2

    .line 530
    check-cast v4, Ljava/lang/String;

    .line 531
    .line 532
    const-string v2, "readOnly"

    .line 533
    .line 534
    invoke-virtual {v8, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    check-cast v2, Ljava/lang/Boolean;

    .line 539
    .line 540
    if-eqz v4, :cond_19

    .line 541
    .line 542
    const-string v3, ":memory:"

    .line 543
    .line 544
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-eqz v3, :cond_18

    .line 549
    .line 550
    goto :goto_2

    .line 551
    :cond_18
    move v3, v7

    .line 552
    goto :goto_3

    .line 553
    :cond_19
    :goto_2
    move v3, v6

    .line 554
    :goto_3
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 555
    .line 556
    const-string v9, "singleInstance"

    .line 557
    .line 558
    invoke-virtual {v8, v9}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v9

    .line 562
    invoke-virtual {v5, v9}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    if-nez v5, :cond_1a

    .line 567
    .line 568
    if-nez v3, :cond_1a

    .line 569
    .line 570
    move v13, v6

    .line 571
    goto :goto_4

    .line 572
    :cond_1a
    move v13, v7

    .line 573
    :goto_4
    if-eqz v13, :cond_20

    .line 574
    .line 575
    sget-object v5, Ljb/l;->e:Ljava/lang/Object;

    .line 576
    .line 577
    monitor-enter v5

    .line 578
    :try_start_1
    sget v7, Ljb/l;->g:I

    .line 579
    .line 580
    invoke-static {v7}, Ljb/a;->a(I)Z

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    if-eqz v7, :cond_1b

    .line 585
    .line 586
    const-string v7, "Sqflite"

    .line 587
    .line 588
    new-instance v9, Ljava/lang/StringBuilder;

    .line 589
    .line 590
    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    const-string v0, " in "

    .line 597
    .line 598
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-static {v7, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 615
    .line 616
    .line 617
    goto :goto_5

    .line 618
    :catchall_0
    move-exception v0

    .line 619
    goto/16 :goto_8

    .line 620
    .line 621
    :cond_1b
    :goto_5
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 622
    .line 623
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    check-cast v0, Ljava/lang/Integer;

    .line 628
    .line 629
    if-eqz v0, :cond_1f

    .line 630
    .line 631
    sget-object v7, Ljb/l;->d:Ljava/util/HashMap;

    .line 632
    .line 633
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    check-cast v7, Ljb/e;

    .line 638
    .line 639
    if-eqz v7, :cond_1f

    .line 640
    .line 641
    iget-object v9, v7, Ljb/e;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 642
    .line 643
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 644
    .line 645
    .line 646
    move-result v9

    .line 647
    if-nez v9, :cond_1c

    .line 648
    .line 649
    sget v0, Ljb/l;->g:I

    .line 650
    .line 651
    invoke-static {v0}, Ljb/a;->a(I)Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    if-eqz v0, :cond_1f

    .line 656
    .line 657
    const-string v0, "Sqflite"

    .line 658
    .line 659
    new-instance v9, Ljava/lang/StringBuilder;

    .line 660
    .line 661
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v7}, Ljb/e;->h()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v7

    .line 668
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    const-string v7, "single instance database of "

    .line 672
    .line 673
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    const-string v7, " not opened"

    .line 680
    .line 681
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v7

    .line 688
    invoke-static {v0, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 689
    .line 690
    .line 691
    goto :goto_7

    .line 692
    :cond_1c
    sget v2, Ljb/l;->g:I

    .line 693
    .line 694
    invoke-static {v2}, Ljb/a;->a(I)Z

    .line 695
    .line 696
    .line 697
    move-result v2

    .line 698
    if-eqz v2, :cond_1e

    .line 699
    .line 700
    const-string v2, "Sqflite"

    .line 701
    .line 702
    new-instance v3, Ljava/lang/StringBuilder;

    .line 703
    .line 704
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v7}, Ljb/e;->h()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v8

    .line 711
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    const-string v8, "re-opened single instance "

    .line 715
    .line 716
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v7}, Ljb/e;->j()Z

    .line 720
    .line 721
    .line 722
    move-result v8

    .line 723
    if-eqz v8, :cond_1d

    .line 724
    .line 725
    const-string v8, "(in transaction) "

    .line 726
    .line 727
    goto :goto_6

    .line 728
    :cond_1d
    const-string v8, ""

    .line 729
    .line 730
    :goto_6
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    const-string v8, " "

    .line 737
    .line 738
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v3

    .line 748
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 749
    .line 750
    .line 751
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    invoke-virtual {v7}, Ljb/e;->j()Z

    .line 756
    .line 757
    .line 758
    move-result v2

    .line 759
    invoke-static {v0, v6, v2}, Ljb/l;->c(IZZ)Ljava/util/HashMap;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    move-object/from16 v2, p2

    .line 764
    .line 765
    check-cast v2, Ltc/g;

    .line 766
    .line 767
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 768
    .line 769
    .line 770
    monitor-exit v5

    .line 771
    return-void

    .line 772
    :cond_1f
    :goto_7
    monitor-exit v5

    .line 773
    goto :goto_9

    .line 774
    :goto_8
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 775
    throw v0

    .line 776
    :cond_20
    :goto_9
    sget-object v15, Ljb/l;->e:Ljava/lang/Object;

    .line 777
    .line 778
    monitor-enter v15

    .line 779
    :try_start_2
    sget v0, Ljb/l;->k:I

    .line 780
    .line 781
    add-int/lit8 v10, v0, 0x1

    .line 782
    .line 783
    sput v10, Ljb/l;->k:I

    .line 784
    .line 785
    monitor-exit v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 786
    new-instance v7, Ljb/e;

    .line 787
    .line 788
    move v12, v10

    .line 789
    iget-object v10, v1, Ljb/l;->a:Landroid/content/Context;

    .line 790
    .line 791
    sget v14, Ljb/l;->g:I

    .line 792
    .line 793
    move-object v11, v4

    .line 794
    move-object v9, v7

    .line 795
    invoke-direct/range {v9 .. v14}, Ljb/e;-><init>(Landroid/content/Context;Ljava/lang/String;IZI)V

    .line 796
    .line 797
    .line 798
    monitor-enter v15

    .line 799
    :try_start_3
    sget-object v0, Ljb/l;->l:Ljb/h;

    .line 800
    .line 801
    if-nez v0, :cond_22

    .line 802
    .line 803
    sget v0, Ljb/l;->j:I

    .line 804
    .line 805
    sget v5, Ljb/l;->i:I

    .line 806
    .line 807
    if-ne v0, v6, :cond_21

    .line 808
    .line 809
    new-instance v0, LE4/n;

    .line 810
    .line 811
    const/16 v9, 0x10

    .line 812
    .line 813
    invoke-direct {v0, v5, v9}, LE4/n;-><init>(II)V

    .line 814
    .line 815
    .line 816
    goto :goto_a

    .line 817
    :cond_21
    new-instance v9, LL8/a;

    .line 818
    .line 819
    invoke-direct {v9, v0, v5}, LL8/a;-><init>(II)V

    .line 820
    .line 821
    .line 822
    move-object v0, v9

    .line 823
    :goto_a
    sput-object v0, Ljb/l;->l:Ljb/h;

    .line 824
    .line 825
    invoke-interface {v0}, Ljb/h;->start()V

    .line 826
    .line 827
    .line 828
    iget v0, v7, Ljb/e;->d:I

    .line 829
    .line 830
    if-lt v0, v6, :cond_22

    .line 831
    .line 832
    const-string v0, "Sqflite"

    .line 833
    .line 834
    new-instance v5, Ljava/lang/StringBuilder;

    .line 835
    .line 836
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v7}, Ljb/e;->h()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v9

    .line 843
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 844
    .line 845
    .line 846
    const-string v9, "starting worker pool with priority "

    .line 847
    .line 848
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    sget v9, Ljb/l;->i:I

    .line 852
    .line 853
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 861
    .line 862
    .line 863
    goto :goto_b

    .line 864
    :catchall_1
    move-exception v0

    .line 865
    goto :goto_c

    .line 866
    :cond_22
    :goto_b
    sget-object v0, Ljb/l;->l:Ljb/h;

    .line 867
    .line 868
    iput-object v0, v7, Ljb/e;->h:Ljb/h;

    .line 869
    .line 870
    iget v0, v7, Ljb/e;->d:I

    .line 871
    .line 872
    if-lt v0, v6, :cond_23

    .line 873
    .line 874
    const-string v0, "Sqflite"

    .line 875
    .line 876
    new-instance v5, Ljava/lang/StringBuilder;

    .line 877
    .line 878
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v7}, Ljb/e;->h()Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v6

    .line 885
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 886
    .line 887
    .line 888
    const-string v6, "opened "

    .line 889
    .line 890
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    const-string v6, " "

    .line 897
    .line 898
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v5

    .line 908
    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 909
    .line 910
    .line 911
    :cond_23
    sget-object v0, Ljb/l;->l:Ljb/h;

    .line 912
    .line 913
    move-object v6, v2

    .line 914
    new-instance v2, Ljb/k;

    .line 915
    .line 916
    move-object/from16 v5, p2

    .line 917
    .line 918
    check-cast v5, Ltc/g;

    .line 919
    .line 920
    move v10, v12

    .line 921
    move v9, v13

    .line 922
    invoke-direct/range {v2 .. v10}, Ljb/k;-><init>(ZLjava/lang/String;Ltc/g;Ljava/lang/Boolean;Ljb/e;Luc/o;ZI)V

    .line 923
    .line 924
    .line 925
    invoke-interface {v0, v7, v2}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 926
    .line 927
    .line 928
    monitor-exit v15

    .line 929
    return-void

    .line 930
    :goto_c
    monitor-exit v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 931
    throw v0

    .line 932
    :catchall_2
    move-exception v0

    .line 933
    :try_start_4
    monitor-exit v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 934
    throw v0

    .line 935
    :pswitch_8
    iget-object v0, v8, Luc/o;->b:Ljava/lang/Object;

    .line 936
    .line 937
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 938
    .line 939
    invoke-virtual {v2, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 940
    .line 941
    .line 942
    move-result v0

    .line 943
    if-eqz v0, :cond_24

    .line 944
    .line 945
    if-eqz v0, :cond_25

    .line 946
    .line 947
    sput v6, Ljb/l;->g:I

    .line 948
    .line 949
    goto :goto_d

    .line 950
    :cond_24
    sput v7, Ljb/l;->g:I

    .line 951
    .line 952
    :cond_25
    :goto_d
    move-object/from16 v0, p2

    .line 953
    .line 954
    check-cast v0, Ltc/g;

    .line 955
    .line 956
    invoke-virtual {v0, v5}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    return-void

    .line 960
    :pswitch_9
    move-object/from16 v0, p2

    .line 961
    .line 962
    check-cast v0, Ltc/g;

    .line 963
    .line 964
    invoke-virtual {v1, v8, v0}, Ljb/l;->e(Luc/o;Ltc/g;)V

    .line 965
    .line 966
    .line 967
    return-void

    .line 968
    :pswitch_a
    move-object/from16 v0, p2

    .line 969
    .line 970
    check-cast v0, Ltc/g;

    .line 971
    .line 972
    invoke-static {v8, v0}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    if-nez v2, :cond_26

    .line 977
    .line 978
    goto/16 :goto_e

    .line 979
    .line 980
    :cond_26
    sget-object v3, Ljb/l;->l:Ljb/h;

    .line 981
    .line 982
    new-instance v4, Ljb/j;

    .line 983
    .line 984
    invoke-direct {v4, v8, v2, v0}, Ljb/j;-><init>(Luc/o;Ljb/e;Ltc/g;)V

    .line 985
    .line 986
    .line 987
    invoke-interface {v3, v2, v4}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 988
    .line 989
    .line 990
    return-void

    .line 991
    :pswitch_b
    move-object/from16 v2, p2

    .line 992
    .line 993
    check-cast v2, Ltc/g;

    .line 994
    .line 995
    invoke-static {v8, v2}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    if-nez v3, :cond_27

    .line 1000
    .line 1001
    goto/16 :goto_e

    .line 1002
    .line 1003
    :cond_27
    sget-object v4, Ljb/l;->l:Ljb/h;

    .line 1004
    .line 1005
    new-instance v5, Ljb/j;

    .line 1006
    .line 1007
    invoke-direct {v5, v8, v2, v3, v0}, Ljb/j;-><init>(Luc/o;Ltc/g;Ljb/e;I)V

    .line 1008
    .line 1009
    .line 1010
    invoke-interface {v4, v3, v5}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 1011
    .line 1012
    .line 1013
    return-void

    .line 1014
    :pswitch_c
    move-object/from16 v0, p2

    .line 1015
    .line 1016
    check-cast v0, Ltc/g;

    .line 1017
    .line 1018
    invoke-static {v8, v0}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    if-nez v2, :cond_28

    .line 1023
    .line 1024
    goto :goto_e

    .line 1025
    :cond_28
    sget-object v3, Ljb/l;->l:Ljb/h;

    .line 1026
    .line 1027
    new-instance v4, Ljb/j;

    .line 1028
    .line 1029
    invoke-direct {v4, v8, v0, v2, v6}, Ljb/j;-><init>(Luc/o;Ltc/g;Ljb/e;I)V

    .line 1030
    .line 1031
    .line 1032
    invoke-interface {v3, v2, v4}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 1033
    .line 1034
    .line 1035
    return-void

    .line 1036
    :pswitch_d
    const-string v0, "androidThreadPriority"

    .line 1037
    .line 1038
    invoke-virtual {v8, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    if-eqz v0, :cond_29

    .line 1043
    .line 1044
    check-cast v0, Ljava/lang/Integer;

    .line 1045
    .line 1046
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    sput v0, Ljb/l;->i:I

    .line 1051
    .line 1052
    :cond_29
    const-string v0, "androidThreadCount"

    .line 1053
    .line 1054
    invoke-virtual {v8, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    if-eqz v0, :cond_2a

    .line 1059
    .line 1060
    sget v2, Ljb/l;->j:I

    .line 1061
    .line 1062
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v2

    .line 1066
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v2

    .line 1070
    if-nez v2, :cond_2a

    .line 1071
    .line 1072
    check-cast v0, Ljava/lang/Integer;

    .line 1073
    .line 1074
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    sput v0, Ljb/l;->j:I

    .line 1079
    .line 1080
    sget-object v0, Ljb/l;->l:Ljb/h;

    .line 1081
    .line 1082
    if-eqz v0, :cond_2a

    .line 1083
    .line 1084
    invoke-interface {v0}, Ljb/h;->b()V

    .line 1085
    .line 1086
    .line 1087
    sput-object v5, Ljb/l;->l:Ljb/h;

    .line 1088
    .line 1089
    :cond_2a
    const-string v0, "logLevel"

    .line 1090
    .line 1091
    invoke-virtual {v8, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    check-cast v0, Ljava/lang/Integer;

    .line 1096
    .line 1097
    if-eqz v0, :cond_2b

    .line 1098
    .line 1099
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1100
    .line 1101
    .line 1102
    move-result v0

    .line 1103
    sput v0, Ljb/l;->g:I

    .line 1104
    .line 1105
    :cond_2b
    move-object/from16 v0, p2

    .line 1106
    .line 1107
    check-cast v0, Ltc/g;

    .line 1108
    .line 1109
    invoke-virtual {v0, v5}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1110
    .line 1111
    .line 1112
    return-void

    .line 1113
    :pswitch_e
    move-object/from16 v0, p2

    .line 1114
    .line 1115
    check-cast v0, Ltc/g;

    .line 1116
    .line 1117
    invoke-virtual {v1, v8, v0}, Ljb/l;->d(Luc/o;Ltc/g;)V

    .line 1118
    .line 1119
    .line 1120
    return-void

    .line 1121
    :pswitch_f
    move-object/from16 v0, p2

    .line 1122
    .line 1123
    check-cast v0, Ltc/g;

    .line 1124
    .line 1125
    invoke-static {v8, v0}, Ljb/l;->b(Luc/o;Ltc/g;)Ljb/e;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    if-nez v3, :cond_2c

    .line 1130
    .line 1131
    :goto_e
    return-void

    .line 1132
    :cond_2c
    sget-object v4, Ljb/l;->l:Ljb/h;

    .line 1133
    .line 1134
    new-instance v5, Ljb/j;

    .line 1135
    .line 1136
    invoke-direct {v5, v8, v0, v3, v2}, Ljb/j;-><init>(Luc/o;Ltc/g;Ljb/e;I)V

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v4, v3, v5}, Ljb/h;->a(Ljb/e;Ljava/lang/Runnable;)V

    .line 1140
    .line 1141
    .line 1142
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4ea7088b -> :sswitch_f
        -0x4ab8246d -> :sswitch_e
        -0x4a797962 -> :sswitch_d
        -0x468f3d47 -> :sswitch_c
        -0x31ffc737 -> :sswitch_b
        -0x179ee453 -> :sswitch_a
        -0xfb4dfba -> :sswitch_9
        -0xbd41d6a -> :sswitch_8
        -0x1064e1b -> :sswitch_7
        0x592d73a -> :sswitch_6
        0x5b09653 -> :sswitch_5
        0x66f18c8 -> :sswitch_4
        0x3901a9b7 -> :sswitch_3
        0x47241251 -> :sswitch_2
        0x529446af -> :sswitch_1
        0x6f17c6e7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
