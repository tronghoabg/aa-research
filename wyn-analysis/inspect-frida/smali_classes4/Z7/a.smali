.class public final LZ7/a;
.super LFe/b;
.source "SourceFile"


# instance fields
.field public final b:Landroid/graphics/Typeface;

.field public final c:Ly3/j;

.field public d:Z


# direct methods
.method public constructor <init>(Ly3/j;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LZ7/a;->b:Landroid/graphics/Typeface;

    .line 5
    .line 6
    iput-object p1, p0, LZ7/a;->c:Ly3/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(I)V
    .locals 1

    .line 1
    iget-boolean p1, p0, LZ7/a;->d:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, LZ7/a;->c:Ly3/j;

    .line 6
    .line 7
    iget-object p1, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LW7/b;

    .line 10
    .line 11
    iget-object v0, p0, LZ7/a;->b:Landroid/graphics/Typeface;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, LW7/b;->j(Landroid/graphics/Typeface;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, LW7/b;->h(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final L(Landroid/graphics/Typeface;Z)V
    .locals 0

    .line 1
    iget-boolean p2, p0, LZ7/a;->d:Z

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, LZ7/a;->c:Ly3/j;

    .line 6
    .line 7
    iget-object p2, p2, Ly3/j;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, LW7/b;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, LW7/b;->j(Landroid/graphics/Typeface;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p2, p1}, LW7/b;->h(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
