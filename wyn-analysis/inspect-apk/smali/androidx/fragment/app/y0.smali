.class public final synthetic Landroidx/fragment/app/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/o;

.field public final synthetic c:Landroidx/fragment/app/A0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/o;Landroidx/fragment/app/A0;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/fragment/app/y0;->a:I

    iput-object p1, p0, Landroidx/fragment/app/y0;->b:Landroidx/fragment/app/o;

    iput-object p2, p0, Landroidx/fragment/app/y0;->c:Landroidx/fragment/app/A0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/fragment/app/y0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/y0;->b:Landroidx/fragment/app/o;

    .line 7
    .line 8
    const-string v1, "this$0"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/y0;->c:Landroidx/fragment/app/A0;

    .line 14
    .line 15
    iget-object v2, v0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    const-string v0, "this$0"

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/fragment/app/y0;->b:Landroidx/fragment/app/o;

    .line 29
    .line 30
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "$operation"

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/fragment/app/y0;->c:Landroidx/fragment/app/A0;

    .line 36
    .line 37
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroidx/fragment/app/o;->a(Landroidx/fragment/app/A0;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    iget-object v0, p0, Landroidx/fragment/app/y0;->b:Landroidx/fragment/app/o;

    .line 45
    .line 46
    const-string v1, "this$0"

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/fragment/app/y0;->c:Landroidx/fragment/app/A0;

    .line 52
    .line 53
    iget-object v2, v0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    iget v2, v1, Landroidx/fragment/app/A0;->a:I

    .line 62
    .line 63
    iget-object v1, v1, Landroidx/fragment/app/A0;->c:Landroidx/fragment/app/F;

    .line 64
    .line 65
    iget-object v1, v1, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 66
    .line 67
    const-string v3, "operation.fragment.mView"

    .line 68
    .line 69
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, Landroidx/fragment/app/o;->a:Landroid/view/ViewGroup;

    .line 73
    .line 74
    invoke-static {v2, v1, v0}, LVa/M6;->g(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
