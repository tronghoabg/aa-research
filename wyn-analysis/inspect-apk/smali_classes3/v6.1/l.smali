.class public Lv6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/k;
.implements Lzg/f;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/X;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lv6/l;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv6/l;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv6/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/WindowManager;

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lo1/c;->d(Landroid/view/Display;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv6/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->setPaymentRequestEnabled(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onFailure(Lzg/c;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lv6/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lzg/g;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lu6/u;->l(Lzg/g;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onResponse(Lzg/c;Lzg/Q;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lv6/l;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lzg/g;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lu6/u;->m(Lzg/g;Lzg/Q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
