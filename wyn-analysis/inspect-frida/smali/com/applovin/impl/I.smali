.class public final synthetic Lcom/applovin/impl/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:Lcom/applovin/impl/e1;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/e1;Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/I;->a:Lcom/applovin/impl/e1;

    iput-object p2, p0, Lcom/applovin/impl/I;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/applovin/impl/I;->c:Landroid/widget/FrameLayout;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/I;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/applovin/impl/I;->c:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/applovin/impl/I;->a:Lcom/applovin/impl/e1;

    invoke-static {v2, v0, v1}, Lcom/applovin/impl/e1;->e(Lcom/applovin/impl/e1;Landroid/view/View;Landroid/widget/FrameLayout;)V

    return-void
.end method
