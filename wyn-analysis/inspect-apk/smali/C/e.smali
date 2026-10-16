.class public final LC/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/b;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public final d:LNf/d;

.field public final synthetic e:LL0/b;


# direct methods
.method public constructor <init>(LL0/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LC/e;->a:I

    const-string v0, "density"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LC/e;->e:LL0/b;

    .line 7
    new-instance p1, LNf/d;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, LNf/d;-><init>(Z)V

    .line 8
    iput-object p1, p0, LC/e;->d:LNf/d;

    return-void
.end method

.method public constructor <init>(Lp0/t;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LC/e;->a:I

    const-string v0, "density"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LC/e;->e:LL0/b;

    .line 3
    new-instance p1, LNf/d;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, LNf/d;-><init>(Z)V

    .line 4
    iput-object p1, p0, LC/e;->d:LNf/d;

    return-void
.end method


# virtual methods
.method public final a(Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LC/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;

    .line 12
    .line 13
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;->d:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;->d:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;-><init>(LC/e;Llf/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;->b:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;->d:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;->a:LC/e;

    .line 42
    .line 43
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-boolean p1, p0, LC/e;->b:Z

    .line 59
    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    iget-boolean p1, p0, LC/e;->c:Z

    .line 63
    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    iput-object p0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;->a:LC/e;

    .line 67
    .line 68
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/a;->d:I

    .line 69
    .line 70
    iget-object p1, p0, LC/e;->d:LNf/d;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move-object v0, p0

    .line 80
    :goto_1
    iget-boolean p1, v0, LC/e;->b:Z

    .line 81
    .line 82
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_2
    return-object v1

    .line 87
    :pswitch_0
    instance-of v0, p1, LC/d;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    move-object v0, p1

    .line 92
    check-cast v0, LC/d;

    .line 93
    .line 94
    iget v1, v0, LC/d;->d:I

    .line 95
    .line 96
    const/high16 v2, -0x80000000

    .line 97
    .line 98
    and-int v3, v1, v2

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    sub-int/2addr v1, v2

    .line 103
    iput v1, v0, LC/d;->d:I

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    new-instance v0, LC/d;

    .line 107
    .line 108
    invoke-direct {v0, p0, p1}, LC/d;-><init>(LC/e;Llf/c;)V

    .line 109
    .line 110
    .line 111
    :goto_3
    iget-object p1, v0, LC/d;->b:Ljava/lang/Object;

    .line 112
    .line 113
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 114
    .line 115
    iget v2, v0, LC/d;->d:I

    .line 116
    .line 117
    const/4 v3, 0x1

    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    if-ne v2, v3, :cond_5

    .line 121
    .line 122
    iget-object v0, v0, LC/d;->a:LC/e;

    .line 123
    .line 124
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 131
    .line 132
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_6
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-boolean p1, p0, LC/e;->b:Z

    .line 140
    .line 141
    if-nez p1, :cond_7

    .line 142
    .line 143
    iget-boolean p1, p0, LC/e;->c:Z

    .line 144
    .line 145
    if-nez p1, :cond_7

    .line 146
    .line 147
    iput-object p0, v0, LC/d;->a:LC/e;

    .line 148
    .line 149
    iput v3, v0, LC/d;->d:I

    .line 150
    .line 151
    iget-object p1, p0, LC/e;->d:LNf/d;

    .line 152
    .line 153
    invoke-virtual {p1, v0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-ne p1, v1, :cond_7

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move-object v0, p0

    .line 161
    :goto_4
    iget-boolean p1, v0, LC/e;->b:Z

    .line 162
    .line 163
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    :goto_5
    return-object v1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, LC/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 7
    .line 8
    check-cast v0, Lp0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 11
    .line 12
    invoke-interface {v0}, LL0/b;->b()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :pswitch_0
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 18
    .line 19
    invoke-interface {v0}, LL0/b;->b()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget v0, p0, LC/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 7
    .line 8
    check-cast v0, Lp0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 11
    .line 12
    invoke-interface {v0}, LL0/b;->getFontScale()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :pswitch_0
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 18
    .line 19
    invoke-interface {v0}, LL0/b;->getFontScale()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(F)I
    .locals 1

    .line 1
    iget v0, p0, LC/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 7
    .line 8
    check-cast v0, Lp0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LL0/b;->j(F)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :pswitch_0
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 18
    .line 19
    invoke-interface {v0, p1}, LL0/b;->j(F)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(J)F
    .locals 1

    .line 1
    iget v0, p0, LC/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 7
    .line 8
    check-cast v0, Lp0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, LL0/b;->l(J)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :pswitch_0
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, LL0/b;->l(J)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final t(F)F
    .locals 1

    .line 1
    iget v0, p0, LC/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 7
    .line 8
    check-cast v0, Lp0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LL0/b;->t(F)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :pswitch_0
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 18
    .line 19
    invoke-interface {v0, p1}, LL0/b;->t(F)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final y(J)J
    .locals 1

    .line 1
    iget v0, p0, LC/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 7
    .line 8
    check-cast v0, Lp0/t;

    .line 9
    .line 10
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, LL0/b;->y(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    return-wide p1

    .line 17
    :pswitch_0
    iget-object v0, p0, LC/e;->e:LL0/b;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, LL0/b;->y(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
