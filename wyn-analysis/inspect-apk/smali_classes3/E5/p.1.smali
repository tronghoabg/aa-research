.class public final synthetic LE5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, LE5/p;->a:I

    iput-object p1, p0, LE5/p;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, LE5/p;->b:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lo2/g;->n:Ll8/e0;

    .line 4
    .line 5
    const-class v1, Lo2/g;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v2, Lo2/g;->t:Lo2/g;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-instance v2, LLc/b;

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-direct {v2, v0, v3}, LLc/b;-><init>(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    new-instance v4, Lo2/g;

    .line 19
    .line 20
    iget-object v0, v2, LLc/b;->d:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v6, v0

    .line 23
    check-cast v6, Ljava/util/HashMap;

    .line 24
    .line 25
    iget-object v0, v2, LLc/b;->e:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v8, v0

    .line 28
    check-cast v8, LQ1/q;

    .line 29
    .line 30
    iget-boolean v9, v2, LLc/b;->a:Z

    .line 31
    .line 32
    iget-object v0, v2, LLc/b;->c:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v5, v0

    .line 35
    check-cast v5, Landroid/content/Context;

    .line 36
    .line 37
    iget v7, v2, LLc/b;->b:I

    .line 38
    .line 39
    invoke-direct/range {v4 .. v9}, Lo2/g;-><init>(Landroid/content/Context;Ljava/util/HashMap;ILQ1/q;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v4, Lo2/g;->t:Lo2/g;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :goto_0
    sget-object v0, Lo2/g;->t:Lo2/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    monitor-exit v1

    .line 50
    return-object v0

    .line 51
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw v0
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LE5/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk2/v;

    .line 7
    .line 8
    new-instance v1, Ls2/k;

    .line 9
    .line 10
    invoke-direct {v1}, Ls2/k;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, LE5/p;->b:Landroid/content/Context;

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Lk2/v;-><init>(Landroid/content/Context;Ls2/k;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, LU1/i;

    .line 20
    .line 21
    iget-object v1, p0, LE5/p;->b:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {v0, v1}, LU1/i;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_1
    invoke-direct {p0}, LE5/p;->a()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_2
    new-instance v0, Ln2/o;

    .line 33
    .line 34
    iget-object v1, p0, LE5/p;->b:Landroid/content/Context;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ln2/o;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_3
    new-instance v0, Lk2/v;

    .line 41
    .line 42
    new-instance v1, Ls2/k;

    .line 43
    .line 44
    invoke-direct {v1}, Ls2/k;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, LE5/p;->b:Landroid/content/Context;

    .line 48
    .line 49
    invoke-direct {v0, v2, v1}, Lk2/v;-><init>(Landroid/content/Context;Ls2/k;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    iget-object v0, p0, LE5/p;->b:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "audio"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Landroid/media/AudioManager;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_5
    iget-object v0, p0, LE5/p;->b:Landroid/content/Context;

    .line 72
    .line 73
    sget-object v1, Lt6/p;->n:Ll8/e0;

    .line 74
    .line 75
    const-class v1, Lt6/p;

    .line 76
    .line 77
    monitor-enter v1

    .line 78
    :try_start_0
    sget-object v2, Lt6/p;->t:Lt6/p;

    .line 79
    .line 80
    if-nez v2, :cond_0

    .line 81
    .line 82
    new-instance v2, LLc/b;

    .line 83
    .line 84
    const/4 v3, 0x4

    .line 85
    invoke-direct {v2, v0, v3}, LLc/b;-><init>(Landroid/content/Context;I)V

    .line 86
    .line 87
    .line 88
    new-instance v4, Lt6/p;

    .line 89
    .line 90
    iget-object v0, v2, LLc/b;->d:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v6, v0

    .line 93
    check-cast v6, Ljava/util/HashMap;

    .line 94
    .line 95
    iget-object v0, v2, LLc/b;->e:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v8, v0

    .line 98
    check-cast v8, Lu6/q;

    .line 99
    .line 100
    iget-boolean v9, v2, LLc/b;->a:Z

    .line 101
    .line 102
    iget-object v0, v2, LLc/b;->c:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v5, v0

    .line 105
    check-cast v5, Landroid/content/Context;

    .line 106
    .line 107
    iget v7, v2, LLc/b;->b:I

    .line 108
    .line 109
    invoke-direct/range {v4 .. v9}, Lt6/p;-><init>(Landroid/content/Context;Ljava/util/HashMap;ILu6/q;Z)V

    .line 110
    .line 111
    .line 112
    sput-object v4, Lt6/p;->t:Lt6/p;

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    goto :goto_1

    .line 117
    :cond_0
    :goto_0
    sget-object v0, Lt6/p;->t:Lt6/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    monitor-exit v1

    .line 120
    return-object v0

    .line 121
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    throw v0

    .line 123
    :pswitch_6
    new-instance v0, Lr6/l;

    .line 124
    .line 125
    iget-object v1, p0, LE5/p;->b:Landroid/content/Context;

    .line 126
    .line 127
    invoke-direct {v0, v1}, Lr6/l;-><init>(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_7
    new-instance v0, Lf6/m;

    .line 132
    .line 133
    new-instance v1, LJ5/i;

    .line 134
    .line 135
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    new-instance v2, Lt6/q;

    .line 139
    .line 140
    iget-object v3, p0, LE5/p;->b:Landroid/content/Context;

    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    invoke-direct {v2, v3, v4}, Lt6/q;-><init>(Landroid/content/Context;I)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v2, v1}, Lf6/m;-><init>(Lt6/k;LJ5/i;)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_8
    new-instance v0, LE5/m;

    .line 151
    .line 152
    iget-object v1, p0, LE5/p;->b:Landroid/content/Context;

    .line 153
    .line 154
    invoke-direct {v0, v1}, LE5/m;-><init>(Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    nop

    .line 159
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
