.class public final LWa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/t;


# static fields
.field public static final j:I

.field public static final k:I


# instance fields
.field public final a:Landroid/app/Activity;

.field public b:LWa/h;

.field public c:Z

.field public d:Z

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Ljava/util/ArrayList;

.field public h:Luc/h;

.field public i:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, LWa/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, 0x2b

    .line 8
    .line 9
    const v2, 0xffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    sput v1, LWa/b;->j:I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, 0x53

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    sput v0, LWa/b;->k:I

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LWa/b;->a:Landroid/app/Activity;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, LWa/b;->b:LWa/h;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LWa/b;->h:Luc/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LWa/b;->e:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "dir"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, LG5/o;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v1, v2, p0, p1}, LG5/o;-><init>(ILjava/lang/Object;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LWa/b;->a(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LWa/b;->b:LWa/h;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v1, p0, LWa/b;->b:LWa/h;

    .line 14
    .line 15
    return-void
.end method

.method public final c(Ljava/io/Serializable;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LWa/b;->a(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, LWa/b;->b:LWa/h;

    .line 6
    .line 7
    if-eqz v1, :cond_8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    instance-of v3, p1, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, v2

    .line 19
    :goto_0
    if-nez v3, :cond_7

    .line 20
    .line 21
    :cond_1
    instance-of v3, p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    check-cast p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object p1, v2

    .line 29
    :goto_1
    if-eqz p1, :cond_6

    .line 30
    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_7

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    instance-of v5, v4, LWa/a;

    .line 51
    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    check-cast v4, LWa/a;

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move-object v4, v2

    .line 58
    :goto_3
    if-eqz v4, :cond_5

    .line 59
    .line 60
    new-instance v5, Lef/k;

    .line 61
    .line 62
    const-string v6, "path"

    .line 63
    .line 64
    iget-object v7, v4, LWa/a;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v5, v6, v7}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance v6, Lef/k;

    .line 70
    .line 71
    const-string v7, "name"

    .line 72
    .line 73
    iget-object v8, v4, LWa/a;->b:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v6, v7, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v7, Lef/k;

    .line 79
    .line 80
    iget-wide v8, v4, LWa/a;->d:J

    .line 81
    .line 82
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    const-string v9, "size"

    .line 87
    .line 88
    invoke-direct {v7, v9, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance v8, Lef/k;

    .line 92
    .line 93
    const-string v9, "bytes"

    .line 94
    .line 95
    iget-object v10, v4, LWa/a;->e:[B

    .line 96
    .line 97
    invoke-direct {v8, v9, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v9, Lef/k;

    .line 101
    .line 102
    iget-object v4, v4, LWa/a;->c:Landroid/net/Uri;

    .line 103
    .line 104
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    const-string v10, "identifier"

    .line 109
    .line 110
    invoke-direct {v9, v10, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    const/4 v4, 0x5

    .line 114
    new-array v4, v4, [Lef/k;

    .line 115
    .line 116
    aput-object v5, v4, v0

    .line 117
    .line 118
    const/4 v5, 0x1

    .line 119
    aput-object v6, v4, v5

    .line 120
    .line 121
    const/4 v5, 0x2

    .line 122
    aput-object v7, v4, v5

    .line 123
    .line 124
    const/4 v5, 0x3

    .line 125
    aput-object v8, v4, v5

    .line 126
    .line 127
    const/4 v5, 0x4

    .line 128
    aput-object v9, v4, v5

    .line 129
    .line 130
    invoke-static {v4}, Lff/A;->Q([Lef/k;)Ljava/util/HashMap;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    goto :goto_4

    .line 135
    :cond_5
    move-object v4, v2

    .line 136
    :goto_4
    if-eqz v4, :cond_3

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    move-object v3, v2

    .line 143
    :cond_7
    invoke-virtual {v1, v3}, LWa/h;->a(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iput-object v2, p0, LWa/b;->b:LWa/h;

    .line 147
    .line 148
    :cond_8
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 11

    .line 1
    sget v0, LWa/b;->k:I

    .line 2
    .line 3
    iget-object v4, p0, LWa/b;->a:Landroid/app/Activity;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    const/4 v10, 0x0

    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne p1, v0, :cond_6

    .line 10
    .line 11
    if-eq p2, v1, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    invoke-virtual {p0, v10}, LWa/b;->c(Ljava/io/Serializable;)V

    .line 17
    .line 18
    .line 19
    return v2

    .line 20
    :cond_1
    if-eqz p3, :cond_2

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    :cond_2
    if-nez v10, :cond_3

    .line 27
    .line 28
    :goto_0
    move v9, v2

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    invoke-virtual {p0, v9}, LWa/b;->a(Z)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object p1, p0, LWa/b;->i:[B

    .line 34
    .line 35
    const-string p2, "context"

    .line 36
    .line 37
    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2, v10}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 45
    .line 46
    .line 47
    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    if-eqz p2, :cond_5

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    move-object p3, v0

    .line 61
    :try_start_3
    invoke-static {p2, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw p3

    .line 65
    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    .line 66
    .line 67
    .line 68
    :cond_5
    invoke-virtual {v10}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, LWa/b;->c(Ljava/io/Serializable;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catch_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    const-string p2, "FilePickerDelegate"

    .line 79
    .line 80
    const-string p3, "Error while saving file"

    .line 81
    .line 82
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p0, p3, p1}, LWa/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_2
    return v9

    .line 94
    :cond_6
    sget v0, LWa/b;->j:I

    .line 95
    .line 96
    if-ne p1, v0, :cond_a

    .line 97
    .line 98
    if-eq p2, v1, :cond_8

    .line 99
    .line 100
    if-eqz p2, :cond_7

    .line 101
    .line 102
    :goto_3
    return v2

    .line 103
    :cond_7
    invoke-virtual {p0, v10}, LWa/b;->c(Ljava/io/Serializable;)V

    .line 104
    .line 105
    .line 106
    return v9

    .line 107
    :cond_8
    invoke-virtual {p0, v9}, LWa/b;->a(Z)V

    .line 108
    .line 109
    .line 110
    iget v5, p0, LWa/b;->f:I

    .line 111
    .line 112
    iget-boolean v6, p0, LWa/b;->d:Z

    .line 113
    .line 114
    iget-object p1, p0, LWa/b;->e:Ljava/lang/String;

    .line 115
    .line 116
    if-nez p1, :cond_9

    .line 117
    .line 118
    const-string p1, ""

    .line 119
    .line 120
    :cond_9
    move-object v7, p1

    .line 121
    const-string p1, "activity"

    .line 122
    .line 123
    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    sget-object p1, LEf/S;->a:LLf/e;

    .line 127
    .line 128
    sget-object p1, LLf/d;->b:LLf/d;

    .line 129
    .line 130
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance v1, LWa/f;

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    move-object v3, p0

    .line 138
    move-object v2, p3

    .line 139
    invoke-direct/range {v1 .. v8}, LWa/f;-><init>(Landroid/content/Intent;LWa/b;Landroid/app/Activity;IZLjava/lang/String;Ljf/c;)V

    .line 140
    .line 141
    .line 142
    const/4 p2, 0x3

    .line 143
    invoke-static {p1, v10, v1, p2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 144
    .line 145
    .line 146
    return v9

    .line 147
    :cond_a
    move-object v3, p0

    .line 148
    const-string p1, "unknown_activity"

    .line 149
    .line 150
    const-string p2, "Unknown activity error, please file an issue."

    .line 151
    .line 152
    invoke-virtual {p0, p1, p2}, LWa/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return v2
.end method
