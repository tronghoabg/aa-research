.class public Lio/flutter/embedding/android/FlutterFragmentActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "SourceFile"

# interfaces
.implements Lkc/h;
.implements Lkc/g;


# static fields
.field public static final c:I


# instance fields
.field public b:Lkc/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lio/flutter/embedding/android/FlutterFragmentActivity;->c:I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/FragmentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/flutter/embedding/android/FlutterFragmentActivity;->D()Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v2, "io.flutter.EntrypointUri"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    :catch_0
    :cond_0
    return-object v0
.end method

.method public final C()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "background_mode"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lka/n;->u(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method public final D()Landroid/os/Bundle;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x80

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    .line 16
    .line 17
    return-object v0
.end method

.method public final a()Llc/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final b(Llc/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lkc/l;->b:Lkc/f;

    .line 6
    .line 7
    iget-boolean v0, v0, Lkc/f;->f:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, LA6/h;->H(Llc/b;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final c(Llc/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "route"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :try_start_0
    invoke-virtual {p0}, Lio/flutter/embedding/android/FlutterFragmentActivity;->D()Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const-string v2, "io.flutter.InitialRoute"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :catch_0
    :cond_1
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "android.intent.action.RUN"

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    return-object v0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lkc/l;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onBackPressed()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 2
    .line 3
    const-string v1, "onBackPressed"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkc/l;->G(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lkc/l;->b:Lkc/f;

    .line 12
    .line 13
    invoke-virtual {v0}, Lkc/f;->c()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lkc/f;->b:Llc/b;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Llc/b;->i:Lac/a;

    .line 21
    .line 22
    iget-object v0, v0, Lac/a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Luc/r;

    .line 25
    .line 26
    const-string v1, "popRoute"

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v1, v2, v2}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 34
    .line 35
    const-string v1, "Invoked onBackPressed() before FlutterFragment was attached to an Activity."

    .line 36
    .line 37
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    :try_start_0
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->D()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    const-string v3, "io.flutter.embedding.android.NormalTheme"

    .line 11
    .line 12
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eq v2, v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/content/Context;->setTheme(I)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    const-string v2, "FlutterFragmentActivity"

    .line 23
    .line 24
    const-string v3, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme."

    .line 25
    .line 26
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "flutter_fragment"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e0;->C(Ljava/lang/String;)Landroidx/fragment/app/F;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lkc/l;

    .line 40
    .line 41
    iput-object v2, v1, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 42
    .line 43
    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->C()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v4, 0x2

    .line 51
    const/4 v5, 0x0

    .line 52
    if-ne v2, v4, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 59
    .line 60
    invoke-direct {v6, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v6}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    new-instance v2, Landroid/widget/FrameLayout;

    .line 67
    .line 68
    invoke-direct {v2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    sget v6, Lio/flutter/embedding/android/FlutterFragmentActivity;->c:I

    .line 72
    .line 73
    invoke-virtual {v2, v6}, Landroid/view/View;->setId(I)V

    .line 74
    .line 75
    .line 76
    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    .line 77
    .line 78
    invoke-direct {v7, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const/high16 v2, -0x80000000

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const/16 v2, 0x500

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v1, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 111
    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0, v3}, Landroidx/fragment/app/e0;->C(Ljava/lang/String;)Landroidx/fragment/app/F;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lkc/l;

    .line 123
    .line 124
    iput-object v0, v1, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 125
    .line 126
    :cond_2
    iget-object v0, v1, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 127
    .line 128
    if-nez v0, :cond_f

    .line 129
    .line 130
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->C()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->C()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    const/4 v7, 0x1

    .line 139
    if-ne v2, v7, :cond_3

    .line 140
    .line 141
    move v2, v7

    .line 142
    goto :goto_1

    .line 143
    :cond_3
    move v2, v4

    .line 144
    :goto_1
    if-ne v0, v7, :cond_4

    .line 145
    .line 146
    move v0, v7

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move v0, v4

    .line 149
    :goto_2
    if-ne v2, v7, :cond_5

    .line 150
    .line 151
    move v8, v7

    .line 152
    goto :goto_3

    .line 153
    :cond_5
    move v8, v5

    .line 154
    :goto_3
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    const-string v10, "cached_engine_id"

    .line 159
    .line 160
    invoke-virtual {v9, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    const-string v11, "flutter_deeplinking_enabled"

    .line 165
    .line 166
    const-string v12, ")"

    .line 167
    .line 168
    const-string v13, "Could not instantiate FlutterFragment subclass ("

    .line 169
    .line 170
    const-string v14, ") does not match the expected return type."

    .line 171
    .line 172
    const-string v15, "The FlutterFragment subclass sent in the constructor ("

    .line 173
    .line 174
    const-class v4, Lkc/l;

    .line 175
    .line 176
    if-eqz v9, :cond_8

    .line 177
    .line 178
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v9, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    const-string v7, "destroy_engine_with_activity"

    .line 190
    .line 191
    invoke-virtual {v9, v7, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-virtual {v9, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    sget v16, Lkc/l;->e:I

    .line 203
    .line 204
    :try_start_1
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->D()Landroid/os/Bundle;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    if-eqz v5, :cond_6

    .line 209
    .line 210
    invoke-virtual {v5, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v17

    .line 214
    if-eqz v17, :cond_6

    .line 215
    .line 216
    invoke-virtual {v5, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v5
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 220
    goto :goto_4

    .line 221
    :cond_6
    const/4 v5, 0x1

    .line 222
    goto :goto_4

    .line 223
    :catch_1
    const/4 v5, 0x0

    .line 224
    :goto_4
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    move-object/from16 v17, v3

    .line 229
    .line 230
    const/4 v3, 0x0

    .line 231
    invoke-virtual {v11, v7, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    :try_start_2
    new-array v11, v3, [Ljava/lang/Class;

    .line 236
    .line 237
    invoke-virtual {v4, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    move/from16 v18, v6

    .line 242
    .line 243
    new-array v6, v3, [Ljava/lang/Object;

    .line 244
    .line 245
    invoke-virtual {v11, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    check-cast v3, Lkc/l;

    .line 250
    .line 251
    if-eqz v3, :cond_7

    .line 252
    .line 253
    new-instance v6, Landroid/os/Bundle;

    .line 254
    .line 255
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v6, v10, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    const-string v9, "destroy_engine_with_fragment"

    .line 262
    .line 263
    invoke-virtual {v6, v9, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 264
    .line 265
    .line 266
    const-string v7, "handle_deeplinking"

    .line 267
    .line 268
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 269
    .line 270
    .line 271
    invoke-static {v2}, Lka/n;->r(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    const-string v5, "flutterview_render_mode"

    .line 276
    .line 277
    invoke-virtual {v6, v5, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0}, Lka/n;->s(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const-string v2, "flutterview_transparency_mode"

    .line 285
    .line 286
    invoke-virtual {v6, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    const-string v0, "should_attach_engine_to_activity"

    .line 290
    .line 291
    const/4 v2, 0x1

    .line 292
    invoke-virtual {v6, v0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 293
    .line 294
    .line 295
    const-string v0, "should_automatically_handle_on_back_pressed"

    .line 296
    .line 297
    invoke-virtual {v6, v0, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 298
    .line 299
    .line 300
    const-string v0, "should_delay_first_android_view_draw"

    .line 301
    .line 302
    invoke-virtual {v6, v0, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v6}, Landroidx/fragment/app/F;->setArguments(Landroid/os/Bundle;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_9

    .line 309
    .line 310
    :catch_2
    move-exception v0

    .line 311
    goto :goto_5

    .line 312
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 313
    .line 314
    new-instance v2, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 337
    :goto_5
    new-instance v2, Ljava/lang/RuntimeException;

    .line 338
    .line 339
    new-instance v3, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    throw v2

    .line 362
    :cond_8
    move-object/from16 v17, v3

    .line 363
    .line 364
    move/from16 v18, v6

    .line 365
    .line 366
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    const-string v5, "cached_engine_group_id"

    .line 371
    .line 372
    invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->s()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->A()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    if-eqz v3, :cond_9

    .line 383
    .line 384
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->A()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    :cond_9
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->l()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->n()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    if-eqz v3, :cond_c

    .line 402
    .line 403
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    sget v5, Lkc/l;->e:I

    .line 412
    .line 413
    new-instance v5, Lkc/k;

    .line 414
    .line 415
    invoke-direct {v5, v3}, Lkc/k;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->s()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    iput-object v3, v5, Lkc/k;->b:Ljava/lang/String;

    .line 423
    .line 424
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->l()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    iput-object v3, v5, Lkc/k;->c:Ljava/lang/String;

    .line 429
    .line 430
    :try_start_3
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->D()Landroid/os/Bundle;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    if-eqz v3, :cond_a

    .line 435
    .line 436
    invoke-virtual {v3, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    if-eqz v6, :cond_a

    .line 441
    .line 442
    invoke-virtual {v3, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 443
    .line 444
    .line 445
    move-result v3
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 446
    goto :goto_6

    .line 447
    :cond_a
    const/4 v3, 0x1

    .line 448
    goto :goto_6

    .line 449
    :catch_3
    const/4 v3, 0x0

    .line 450
    :goto_6
    iput-boolean v3, v5, Lkc/k;->d:Z

    .line 451
    .line 452
    iput v2, v5, Lkc/k;->e:I

    .line 453
    .line 454
    iput v0, v5, Lkc/k;->f:I

    .line 455
    .line 456
    iput-boolean v8, v5, Lkc/k;->h:Z

    .line 457
    .line 458
    const/4 v2, 0x1

    .line 459
    iput-boolean v2, v5, Lkc/k;->g:Z

    .line 460
    .line 461
    const/4 v3, 0x0

    .line 462
    :try_start_4
    new-array v0, v3, [Ljava/lang/Class;

    .line 463
    .line 464
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    new-array v2, v3, [Ljava/lang/Object;

    .line 469
    .line 470
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    move-object v3, v0

    .line 475
    check-cast v3, Lkc/l;

    .line 476
    .line 477
    if-eqz v3, :cond_b

    .line 478
    .line 479
    invoke-virtual {v5}, Lkc/k;->a()Landroid/os/Bundle;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v3, v0}, Landroidx/fragment/app/F;->setArguments(Landroid/os/Bundle;)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_9

    .line 487
    .line 488
    :catch_4
    move-exception v0

    .line 489
    goto :goto_7

    .line 490
    :cond_b
    new-instance v0, Ljava/lang/RuntimeException;

    .line 491
    .line 492
    new-instance v2, Ljava/lang/StringBuilder;

    .line 493
    .line 494
    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 515
    :goto_7
    new-instance v2, Ljava/lang/RuntimeException;

    .line 516
    .line 517
    new-instance v3, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 537
    .line 538
    .line 539
    throw v2

    .line 540
    :cond_c
    sget v3, Lkc/l;->e:I

    .line 541
    .line 542
    new-instance v3, Lkc/j;

    .line 543
    .line 544
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 545
    .line 546
    .line 547
    const-string v5, "main"

    .line 548
    .line 549
    iput-object v5, v3, Lkc/j;->a:Ljava/lang/String;

    .line 550
    .line 551
    const/4 v5, 0x0

    .line 552
    iput-object v5, v3, Lkc/j;->b:Ljava/lang/String;

    .line 553
    .line 554
    const-string v6, "/"

    .line 555
    .line 556
    iput-object v6, v3, Lkc/j;->d:Ljava/lang/String;

    .line 557
    .line 558
    const/4 v6, 0x0

    .line 559
    iput-boolean v6, v3, Lkc/j;->e:Z

    .line 560
    .line 561
    iput-object v5, v3, Lkc/j;->f:Ljava/lang/String;

    .line 562
    .line 563
    iput-object v5, v3, Lkc/j;->g:La2/v;

    .line 564
    .line 565
    const/4 v5, 0x1

    .line 566
    iput v5, v3, Lkc/j;->h:I

    .line 567
    .line 568
    const/4 v5, 0x2

    .line 569
    iput v5, v3, Lkc/j;->i:I

    .line 570
    .line 571
    iput-boolean v6, v3, Lkc/j;->j:Z

    .line 572
    .line 573
    iput-boolean v6, v3, Lkc/j;->k:Z

    .line 574
    .line 575
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->s()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v5

    .line 579
    iput-object v5, v3, Lkc/j;->a:Ljava/lang/String;

    .line 580
    .line 581
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->A()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    iput-object v5, v3, Lkc/j;->b:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    const-string v6, "dart_entrypoint_args"

    .line 592
    .line 593
    invoke-virtual {v5, v6}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    check-cast v5, Ljava/util/List;

    .line 598
    .line 599
    iput-object v5, v3, Lkc/j;->c:Ljava/util/List;

    .line 600
    .line 601
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->l()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v5

    .line 605
    iput-object v5, v3, Lkc/j;->d:Ljava/lang/String;

    .line 606
    .line 607
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->n()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    iput-object v5, v3, Lkc/j;->f:Ljava/lang/String;

    .line 612
    .line 613
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 614
    .line 615
    .line 616
    move-result-object v5

    .line 617
    invoke-static {v5}, La2/v;->v(Landroid/content/Intent;)La2/v;

    .line 618
    .line 619
    .line 620
    move-result-object v5

    .line 621
    iput-object v5, v3, Lkc/j;->g:La2/v;

    .line 622
    .line 623
    :try_start_5
    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterFragmentActivity;->D()Landroid/os/Bundle;

    .line 624
    .line 625
    .line 626
    move-result-object v5

    .line 627
    if-eqz v5, :cond_d

    .line 628
    .line 629
    invoke-virtual {v5, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 630
    .line 631
    .line 632
    move-result v6

    .line 633
    if-eqz v6, :cond_d

    .line 634
    .line 635
    invoke-virtual {v5, v11}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 636
    .line 637
    .line 638
    move-result v5
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 639
    goto :goto_8

    .line 640
    :cond_d
    const/4 v5, 0x1

    .line 641
    goto :goto_8

    .line 642
    :catch_5
    const/4 v5, 0x0

    .line 643
    :goto_8
    iput-boolean v5, v3, Lkc/j;->e:Z

    .line 644
    .line 645
    iput v2, v3, Lkc/j;->h:I

    .line 646
    .line 647
    iput v0, v3, Lkc/j;->i:I

    .line 648
    .line 649
    iput-boolean v8, v3, Lkc/j;->k:Z

    .line 650
    .line 651
    const/4 v2, 0x1

    .line 652
    iput-boolean v2, v3, Lkc/j;->j:Z

    .line 653
    .line 654
    const/4 v6, 0x0

    .line 655
    :try_start_6
    new-array v0, v6, [Ljava/lang/Class;

    .line 656
    .line 657
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    new-array v2, v6, [Ljava/lang/Object;

    .line 662
    .line 663
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    check-cast v0, Lkc/l;

    .line 668
    .line 669
    if-eqz v0, :cond_e

    .line 670
    .line 671
    invoke-virtual {v3}, Lkc/j;->a()Landroid/os/Bundle;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    invoke-virtual {v0, v2}, Landroidx/fragment/app/F;->setArguments(Landroid/os/Bundle;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 676
    .line 677
    .line 678
    move-object v3, v0

    .line 679
    :goto_9
    iput-object v3, v1, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 680
    .line 681
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    new-instance v2, Landroidx/fragment/app/a;

    .line 689
    .line 690
    invoke-direct {v2, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/e0;)V

    .line 691
    .line 692
    .line 693
    iget-object v0, v1, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 694
    .line 695
    move-object/from16 v3, v17

    .line 696
    .line 697
    move/from16 v4, v18

    .line 698
    .line 699
    const/4 v5, 0x1

    .line 700
    invoke-virtual {v2, v4, v0, v3, v5}, Landroidx/fragment/app/a;->e(ILandroidx/fragment/app/F;Ljava/lang/String;I)V

    .line 701
    .line 702
    .line 703
    const/4 v3, 0x0

    .line 704
    invoke-virtual {v2, v3}, Landroidx/fragment/app/a;->d(Z)I

    .line 705
    .line 706
    .line 707
    goto :goto_b

    .line 708
    :catch_6
    move-exception v0

    .line 709
    goto :goto_a

    .line 710
    :cond_e
    :try_start_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 711
    .line 712
    new-instance v2, Ljava/lang/StringBuilder;

    .line 713
    .line 714
    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 735
    :goto_a
    new-instance v2, Ljava/lang/RuntimeException;

    .line 736
    .line 737
    new-instance v3, Ljava/lang/StringBuilder;

    .line 738
    .line 739
    invoke-direct {v3, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v4

    .line 746
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 757
    .line 758
    .line 759
    throw v2

    .line 760
    :cond_f
    :goto_b
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 2
    .line 3
    const-string v1, "onNewIntent"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkc/l;->G(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lkc/l;->b:Lkc/f;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lkc/f;->j(Landroid/content/Intent;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 5
    .line 6
    const-string v1, "onPostResume"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lkc/l;->G(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lkc/l;->b:Lkc/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Lkc/f;->k()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lkc/l;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onTrimMemory(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lkc/l;->onTrimMemory(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onUserLeaveHint()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterFragmentActivity;->b:Lkc/l;

    .line 2
    .line 3
    const-string v1, "onUserLeaveHint"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkc/l;->G(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lkc/l;->b:Lkc/f;

    .line 12
    .line 13
    invoke-virtual {v0}, Lkc/f;->r()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final s()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "main"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lio/flutter/embedding/android/FlutterFragmentActivity;->D()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v2, "io.flutter.Entrypoint"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :catch_0
    :cond_1
    return-object v0
.end method
