.class public final Landroidx/activity/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/t;


# static fields
.field public static c:I

.field public static d:Ljava/lang/reflect/Field;

.field public static e:Ljava/lang/reflect/Field;

.field public static f:Ljava/lang/reflect/Field;


# instance fields
.field public final synthetic a:I

.field public b:Landroidx/activity/ComponentActivity;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Landroidx/activity/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/activity/ComponentActivity;I)V
    .locals 0

    .line 2
    iput p2, p0, Landroidx/activity/g;->a:I

    iput-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/activity/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 7
    .line 8
    if-eq p2, p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    sget p1, Landroidx/activity/g;->c:I

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    const-class p1, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    :try_start_0
    sput v0, Landroidx/activity/g;->c:I

    .line 21
    .line 22
    const-string v0, "mServedView"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Landroidx/activity/g;->e:Ljava/lang/reflect/Field;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "mNextServedView"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Landroidx/activity/g;->f:Ljava/lang/reflect/Field;

    .line 40
    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "mH"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sput-object p1, Landroidx/activity/g;->d:Ljava/lang/reflect/Field;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 53
    .line 54
    .line 55
    sput p2, Landroidx/activity/g;->c:I
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    :catch_0
    :cond_1
    sget p1, Landroidx/activity/g;->c:I

    .line 58
    .line 59
    if-ne p1, p2, :cond_5

    .line 60
    .line 61
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 62
    .line 63
    const-string p2, "input_method"

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 70
    .line 71
    :try_start_1
    sget-object p2, Landroidx/activity/g;->d:Ljava/lang/reflect/Field;

    .line 72
    .line 73
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4

    .line 77
    if-nez p2, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    monitor-enter p2

    .line 81
    :try_start_2
    sget-object v0, Landroidx/activity/g;->e:Ljava/lang/reflect/Field;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroid/view/View;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    :try_start_3
    monitor-exit p2

    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    :try_start_4
    sget-object v0, Landroidx/activity/g;->f:Ljava/lang/reflect/Field;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    .line 108
    .line 109
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 110
    invoke-virtual {p1}, Landroid/view/inputmethod/InputMethodManager;->isActive()Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :catch_1
    :try_start_6
    monitor-exit p2

    .line 115
    goto :goto_1

    .line 116
    :catch_2
    monitor-exit p2

    .line 117
    goto :goto_1

    .line 118
    :catch_3
    monitor-exit p2

    .line 119
    goto :goto_1

    .line 120
    :goto_0
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 121
    throw p1

    .line 122
    :catch_4
    :cond_5
    :goto_1
    return-void

    .line 123
    :pswitch_0
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 124
    .line 125
    if-ne p2, v0, :cond_6

    .line 126
    .line 127
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 128
    .line 129
    const/16 v0, 0x21

    .line 130
    .line 131
    if-lt p2, v0, :cond_6

    .line 132
    .line 133
    iget-object p2, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 134
    .line 135
    invoke-static {p2}, Landroidx/activity/ComponentActivity;->access$100(Landroidx/activity/ComponentActivity;)Landroidx/activity/w;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    check-cast p1, Landroidx/activity/ComponentActivity;

    .line 140
    .line 141
    invoke-static {p1}, Landroidx/activity/i;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    const-string v0, "invoker"

    .line 149
    .line 150
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p2, Landroidx/activity/w;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 154
    .line 155
    iget-boolean p1, p2, Landroidx/activity/w;->g:Z

    .line 156
    .line 157
    invoke-virtual {p2, p1}, Landroidx/activity/w;->c(Z)V

    .line 158
    .line 159
    .line 160
    :cond_6
    return-void

    .line 161
    :pswitch_1
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 162
    .line 163
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->ensureViewModelStore()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/o;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_2
    sget-object p1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 175
    .line 176
    if-ne p2, p1, :cond_8

    .line 177
    .line 178
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 179
    .line 180
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_7

    .line 185
    .line 186
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    goto :goto_2

    .line 191
    :cond_7
    const/4 p1, 0x0

    .line 192
    :goto_2
    if-eqz p1, :cond_8

    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 195
    .line 196
    .line 197
    :cond_8
    return-void

    .line 198
    :pswitch_3
    sget-object p1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 199
    .line 200
    if-ne p2, p1, :cond_a

    .line 201
    .line 202
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 203
    .line 204
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->mContextAwareHelper:Lf/a;

    .line 205
    .line 206
    const/4 p2, 0x0

    .line 207
    iput-object p2, p1, Lf/a;->b:Landroidx/activity/ComponentActivity;

    .line 208
    .line 209
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 210
    .line 211
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-nez p1, :cond_9

    .line 216
    .line 217
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 218
    .line 219
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getViewModelStore()Landroidx/lifecycle/e0;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p1}, Landroidx/lifecycle/e0;->a()V

    .line 224
    .line 225
    .line 226
    :cond_9
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/ComponentActivity;

    .line 227
    .line 228
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->mReportFullyDrawnExecutor:Landroidx/activity/k;

    .line 229
    .line 230
    check-cast p1, Landroidx/activity/l;

    .line 231
    .line 232
    iget-object p2, p1, Landroidx/activity/l;->d:Landroidx/activity/ComponentActivity;

    .line 233
    .line 234
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-virtual {p2, p1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 258
    .line 259
    .line 260
    :cond_a
    return-void

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
