.class public final synthetic LP9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP9/c;


# direct methods
.method public synthetic constructor <init>(LP9/c;I)V
    .locals 0

    .line 1
    iput p2, p0, LP9/b;->a:I

    iput-object p1, p0, LP9/b;->b:LP9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, LP9/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP9/b;->b:LP9/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v1, LP9/c;->m:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v2, v0, LP9/c;->a:Ls8/g;

    .line 15
    .line 16
    invoke-virtual {v2}, Ls8/g;->a()V

    .line 17
    .line 18
    .line 19
    iget-object v2, v2, Ls8/g;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v2}, LS3/e;->j(Landroid/content/Context;)LS3/e;

    .line 22
    .line 23
    .line 24
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :try_start_1
    iget-object v3, v0, LP9/c;->c:LS3/s;

    .line 26
    .line 27
    invoke-virtual {v3}, LS3/s;->u()LQ9/b;

    .line 28
    .line 29
    .line 30
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-virtual {v2}, LS3/e;->w()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    :try_start_3
    iget v1, v3, LQ9/b;->b:I

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v4, 0x5

    .line 45
    const/4 v5, 0x1

    .line 46
    if-ne v1, v4, :cond_1

    .line 47
    .line 48
    move v6, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v6, v2

    .line 51
    :goto_1
    if-nez v6, :cond_4

    .line 52
    .line 53
    const/4 v6, 0x3

    .line 54
    if-ne v1, v6, :cond_2

    .line 55
    .line 56
    move v2, v5

    .line 57
    :cond_2
    if-eqz v2, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget-object v1, v0, LP9/c;->d:LP9/j;

    .line 61
    .line 62
    invoke-virtual {v1, v3}, LP9/j;->a(LQ9/b;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_9

    .line 67
    .line 68
    invoke-virtual {v0, v3}, LP9/c;->c(LQ9/b;)LQ9/b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_3

    .line 73
    :catch_0
    move-exception v1

    .line 74
    goto :goto_5

    .line 75
    :cond_4
    :goto_2
    invoke-virtual {v0, v3}, LP9/c;->i(LQ9/b;)LQ9/b;

    .line 76
    .line 77
    .line 78
    move-result-object v1
    :try_end_3
    .catch LP9/e; {:try_start_3 .. :try_end_3} :catch_0

    .line 79
    :goto_3
    invoke-virtual {v0, v1}, LP9/c;->f(LQ9/b;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3, v1}, LP9/c;->m(LQ9/b;LQ9/b;)V

    .line 83
    .line 84
    .line 85
    const/4 v2, 0x4

    .line 86
    iget v3, v1, LQ9/b;->b:I

    .line 87
    .line 88
    if-ne v3, v2, :cond_5

    .line 89
    .line 90
    iget-object v2, v1, LQ9/b;->a:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, LP9/c;->l(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    iget v2, v1, LQ9/b;->b:I

    .line 96
    .line 97
    if-ne v2, v4, :cond_6

    .line 98
    .line 99
    new-instance v1, LP9/e;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, LP9/c;->j(Ljava/lang/Exception;)V

    .line 105
    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_6
    const/4 v3, 0x2

    .line 109
    if-eq v2, v3, :cond_8

    .line 110
    .line 111
    if-ne v2, v5, :cond_7

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-virtual {v0, v1}, LP9/c;->k(LQ9/b;)V

    .line 115
    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_8
    :goto_4
    new-instance v1, Ljava/io/IOException;

    .line 119
    .line 120
    const-string v2, "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."

    .line 121
    .line 122
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, LP9/c;->j(Ljava/lang/Exception;)V

    .line 126
    .line 127
    .line 128
    goto :goto_6

    .line 129
    :goto_5
    invoke-virtual {v0, v1}, LP9/c;->j(Ljava/lang/Exception;)V

    .line 130
    .line 131
    .line 132
    :cond_9
    :goto_6
    return-void

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    if-eqz v2, :cond_a

    .line 135
    .line 136
    :try_start_4
    invoke-virtual {v2}, LS3/e;->w()V

    .line 137
    .line 138
    .line 139
    :cond_a
    throw v0

    .line 140
    :goto_7
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 141
    throw v0

    .line 142
    :pswitch_0
    iget-object v0, p0, LP9/b;->b:LP9/c;

    .line 143
    .line 144
    invoke-virtual {v0}, LP9/c;->b()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_1
    iget-object v0, p0, LP9/b;->b:LP9/c;

    .line 149
    .line 150
    invoke-virtual {v0}, LP9/c;->b()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
