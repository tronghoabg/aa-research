.class public final LG9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# instance fields
.field public final synthetic a:I

.field public final b:LG9/e;


# direct methods
.method public synthetic constructor <init>(ILG9/e;)V
    .locals 0

    .line 1
    iput p1, p0, LG9/f;->a:I

    iput-object p2, p0, LG9/f;->b:LG9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LG9/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG9/f;->b:LG9/e;

    .line 7
    .line 8
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/app/Application;

    .line 11
    .line 12
    const-string v1, "layout_inflater"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/view/LayoutInflater;

    .line 19
    .line 20
    invoke-static {v0}, LA6/h;->j(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    iget-object v0, p0, LG9/f;->b:LG9/e;

    .line 25
    .line 26
    iget-object v0, v0, LG9/e;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, LN9/h;

    .line 29
    .line 30
    invoke-static {v0}, LA6/h;->j(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    iget-object v0, p0, LG9/f;->b:LG9/e;

    .line 35
    .line 36
    iget-object v0, v0, LG9/e;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LD9/k;

    .line 39
    .line 40
    invoke-static {v0}, LA6/h;->j(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
