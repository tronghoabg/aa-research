.class public final synthetic Lcom/moloco/sdk/internal/publisher/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/V;

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

.field public final synthetic c:LHf/j0;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/publisher/V;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;LHf/j0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/K;->a:Lcom/moloco/sdk/internal/publisher/V;

    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/K;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/K;->c:LHf/j0;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/K;->a:Lcom/moloco/sdk/internal/publisher/V;

    .line 2
    .line 3
    iget-object p1, v3, Lcom/moloco/sdk/internal/publisher/V;->s:LKd/a;

    .line 4
    .line 5
    new-instance v0, Lcom/moloco/sdk/internal/publisher/T;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/K;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/K;->c:LHf/j0;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v1, p2

    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/internal/publisher/T;-><init>(Landroid/view/MotionEvent;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;Lcom/moloco/sdk/internal/publisher/V;LHf/j0;Ljf/c;)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-static {p1, p2, v0, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1
.end method
