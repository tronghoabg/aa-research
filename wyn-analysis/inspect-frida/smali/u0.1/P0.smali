.class public abstract Lu0/P0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu0/P0;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Lu0/a;LN/q;LV/d;)Lu0/M0;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu0/U;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    const/4 v4, 0x6

    .line 19
    invoke-static {v0, v4, v3}, Lic/d;->a(IILGf/a;)LGf/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v4, Lu0/B;->l:Lef/p;

    .line 24
    .line 25
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Ljf/h;

    .line 30
    .line 31
    invoke-static {v4}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, Lu0/T;

    .line 36
    .line 37
    invoke-direct {v5, v0, v3}, Lu0/T;-><init>(LGf/e;Ljf/c;)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x3

    .line 41
    invoke-static {v4, v3, v5, v6}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 42
    .line 43
    .line 44
    new-instance v4, LB/F;

    .line 45
    .line 46
    const/16 v5, 0x14

    .line 47
    .line 48
    invoke-direct {v4, v0, v5}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    sget-object v0, LX/m;->b:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v0

    .line 54
    :try_start_0
    sget-object v5, LX/m;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, Ljava/util/Collection;

    .line 57
    .line 58
    invoke-static {v5, v4}, Lff/o;->F0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sput-object v4, LX/m;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    monitor-exit v0

    .line 65
    invoke-static {}, LX/m;->a()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    monitor-exit v0

    .line 71
    throw p0

    .line 72
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-lez v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    instance-of v1, v0, Lu0/n;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    check-cast v0, Lu0/n;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    :goto_1
    move-object v0, v3

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :goto_2
    if-nez v0, :cond_3

    .line 96
    .line 97
    new-instance v0, Lu0/n;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v4, "context"

    .line 104
    .line 105
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v0, v1}, Lu0/n;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lu0/n;->getView()Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    sget-object v4, Lu0/P0;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 116
    .line 117
    invoke-virtual {p0, v1, v4}, Lu0/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 121
    .line 122
    const/16 v1, 0x1d

    .line 123
    .line 124
    if-lt p0, v1, :cond_4

    .line 125
    .line 126
    sget-object p0, Lu0/O0;->a:Lu0/O0;

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Lu0/O0;->a(Landroid/view/View;)Ljava/util/Map;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_4

    .line 137
    .line 138
    new-instance p0, Ljava/util/WeakHashMap;

    .line 139
    .line 140
    invoke-direct {p0}, Ljava/util/WeakHashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-static {p0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const v1, 0x7f0a0160

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :try_start_1
    const-class p0, Lu0/Y;

    .line 154
    .line 155
    const-string v1, "isDebugInspectorInfoEnabled"

    .line 156
    .line 157
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v3, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :catch_0
    const-string p0, "Wrapper"

    .line 169
    .line 170
    const-string v1, "Could not access isDebugInspectorInfoEnabled. Please set explicitly."

    .line 171
    .line 172
    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    :cond_4
    :goto_3
    new-instance p0, Lt0/Q;

    .line 176
    .line 177
    invoke-virtual {v0}, Lu0/n;->getRoot()Lt0/t;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const-string v2, "root"

    .line 182
    .line 183
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-direct {p0, v1}, LE9/c;-><init>(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    new-instance v1, LN/s;

    .line 190
    .line 191
    invoke-direct {v1, p1, p0}, LN/s;-><init>(LN/q;LE9/c;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Lu0/n;->getView()Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    const p1, 0x7f0a02d3

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    instance-of v2, p0, Lu0/M0;

    .line 206
    .line 207
    if-eqz v2, :cond_5

    .line 208
    .line 209
    move-object v3, p0

    .line 210
    check-cast v3, Lu0/M0;

    .line 211
    .line 212
    :cond_5
    if-nez v3, :cond_6

    .line 213
    .line 214
    new-instance v3, Lu0/M0;

    .line 215
    .line 216
    invoke-direct {v3, v0, v1}, Lu0/M0;-><init>(Lu0/n;LN/s;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Lu0/n;->getView()Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p0, p1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_6
    invoke-virtual {v3, p2}, Lu0/M0;->b(LV/d;)V

    .line 227
    .line 228
    .line 229
    return-object v3
.end method
