.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "v"

    .line 4
    .line 5
    iget v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    const-string v0, "view"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :pswitch_2
    return-void

    .line 24
    :pswitch_3
    check-cast v0, Lf8/m;

    .line 25
    .line 26
    iget-object p1, v0, Lf8/m;->u:Lcom/unity3d/services/core/webview/b;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, v0, Lf8/m;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    sget-object v1, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-object v0, v0, Lf8/m;->u:Lcom/unity3d/services/core/webview/b;

    .line 43
    .line 44
    new-instance v1, Ll1/b;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Ll1/b;-><init>(Lcom/unity3d/services/core/webview/b;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :pswitch_4
    const-string v1, "p0"

    .line 54
    .line 55
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    check-cast v0, LGf/t;

    .line 61
    .line 62
    check-cast v0, LGf/s;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, LGf/s;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "v"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LEf/H0;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    const-string v0, "v"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lu0/a;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, Lk1/V;->a:Lk1/V;

    .line 37
    .line 38
    invoke-static {v0, v1}, LAf/n;->a0(Ljava/lang/Object;Ltf/l;)LAf/k;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, LAf/k;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Landroid/view/ViewParent;

    .line 59
    .line 60
    instance-of v4, v1, Landroid/view/View;

    .line 61
    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    check-cast v1, Landroid/view/View;

    .line 65
    .line 66
    const-string v4, "<this>"

    .line 67
    .line 68
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const v4, 0x7f0a0165

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    instance-of v4, v1, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v4, :cond_1

    .line 81
    .line 82
    check-cast v1, Ljava/lang/Boolean;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move-object v1, v2

    .line 86
    :goto_0
    if-eqz v1, :cond_2

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    :cond_2
    if-eqz v3, :cond_0

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    :cond_3
    if-nez v3, :cond_5

    .line 96
    .line 97
    iget-object v0, p1, Lu0/a;->c:Lu0/M0;

    .line 98
    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0}, Lu0/M0;->dispose()V

    .line 102
    .line 103
    .line 104
    :cond_4
    iput-object v2, p1, Lu0/a;->c:Lu0/M0;

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 107
    .line 108
    .line 109
    :cond_5
    return-void

    .line 110
    :pswitch_1
    const-string v0, "view"

    .line 111
    .line 112
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Lu0/s;

    .line 118
    .line 119
    iget-object v0, p1, Lu0/s;->g:Landroid/os/Handler;

    .line 120
    .line 121
    iget-object p1, p1, Lu0/s;->w:Lkd/c;

    .line 122
    .line 123
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_2
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lp/C;

    .line 130
    .line 131
    iget-object v1, v0, Lp/C;->o:Landroid/view/ViewTreeObserver;

    .line 132
    .line 133
    if-eqz v1, :cond_7

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_6

    .line 140
    .line 141
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iput-object v1, v0, Lp/C;->o:Landroid/view/ViewTreeObserver;

    .line 146
    .line 147
    :cond_6
    iget-object v1, v0, Lp/C;->o:Landroid/view/ViewTreeObserver;

    .line 148
    .line 149
    iget-object v0, v0, Lp/C;->i:LE9/d;

    .line 150
    .line 151
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 152
    .line 153
    .line 154
    :cond_7
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_3
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lp/e;

    .line 161
    .line 162
    iget-object v1, v0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 163
    .line 164
    if-eqz v1, :cond_9

    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_8

    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    iput-object v1, v0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 177
    .line 178
    :cond_8
    iget-object v1, v0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 179
    .line 180
    iget-object v0, v0, Lp/e;->i:LE9/d;

    .line 181
    .line 182
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 183
    .line 184
    .line 185
    :cond_9
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_4
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p1, Lf8/m;

    .line 192
    .line 193
    iget-object v0, p1, Lf8/m;->u:Lcom/unity3d/services/core/webview/b;

    .line 194
    .line 195
    if-eqz v0, :cond_a

    .line 196
    .line 197
    iget-object p1, p1, Lf8/m;->t:Landroid/view/accessibility/AccessibilityManager;

    .line 198
    .line 199
    if-eqz p1, :cond_a

    .line 200
    .line 201
    new-instance v1, Ll1/b;

    .line 202
    .line 203
    invoke-direct {v1, v0}, Ll1/b;-><init>(Lcom/unity3d/services/core/webview/b;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 207
    .line 208
    .line 209
    :cond_a
    return-void

    .line 210
    :pswitch_5
    const-string v0, "p0"

    .line 211
    .line 212
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, LGf/t;

    .line 220
    .line 221
    check-cast v0, LGf/s;

    .line 222
    .line 223
    invoke-virtual {v0, p1}, LGf/s;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
