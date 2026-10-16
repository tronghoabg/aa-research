.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LK3/r;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public constructor <init>(LK3/r;IIIILjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->b:LK3/r;

    .line 2
    .line 3
    iput p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->c:I

    .line 4
    .line 5
    iput p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->d:I

    .line 6
    .line 7
    iput p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->e:I

    .line 8
    .line 9
    iput p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->f:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;

    .line 2
    .line 3
    iget v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->e:I

    .line 4
    .line 5
    iget v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->f:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->b:LK3/r;

    .line 8
    .line 9
    iget v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->c:I

    .line 10
    .line 11
    iget v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->d:I

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;-><init>(LK3/r;IIIILjf/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->a:I

    .line 26
    .line 27
    const-wide/16 v1, 0xc8

    .line 28
    .line 29
    invoke-static {v1, v2, p0}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-ne p1, v0, :cond_2

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->b:LK3/r;

    .line 37
    .line 38
    iget-object v0, p1, LK3/r;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LHf/x0;

    .line 41
    .line 42
    iget-object v1, p1, LK3/r;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroid/webkit/WebView;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v0, v2, v1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    new-instance v0, Landroid/graphics/Rect;

    .line 62
    .line 63
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->e:I

    .line 64
    .line 65
    iget v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->f:I

    .line 66
    .line 67
    iget v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->c:I

    .line 68
    .line 69
    iget v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/J;->d:I

    .line 70
    .line 71
    invoke-direct {v0, v4, v5, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    add-int v3, v4, v1

    .line 83
    .line 84
    add-int v6, v5, v0

    .line 85
    .line 86
    iget-object v7, p1, LK3/r;->g:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v7, LK3/r;

    .line 89
    .line 90
    iget-object v8, v7, LK3/r;->f:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Landroid/graphics/Rect;

    .line 93
    .line 94
    invoke-virtual {v8, v4, v5, v3, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 95
    .line 96
    .line 97
    iget-object v9, v7, LK3/r;->g:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v9, Landroid/graphics/Rect;

    .line 100
    .line 101
    invoke-virtual {v7, v8, v9}, LK3/r;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 102
    .line 103
    .line 104
    iget-object v8, v7, LK3/r;->h:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v8, Landroid/graphics/Rect;

    .line 107
    .line 108
    invoke-virtual {v8, v4, v5, v3, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 109
    .line 110
    .line 111
    iget-object v9, v7, LK3/r;->i:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v9, Landroid/graphics/Rect;

    .line 114
    .line 115
    invoke-virtual {v7, v8, v9}, LK3/r;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 116
    .line 117
    .line 118
    iget-object v8, v7, LK3/r;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v8, Landroid/graphics/Rect;

    .line 121
    .line 122
    invoke-virtual {v8, v4, v5, v3, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 123
    .line 124
    .line 125
    iget-object v3, v7, LK3/r;->e:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, Landroid/graphics/Rect;

    .line 128
    .line 129
    invoke-virtual {v7, v8, v3}, LK3/r;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 130
    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    iget-object v4, v7, LK3/r;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v4, Landroid/graphics/Rect;

    .line 136
    .line 137
    invoke-virtual {v4, v3, v3, v1, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 138
    .line 139
    .line 140
    iget-object v0, v7, LK3/r;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Landroid/graphics/Rect;

    .line 143
    .line 144
    invoke-virtual {v7, v4, v0}, LK3/r;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/I;

    .line 148
    .line 149
    invoke-direct {v0, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/I;-><init>(LK3/r;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p1, LK3/r;->h:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, LHf/x0;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v2, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    sget-object p1, Lef/C;->a:Lef/C;

    .line 163
    .line 164
    return-object p1
.end method
