.class public final LP4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB4/k;


# instance fields
.field public final b:LK4/a;


# direct methods
.method public constructor <init>(LK4/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LP4/d;->b:LK4/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LE4/B;II)LE4/B;
    .locals 1

    .line 1
    invoke-interface {p2}, LE4/B;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, LP4/c;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Lcom/bumptech/glide/b;->a:LF4/a;

    .line 12
    .line 13
    iget-object p4, p3, LP4/c;->a:LP4/b;

    .line 14
    .line 15
    iget-object p4, p4, LP4/b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p4, LP4/h;

    .line 18
    .line 19
    iget-object p4, p4, LP4/h;->l:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    new-instance v0, LL4/c;

    .line 22
    .line 23
    invoke-direct {v0, p1, p4}, LL4/c;-><init>(LF4/a;Landroid/graphics/Bitmap;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LP4/d;->b:LK4/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    if-nez p4, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, LL4/c;->a()V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object p3, p3, LP4/c;->a:LP4/b;

    .line 41
    .line 42
    iget-object p3, p3, LP4/b;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p3, LP4/h;

    .line 45
    .line 46
    iget-object p4, v0, LL4/c;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p4, Landroid/graphics/Bitmap;

    .line 49
    .line 50
    invoke-virtual {p3, p1, p4}, LP4/h;->c(LK4/a;Landroid/graphics/Bitmap;)V

    .line 51
    .line 52
    .line 53
    return-object p2
.end method

.method public final b(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    iget-object p1, p0, LP4/d;->b:LK4/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LP4/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LP4/d;

    .line 6
    .line 7
    iget-object v0, p0, LP4/d;->b:LK4/a;

    .line 8
    .line 9
    iget-object p1, p1, LP4/d;->b:LK4/a;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LP4/d;->b:LK4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
