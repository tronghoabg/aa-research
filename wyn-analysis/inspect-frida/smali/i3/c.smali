.class public final synthetic Li3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Li3/c;->a:I

    iput-object p1, p0, Li3/c;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Li3/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x21

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-lt v0, v1, :cond_5

    .line 12
    .line 13
    new-instance v0, Landroid/content/ComponentName;

    .line 14
    .line 15
    iget-object v1, p0, Li3/c;->b:Landroid/content/Context;

    .line 16
    .line 17
    const-string v3, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 18
    .line 19
    invoke-direct {v0, v1, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eq v3, v2, :cond_5

    .line 31
    .line 32
    invoke-static {}, Lg1/a;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const-string v4, "locale"

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    sget-object v3, Lj/l;->g:Lx/f;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v5, Lx/a;

    .line 46
    .line 47
    invoke-direct {v5, v3}, Lx/a;-><init>(Lx/f;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {v5}, Lx/a;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {v5}, Lx/a;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lj/l;

    .line 67
    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    check-cast v3, Lj/w;

    .line 71
    .line 72
    iget-object v3, v3, Lj/w;->k:Landroid/content/Context;

    .line 73
    .line 74
    if-eqz v3, :cond_0

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const/4 v3, 0x0

    .line 82
    :goto_0
    if-eqz v3, :cond_3

    .line 83
    .line 84
    invoke-static {v3}, Lj/k;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v5, Lg1/d;

    .line 89
    .line 90
    new-instance v6, Lg1/g;

    .line 91
    .line 92
    invoke-direct {v6, v3}, Lg1/g;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {v5, v6}, Lg1/d;-><init>(Lg1/f;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    sget-object v5, Lj/l;->c:Lg1/d;

    .line 100
    .line 101
    if-eqz v5, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    sget-object v5, Lg1/d;->b:Lg1/d;

    .line 105
    .line 106
    :goto_1
    iget-object v3, v5, Lg1/d;->a:Lg1/f;

    .line 107
    .line 108
    invoke-interface {v3}, Lg1/f;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    invoke-static {v1}, LA6/h;->G(Landroid/content/Context;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-static {v3}, Lj/j;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v4, v3}, Lj/k;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1, v0, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 136
    .line 137
    .line 138
    :cond_5
    sput-boolean v2, Lj/l;->f:Z

    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_0
    new-instance v0, Lcom/applovin/impl/T0;

    .line 142
    .line 143
    const/4 v1, 0x1

    .line 144
    invoke-direct {v0, v1}, Lcom/applovin/impl/T0;-><init>(I)V

    .line 145
    .line 146
    .line 147
    sget-object v1, Li3/b;->a:Lad/r;

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    iget-object v3, p0, Li3/c;->b:Landroid/content/Context;

    .line 151
    .line 152
    invoke-static {v3, v0, v1, v2}, Li3/b;->s(Landroid/content/Context;Ljava/util/concurrent/Executor;Li3/a;Z)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_1
    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 157
    .line 158
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 159
    .line 160
    new-instance v10, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 161
    .line 162
    invoke-direct {v10}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 163
    .line 164
    .line 165
    const/4 v6, 0x1

    .line 166
    const-wide/16 v7, 0x0

    .line 167
    .line 168
    const/4 v5, 0x0

    .line 169
    invoke-direct/range {v4 .. v10}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 170
    .line 171
    .line 172
    new-instance v0, Li3/c;

    .line 173
    .line 174
    iget-object v1, p0, Li3/c;->b:Landroid/content/Context;

    .line 175
    .line 176
    const/4 v2, 0x1

    .line 177
    invoke-direct {v0, v1, v2}, Li3/c;-><init>(Landroid/content/Context;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
