.class public final LX3/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lb7/k;


# direct methods
.method public synthetic constructor <init>(Lb7/k;I)V
    .locals 0

    .line 1
    iput p2, p0, LX3/d;->i:I

    iput-object p1, p0, LX3/d;->j:Lb7/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p0, LX3/d;->i:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v2, Lk4/i;->a:Lk4/i;

    .line 9
    .line 10
    iget-object v0, p0, LX3/d;->j:Lb7/k;

    .line 11
    .line 12
    iget-object v0, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    sget-object v1, Lk4/i;->b:La4/i;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, La4/a;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v3, Lcg/m;->a:Lcg/u;

    .line 27
    .line 28
    iput-object v3, v1, La4/a;->b:Lcg/u;

    .line 29
    .line 30
    const-wide v3, 0x3f947ae147ae147bL    # 0.02

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide v3, v1, La4/a;->c:D

    .line 36
    .line 37
    const-wide/32 v3, 0xa00000

    .line 38
    .line 39
    .line 40
    iput-wide v3, v1, La4/a;->d:J

    .line 41
    .line 42
    const-wide/32 v3, 0xfa00000

    .line 43
    .line 44
    .line 45
    iput-wide v3, v1, La4/a;->e:J

    .line 46
    .line 47
    sget-object v3, LEf/S;->a:LLf/e;

    .line 48
    .line 49
    sget-object v3, LLf/d;->b:LLf/d;

    .line 50
    .line 51
    iput-object v3, v1, La4/a;->f:LLf/d;

    .line 52
    .line 53
    sget-object v3, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 60
    .line 61
    .line 62
    const-string v3, "image_cache"

    .line 63
    .line 64
    invoke-static {v0, v3}, Lqf/i;->X(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v3, Lcg/y;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0}, Lad/r;->i(Ljava/io/File;)Lcg/y;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, La4/a;->a:Lcg/y;

    .line 75
    .line 76
    invoke-virtual {v1}, La4/a;->a()La4/i;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sput-object v1, Lk4/i;->b:La4/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto :goto_1

    .line 85
    :cond_0
    :goto_0
    monitor-exit v2

    .line 86
    return-object v1

    .line 87
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    throw v0

    .line 89
    :pswitch_0
    new-instance v2, Lf4/a;

    .line 90
    .line 91
    iget-object v3, p0, LX3/d;->j:Lb7/k;

    .line 92
    .line 93
    iget-object v3, v3, Lb7/k;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Landroid/content/Context;

    .line 96
    .line 97
    invoke-direct {v2, v3}, Lf4/a;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    iget-boolean v4, v2, Lf4/a;->d:Z

    .line 101
    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    new-instance v4, LA/x;

    .line 105
    .line 106
    const/16 v5, 0xe

    .line 107
    .line 108
    invoke-direct {v4, v1, v5}, LA/x;-><init>(BI)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    new-instance v4, Lae/d;

    .line 113
    .line 114
    const/4 v5, 0x5

    .line 115
    invoke-direct {v4, v5}, Lae/d;-><init>(I)V

    .line 116
    .line 117
    .line 118
    :goto_2
    iget-boolean v5, v2, Lf4/a;->c:Z

    .line 119
    .line 120
    if-eqz v5, :cond_5

    .line 121
    .line 122
    iget-wide v5, v2, Lf4/a;->b:D

    .line 123
    .line 124
    const-wide/16 v7, 0x0

    .line 125
    .line 126
    cmpl-double v2, v5, v7

    .line 127
    .line 128
    if-lez v2, :cond_3

    .line 129
    .line 130
    sget-object v1, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 131
    .line 132
    :try_start_2
    const-class v1, Landroid/app/ActivityManager;

    .line 133
    .line 134
    invoke-static {v3, v1}, LY0/e;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    check-cast v1, Landroid/app/ActivityManager;

    .line 142
    .line 143
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 148
    .line 149
    const/high16 v3, 0x100000

    .line 150
    .line 151
    and-int/2addr v2, v3

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    goto :goto_3

    .line 159
    :cond_2
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 160
    .line 161
    .line 162
    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 163
    goto :goto_3

    .line 164
    :catch_0
    const/16 v1, 0x100

    .line 165
    .line 166
    :goto_3
    int-to-double v1, v1

    .line 167
    mul-double/2addr v5, v1

    .line 168
    const/16 v1, 0x400

    .line 169
    .line 170
    int-to-double v1, v1

    .line 171
    mul-double/2addr v5, v1

    .line 172
    mul-double/2addr v5, v1

    .line 173
    double-to-int v1, v5

    .line 174
    :cond_3
    if-lez v1, :cond_4

    .line 175
    .line 176
    new-instance v0, LX2/j;

    .line 177
    .line 178
    invoke-direct {v0, v1, v4}, LX2/j;-><init>(ILf4/i;)V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_4
    new-instance v1, Lad/L;

    .line 183
    .line 184
    invoke-direct {v1, v4, v0}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 185
    .line 186
    .line 187
    :goto_4
    move-object v0, v1

    .line 188
    goto :goto_5

    .line 189
    :cond_5
    new-instance v1, Lad/L;

    .line 190
    .line 191
    invoke-direct {v1, v4, v0}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :goto_5
    new-instance v1, Lf4/e;

    .line 196
    .line 197
    invoke-direct {v1, v0, v4}, Lf4/e;-><init>(Lf4/h;Lf4/i;)V

    .line 198
    .line 199
    .line 200
    return-object v1

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
