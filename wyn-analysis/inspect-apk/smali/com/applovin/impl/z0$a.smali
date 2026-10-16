.class Lcom/applovin/impl/z0$a;
.super Lcom/applovin/impl/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/z0;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/z0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/applovin/impl/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/applovin/impl/b;->onActivityResumed(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/applovin/sdk/AppLovinWebViewActivity;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;)Lcom/applovin/impl/v0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/applovin/impl/z0;->b(Lcom/applovin/impl/z0;)Landroid/app/Dialog;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/applovin/impl/z0;->b(Lcom/applovin/impl/z0;)Landroid/app/Dialog;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v0, v2}, Lcom/applovin/impl/z0;->b(Lcom/applovin/impl/z0;Landroid/app/Dialog;)Landroid/app/Activity;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/applovin/impl/d;->d(Landroid/app/Activity;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/applovin/impl/z0;->b(Lcom/applovin/impl/z0;)Landroid/app/Dialog;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Landroid/app/Dialog;)Landroid/app/Dialog;

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;)Lcom/applovin/impl/v0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v2, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 64
    .line 65
    invoke-static {v2, v1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;)Lcom/applovin/impl/v0;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/applovin/impl/z0$a;->a:Lcom/applovin/impl/z0;

    .line 69
    .line 70
    invoke-static {v1}, Lcom/applovin/impl/z0;->c(Lcom/applovin/impl/z0;)Lcom/applovin/impl/v0;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v1, v2, v0, p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
