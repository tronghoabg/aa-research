.class public Lflutter/overlay/window/flutter_overlay_window/OverlayService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field public static q:Lflutter/overlay/window/flutter_overlay_window/OverlayService; = null

.field public static r:Z = false


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/Integer;

.field public c:Landroid/content/res/Resources;

.field public d:Landroid/view/WindowManager;

.field public e:Lkc/r;

.field public f:Luc/r;

.field public g:LVa/X7;

.field public final h:I

.field public final i:Landroid/os/Handler;

.field public j:F

.field public k:F

.field public l:I

.field public m:Z

.field public final n:Landroid/graphics/Point;

.field public o:Ljava/util/Timer;

.field public p:Lcc/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->b:Ljava/lang/Integer;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 15
    .line 16
    const/16 v1, 0x398

    .line 17
    .line 18
    iput v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->h:I

    .line 19
    .line 20
    new-instance v1, Landroid/os/Handler;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->i:Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v1, Landroid/graphics/Point;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->n:Landroid/graphics/Point;

    .line 33
    .line 34
    iput-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->o:Ljava/util/Timer;

    .line 35
    .line 36
    iput-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->p:Lcc/c;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    float-to-int p1, p1

    .line 34
    return p1
.end method

.method public final b(IILtc/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    .line 12
    .line 13
    const/16 v1, -0x7cf

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-eq p1, v1, :cond_1

    .line 17
    .line 18
    if-ne p1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :cond_1
    :goto_0
    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 26
    .line 27
    invoke-virtual {p0, p2}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 32
    .line 33
    iget-object p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 34
    .line 35
    iget-object p2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 36
    .line 37
    invoke-interface {p1, p2, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    .line 39
    .line 40
    if-eqz p3, :cond_3

    .line 41
    .line 42
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p3, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    if-eqz p3, :cond_3

    .line 49
    .line 50
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p3, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    return-void
.end method

.method public final c()I
    .locals 4

    .line 1
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 11
    .line 12
    const-string v1, "dimen"

    .line 13
    .line 14
    const-string v2, "android"

    .line 15
    .line 16
    const-string v3, "status_bar_height"

    .line 17
    .line 18
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a:Ljava/lang/Integer;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 v0, 0x19

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a:Ljava/lang/Integer;

    .line 48
    .line 49
    :cond_1
    :goto_0
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a:Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    return v0
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 6

    .line 1
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LE4/y;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v1, "wynCachedEngine"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Llc/b;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Llc/d;

    .line 19
    .line 20
    invoke-direct {v0, p0, v2}, Llc/d;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lmc/a;

    .line 24
    .line 25
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v4, v4, Lb7/k;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Loc/d;

    .line 32
    .line 33
    iget-object v4, v4, Loc/d;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, LM/y;

    .line 36
    .line 37
    iget-object v4, v4, LM/y;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Ljava/lang/String;

    .line 40
    .line 41
    const-string v5, "overlayMain"

    .line 42
    .line 43
    invoke-direct {v3, v4, v5}, Lmc/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v4, LE5/l;

    .line 47
    .line 48
    invoke-direct {v4, p0}, LE5/l;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    iput-object v3, v4, LE5/l;->e:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v2, v4, LE5/l;->f:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Llc/d;->a(LE5/l;)Llc/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3, v1, v0}, LE4/y;->b(Ljava/lang/String;Llc/b;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    new-instance v1, Luc/r;

    .line 67
    .line 68
    iget-object v0, v0, Llc/b;->c:Lmc/b;

    .line 69
    .line 70
    const-string v3, "x-slayer/overlay"

    .line 71
    .line 72
    invoke-direct {v1, v0, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->f:Luc/r;

    .line 76
    .line 77
    new-instance v1, LVa/X7;

    .line 78
    .line 79
    sget-object v3, Luc/l;->a:Luc/l;

    .line 80
    .line 81
    const-string v4, "x-slayer/overlay_messenger"

    .line 82
    .line 83
    invoke-direct {v1, v0, v3, v2, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->g:LVa/X7;

    .line 87
    .line 88
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    const/16 v1, 0x1a

    .line 91
    .line 92
    if-lt v0, v1, :cond_1

    .line 93
    .line 94
    invoke-static {}, Lcc/b;->c()Landroid/app/NotificationChannel;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-class v2, Landroid/app/NotificationManager;

    .line 99
    .line 100
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Landroid/app/NotificationManager;

    .line 105
    .line 106
    invoke-static {v2, v1}, Lcom/dexterous/flutterlocalnotifications/a;->q(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    new-instance v1, Landroid/content/Intent;

    .line 110
    .line 111
    const-class v2, Lcc/a;

    .line 112
    .line 113
    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 114
    .line 115
    .line 116
    const/16 v2, 0x1f

    .line 117
    .line 118
    if-lt v0, v2, :cond_2

    .line 119
    .line 120
    const/high16 v2, 0x4000000

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    const/high16 v2, 0x8000000

    .line 124
    .line 125
    :goto_0
    const/4 v3, 0x0

    .line 126
    invoke-static {p0, v3, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-string v4, "ic_launcher"

    .line 147
    .line 148
    const-string v5, "mipmap"

    .line 149
    .line 150
    invoke-virtual {v2, v4, v5, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    new-instance v3, LX0/q;

    .line 155
    .line 156
    const-string v4, "Overlay Channel"

    .line 157
    .line 158
    invoke-direct {v3, p0, v4}, LX0/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    sget-object v4, LS3/f;->g:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v4}, LX0/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    iput-object v4, v3, LX0/q;->e:Ljava/lang/CharSequence;

    .line 168
    .line 169
    sget-object v4, LS3/f;->h:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v4}, LX0/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iput-object v4, v3, LX0/q;->f:Ljava/lang/CharSequence;

    .line 176
    .line 177
    if-nez v2, :cond_3

    .line 178
    .line 179
    const v2, 0x7f0801b3

    .line 180
    .line 181
    .line 182
    :cond_3
    iget-object v4, v3, LX0/q;->G:Landroid/app/Notification;

    .line 183
    .line 184
    iput v2, v4, Landroid/app/Notification;->icon:I

    .line 185
    .line 186
    iput-object v1, v3, LX0/q;->g:Landroid/app/PendingIntent;

    .line 187
    .line 188
    sget v1, LS3/f;->j:I

    .line 189
    .line 190
    iput v1, v3, LX0/q;->A:I

    .line 191
    .line 192
    invoke-virtual {v3}, LX0/q;->a()Landroid/app/Notification;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const/16 v2, 0x21

    .line 197
    .line 198
    if-ge v0, v2, :cond_4

    .line 199
    .line 200
    const/16 v0, 0x11e3

    .line 201
    .line 202
    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_4
    invoke-static {p0, v1}, Lc5/a;->x(Lflutter/overlay/window/flutter_overlay_window/OverlayService;Landroid/app/Notification;)V

    .line 207
    .line 208
    .line 209
    :goto_1
    sput-object p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 210
    .line 211
    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 7
    .line 8
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 12
    .line 13
    iget-object v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 14
    .line 15
    invoke-virtual {v0}, Lkc/r;->b()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    sput-boolean v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->r:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "notification"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/app/NotificationManager;

    .line 34
    .line 35
    const/16 v2, 0x11e3

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 41
    .line 42
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iput-object v2, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_d

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_0
    const-string v3, "startX"

    .line 27
    .line 28
    const/4 v4, -0x6

    .line 29
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const-string v5, "startY"

    .line 34
    .line 35
    invoke-virtual {v1, v5, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const-string v6, "IsCloseWindow"

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-virtual {v1, v6, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v6, 0x0

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    iget-object v3, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 54
    .line 55
    invoke-interface {v1, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    iput-object v6, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 59
    .line 60
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 61
    .line 62
    invoke-virtual {v1}, Lkc/r;->b()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 66
    .line 67
    .line 68
    :cond_1
    sput-boolean v7, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->r:Z

    .line 69
    .line 70
    return v2

    .line 71
    :cond_2
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    iget-object v8, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 76
    .line 77
    invoke-interface {v1, v8}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    iput-object v6, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 81
    .line 82
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 83
    .line 84
    invoke-virtual {v1}, Lkc/r;->b()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 88
    .line 89
    .line 90
    :cond_3
    sput-boolean v2, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->r:Z

    .line 91
    .line 92
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v1, v1, LE4/y;->a:Ljava/util/HashMap;

    .line 97
    .line 98
    const-string v8, "wynCachedEngine"

    .line 99
    .line 100
    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Llc/b;

    .line 105
    .line 106
    iget-object v8, v1, Llc/b;->g:Lg2/k;

    .line 107
    .line 108
    iget-boolean v9, v8, Lg2/k;->a:Z

    .line 109
    .line 110
    const/4 v10, 0x2

    .line 111
    invoke-virtual {v8, v10, v9}, Lg2/k;->f(IZ)V

    .line 112
    .line 113
    .line 114
    new-instance v8, Lkc/r;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    new-instance v10, Lkc/p;

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-direct {v10, v11}, Lkc/p;-><init>(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v8, v9, v10}, Lkc/r;-><init>(Landroid/content/Context;Lkc/p;)V

    .line 130
    .line 131
    .line 132
    iput-object v8, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 133
    .line 134
    invoke-virtual {v8, v1}, Lkc/r;->a(Llc/b;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 145
    .line 146
    .line 147
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 148
    .line 149
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 153
    .line 154
    invoke-virtual {v1, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->f:Luc/r;

    .line 158
    .line 159
    new-instance v8, LS8/b;

    .line 160
    .line 161
    const/16 v9, 0x15

    .line 162
    .line 163
    invoke-direct {v8, v0, v9}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v8}, Luc/r;->b(Luc/p;)V

    .line 167
    .line 168
    .line 169
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->g:LVa/X7;

    .line 170
    .line 171
    new-instance v8, LV1/c;

    .line 172
    .line 173
    const/16 v9, 0x13

    .line 174
    .line 175
    invoke-direct {v8, v9}, LV1/c;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v8}, LVa/X7;->n(Luc/b;)V

    .line 179
    .line 180
    .line 181
    const-string v1, "window"

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Landroid/view/WindowManager;

    .line 188
    .line 189
    iput-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 190
    .line 191
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 192
    .line 193
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iget-object v9, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->n:Landroid/graphics/Point;

    .line 198
    .line 199
    invoke-virtual {v1, v9}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 200
    .line 201
    .line 202
    if-ne v3, v4, :cond_4

    .line 203
    .line 204
    move v3, v7

    .line 205
    :cond_4
    if-ne v5, v4, :cond_5

    .line 206
    .line 207
    invoke-virtual {v0}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    neg-int v5, v1

    .line 212
    :cond_5
    new-instance v9, Landroid/view/WindowManager$LayoutParams;

    .line 213
    .line 214
    sget v1, LS3/f;->c:I

    .line 215
    .line 216
    const/4 v4, -0x1

    .line 217
    const/16 v7, -0x7cf

    .line 218
    .line 219
    if-ne v1, v7, :cond_6

    .line 220
    .line 221
    move v10, v4

    .line 222
    goto :goto_0

    .line 223
    :cond_6
    move v10, v1

    .line 224
    :goto_0
    sget v1, LS3/f;->b:I

    .line 225
    .line 226
    if-eq v1, v7, :cond_7

    .line 227
    .line 228
    :goto_1
    move v11, v1

    .line 229
    goto :goto_3

    .line 230
    :cond_7
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 231
    .line 232
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    new-instance v7, Landroid/util/DisplayMetrics;

    .line 237
    .line 238
    invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v7}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 245
    .line 246
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 251
    .line 252
    if-ne v1, v2, :cond_a

    .line 253
    .line 254
    iget v1, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 255
    .line 256
    invoke-virtual {v0}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c()I

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    add-int/2addr v7, v1

    .line 261
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->b:Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-ne v1, v4, :cond_9

    .line 268
    .line 269
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 270
    .line 271
    const-string v4, "dimen"

    .line 272
    .line 273
    const-string v11, "android"

    .line 274
    .line 275
    const-string v12, "navigation_bar_height"

    .line 276
    .line 277
    invoke-virtual {v1, v12, v4, v11}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-lez v1, :cond_8

    .line 282
    .line 283
    iget-object v4, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 284
    .line 285
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    iput-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->b:Ljava/lang/Integer;

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_8
    const/16 v1, 0x30

    .line 297
    .line 298
    invoke-virtual {v0, v1}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iput-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->b:Ljava/lang/Integer;

    .line 307
    .line 308
    :cond_9
    :goto_2
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->b:Ljava/lang/Integer;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    add-int/2addr v1, v7

    .line 315
    goto :goto_1

    .line 316
    :cond_a
    iget v1, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 317
    .line 318
    invoke-virtual {v0}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c()I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    add-int/2addr v4, v1

    .line 323
    move v1, v4

    .line 324
    goto :goto_1

    .line 325
    :goto_3
    invoke-virtual {v0}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c()I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    neg-int v13, v1

    .line 330
    const/16 v1, 0x1a

    .line 331
    .line 332
    if-lt v8, v1, :cond_b

    .line 333
    .line 334
    const/16 v1, 0x7f6

    .line 335
    .line 336
    :goto_4
    move v14, v1

    .line 337
    goto :goto_5

    .line 338
    :cond_b
    const/16 v1, 0x7d2

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :goto_5
    sget v1, LS3/f;->d:I

    .line 342
    .line 343
    const v4, 0x1010380

    .line 344
    .line 345
    .line 346
    or-int v15, v1, v4

    .line 347
    .line 348
    const/16 v16, -0x3

    .line 349
    .line 350
    const/4 v12, 0x0

    .line 351
    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 352
    .line 353
    .line 354
    const/16 v1, 0x1f

    .line 355
    .line 356
    if-lt v8, v1, :cond_c

    .line 357
    .line 358
    sget v1, LS3/f;->d:I

    .line 359
    .line 360
    iget v4, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->h:I

    .line 361
    .line 362
    if-ne v1, v4, :cond_c

    .line 363
    .line 364
    const v1, 0x3f4ccccd    # 0.8f

    .line 365
    .line 366
    .line 367
    iput v1, v9, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 368
    .line 369
    :cond_c
    sget v1, LS3/f;->e:I

    .line 370
    .line 371
    iput v1, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 372
    .line 373
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 374
    .line 375
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 376
    .line 377
    .line 378
    iget-object v1, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 379
    .line 380
    iget-object v4, v0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 381
    .line 382
    invoke-interface {v1, v4, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v3, v5, v6}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->b(IILtc/g;)V

    .line 386
    .line 387
    .line 388
    :cond_d
    :goto_6
    return v2
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    iget-object p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_e

    .line 5
    .line 6
    sget-boolean p1, LS3/f;->k:Z

    .line 7
    .line 8
    if-eqz p1, :cond_e

    .line 9
    .line 10
    iget-object p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_d

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v1, v2, :cond_9

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v1, v3, :cond_0

    .line 29
    .line 30
    const/4 p2, 0x3

    .line 31
    if-eq v1, p2, :cond_9

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget v3, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->j:F

    .line 40
    .line 41
    sub-float/2addr v1, v3

    .line 42
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    iget v4, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->k:F

    .line 47
    .line 48
    sub-float/2addr v3, v4

    .line 49
    iget-boolean v4, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->m:Z

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    mul-float v4, v1, v1

    .line 54
    .line 55
    mul-float v5, v3, v3

    .line 56
    .line 57
    add-float/2addr v5, v4

    .line 58
    const/high16 v4, 0x41c80000    # 25.0f

    .line 59
    .line 60
    cmpg-float v4, v5, v4

    .line 61
    .line 62
    if-gez v4, :cond_1

    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    iput v4, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->j:F

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    iput p2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->k:F

    .line 77
    .line 78
    sget p2, LS3/f;->e:I

    .line 79
    .line 80
    const/16 v4, 0x35

    .line 81
    .line 82
    const/16 v5, 0x55

    .line 83
    .line 84
    if-eq p2, v4, :cond_3

    .line 85
    .line 86
    const/16 v4, 0x15

    .line 87
    .line 88
    if-eq p2, v4, :cond_3

    .line 89
    .line 90
    if-ne p2, v5, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move v4, v0

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    :goto_0
    move v4, v2

    .line 96
    :goto_1
    const/16 v6, 0x53

    .line 97
    .line 98
    if-eq p2, v6, :cond_5

    .line 99
    .line 100
    const/16 v6, 0x50

    .line 101
    .line 102
    if-eq p2, v6, :cond_5

    .line 103
    .line 104
    if-ne p2, v5, :cond_4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move p2, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    :goto_2
    move p2, v2

    .line 110
    :goto_3
    iget v5, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 111
    .line 112
    float-to-int v1, v1

    .line 113
    const/4 v6, -0x1

    .line 114
    if-eqz v4, :cond_6

    .line 115
    .line 116
    move v4, v6

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move v4, v2

    .line 119
    :goto_4
    mul-int/2addr v1, v4

    .line 120
    add-int/2addr v1, v5

    .line 121
    iget v4, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 122
    .line 123
    float-to-int v3, v3

    .line 124
    if-eqz p2, :cond_7

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    move v6, v2

    .line 128
    :goto_5
    mul-int/2addr v3, v6

    .line 129
    add-int/2addr v3, v4

    .line 130
    iput v1, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 131
    .line 132
    iput v3, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 133
    .line 134
    iget-object p2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 135
    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    iget-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 139
    .line 140
    invoke-interface {p2, v1, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    iput-boolean v2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->m:Z

    .line 144
    .line 145
    return v0

    .line 146
    :cond_9
    iget p2, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 147
    .line 148
    iput p2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->l:I

    .line 149
    .line 150
    sget-object p2, LS3/f;->i:Ljava/lang/String;

    .line 151
    .line 152
    const-string v1, "none"

    .line 153
    .line 154
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-nez p2, :cond_e

    .line 159
    .line 160
    iget-object p2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 161
    .line 162
    if-nez p2, :cond_a

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_a
    iget-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 166
    .line 167
    invoke-interface {p2, v1, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 168
    .line 169
    .line 170
    iget-object p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->p:Lcc/c;

    .line 171
    .line 172
    if-eqz p1, :cond_b

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/util/TimerTask;->cancel()Z

    .line 175
    .line 176
    .line 177
    :cond_b
    iget-object p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->o:Ljava/util/Timer;

    .line 178
    .line 179
    if-eqz p1, :cond_c

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 182
    .line 183
    .line 184
    :cond_c
    new-instance p1, Lcc/c;

    .line 185
    .line 186
    invoke-direct {p1, p0}, Lcc/c;-><init>(Lflutter/overlay/window/flutter_overlay_window/OverlayService;)V

    .line 187
    .line 188
    .line 189
    iput-object p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->p:Lcc/c;

    .line 190
    .line 191
    new-instance v1, Ljava/util/Timer;

    .line 192
    .line 193
    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    .line 194
    .line 195
    .line 196
    iput-object v1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->o:Ljava/util/Timer;

    .line 197
    .line 198
    iget-object v2, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->p:Lcc/c;

    .line 199
    .line 200
    const-wide/16 v3, 0x0

    .line 201
    .line 202
    const-wide/16 v5, 0x19

    .line 203
    .line 204
    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 205
    .line 206
    .line 207
    return v0

    .line 208
    :cond_d
    iput-boolean v0, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->m:Z

    .line 209
    .line 210
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    iput p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->j:F

    .line 215
    .line 216
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    iput p1, p0, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->k:F

    .line 221
    .line 222
    :cond_e
    :goto_6
    return v0
.end method
