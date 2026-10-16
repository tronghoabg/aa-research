.class public final Lq/e;
.super Lp/v;
.source "SourceFile"


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Lq/i;


# direct methods
.method public constructor <init>(Lq/i;Landroid/content/Context;Lp/D;Landroid/view/View;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Lq/e;->l:I

    .line 8
    iput-object p1, p0, Lq/e;->m:Lq/i;

    const/4 v6, 0x0

    const v2, 0x7f040022

    move-object v1, p0

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    .line 9
    invoke-direct/range {v1 .. v6}, Lp/v;-><init>(ILandroid/content/Context;Landroid/view/View;Lp/k;Z)V

    .line 10
    iget-object p2, v5, Lp/D;->A:Lp/m;

    .line 11
    iget p2, p2, Lp/m;->x:I

    const/16 p3, 0x20

    and-int/2addr p2, p3

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p1, Lq/i;->i:Lq/h;

    if-nez p2, :cond_1

    .line 13
    iget-object p2, p1, Lq/i;->h:Lp/z;

    .line 14
    check-cast p2, Landroid/view/View;

    .line 15
    :cond_1
    iput-object p2, v1, Lp/v;->e:Landroid/view/View;

    .line 16
    :goto_0
    iget-object p1, p1, Lq/i;->w:Lac/a;

    .line 17
    iput-object p1, v1, Lp/v;->h:Lp/w;

    .line 18
    iget-object p2, v1, Lp/v;->i:Lp/s;

    if-eqz p2, :cond_2

    .line 19
    invoke-interface {p2, p1}, Lp/x;->c(Lp/w;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Lq/i;Landroid/content/Context;Lp/k;Landroid/view/View;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, Lq/e;->l:I

    .line 1
    iput-object p1, p0, Lq/e;->m:Lq/i;

    const v2, 0x7f040022

    const/4 v6, 0x1

    move-object v1, p0

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v1 .. v6}, Lp/v;-><init>(ILandroid/content/Context;Landroid/view/View;Lp/k;Z)V

    const p2, 0x800005

    .line 3
    iput p2, v1, Lp/v;->f:I

    .line 4
    iget-object p1, p1, Lq/i;->w:Lac/a;

    .line 5
    iput-object p1, v1, Lp/v;->h:Lp/w;

    .line 6
    iget-object p2, v1, Lp/v;->i:Lp/s;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, Lp/x;->c(Lp/w;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Lq/e;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq/e;->m:Lq/i;

    .line 7
    .line 8
    iget-object v1, v0, Lq/i;->c:Lp/k;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Lp/k;->c(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lq/i;->s:Lq/e;

    .line 18
    .line 19
    invoke-super {p0}, Lp/v;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    const/4 v0, 0x0

    .line 24
    iget-object v1, p0, Lq/e;->m:Lq/i;

    .line 25
    .line 26
    iput-object v0, v1, Lq/i;->t:Lq/e;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-super {p0}, Lp/v;->c()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
