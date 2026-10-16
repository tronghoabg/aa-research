.class public final LFe/h;
.super Landroidx/fragment/app/F;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "LFe/h;",
        "Landroidx/fragment/app/F;",
        "",
        "<init>",
        "()V",
        "",
        "message",
        "Lef/C;",
        "jsMessageReceived",
        "(Ljava/lang/String;)V",
        "nocodes_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:LFe/a;

.field public final b:Lac/a;

.field public final c:Lre/c;

.field public d:LX2/j;


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct/range {p0 .. p0}, Landroidx/fragment/app/F;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v2, LX2/j;->d:LX2/j;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const-string v8, "instance"

    .line 10
    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    iget-object v2, v2, LX2/j;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, LW9/u;

    .line 16
    .line 17
    new-instance v3, LFe/m;

    .line 18
    .line 19
    iget-object v4, v2, LW9/u;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, LX2/j;

    .line 22
    .line 23
    new-instance v5, LCe/a;

    .line 24
    .line 25
    iget-object v6, v4, LX2/j;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Lne/a;

    .line 28
    .line 29
    new-instance v9, Lba/a;

    .line 30
    .line 31
    new-instance v10, LC8/i;

    .line 32
    .line 33
    iget-object v11, v6, Lne/a;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v11, La2/c;

    .line 36
    .line 37
    new-instance v12, La2/v;

    .line 38
    .line 39
    iget-object v11, v11, La2/c;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v11, Landroid/app/Application;

    .line 42
    .line 43
    const-string v13, "io.qonversion.nocodes"

    .line 44
    .line 45
    invoke-virtual {v11, v13, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    const-string v13, "getSharedPreferences(...)"

    .line 50
    .line 51
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/16 v13, 0x8

    .line 55
    .line 56
    invoke-direct {v12, v11, v13}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    iget-object v11, v6, Lne/a;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v11, Lme/a;

    .line 62
    .line 63
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    const-string v13, "getDefault(...)"

    .line 71
    .line 72
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v13, v6, Lne/a;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v13, LC8/i;

    .line 78
    .line 79
    invoke-direct {v10, v12, v11, v13}, LC8/i;-><init>(La2/v;Ljava/util/Locale;LC8/i;)V

    .line 80
    .line 81
    .line 82
    iget-object v11, v13, LC8/i;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v11, Lk3/p;

    .line 85
    .line 86
    iget-object v11, v11, Lk3/p;->a:Ljava/lang/String;

    .line 87
    .line 88
    if-nez v11, :cond_0

    .line 89
    .line 90
    const-string v11, "https://api2.qonversion.io/"

    .line 91
    .line 92
    :cond_0
    const/16 v12, 0x1d

    .line 93
    .line 94
    invoke-direct {v9, v10, v1, v11, v12}, Lba/a;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    new-instance v18, La9/b;

    .line 98
    .line 99
    invoke-direct/range {v18 .. v18}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v13, LC8/i;

    .line 103
    .line 104
    new-instance v14, Lv6/l;

    .line 105
    .line 106
    iget-object v1, v6, Lne/a;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Lme/a;

    .line 109
    .line 110
    new-instance v10, Landroidx/fragment/app/X;

    .line 111
    .line 112
    invoke-direct {v10, v0}, Landroidx/fragment/app/X;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v14, v10}, Lv6/l;-><init>(Landroidx/fragment/app/X;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v15, Lad/r;

    .line 122
    .line 123
    sget-object v1, Lxf/d;->a:Lxf/a;

    .line 124
    .line 125
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    new-instance v17, Lab/b;

    .line 129
    .line 130
    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v1, v6, Lne/a;->a:Ljava/lang/Object;

    .line 134
    .line 135
    move-object/from16 v16, v1

    .line 136
    .line 137
    check-cast v16, LC8/i;

    .line 138
    .line 139
    invoke-direct/range {v13 .. v18}, LC8/i;-><init>(Lv6/l;Lad/r;LC8/i;Lab/b;La9/b;)V

    .line 140
    .line 141
    .line 142
    new-instance v1, La2/k;

    .line 143
    .line 144
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    iget-object v4, v4, LX2/j;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v4, Lme/a;

    .line 150
    .line 151
    invoke-virtual {v4}, Lme/a;->D()Lac/a;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-direct {v5, v9, v13, v1, v4}, LCe/a;-><init>(Lba/a;LC8/i;Lge/a;Lac/a;)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v2, LW9/u;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Lme/a;

    .line 161
    .line 162
    move-object v2, v3

    .line 163
    invoke-virtual {v1}, Lme/a;->D()Lac/a;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iget-object v1, v1, Lme/a;->b:Ljava/lang/Object;

    .line 168
    .line 169
    move-object v4, v1

    .line 170
    check-cast v4, LC8/i;

    .line 171
    .line 172
    move-object v1, v5

    .line 173
    new-instance v5, Landroidx/fragment/app/X;

    .line 174
    .line 175
    invoke-direct {v5, v0}, Landroidx/fragment/app/X;-><init>(I)V

    .line 176
    .line 177
    .line 178
    new-instance v6, Landroidx/fragment/app/X;

    .line 179
    .line 180
    const/4 v0, 0x6

    .line 181
    invoke-direct {v6, v0}, Landroidx/fragment/app/X;-><init>(I)V

    .line 182
    .line 183
    .line 184
    move-object v0, v2

    .line 185
    move-object/from16 v2, p0

    .line 186
    .line 187
    invoke-direct/range {v0 .. v6}, LFe/m;-><init>(LCe/a;LFe/h;Lac/a;LC8/i;Landroidx/fragment/app/X;Lge/a;)V

    .line 188
    .line 189
    .line 190
    iput-object v0, v2, LFe/h;->a:LFe/a;

    .line 191
    .line 192
    sget-object v0, LX2/j;->d:LX2/j;

    .line 193
    .line 194
    if-eqz v0, :cond_2

    .line 195
    .line 196
    iget-object v0, v0, LX2/j;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lme/a;

    .line 199
    .line 200
    invoke-virtual {v0}, Lme/a;->D()Lac/a;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iput-object v0, v2, LFe/h;->b:Lac/a;

    .line 205
    .line 206
    sget-object v0, LX2/j;->d:LX2/j;

    .line 207
    .line 208
    if-eqz v0, :cond_1

    .line 209
    .line 210
    iget-object v0, v0, LX2/j;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lme/a;

    .line 213
    .line 214
    iget-object v0, v0, Lme/a;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, LC8/i;

    .line 217
    .line 218
    iget-object v0, v0, LC8/i;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lre/c;

    .line 221
    .line 222
    iput-object v0, v2, LFe/h;->c:Lre/c;

    .line 223
    .line 224
    return-void

    .line 225
    :cond_1
    invoke-static {v8}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v7

    .line 229
    :cond_2
    invoke-static {v8}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v7

    .line 233
    :cond_3
    move-object/from16 v2, p0

    .line 234
    .line 235
    invoke-static {v8}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v7
.end method

.method public static final G(LFe/h;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lae/f;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, LG9/e;

    .line 5
    .line 6
    sget-object v1, Lbe/a;->l:Lbe/a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2, p2}, LG9/e;-><init>(Lbe/a;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p3, Lae/f;->c:LG9/e;

    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QonversionError;->getDescription()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p0, p1, p2, p3}, LFe/h;->I(Ljava/lang/String;Ljava/lang/String;Lae/f;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final H(Lae/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, LFe/h;->d:LX2/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, LX2/j;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly3/j;

    .line 9
    .line 10
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/widget/ProgressBar;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/16 v2, 0x8

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v2, v0, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    move-object v1, v0

    .line 33
    check-cast v1, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;

    .line 34
    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    if-eqz v1, :cond_6

    .line 37
    .line 38
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v3, v2, Landroidx/fragment/app/e0;->d:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iget-object v2, v2, Landroidx/fragment/app/e0;->h:Landroidx/fragment/app/a;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    move v2, v4

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move v2, v0

    .line 56
    :goto_2
    add-int/2addr v3, v2

    .line 57
    if-nez v3, :cond_4

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v4, v0

    .line 61
    :goto_3
    if-eqz v4, :cond_5

    .line 62
    .line 63
    invoke-virtual {v1}, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;->finish()V

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/e0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v2, Landroidx/fragment/app/c0;

    .line 75
    .line 76
    const/4 v3, -0x1

    .line 77
    invoke-direct {v2, v1, v3, v0}, Landroidx/fragment/app/c0;-><init>(Landroidx/fragment/app/e0;II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/e0;->x(Landroidx/fragment/app/b0;Z)V

    .line 81
    .line 82
    .line 83
    :goto_4
    move v0, v4

    .line 84
    :cond_6
    iget-object v1, p0, LFe/h;->c:Lre/c;

    .line 85
    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    invoke-virtual {v1, p1}, Lre/c;->e(Lae/f;)V

    .line 89
    .line 90
    .line 91
    :cond_7
    if-eqz v0, :cond_8

    .line 92
    .line 93
    if-eqz v1, :cond_8

    .line 94
    .line 95
    invoke-virtual {v1}, Lre/c;->c()V

    .line 96
    .line 97
    .line 98
    :cond_8
    return-void
.end method

.method public final I(Ljava/lang/String;Ljava/lang/String;Lae/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, LFe/h;->d:LX2/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LX2/j;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ly3/j;

    .line 8
    .line 9
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroid/widget/ProgressBar;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    :goto_1
    const-string v0, "ScreenActivity "

    .line 24
    .line 25
    const-string v1, " -> "

    .line 26
    .line 27
    invoke-static {v0, p1, v1, p2}, LN0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, LFe/h;->b:Lac/a;

    .line 32
    .line 33
    invoke-static {p2, p1}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LFe/h;->c:Lre/c;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1, p3}, Lre/c;->b(Lae/f;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final jsMessageReceived(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "JSMessage"

    .line 7
    .line 8
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, LC8/d;

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    invoke-direct {v1, v2, p0, p1}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const p3, 0x7f0d00aa

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const p2, 0x7f0a0218

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p1}, Lvf/a;->q(ILandroid/view/View;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    const-string v0, "Missing required view with ID: "

    .line 22
    .line 23
    if-eqz p3, :cond_2

    .line 24
    .line 25
    const p2, 0x7f0a0217

    .line 26
    .line 27
    .line 28
    invoke-static {p2, p3}, Lvf/a;->q(ILandroid/view/View;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/widget/ProgressBar;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    new-instance p2, Ly3/j;

    .line 37
    .line 38
    check-cast p3, Landroid/widget/LinearLayout;

    .line 39
    .line 40
    const/16 p3, 0x1c

    .line 41
    .line 42
    invoke-direct {p2, v1, p3}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    move-object p3, p1

    .line 46
    check-cast p3, Landroid/widget/RelativeLayout;

    .line 47
    .line 48
    const v1, 0x7f0a02c9

    .line 49
    .line 50
    .line 51
    invoke-static {v1, p1}, Lvf/a;->q(ILandroid/view/View;)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Landroid/webkit/WebView;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    new-instance p1, LX2/j;

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    invoke-direct {p1, p3, p2, v2, v0}, LX2/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, LFe/h;->d:LX2/j;

    .line 66
    .line 67
    const-string p1, "getRoot(...)"

    .line 68
    .line 69
    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object p3

    .line 73
    :cond_0
    move p2, v1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p2

    .line 93
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance p2, Ljava/lang/NullPointerException;

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p2
.end method

.method public final onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/F;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LFe/h;->d:LX2/j;

    .line 6
    .line 7
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LFe/h;->d:LX2/j;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, LX2/j;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/webkit/WebView;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, p2

    .line 21
    :goto_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 26
    .line 27
    .line 28
    :goto_1
    iget-object p1, p0, LFe/h;->d:LX2/j;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p1, LX2/j;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Landroid/webkit/WebView;

    .line 35
    .line 36
    const-string v0, "NoCodesMessageHandler"

    .line 37
    .line 38
    invoke-virtual {p1, p0, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, LFe/h;->d:LX2/j;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    iget-object p1, p1, LX2/j;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Landroid/webkit/WebView;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move-object p1, p2

    .line 51
    :goto_2
    if-nez p1, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v0, 0x8

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :goto_3
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getArguments()Landroid/os/Bundle;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    const-string v0, "contextKey"

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_4

    .line 72
    :cond_5
    move-object p1, p2

    .line 73
    :goto_4
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getArguments()Landroid/os/Bundle;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    const-string v1, "screenId"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_5

    .line 86
    :cond_6
    move-object v0, p2

    .line 87
    :goto_5
    iget-object v1, p0, LFe/h;->a:LFe/a;

    .line 88
    .line 89
    check-cast v1, LFe/m;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v2, LFe/l;

    .line 95
    .line 96
    invoke-direct {v2, v1, p1, v0, p2}, LFe/l;-><init>(LFe/m;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v1, LFe/m;->g:LEf/E;

    .line 100
    .line 101
    const/4 v0, 0x3

    .line 102
    invoke-static {p1, p2, v2, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 103
    .line 104
    .line 105
    return-void
.end method
