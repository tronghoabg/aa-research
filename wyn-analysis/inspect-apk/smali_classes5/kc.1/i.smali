.class public final Lkc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;


# instance fields
.field public final synthetic a:Lkc/l;


# direct methods
.method public constructor <init>(Lkc/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkc/i;->a:Lkc/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    sget v0, Lkc/l;->e:I

    .line 2
    .line 3
    iget-object v0, p0, Lkc/i;->a:Lkc/l;

    .line 4
    .line 5
    const-string v1, "onWindowFocusChanged"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lkc/l;->G(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lkc/l;->b:Lkc/f;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lkc/f;->s(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
