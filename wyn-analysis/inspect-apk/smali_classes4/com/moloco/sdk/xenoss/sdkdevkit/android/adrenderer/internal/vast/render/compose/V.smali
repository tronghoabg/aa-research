.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;

.field public final synthetic b:LKd/a;

.field public final synthetic c:LN/V;

.field public final synthetic d:LN/V;

.field public final synthetic e:LN/V;

.field public final synthetic f:LN/V;

.field public final synthetic g:LN/V;

.field public final synthetic h:LN/V;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;LKd/a;LN/V;LN/V;LN/V;LN/V;LN/V;LN/V;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;

    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->b:LKd/a;

    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->c:LN/V;

    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->d:LN/V;

    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->e:LN/V;

    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->f:LN/V;

    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->g:LN/V;

    iput-object p8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->h:LN/V;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    check-cast p1, LN/C;

    .line 4
    .line 5
    const-string v2, "$this$DisposableEffect"

    .line 6
    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;

    .line 11
    .line 12
    iget-object p1, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->d:LHf/x0;

    .line 13
    .line 14
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/X;

    .line 15
    .line 16
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->e:LN/V;

    .line 17
    .line 18
    iget-object v8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->f:LN/V;

    .line 19
    .line 20
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->c:LN/V;

    .line 21
    .line 22
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->d:LN/V;

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    invoke-direct/range {v3 .. v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/X;-><init>(LN/V;LN/V;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;LN/V;LN/V;Ljf/c;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, LHf/Z;

    .line 29
    .line 30
    invoke-direct {v2, p1, v3, v1}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->b:LKd/a;

    .line 34
    .line 35
    invoke-static {v2, p1}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 40
    .line 41
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/Y;

    .line 42
    .line 43
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->g:LN/V;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    invoke-direct {v4, v5, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/Y;-><init>(LN/V;Ljf/c;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, LHf/Z;

    .line 50
    .line 51
    iget-object v9, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->g:LHf/x0;

    .line 52
    .line 53
    invoke-direct {v5, v9, v4, v1}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v5, p1}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    new-instance v5, LHf/A;

    .line 61
    .line 62
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->k:LHf/x0;

    .line 63
    .line 64
    invoke-direct {v5, v3, v0}, LHf/A;-><init>(LHf/v0;I)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/Z;

    .line 68
    .line 69
    iget-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/V;->h:LN/V;

    .line 70
    .line 71
    invoke-direct {v3, v9, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/Z;-><init>(LN/V;Ljf/c;)V

    .line 72
    .line 73
    .line 74
    new-instance v8, LHf/Z;

    .line 75
    .line 76
    invoke-direct {v8, v5, v3, v1}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v8, p1}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/4 v3, 0x3

    .line 84
    new-array v3, v3, [LEf/m0;

    .line 85
    .line 86
    aput-object v2, v3, v1

    .line 87
    .line 88
    aput-object v4, v3, v0

    .line 89
    .line 90
    const/4 v0, 0x2

    .line 91
    aput-object p1, v3, v0

    .line 92
    .line 93
    invoke-static {v3}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/h0;

    .line 98
    .line 99
    invoke-direct {v0, p1, v6, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/h0;-><init>(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;LN/V;)V

    .line 100
    .line 101
    .line 102
    return-object v0
.end method
