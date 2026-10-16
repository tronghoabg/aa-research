.class public final LD9/h;
.super LD9/s;
.source "SourceFile"


# instance fields
.field public final synthetic n:Landroid/view/WindowManager$LayoutParams;

.field public final synthetic o:Landroid/view/WindowManager;

.field public final synthetic p:LE9/c;


# direct methods
.method public constructor <init>(Landroid/view/View;LS3/l;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;LE9/c;)V
    .locals 0

    .line 1
    iput-object p3, p0, LD9/h;->n:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    iput-object p4, p0, LD9/h;->o:Landroid/view/WindowManager;

    .line 4
    .line 5
    iput-object p5, p0, LD9/h;->p:LE9/c;

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, LD9/s;-><init>(Landroid/view/View;LS3/l;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, LD9/h;->n:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 4
    .line 5
    int-to-float v0, v0

    .line 6
    return v0
.end method

.method public final c(F)V
    .locals 2

    .line 1
    float-to-int p1, p1

    .line 2
    iget-object v0, p0, LD9/h;->n:Landroid/view/WindowManager$LayoutParams;

    .line 3
    .line 4
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 5
    .line 6
    iget-object p1, p0, LD9/h;->p:LE9/c;

    .line 7
    .line 8
    invoke-virtual {p1}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v1, p0, LD9/h;->o:Landroid/view/WindowManager;

    .line 13
    .line 14
    invoke-interface {v1, p1, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
