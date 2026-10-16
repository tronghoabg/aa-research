.class public final Lcom/moloco/sdk/internal/publisher/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/publisher/AdLoad;


# instance fields
.field public final a:Ltf/l;

.field public final b:Ljava/lang/String;

.field public final c:Lkotlin/jvm/internal/i;

.field public final d:Lcom/moloco/sdk/internal/ortb/e;

.field public final e:Landroidx/fragment/app/X;

.field public final f:Lcom/moloco/sdk/publisher/AdFormatType;

.field public final g:Lcom/moloco/sdk/internal/services/l;

.field public final h:Lcom/moloco/sdk/acm/recorder/c;

.field public final i:Ltf/a;

.field public final j:LKd/a;

.field public k:Z

.field public l:Ljava/lang/String;

.field public m:Lcom/moloco/sdk/internal/ortb/model/y;

.field public final n:Lcom/moloco/sdk/acm/l;

.field public o:LEf/H0;


# direct methods
.method public constructor <init>(LKd/a;Ltf/l;Ljava/lang/String;Ltf/l;Lcom/moloco/sdk/internal/ortb/e;Landroidx/fragment/app/X;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/internal/services/l;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)V
    .locals 1

    .line 1
    const-string v0, "adUnitId"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parseBidResponse"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "adFormatType"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "webViewChecker"

    .line 17
    .line 18
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/B;->a:Ltf/l;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 27
    .line 28
    check-cast p4, Lkotlin/jvm/internal/i;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/B;->c:Lkotlin/jvm/internal/i;

    .line 31
    .line 32
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/B;->d:Lcom/moloco/sdk/internal/ortb/e;

    .line 33
    .line 34
    iput-object p6, p0, Lcom/moloco/sdk/internal/publisher/B;->e:Landroidx/fragment/app/X;

    .line 35
    .line 36
    iput-object p7, p0, Lcom/moloco/sdk/internal/publisher/B;->f:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 37
    .line 38
    iput-object p8, p0, Lcom/moloco/sdk/internal/publisher/B;->g:Lcom/moloco/sdk/internal/services/l;

    .line 39
    .line 40
    iput-object p9, p0, Lcom/moloco/sdk/internal/publisher/B;->h:Lcom/moloco/sdk/acm/recorder/c;

    .line 41
    .line 42
    iput-object p10, p0, Lcom/moloco/sdk/internal/publisher/B;->i:Ltf/a;

    .line 43
    .line 44
    sget-object p2, LEf/S;->a:LLf/e;

    .line 45
    .line 46
    sget-object p2, LJf/n;->a:LFf/e;

    .line 47
    .line 48
    invoke-static {p1, p2}, LEf/H;->F(LEf/E;Ljf/f;)LKd/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/B;->j:LKd/a;

    .line 53
    .line 54
    sget-object p1, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 55
    .line 56
    const-string p1, "load_ad_time"

    .line 57
    .line 58
    invoke-virtual {p9, p1}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/B;->n:Lcom/moloco/sdk/acm/l;

    .line 63
    .line 64
    return-void
.end method

.method public static final a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p1, Lcom/moloco/sdk/internal/ortb/model/y;->a:Ljava/util/List;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/moloco/sdk/internal/ortb/model/f;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lcom/moloco/sdk/internal/ortb/model/f;->a:Ljava/util/List;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public static final b(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/moloco/sdk/internal/publisher/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/w;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/w;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/w;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/w;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/internal/publisher/w;-><init>(Lcom/moloco/sdk/internal/publisher/B;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/moloco/sdk/internal/publisher/w;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/w;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/moloco/sdk/internal/publisher/w;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, Lcom/moloco/sdk/internal/publisher/w;->a:Ljava/lang/String;

    .line 54
    .line 55
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/w;->d:I

    .line 56
    .line 57
    iget-object p0, p0, Lcom/moloco/sdk/internal/publisher/B;->e:Landroidx/fragment/app/X;

    .line 58
    .line 59
    sget-object p2, LEf/S;->a:LLf/e;

    .line 60
    .line 61
    new-instance v2, Lcom/moloco/sdk/internal/publisher/W;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v2, p0, p1, v3}, Lcom/moloco/sdk/internal/publisher/W;-><init>(Landroidx/fragment/app/X;Ljava/lang/String;Ljf/c;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p2, v2, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 75
    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    return-object p2

    .line 79
    :cond_4
    return-object p1
.end method


# virtual methods
.method public final isLoaded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final load(Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;)V
    .locals 15

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    const-string v0, "bidResponseJson"

    .line 6
    .line 7
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/B;->g:Lcom/moloco/sdk/internal/services/l;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-boolean v0, Lx3/j;->a:Z

    .line 16
    .line 17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v4, 0x1a

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    if-lt v0, v4, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lx4/g;->b()Landroid/content/pm/PackageInfo;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    invoke-static {}, Lx3/j;->b()Landroid/content/pm/PackageInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-object v0, v7

    .line 35
    :goto_0
    iget-object v4, v1, Lcom/moloco/sdk/internal/services/l;->a:Landroid/content/Context;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_1
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v5, 0x17

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    if-gt v0, v5, :cond_2

    .line 46
    .line 47
    const-string v0, "android.webkit.WebViewFactory"

    .line 48
    .line 49
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v5, "getWebViewPackageName"

    .line 54
    .line 55
    new-array v8, v6, [Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v0, v5, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-array v5, v6, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const-string v0, "android.webkit.WebViewUpdateService"

    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v5, "getCurrentWebViewPackageName"

    .line 77
    .line 78
    new-array v8, v6, [Ljava/lang/Class;

    .line 79
    .line 80
    invoke-virtual {v0, v5, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-array v5, v6, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 91
    .line 92
    :goto_1
    if-nez v0, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    :try_start_2
    invoke-virtual {v5, v0, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 100
    .line 101
    .line 102
    move-result-object v0
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 103
    goto :goto_3

    .line 104
    :catch_1
    :goto_2
    move-object v0, v7

    .line 105
    :goto_3
    const/4 v8, 0x3

    .line 106
    if-nez v0, :cond_4

    .line 107
    .line 108
    const-string v0, "no_package"

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/internal/services/l;->a(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, Ljava/lang/Exception;

    .line 114
    .line 115
    const-string v1, "No current WebView package exists"

    .line 116
    .line 117
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    goto :goto_4

    .line 125
    :cond_4
    :try_start_3
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getApplicationEnabledSetting(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2

    .line 135
    const/4 v4, 0x2

    .line 136
    if-eq v0, v4, :cond_7

    .line 137
    .line 138
    if-eq v0, v8, :cond_6

    .line 139
    .line 140
    const/4 v4, 0x4

    .line 141
    if-eq v0, v4, :cond_5

    .line 142
    .line 143
    sget-object v0, Lef/C;->a:Lef/C;

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    const-string v0, "disabled_until_used"

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/internal/services/l;->a(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v0, Ljava/lang/Exception;

    .line 152
    .line 153
    const-string v1, "WebView component is disabled until used"

    .line 154
    .line 155
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    goto :goto_4

    .line 163
    :cond_6
    const-string v0, "disabled_by_user"

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/internal/services/l;->a(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Ljava/lang/Exception;

    .line 169
    .line 170
    const-string v1, "WebView component is disabled by user"

    .line 171
    .line 172
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    goto :goto_4

    .line 180
    :cond_7
    const-string v0, "disabled_by_system"

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/internal/services/l;->a(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    new-instance v0, Ljava/lang/Exception;

    .line 186
    .line 187
    const-string v1, "WebView component is disabled by system"

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    goto :goto_4

    .line 197
    :catch_2
    move-exception v0

    .line 198
    const-string v4, "unknown_package"

    .line 199
    .line 200
    invoke-virtual {v1, v4}, Lcom/moloco/sdk/internal/services/l;->a(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    :goto_4
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-eqz v0, :cond_9

    .line 212
    .line 213
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 214
    .line 215
    new-instance v2, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v4, "WebView Error: "

    .line 218
    .line 219
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const-string v4, "AdLoad"

    .line 234
    .line 235
    const/4 v5, 0x1

    .line 236
    invoke-virtual {v1, v4, v2, v0, v5}, Lcom/moloco/sdk/internal/MolocoLogger;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 237
    .line 238
    .line 239
    if-eqz v3, :cond_8

    .line 240
    .line 241
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 242
    .line 243
    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_WEBVIEW_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 244
    .line 245
    invoke-static {v0, v1}, Lcom/moloco/sdk/publisher/MolocoAdErrorKt;->createAdErrorInfo(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)Lcom/moloco/sdk/publisher/MolocoAdError;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-interface {v3, v0}, Lcom/moloco/sdk/publisher/AdLoad$Listener;->onAdLoadFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V

    .line 250
    .line 251
    .line 252
    :cond_8
    return-void

    .line 253
    :cond_9
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->b()Lcom/moloco/sdk/internal/services/k;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 261
    .line 262
    .line 263
    move-result-wide v4

    .line 264
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 265
    .line 266
    const-string v0, "load() called with bidResponseJson: "

    .line 267
    .line 268
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    const-string v10, "AdLoadImpl"

    .line 273
    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x4

    .line 276
    const/4 v14, 0x0

    .line 277
    invoke-static/range {v9 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/B;->n:Lcom/moloco/sdk/acm/l;

    .line 281
    .line 282
    iget-object v0, v0, Lcom/moloco/sdk/acm/l;->a:Lcom/moloco/sdk/acm/services/f;

    .line 283
    .line 284
    iget-object v0, v0, Lcom/moloco/sdk/acm/services/f;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 285
    .line 286
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 287
    .line 288
    .line 289
    move-result-wide v9

    .line 290
    invoke-virtual {v0, v9, v10}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 294
    .line 295
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 296
    .line 297
    const-string v1, "load_ad_attempted"

    .line 298
    .line 299
    invoke-direct {v0, v1}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 303
    .line 304
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/B;->f:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 311
    .line 312
    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    const-string v6, "toLowerCase(...)"

    .line 317
    .line 318
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    const-string v6, "ad_type"

    .line 322
    .line 323
    invoke-virtual {v0, v6, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/B;->h:Lcom/moloco/sdk/acm/recorder/c;

    .line 327
    .line 328
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 329
    .line 330
    .line 331
    new-instance v0, Lcom/moloco/sdk/internal/publisher/v;

    .line 332
    .line 333
    const/4 v6, 0x0

    .line 334
    move-object v1, p0

    .line 335
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/v;-><init>(Lcom/moloco/sdk/internal/publisher/B;Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;JLjf/c;)V

    .line 336
    .line 337
    .line 338
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/B;->j:LKd/a;

    .line 339
    .line 340
    invoke-static {v2, v7, v0, v8}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 341
    .line 342
    .line 343
    return-void
.end method
