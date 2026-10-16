.class public final Lp/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/view/ActionProvider;

.field public final synthetic c:Lp/r;

.field public d:Lcom/google/android/gms/ads/nativead/l;


# direct methods
.method public constructor <init>(Lp/r;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/n;->c:Lp/r;

    .line 5
    .line 6
    iput-object p2, p0, Lp/n;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lp/n;->b:Landroid/view/ActionProvider;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lp/m;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lp/n;->b:Landroid/view/ActionProvider;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final onActionProviderVisibilityChanged(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lp/n;->d:Lcom/google/android/gms/ads/nativead/l;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lp/m;

    .line 8
    .line 9
    iget-object p1, p1, Lp/m;->n:Lp/k;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p1, Lp/k;->h:Z

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lp/k;->p(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
