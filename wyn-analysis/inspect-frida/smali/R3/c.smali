.class public final LR3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, LR3/c;->a:I

    iput-object p1, p0, LR3/c;->c:Ljava/lang/Object;

    iput p2, p0, LR3/c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    const/4 p3, 0x7

    iput p3, p0, LR3/c;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string p3, "initCallbacks cannot be null"

    invoke-static {p1, p3}, Lj1/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, LR3/c;->c:Ljava/lang/Object;

    .line 5
    iput p2, p0, LR3/c;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LR3/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, LR3/c;->b:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    :goto_0
    if-ge v4, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ly1/e;

    .line 27
    .line 28
    invoke-virtual {v2}, Ly1/e;->a()V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    :goto_1
    if-ge v4, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ly1/e;

    .line 41
    .line 42
    invoke-virtual {v2}, Ly1/e;->b()V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lod/I0;

    .line 52
    .line 53
    iget-object v0, v0, Lod/I0;->f:Lmd/f;

    .line 54
    .line 55
    iget v1, p0, LR3/c;->b:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lmd/f;->c(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_1
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lpd/j;

    .line 64
    .line 65
    :try_start_0
    invoke-static {}, LXd/b;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 66
    .line 67
    .line 68
    :try_start_1
    sget-object v1, LXd/b;->a:LXd/a;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, Lod/a;->a:Lod/W0;

    .line 74
    .line 75
    iget v3, p0, LR3/c;->b:I

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    if-lez v3, :cond_2

    .line 81
    .line 82
    const/4 v4, 0x1

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const/4 v4, 0x0

    .line 85
    :goto_2
    const-string v5, "numMessages must be > 0"

    .line 86
    .line 87
    invoke-static {v5, v4}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lod/W0;->isClosed()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    iget-wide v4, v2, Lod/W0;->m:J

    .line 98
    .line 99
    int-to-long v6, v3

    .line 100
    add-long/2addr v4, v6

    .line 101
    iput-wide v4, v2, Lod/W0;->m:J

    .line 102
    .line 103
    invoke-virtual {v2}, Lod/W0;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    :goto_3
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :catchall_0
    move-exception v1

    .line 111
    :try_start_3
    sget-object v2, LXd/b;->a:LXd/a;

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :catchall_1
    move-exception v2

    .line 118
    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :goto_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 122
    :catchall_2
    move-exception v1

    .line 123
    invoke-virtual {v0, v1}, Lpd/j;->n(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :goto_5
    return-void

    .line 127
    :pswitch_2
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, LE9/d;

    .line 130
    .line 131
    iget-object v0, v0, LE9/d;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Ll4/g;

    .line 134
    .line 135
    iget-object v1, v0, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 138
    .line 139
    .line 140
    iget-object v0, v0, Ll4/g;->c:Ll4/e;

    .line 141
    .line 142
    iget-object v0, v0, Ll4/e;->z:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 143
    .line 144
    iget v1, p0, LR3/c;->b:I

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPosition(I)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_3
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, La2/v;

    .line 153
    .line 154
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, La1/b;

    .line 157
    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    iget v1, p0, LR3/c;->b:I

    .line 161
    .line 162
    invoke-virtual {v0, v1}, La1/b;->j(I)V

    .line 163
    .line 164
    .line 165
    :cond_4
    return-void

    .line 166
    :pswitch_4
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Lcom/google/android/material/datepicker/k;

    .line 169
    .line 170
    iget-object v0, v0, Lcom/google/android/material/datepicker/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    iget v1, p0, LR3/c;->b:I

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :pswitch_5
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 181
    .line 182
    iget v1, p0, LR3/c;->b:I

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/H;->f(I)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_6
    iget-object v0, p0, LR3/c;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 191
    .line 192
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->e:Landroid/app/NotificationManager;

    .line 193
    .line 194
    iget v1, p0, LR3/c;->b:I

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
