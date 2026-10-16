.class public final LFe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/fragment/app/FragmentActivity;

.field public final synthetic d:LFe/h;

.field public final synthetic e:Lae/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;LFe/h;Lae/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LFe/f;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LFe/f;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LFe/f;->c:Landroidx/fragment/app/FragmentActivity;

    .line 9
    .line 10
    iput-object p4, p0, LFe/f;->d:LFe/h;

    .line 11
    .line 12
    iput-object p5, p0, LFe/f;->e:Lae/f;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, LFe/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object v1, p0, LFe/f;->e:Lae/f;

    .line 21
    .line 22
    iget-object v2, p0, LFe/f;->d:LFe/h;

    .line 23
    .line 24
    invoke-static {v2, v0, p1, v1}, LFe/h;->G(LFe/h;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lae/f;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onSuccess(Ljava/util/Map;)V
    .locals 7

    .line 1
    const-string v0, "products"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LFe/f;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 13
    .line 14
    iget-object v1, p0, LFe/f;->e:Lae/f;

    .line 15
    .line 16
    iget-object v2, p0, LFe/f;->d:LFe/h;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const-class p1, LFe/e;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    const-string v3, "Product with id "

    .line 35
    .line 36
    const-string v4, " not found"

    .line 37
    .line 38
    invoke-static {v3, v0, v4}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2, p1, v0, v1}, LFe/h;->I(Ljava/lang/String;Ljava/lang/String;Lae/f;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 47
    .line 48
    invoke-direct {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v3, p0, LFe/f;->b:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setScreenUid(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->build()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v3, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 63
    .line 64
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v4, p0, LFe/f;->c:Landroidx/fragment/app/FragmentActivity;

    .line 69
    .line 70
    new-instance v5, LFe/d;

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    invoke-direct {v5, v2, v1, v6}, LFe/d;-><init>(LFe/h;Lae/f;I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v3, v4, p1, v0, v5}, Lcom/qonversion/android/sdk/Qonversion;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
