.class public final LB9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:LN9/a;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:LB9/f;


# direct methods
.method public constructor <init>(LB9/f;LN9/a;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB9/b;->c:LB9/f;

    .line 5
    .line 6
    iput-object p2, p0, LB9/b;->a:LN9/a;

    .line 7
    .line 8
    iput-object p3, p0, LB9/b;->b:Landroid/app/Activity;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object p1, p0, LB9/b;->c:LB9/f;

    .line 2
    .line 3
    iget-object v0, p1, LB9/f;->k:Lz9/E;

    .line 4
    .line 5
    iget-object v1, p0, LB9/b;->a:LN9/a;

    .line 6
    .line 7
    iget-object v2, v1, LN9/a;->a:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    const-string v0, "Calling callback for click action"

    .line 12
    .line 13
    invoke-static {v0}, LD9/e;->e(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, LB9/f;->k:Lz9/E;

    .line 17
    .line 18
    check-cast v0, LJ9/o;

    .line 19
    .line 20
    iget-object v3, v0, LJ9/o;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, LJ9/i;

    .line 23
    .line 24
    invoke-virtual {v3}, LJ9/i;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    sget-object v1, Lz9/C;->c:Lz9/C;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, LJ9/o;->f(Lz9/C;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v3, "Attempting to record: message click to metrics logger"

    .line 39
    .line 40
    invoke-static {v3}, Lic/d;->E(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, LJ9/n;

    .line 44
    .line 45
    invoke-direct {v3, v0, v1}, LJ9/n;-><init>(LJ9/o;LN9/a;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, LQe/b;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    invoke-direct {v1, v3, v4}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iget-boolean v3, v0, LJ9/o;->a:Z

    .line 55
    .line 56
    if-nez v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, LJ9/o;->b()Lcom/google/android/gms/tasks/Task;

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {v1}, LHe/a;->f()LHe/g;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v0, v0, LJ9/o;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, LJ9/X;

    .line 68
    .line 69
    iget-object v0, v0, LJ9/X;->a:LHe/m;

    .line 70
    .line 71
    invoke-static {v1, v0}, LJ9/o;->e(LHe/g;LHe/m;)Lcom/google/android/gms/tasks/Task;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const-string v1, "message click to metrics logger"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, LJ9/o;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 81
    .line 82
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v1, p0, LB9/b;->b:Landroid/app/Activity;

    .line 93
    .line 94
    const/high16 v2, 0x10000000

    .line 95
    .line 96
    const/high16 v3, 0x40000000    # 2.0f

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-eqz v5, :cond_6

    .line 107
    .line 108
    const-string v6, "http"

    .line 109
    .line 110
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-nez v6, :cond_5

    .line 115
    .line 116
    const-string v6, "https"

    .line 117
    .line 118
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_6

    .line 123
    .line 124
    :cond_5
    new-instance v5, Landroid/content/Intent;

    .line 125
    .line 126
    const-string v6, "android.support.customtabs.action.CustomTabsService"

    .line 127
    .line 128
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v6, "com.android.chrome"

    .line 132
    .line 133
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {v6, v5, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    if-eqz v5, :cond_6

    .line 145
    .line 146
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-nez v5, :cond_6

    .line 151
    .line 152
    new-instance v4, Lp9/C;

    .line 153
    .line 154
    invoke-direct {v4}, Lp9/C;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Lp9/C;->b()Lu/k;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    iget-object v5, v4, Lu/k;->a:Landroid/content/Intent;

    .line 162
    .line 163
    invoke-virtual {v5, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v1, v0}, Lu/k;->a(Landroid/content/Context;Landroid/net/Uri;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_6
    :goto_1
    new-instance v5, Landroid/content/Intent;

    .line 174
    .line 175
    const-string v6, "android.intent.action.VIEW"

    .line 176
    .line 177
    invoke-direct {v5, v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0, v5, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v5, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 192
    .line 193
    .line 194
    if-eqz v0, :cond_7

    .line 195
    .line 196
    invoke-virtual {v1, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_7
    const-string v0, "Device cannot resolve intent for: android.intent.action.VIEW"

    .line 201
    .line 202
    invoke-static {v0}, LD9/e;->d(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :goto_2
    invoke-virtual {p1, v1}, LB9/f;->e(Landroid/app/Activity;)V

    .line 206
    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    iput-object v0, p1, LB9/f;->j:LN9/h;

    .line 210
    .line 211
    iput-object v0, p1, LB9/f;->k:Lz9/E;

    .line 212
    .line 213
    return-void
.end method
