.class public final LD9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ldf/a;


# direct methods
.method public synthetic constructor <init>(Ldf/a;I)V
    .locals 0

    .line 1
    iput p2, p0, LD9/b;->a:I

    iput-object p1, p0, LD9/b;->b:Ldf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LD9/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LD9/b;->b:Ldf/a;

    .line 7
    .line 8
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/bumptech/glide/h;

    .line 13
    .line 14
    new-instance v1, LD9/g;

    .line 15
    .line 16
    invoke-direct {v1, v0}, LD9/g;-><init>(Lcom/bumptech/glide/h;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    iget-object v0, p0, LD9/b;->b:Ldf/a;

    .line 21
    .line 22
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/app/Application;

    .line 27
    .line 28
    new-instance v1, LD9/a;

    .line 29
    .line 30
    invoke-direct {v1, v0}, LD9/a;-><init>(Landroid/app/Application;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
