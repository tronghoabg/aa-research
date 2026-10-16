.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/j;


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

.field public final b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

.field public final c:LKd/a;

.field public final d:LE4/n;

.field public final e:LC6/l;

.field public final f:LHf/j0;

.field public final g:LHf/j0;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;

.field public final j:LR8/a;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;ILandroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;)V
    .locals 11

    .line 1
    move-object/from16 v7, p5

    .line 2
    .line 3
    const-string v0, "dec"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "context"

    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "customUserEventBuilderService"

    .line 14
    .line 15
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "externalLinkHandler"

    .line 19
    .line 20
    move-object/from16 v8, p6

    .line 21
    .line 22
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 29
    .line 30
    move-object/from16 v0, p7

    .line 31
    .line 32
    iput-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 33
    .line 34
    sget-object v0, LEf/S;->a:LLf/e;

    .line 35
    .line 36
    sget-object v0, LJf/n;->a:LFf/e;

    .line 37
    .line 38
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iput-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->c:LKd/a;

    .line 43
    .line 44
    new-instance v0, LE4/n;

    .line 45
    .line 46
    invoke-direct {v0, p3, v5}, LE4/n;-><init>(ILKd/a;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->d:LE4/n;

    .line 50
    .line 51
    new-instance p3, LC6/l;

    .line 52
    .line 53
    iget-object v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0}, Lr7/e;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->d:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1}, Lr7/e;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->e:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v2}, Lr7/e;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {p3, v7, v0, v1, v2}, LC6/l;-><init>(Lcom/moloco/sdk/internal/services/events/c;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->e:LC6/l;

    .line 75
    .line 76
    const/4 p3, 0x7

    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-static {v0, v0, p3}, LHf/k0;->b(III)LHf/j0;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->f:LHf/j0;

    .line 83
    .line 84
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->g:LHf/j0;

    .line 85
    .line 86
    iget-object p3, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->a:Ljava/lang/String;

    .line 87
    .line 88
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->h:Ljava/lang/String;

    .line 89
    .line 90
    new-instance p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;

    .line 91
    .line 92
    iget-object v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->f:Ljava/lang/Integer;

    .line 93
    .line 94
    iget-object v1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;

    .line 95
    .line 96
    iget-object v2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;

    .line 99
    .line 100
    invoke-direct {p3, v0, v1, v2, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;-><init>(Ljava/lang/Integer;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;)V

    .line 101
    .line 102
    .line 103
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;

    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    if-eqz p2, :cond_0

    .line 107
    .line 108
    iget-object p3, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 109
    .line 110
    move-object v1, p3

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    move-object v1, p1

    .line 113
    :goto_0
    if-eqz p2, :cond_1

    .line 114
    .line 115
    iget p3, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->b:I

    .line 116
    .line 117
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    move-object v2, p3

    .line 122
    goto :goto_1

    .line 123
    :cond_1
    move-object v2, p1

    .line 124
    :goto_1
    if-eqz p2, :cond_2

    .line 125
    .line 126
    iget p3, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->c:I

    .line 127
    .line 128
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    move-object v3, p3

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    move-object v3, p1

    .line 135
    :goto_2
    if-eqz p2, :cond_3

    .line 136
    .line 137
    iget-object p1, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;->d:Ljava/lang/String;

    .line 138
    .line 139
    :cond_3
    move-object v4, p1

    .line 140
    new-instance v0, LR8/a;

    .line 141
    .line 142
    const/4 v9, 0x0

    .line 143
    const/4 v10, 0x0

    .line 144
    move-object v6, p4

    .line 145
    invoke-direct/range {v0 .. v10}, LR8/a;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;LKd/a;Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->j:LR8/a;

    .line 149
    .line 150
    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->c:LKd/a;

    .line 3
    .line 4
    invoke-static {v1, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->j:LR8/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LR8/a;->destroy()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->d:LE4/n;

    .line 2
    .line 3
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LHf/e0;

    .line 6
    .line 7
    return-object v0
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;->d:LE4/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LE4/n;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
