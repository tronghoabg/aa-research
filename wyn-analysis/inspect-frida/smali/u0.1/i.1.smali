.class public final synthetic Lu0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;


# instance fields
.field public final synthetic a:Lu0/n;


# direct methods
.method public synthetic constructor <init>(Lu0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/i;->a:Lu0/n;

    return-void
.end method


# virtual methods
.method public final onTouchModeChanged(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/i;->a:Lu0/n;

    .line 2
    .line 3
    const-string v1, "this$0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x2

    .line 13
    :goto_0
    iget-object v1, v0, Lu0/n;->c0:Ll0/c;

    .line 14
    .line 15
    iget-object v1, v1, Ll0/c;->a:LN/Y;

    .line 16
    .line 17
    new-instance v2, Ll0/a;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Ll0/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Lu0/n;->e:Lb7/k;

    .line 26
    .line 27
    iget-object p1, p1, Lb7/k;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lc0/g;

    .line 30
    .line 31
    invoke-static {p1}, Lvf/a;->P(Lc0/g;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
