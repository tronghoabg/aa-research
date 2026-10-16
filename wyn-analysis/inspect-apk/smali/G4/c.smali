.class public final LG4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/f;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 1
    iput-object p1, p0, LG4/c;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LG4/c;->a:Landroid/content/Context;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LG4/c;->a:Landroid/content/Context;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ltg/b;)V
    .locals 8

    .line 1
    new-instance v7, LQ1/w;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-direct {v7, v0, v1}, LQ1/w;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 10
    .line 11
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 14
    .line 15
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 16
    .line 17
    .line 18
    const-wide/16 v3, 0xf

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lr9/k;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v1, p0, p1, v0, v2}, Lr9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LG4/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "open(...)"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    new-instance v1, Ljava/io/InputStreamReader;

    .line 19
    .line 20
    invoke-direct {v1, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Ljava/io/BufferedReader;

    .line 24
    .line 25
    const/16 v0, 0x2000

    .line 26
    .line 27
    invoke-direct {p1, v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-static {p1}, LFe/c;->C(Ljava/io/Reader;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    invoke-static {p1, v0}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw v1
.end method

.method public c()Lt5/j;
    .locals 14

    .line 1
    iget-object v0, p0, LG4/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lt5/j;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lt5/m;->a:Lt5/n;

    .line 11
    .line 12
    invoke-static {v2}, Lv5/a;->a(Lv5/b;)Ldf/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, v1, Lt5/j;->a:Ldf/a;

    .line 17
    .line 18
    new-instance v2, LA5/e;

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    invoke-direct {v2, v0, v3}, LA5/e;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    iput-object v2, v1, Lt5/j;->b:LA5/e;

    .line 25
    .line 26
    new-instance v0, LA5/e;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v0, v2, v3}, LA5/e;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    new-instance v3, LA5/n;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-direct {v3, v2, v0, v4}, LA5/n;-><init>(Lv5/b;Ldf/a;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Lv5/a;->a(Lv5/b;)Ldf/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, v1, Lt5/j;->c:Ldf/a;

    .line 43
    .line 44
    iget-object v0, v1, Lt5/j;->b:LA5/e;

    .line 45
    .line 46
    new-instance v2, LA5/e;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct {v2, v0, v3}, LA5/e;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    iput-object v2, v1, Lt5/j;->d:LA5/e;

    .line 53
    .line 54
    new-instance v2, LA5/e;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v2, v0, v3}, LA5/e;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, Lv5/a;->a(Lv5/b;)Ldf/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v2, v1, Lt5/j;->d:LA5/e;

    .line 65
    .line 66
    new-instance v3, LA5/n;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {v3, v2, v0, v4}, LA5/n;-><init>(Lv5/b;Ldf/a;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v3}, Lv5/a;->a(Lv5/b;)Ldf/a;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    iput-object v8, v1, Lt5/j;->e:Ldf/a;

    .line 77
    .line 78
    new-instance v0, Lt5/n;

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-direct {v0, v2}, Lt5/n;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, Lt5/j;->b:LA5/e;

    .line 85
    .line 86
    new-instance v9, Lt5/s;

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    invoke-direct {v9, v2, v8, v0, v3}, Lt5/s;-><init>(Lv5/b;Ldf/a;Lv5/b;I)V

    .line 90
    .line 91
    .line 92
    iget-object v6, v1, Lt5/j;->a:Ldf/a;

    .line 93
    .line 94
    iget-object v7, v1, Lt5/j;->c:Ldf/a;

    .line 95
    .line 96
    new-instance v5, Ly5/b;

    .line 97
    .line 98
    move-object v10, v8

    .line 99
    move-object v13, v9

    .line 100
    move-object v9, v8

    .line 101
    move-object v8, v13

    .line 102
    invoke-direct/range {v5 .. v10}, Ly5/b;-><init>(Ldf/a;Ldf/a;Lt5/s;Ldf/a;Ldf/a;)V

    .line 103
    .line 104
    .line 105
    move-object v0, v9

    .line 106
    move-object v9, v8

    .line 107
    move-object v8, v0

    .line 108
    move-object v0, v5

    .line 109
    new-instance v5, Lz5/g;

    .line 110
    .line 111
    move-object v11, v8

    .line 112
    move-object v12, v8

    .line 113
    move-object v10, v6

    .line 114
    move-object v6, v2

    .line 115
    invoke-direct/range {v5 .. v12}, Lz5/g;-><init>(LA5/e;Ldf/a;Ldf/a;Lt5/s;Ldf/a;Ldf/a;Ldf/a;)V

    .line 116
    .line 117
    .line 118
    move-object v6, v10

    .line 119
    new-instance v2, Lz5/i;

    .line 120
    .line 121
    invoke-direct {v2, v6, v8, v9, v8}, Lz5/i;-><init>(Ldf/a;Ldf/a;Lt5/s;Ldf/a;)V

    .line 122
    .line 123
    .line 124
    new-instance v3, Lt5/s;

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    invoke-direct {v3, v0, v5, v2, v4}, Lt5/s;-><init>(Lv5/b;Ldf/a;Lv5/b;I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, Lv5/a;->a(Lv5/b;)Ldf/a;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, v1, Lt5/j;->f:Ldf/a;

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-class v2, Landroid/content/Context;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v2, " must be set"

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0
.end method
