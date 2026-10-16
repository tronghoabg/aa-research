.class public final Landroidx/activity/x;
.super Landroidx/activity/o;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/x;->d:I

    iput-object p1, p0, Landroidx/activity/x;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/activity/o;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/activity/x;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/x;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkc/l;

    .line 9
    .line 10
    const-string v1, "onBackPressed"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lkc/l;->G(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v0, v0, Lkc/l;->b:Lkc/f;

    .line 19
    .line 20
    invoke-virtual {v0}, Lkc/f;->c()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Lkc/f;->b:Llc/b;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Llc/b;->i:Lac/a;

    .line 28
    .line 29
    iget-object v0, v0, Lac/a;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Luc/r;

    .line 32
    .line 33
    const-string v1, "popRoute"

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v1, v2, v2}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 41
    .line 42
    const-string v1, "Invoked onBackPressed() before FlutterFragment was attached to an Activity."

    .line 43
    .line 44
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, Landroidx/activity/x;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ltf/l;

    .line 51
    .line 52
    invoke-interface {v0, p0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
