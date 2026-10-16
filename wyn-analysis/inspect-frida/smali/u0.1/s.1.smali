.class public final Lu0/s;
.super Lk1/b;
.source "SourceFile"


# static fields
.field public static final z:[I


# instance fields
.field public final d:Lu0/n;

.field public e:I

.field public final f:Landroid/view/accessibility/AccessibilityManager;

.field public final g:Landroid/os/Handler;

.field public final h:Lad/L;

.field public i:I

.field public final j:Lx/w;

.field public final k:Lx/w;

.field public l:I

.field public m:Ljava/lang/Integer;

.field public final n:Lx/f;

.field public final o:LGf/e;

.field public p:Z

.field public q:Lu0/p;

.field public r:Ljava/lang/Object;

.field public final s:Lx/f;

.field public final t:Ljava/util/LinkedHashMap;

.field public u:Lu0/q;

.field public v:Z

.field public final w:Lkd/c;

.field public final x:Ljava/util/ArrayList;

.field public final y:LB/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu0/s;->z:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x7f0a0010
        0x7f0a0011
        0x7f0a001c
        0x7f0a0027
        0x7f0a002a
        0x7f0a002b
        0x7f0a002c
        0x7f0a002d
        0x7f0a002e
        0x7f0a002f
        0x7f0a0012
        0x7f0a0013
        0x7f0a0014
        0x7f0a0015
        0x7f0a0016
        0x7f0a0017
        0x7f0a0018
        0x7f0a0019
        0x7f0a001a
        0x7f0a001b
        0x7f0a001d
        0x7f0a001e
        0x7f0a001f
        0x7f0a0020
        0x7f0a0021
        0x7f0a0022
        0x7f0a0023
        0x7f0a0024
        0x7f0a0025
        0x7f0a0026
        0x7f0a0028
        0x7f0a0029
    .end array-data
.end method

.method public constructor <init>(Lu0/n;)V
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lk1/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lu0/s;->d:Lu0/n;

    .line 10
    .line 11
    const/high16 v0, -0x80000000

    .line 12
    .line 13
    iput v0, p0, Lu0/s;->e:I

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "accessibility"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 28
    .line 29
    iput-object v1, p0, Lu0/s;->f:Landroid/view/accessibility/AccessibilityManager;

    .line 30
    .line 31
    new-instance v1, Landroid/os/Handler;

    .line 32
    .line 33
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lu0/s;->g:Landroid/os/Handler;

    .line 41
    .line 42
    new-instance v1, Lad/L;

    .line 43
    .line 44
    new-instance v2, Ll1/f;

    .line 45
    .line 46
    invoke-direct {v2, p0}, Ll1/f;-><init>(Lu0/s;)V

    .line 47
    .line 48
    .line 49
    const/16 v3, 0xd

    .line 50
    .line 51
    invoke-direct {v1, v2, v3}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lu0/s;->h:Lad/L;

    .line 55
    .line 56
    iput v0, p0, Lu0/s;->i:I

    .line 57
    .line 58
    new-instance v0, Lx/w;

    .line 59
    .line 60
    invoke-direct {v0}, Lx/w;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lu0/s;->j:Lx/w;

    .line 64
    .line 65
    new-instance v0, Lx/w;

    .line 66
    .line 67
    invoke-direct {v0}, Lx/w;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lu0/s;->k:Lx/w;

    .line 71
    .line 72
    const/4 v0, -0x1

    .line 73
    iput v0, p0, Lu0/s;->l:I

    .line 74
    .line 75
    new-instance v1, Lx/f;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-direct {v1, v2}, Lx/f;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lu0/s;->n:Lx/f;

    .line 82
    .line 83
    const/4 v1, 0x6

    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static {v0, v1, v3}, Lic/d;->a(IILGf/a;)LGf/e;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lu0/s;->o:LGf/e;

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p0, Lu0/s;->p:Z

    .line 93
    .line 94
    sget-object v0, Lff/w;->a:Lff/w;

    .line 95
    .line 96
    iput-object v0, p0, Lu0/s;->r:Ljava/lang/Object;

    .line 97
    .line 98
    new-instance v1, Lx/f;

    .line 99
    .line 100
    invoke-direct {v1, v2}, Lx/f;-><init>(I)V

    .line 101
    .line 102
    .line 103
    iput-object v1, p0, Lu0/s;->s:Lx/f;

    .line 104
    .line 105
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 106
    .line 107
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lu0/s;->t:Ljava/util/LinkedHashMap;

    .line 111
    .line 112
    new-instance v1, Lu0/q;

    .line 113
    .line 114
    invoke-virtual {p1}, Lu0/n;->getSemanticsOwner()Lx0/l;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, Lx0/l;->a()Lx0/k;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-direct {v1, v2, v0}, Lu0/q;-><init>(Lx0/k;Ljava/util/Map;)V

    .line 123
    .line 124
    .line 125
    iput-object v1, p0, Lu0/s;->u:Lu0/q;

    .line 126
    .line 127
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

    .line 128
    .line 129
    const/4 v1, 0x4

    .line 130
    invoke-direct {v0, p0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;-><init>(Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 134
    .line 135
    .line 136
    new-instance p1, Lkd/c;

    .line 137
    .line 138
    const/16 v0, 0xf

    .line 139
    .line 140
    invoke-direct {p1, p0, v0}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Lu0/s;->w:Lkd/c;

    .line 144
    .line 145
    new-instance p1, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    iput-object p1, p0, Lu0/s;->x:Ljava/util/ArrayList;

    .line 151
    .line 152
    new-instance p1, LB/F;

    .line 153
    .line 154
    const/16 v0, 0x12

    .line 155
    .line 156
    invoke-direct {p1, p0, v0}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 157
    .line 158
    .line 159
    iput-object p1, p0, Lu0/s;->y:LB/F;

    .line 160
    .line 161
    return-void

    .line 162
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 163
    .line 164
    const-string v0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    .line 165
    .line 166
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1
.end method

.method public static C(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const v1, 0x186a0

    .line 15
    .line 16
    .line 17
    if-gt v0, v1, :cond_1

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    const v0, 0x1869f

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    move v1, v0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_3
    :goto_0
    return-object p0
.end method

.method public static q(Lx0/k;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lx0/n;->a:Lx0/q;

    .line 5
    .line 6
    iget-object p0, p0, Lx0/k;->e:Lx0/g;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lx0/g;->a(Lx0/q;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p0}, Lff/B;->s(Ljava/util/List;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object v0, Lx0/f;->g:Lx0/q;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lx0/g;->a(Lx0/q;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object v0, Lx0/n;->r:Lx0/q;

    .line 34
    .line 35
    invoke-static {p0, v0}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lz0/b;

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    iget-object p0, p0, Lz0/b;->a:Ljava/lang/String;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    sget-object v0, Lx0/n;->q:Lx0/q;

    .line 47
    .line 48
    invoke-static {p0, v0}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/util/List;

    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lz0/b;

    .line 61
    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    iget-object p0, p0, Lz0/b;->a:Ljava/lang/String;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public static synthetic w(Lu0/s;IILjava/lang/Integer;I)V
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lu0/s;->v(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A(Lt0/t;Lx/f;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lt0/t;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lu0/s;->d:Lu0/n;

    .line 10
    .line 11
    invoke-virtual {v0}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lu0/F;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_1
    invoke-static {p1}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-nez v0, :cond_5

    .line 33
    .line 34
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-static {v0}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {v0}, Lt0/t;->j()Lt0/t;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    move-object v0, v1

    .line 53
    :goto_1
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-static {v0}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    move-object v0, v1

    .line 61
    :goto_2
    if-nez v0, :cond_5

    .line 62
    .line 63
    goto :goto_5

    .line 64
    :cond_5
    invoke-virtual {v0}, Lx0/h;->j()Lx0/g;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-boolean v2, v2, Lx0/g;->b:Z

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    if-nez v2, :cond_8

    .line 72
    .line 73
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_3
    if-eqz p1, :cond_7

    .line 78
    .line 79
    invoke-static {p1}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {v2}, Lx0/h;->j()Lx0/g;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    iget-boolean v2, v2, Lx0/g;->b:Z

    .line 92
    .line 93
    if-ne v2, v3, :cond_6

    .line 94
    .line 95
    move-object v1, p1

    .line 96
    goto :goto_4

    .line 97
    :cond_6
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_3

    .line 102
    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    .line 103
    .line 104
    invoke-static {v1}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    move-object v0, p1

    .line 111
    :cond_8
    iget-object p1, v0, LX0/E;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, LZ/j;

    .line 114
    .line 115
    check-cast p1, Lx0/i;

    .line 116
    .line 117
    check-cast p1, Lx0/j;

    .line 118
    .line 119
    iget p1, p1, Lx0/j;->a:I

    .line 120
    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p2, v0}, Lx/f;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-nez p2, :cond_9

    .line 130
    .line 131
    :goto_5
    return-void

    .line 132
    :cond_9
    invoke-virtual {p0, p1}, Lu0/s;->t(I)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    const/16 v0, 0x8

    .line 141
    .line 142
    const/16 v1, 0x800

    .line 143
    .line 144
    invoke-static {p0, p1, v1, p2, v0}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public final B(Lx0/k;IIZ)Z
    .locals 9

    .line 1
    iget-object v0, p1, Lx0/k;->e:Lx0/g;

    .line 2
    .line 3
    sget-object v1, Lx0/f;->f:Lx0/q;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lx0/g;->a(Lx0/q;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lu0/Q;->a(Lx0/k;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p1, p1, Lx0/k;->e:Lx0/g;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lx0/a;

    .line 25
    .line 26
    iget-object p1, p1, Lx0/a;->b:Lef/e;

    .line 27
    .line 28
    check-cast p1, Ltf/q;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    invoke-interface {p1, p2, p3, p4}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_0
    if-ne p2, p3, :cond_1

    .line 56
    .line 57
    iget p4, p0, Lu0/s;->l:I

    .line 58
    .line 59
    if-ne p3, p4, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {p1}, Lu0/s;->q(Lx0/k;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    if-nez v8, :cond_3

    .line 67
    .line 68
    :cond_2
    :goto_0
    return v2

    .line 69
    :cond_3
    if-ltz p2, :cond_4

    .line 70
    .line 71
    if-ne p2, p3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    if-gt p3, p4, :cond_4

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    const/4 p2, -0x1

    .line 81
    :goto_1
    iput p2, p0, Lu0/s;->l:I

    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    const/4 p3, 0x1

    .line 88
    if-lez p2, :cond_5

    .line 89
    .line 90
    move v2, p3

    .line 91
    :cond_5
    iget p1, p1, Lx0/k;->f:I

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lu0/s;->t(I)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    const/4 p2, 0x0

    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    iget p4, p0, Lu0/s;->l:I

    .line 101
    .line 102
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    move-object v5, p4

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move-object v5, p2

    .line 109
    :goto_2
    if-eqz v2, :cond_7

    .line 110
    .line 111
    iget p4, p0, Lu0/s;->l:I

    .line 112
    .line 113
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p4

    .line 117
    move-object v6, p4

    .line 118
    goto :goto_3

    .line 119
    :cond_7
    move-object v6, p2

    .line 120
    :goto_3
    if-eqz v2, :cond_8

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    :cond_8
    move-object v3, p0

    .line 131
    move-object v7, p2

    .line 132
    invoke-virtual/range {v3 .. v8}, Lu0/s;->m(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p0, p2}, Lu0/s;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lu0/s;->y(I)V

    .line 140
    .line 141
    .line 142
    return p3
.end method

.method public final b(Landroid/view/View;)Lad/L;
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lu0/s;->h:Lad/L;

    .line 7
    .line 8
    return-object p1
.end method

.method public final j(Llf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, Lu0/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lu0/r;

    .line 7
    .line 8
    iget v1, v0, Lu0/r;->f:I

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
    iput v1, v0, Lu0/r;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu0/r;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lu0/r;-><init>(Lu0/s;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lu0/r;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lu0/r;->f:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x2

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v3, :cond_3

    .line 37
    .line 38
    if-ne v2, v5, :cond_2

    .line 39
    .line 40
    iget-object v2, v0, Lu0/r;->c:LGf/b;

    .line 41
    .line 42
    iget-object v6, v0, Lu0/r;->b:Lx/f;

    .line 43
    .line 44
    iget-object v7, v0, Lu0/r;->a:Lu0/s;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :cond_1
    move-object p1, v6

    .line 50
    move-object v6, v2

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_3
    iget-object v2, v0, Lu0/r;->c:LGf/b;

    .line 64
    .line 65
    iget-object v6, v0, Lu0/r;->b:Lx/f;

    .line 66
    .line 67
    iget-object v7, v0, Lu0/r;->a:Lu0/s;

    .line 68
    .line 69
    :try_start_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :try_start_2
    new-instance p1, Lx/f;

    .line 77
    .line 78
    invoke-direct {p1, v4}, Lx/f;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lu0/s;->o:LGf/e;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v6, LGf/b;

    .line 87
    .line 88
    invoke-direct {v6, v2}, LGf/b;-><init>(LGf/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    .line 90
    .line 91
    move-object v7, p0

    .line 92
    :goto_1
    :try_start_3
    iput-object v7, v0, Lu0/r;->a:Lu0/s;

    .line 93
    .line 94
    iput-object p1, v0, Lu0/r;->b:Lx/f;

    .line 95
    .line 96
    iput-object v6, v0, Lu0/r;->c:LGf/b;

    .line 97
    .line 98
    iput v3, v0, Lu0/r;->f:I

    .line 99
    .line 100
    invoke-virtual {v6, v0}, LGf/b;->a(Llf/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-ne v2, v1, :cond_5

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move-object v11, v6

    .line 108
    move-object v6, p1

    .line 109
    move-object p1, v2

    .line 110
    move-object v2, v11

    .line 111
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_8

    .line 118
    .line 119
    invoke-virtual {v2}, LGf/b;->c()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7}, Lu0/s;->r()Z

    .line 123
    .line 124
    .line 125
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 126
    iget-object v8, v7, Lu0/s;->n:Lx/f;

    .line 127
    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    :try_start_4
    iget p1, v8, Lx/f;->c:I

    .line 131
    .line 132
    move v9, v4

    .line 133
    :goto_3
    if-ge v9, p1, :cond_6

    .line 134
    .line 135
    iget-object v10, v8, Lx/f;->b:[Ljava/lang/Object;

    .line 136
    .line 137
    aget-object v10, v10, v9

    .line 138
    .line 139
    invoke-static {v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    check-cast v10, Lt0/t;

    .line 143
    .line 144
    invoke-virtual {v7, v10, v6}, Lu0/s;->A(Lt0/t;Lx/f;)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v9, v9, 0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    invoke-virtual {v6}, Lx/f;->clear()V

    .line 151
    .line 152
    .line 153
    iget-boolean p1, v7, Lu0/s;->v:Z

    .line 154
    .line 155
    if-nez p1, :cond_7

    .line 156
    .line 157
    iput-boolean v3, v7, Lu0/s;->v:Z

    .line 158
    .line 159
    iget-object p1, v7, Lu0/s;->g:Landroid/os/Handler;

    .line 160
    .line 161
    iget-object v9, v7, Lu0/s;->w:Lkd/c;

    .line 162
    .line 163
    invoke-virtual {p1, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 164
    .line 165
    .line 166
    :cond_7
    invoke-virtual {v8}, Lx/f;->clear()V

    .line 167
    .line 168
    .line 169
    iput-object v7, v0, Lu0/r;->a:Lu0/s;

    .line 170
    .line 171
    iput-object v6, v0, Lu0/r;->b:Lx/f;

    .line 172
    .line 173
    iput-object v2, v0, Lu0/r;->c:LGf/b;

    .line 174
    .line 175
    iput v5, v0, Lu0/r;->f:I

    .line 176
    .line 177
    const-wide/16 v8, 0x64

    .line 178
    .line 179
    invoke-static {v8, v9, v0}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 183
    if-ne p1, v1, :cond_1

    .line 184
    .line 185
    :goto_4
    return-object v1

    .line 186
    :cond_8
    iget-object p1, v7, Lu0/s;->n:Lx/f;

    .line 187
    .line 188
    invoke-virtual {p1}, Lx/f;->clear()V

    .line 189
    .line 190
    .line 191
    sget-object p1, Lef/C;->a:Lef/C;

    .line 192
    .line 193
    return-object p1

    .line 194
    :goto_5
    move-object v7, p0

    .line 195
    goto :goto_6

    .line 196
    :catchall_1
    move-exception p1

    .line 197
    goto :goto_5

    .line 198
    :goto_6
    iget-object v0, v7, Lu0/s;->n:Lx/f;

    .line 199
    .line 200
    invoke-virtual {v0}, Lx/f;->clear()V

    .line 201
    .line 202
    .line 203
    throw p1
.end method

.method public final k(JZ)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lu0/s;->p()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "currentSemanticsNodes"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-wide v1, Ld0/c;->d:J

    .line 15
    .line 16
    invoke-static {p1, p2, v1, v2}, Ld0/c;->a(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_6

    .line 21
    .line 22
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_5

    .line 31
    .line 32
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_5

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    if-ne p3, v1, :cond_0

    .line 44
    .line 45
    sget-object p3, Lx0/n;->n:Lx0/q;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    if-nez p3, :cond_4

    .line 49
    .line 50
    sget-object p3, Lx0/n;->m:Lx0/q;

    .line 51
    .line 52
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    .line 53
    .line 54
    move-object v1, v0

    .line 55
    check-cast v1, Ljava/util/Collection;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_6

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lu0/m0;

    .line 79
    .line 80
    iget-object v2, v1, Lu0/m0;->b:Landroid/graphics/Rect;

    .line 81
    .line 82
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 83
    .line 84
    int-to-float v3, v3

    .line 85
    iget v4, v2, Landroid/graphics/Rect;->top:I

    .line 86
    .line 87
    int-to-float v4, v4

    .line 88
    iget v5, v2, Landroid/graphics/Rect;->right:I

    .line 89
    .line 90
    int-to-float v5, v5

    .line 91
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 92
    .line 93
    int-to-float v2, v2

    .line 94
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    cmpl-float v3, v6, v3

    .line 99
    .line 100
    if-ltz v3, :cond_2

    .line 101
    .line 102
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    cmpg-float v3, v3, v5

    .line 107
    .line 108
    if-gez v3, :cond_2

    .line 109
    .line 110
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    cmpl-float v3, v3, v4

    .line 115
    .line 116
    if-ltz v3, :cond_2

    .line 117
    .line 118
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    cmpg-float v2, v3, v2

    .line 123
    .line 124
    if-gez v2, :cond_2

    .line 125
    .line 126
    iget-object v1, v1, Lu0/m0;->a:Lx0/k;

    .line 127
    .line 128
    invoke-virtual {v1}, Lx0/k;->f()Lx0/g;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1, p3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-nez v1, :cond_3

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    .line 140
    .line 141
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_4
    new-instance p1, LE5/Q;

    .line 146
    .line 147
    const/16 p2, 0x9

    .line 148
    .line 149
    const/4 p3, 0x0

    .line 150
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    const-string p2, "Offset argument contained a NaN value."

    .line 157
    .line 158
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :cond_6
    :goto_2
    return-void
.end method

.method public final l(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "obtain(eventType)"

    .line 6
    .line 7
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    const-string v0, "android.view.View"

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lu0/s;->d:Lu0/n;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lu0/s;->p()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lu0/m0;

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    iget-object p1, p1, Lu0/m0;->a:Lx0/k;

    .line 52
    .line 53
    invoke-virtual {p1}, Lx0/k;->f()Lx0/g;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v0, Lx0/n;->v:Lx0/q;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lx0/g;->a(Lx0/q;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-object p2
.end method

.method public final m(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lu0/s;->l(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p5, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_3
    return-object p1
.end method

.method public final n(Lx0/k;)I
    .locals 4

    .line 1
    iget-object v0, p1, Lx0/k;->e:Lx0/g;

    .line 2
    .line 3
    sget-object v1, Lx0/n;->a:Lx0/q;

    .line 4
    .line 5
    sget-object v1, Lx0/n;->a:Lx0/q;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lx0/g;->a(Lx0/q;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lx0/n;->s:Lx0/q;

    .line 14
    .line 15
    iget-object p1, p1, Lx0/k;->e:Lx0/g;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lx0/g;->a(Lx0/q;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lz0/o;

    .line 28
    .line 29
    const-wide v0, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-long/2addr v0, v2

    .line 40
    long-to-int p1, v0

    .line 41
    return p1

    .line 42
    :cond_0
    iget p1, p0, Lu0/s;->l:I

    .line 43
    .line 44
    return p1
.end method

.method public final o(Lx0/k;)I
    .locals 3

    .line 1
    iget-object v0, p1, Lx0/k;->e:Lx0/g;

    .line 2
    .line 3
    sget-object v1, Lx0/n;->a:Lx0/q;

    .line 4
    .line 5
    sget-object v1, Lx0/n;->a:Lx0/q;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lx0/g;->a(Lx0/q;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lx0/n;->s:Lx0/q;

    .line 14
    .line 15
    iget-object p1, p1, Lx0/k;->e:Lx0/g;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lx0/g;->a(Lx0/q;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lz0/o;

    .line 28
    .line 29
    const/16 v0, 0x20

    .line 30
    .line 31
    const-wide/16 v1, 0x0

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    shr-long v0, v1, v0

    .line 37
    .line 38
    long-to-int p1, v0

    .line 39
    return p1

    .line 40
    :cond_0
    iget p1, p0, Lu0/s;->l:I

    .line 41
    .line 42
    return p1
.end method

.method public final p()Ljava/util/Map;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lu0/s;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lu0/s;->d:Lu0/n;

    .line 6
    .line 7
    invoke-virtual {v0}, Lu0/n;->getSemanticsOwner()Lx0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "<this>"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lx0/l;->a()Lx0/k;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Lx0/k;->g:Lt0/t;

    .line 26
    .line 27
    iget-boolean v3, v2, Lt0/t;->s:Z

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2}, Lt0/t;->r()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v2, Landroid/graphics/Region;

    .line 39
    .line 40
    invoke-direct {v2}, Landroid/graphics/Region;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lx0/k;->d()Ld0/d;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, Le0/z;->r(Ld0/d;)Landroid/graphics/Rect;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v2, v3}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v0, v1, v0}, Lu0/Q;->g(Landroid/graphics/Region;Lx0/k;Ljava/util/LinkedHashMap;Lx0/k;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_0
    iput-object v1, p0, Lu0/s;->r:Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Lu0/s;->p:Z

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lu0/s;->r:Ljava/lang/Object;

    .line 63
    .line 64
    return-object v0
.end method

.method public final r()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/s;->f:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final s(Lt0/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/s;->n:Lx/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx/f;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lu0/s;->o:LGf/e;

    .line 10
    .line 11
    sget-object v0, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-interface {p1, v0}, LGf/w;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final t(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/s;->d:Lu0/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu0/n;->getSemanticsOwner()Lx0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lx0/l;->a()Lx0/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Lx0/k;->f:I

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    :cond_0
    return p1
.end method

.method public final u(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu0/s;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lu0/s;->d:Lu0/n;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1, v0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final v(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lu0/s;->r()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lu0/s;->l(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-static {p4}, Lff/B;->s(Ljava/util/List;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p1}, Lu0/s;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1

    .line 39
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public final x(IILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lu0/s;->t(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Lu0/s;->l(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lu0/s;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final y(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lu0/s;->q:Lu0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lu0/p;->a:Lx0/k;

    .line 6
    .line 7
    iget v2, v1, Lx0/k;->f:I

    .line 8
    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, v0, Lu0/p;->f:J

    .line 17
    .line 18
    sub-long/2addr v2, v4

    .line 19
    const-wide/16 v4, 0x3e8

    .line 20
    .line 21
    cmp-long p1, v2, v4

    .line 22
    .line 23
    if-gtz p1, :cond_1

    .line 24
    .line 25
    iget p1, v1, Lx0/k;->f:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lu0/s;->t(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 v2, 0x20000

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, Lu0/s;->l(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget v2, v0, Lu0/p;->d:I

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 40
    .line 41
    .line 42
    iget v2, v0, Lu0/p;->e:I

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 45
    .line 46
    .line 47
    iget v2, v0, Lu0/p;->b:I

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    .line 50
    .line 51
    .line 52
    iget v0, v0, Lu0/p;->c:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1}, Lu0/s;->q(Lx0/k;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lu0/s;->u(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, Lu0/s;->q:Lu0/p;

    .line 73
    .line 74
    return-void
.end method

.method public final z(Lx0/k;Lu0/q;)V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v1}, Lx0/k;->e(Z)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    move v4, v1

    .line 16
    :goto_0
    iget-object v5, p1, Lx0/k;->g:Lt0/t;

    .line 17
    .line 18
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, Lx0/k;

    .line 25
    .line 26
    invoke-virtual {p0}, Lu0/s;->p()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    iget v8, v6, Lx0/k;->f:I

    .line 31
    .line 32
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-interface {v7, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    iget-object v7, p2, Lu0/q;->b:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    iget v6, v6, Lx0/k;->f:I

    .line 45
    .line 46
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-nez v7, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0, v5}, Lu0/s;->s(Lt0/t;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object p2, p2, Lu0/q;->b:Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_3

    .line 101
    .line 102
    invoke-virtual {p0, v5}, Lu0/s;->s(Lt0/t;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    invoke-virtual {p1, v1}, Lx0/k;->e(Z)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    :goto_1
    if-ge v1, p2, :cond_6

    .line 115
    .line 116
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lx0/k;

    .line 121
    .line 122
    invoke-virtual {p0}, Lu0/s;->p()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iget v3, v0, Lx0/k;->f:I

    .line 127
    .line 128
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_5

    .line 137
    .line 138
    iget-object v2, p0, Lu0/s;->t:Ljava/util/LinkedHashMap;

    .line 139
    .line 140
    iget v3, v0, Lx0/k;->f:I

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    check-cast v2, Lu0/q;

    .line 154
    .line 155
    invoke-virtual {p0, v0, v2}, Lu0/s;->z(Lx0/k;Lu0/q;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_6
    return-void
.end method
