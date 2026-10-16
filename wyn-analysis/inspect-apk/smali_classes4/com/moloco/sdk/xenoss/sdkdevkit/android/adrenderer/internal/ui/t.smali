.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/t;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Ljava/lang/String;Lr0/h;LZ/k;LN/o;I)V
    .locals 4

    .line 1
    const-string v0, "modifier"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x1cb2a636

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, v0}, LN/o;->N(I)LN/o;

    .line 10
    .line 11
    .line 12
    and-int/lit8 v0, p4, 0x6

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p3, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int/2addr v0, p4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v0, p4

    .line 28
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p3, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x20

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v1, 0x10

    .line 42
    .line 43
    :goto_2
    or-int/2addr v0, v1

    .line 44
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 45
    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    invoke-virtual {p3, p2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    const/16 v1, 0x100

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    const/16 v1, 0x80

    .line 58
    .line 59
    :goto_3
    or-int/2addr v0, v1

    .line 60
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 61
    .line 62
    const/16 v2, 0x92

    .line 63
    .line 64
    if-ne v1, v2, :cond_7

    .line 65
    .line 66
    invoke-virtual {p3}, LN/o;->x()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_6

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_6
    invoke-virtual {p3}, LN/o;->I()V

    .line 74
    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_7
    :goto_4
    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LN/L0;

    .line 78
    .line 79
    invoke-virtual {p3, v1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Landroid/view/View;

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/view/View;->isHardwareAccelerated()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    const v2, 0x12b71c7e

    .line 90
    .line 91
    .line 92
    invoke-virtual {p3, v2}, LN/o;->M(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, v1}, LN/o;->f(Z)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-virtual {p3}, LN/o;->F()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-nez v2, :cond_8

    .line 104
    .line 105
    sget-object v2, LN/k;->a:LN/P;

    .line 106
    .line 107
    if-ne v3, v2, :cond_9

    .line 108
    .line 109
    :cond_8
    new-instance v3, LCd/z;

    .line 110
    .line 111
    const/4 v2, 0x1

    .line 112
    invoke-direct {v3, v1, v2}, LCd/z;-><init>(ZI)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p3, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    check-cast v3, Ltf/a;

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    invoke-virtual {p3, v2}, LN/o;->p(Z)V

    .line 122
    .line 123
    .line 124
    invoke-static {v3, p3}, LN/d;->g(Ltf/a;LN/o;)V

    .line 125
    .line 126
    .line 127
    new-instance v2, Lh4/g;

    .line 128
    .line 129
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LN/L0;

    .line 130
    .line 131
    invoke-virtual {p3, v3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Landroid/content/Context;

    .line 136
    .line 137
    invoke-direct {v2, v3}, Lh4/g;-><init>(Landroid/content/Context;)V

    .line 138
    .line 139
    .line 140
    iput-object p0, v2, Lh4/g;->c:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iput-object v1, v2, Lh4/g;->i:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v2}, Lh4/g;->a()Lh4/h;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    and-int/lit16 v2, v0, 0x380

    .line 153
    .line 154
    or-int/lit8 v2, v2, 0x30

    .line 155
    .line 156
    shl-int/lit8 v0, v0, 0xf

    .line 157
    .line 158
    const/high16 v3, 0x380000

    .line 159
    .line 160
    and-int/2addr v0, v3

    .line 161
    or-int/2addr v0, v2

    .line 162
    invoke-static {v1, p2, p1, p3, v0}, Lcom/moloco/sdk/internal/publisher/H;->G(Lh4/h;LZ/k;Lr0/h;LN/o;I)V

    .line 163
    .line 164
    .line 165
    :goto_5
    invoke-virtual {p3}, LN/o;->r()LN/i0;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    if-eqz p3, :cond_a

    .line 170
    .line 171
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/b;

    .line 172
    .line 173
    invoke-direct {v0, p0, p1, p2, p4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/b;-><init>(Ljava/lang/String;Lr0/h;LZ/k;I)V

    .line 174
    .line 175
    .line 176
    iput-object v0, p3, LN/i0;->d:Ltf/p;

    .line 177
    .line 178
    :cond_a
    return-void
.end method
