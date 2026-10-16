.class public final Ll4/a;
.super Landroidx/recyclerview/widget/m0;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final c:Landroid/widget/CompoundButton;

.field public final d:Ll4/b;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll4/b;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/m0;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0a01a7

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/CompoundButton;

    .line 12
    .line 13
    iput-object v0, p0, Ll4/a;->c:Landroid/widget/CompoundButton;

    .line 14
    .line 15
    const v0, 0x7f0a01b1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p2, p0, Ll4/a;->d:Ll4/b;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p2, Ll4/b;->i:Ll4/g;

    .line 30
    .line 31
    iget-object p1, p1, Ll4/g;->c:Ll4/e;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll4/a;->d:Ll4/b;

    .line 2
    .line 3
    iget-object v1, v0, Ll4/b;->k:Ll4/g;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/m0;->getAdapterPosition()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Ll4/b;->i:Ll4/g;

    .line 15
    .line 16
    iget-object v1, v1, Ll4/g;->c:Ll4/e;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Ll4/b;->k:Ll4/g;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/m0;->getAdapterPosition()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v0, p1, v1, v2}, Ll4/g;->b(Landroid/view/View;IZ)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ll4/a;->d:Ll4/b;

    .line 2
    .line 3
    iget-object v1, v0, Ll4/b;->k:Ll4/g;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/m0;->getAdapterPosition()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Ll4/b;->i:Ll4/g;

    .line 15
    .line 16
    iget-object v1, v1, Ll4/g;->c:Ll4/e;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Ll4/b;->k:Ll4/g;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/m0;->getAdapterPosition()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-virtual {v0, p1, v1, v2}, Ll4/g;->b(Landroid/view/View;IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return p1
.end method
