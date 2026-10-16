.class public final LG9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LG9/a;->a:I

    iput-object p1, p0, LG9/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lya/b;LF9/a;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, LG9/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, LG9/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LG9/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG9/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LS3/l;

    .line 9
    .line 10
    iget-object v0, v0, LS3/l;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lz9/B;

    .line 13
    .line 14
    invoke-static {v0}, LA6/h;->j(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, LG9/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LF9/a;

    .line 21
    .line 22
    invoke-virtual {v0}, LF9/a;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/app/Application;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, Lcom/bumptech/glide/b;->f:LR4/h;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, LR4/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, LA6/h;->j(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_1
    iget-object v0, p0, LG9/a;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ly3/j;

    .line 45
    .line 46
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Landroid/app/Application;

    .line 49
    .line 50
    invoke-static {v0}, LA6/h;->j(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
