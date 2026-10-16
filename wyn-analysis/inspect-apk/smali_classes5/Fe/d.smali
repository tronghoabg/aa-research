.class public final LFe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LFe/h;

.field public final synthetic c:Lae/f;


# direct methods
.method public synthetic constructor <init>(LFe/h;Lae/f;I)V
    .locals 0

    .line 1
    iput p3, p0, LFe/d;->a:I

    iput-object p1, p0, LFe/d;->b:LFe/h;

    iput-object p2, p0, LFe/d;->c:Lae/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    .line 1
    iget v0, p0, LFe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-class v0, LFe/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget-object v1, p0, LFe/d;->c:Lae/f;

    .line 26
    .line 27
    iget-object v2, p0, LFe/d;->b:LFe/h;

    .line 28
    .line 29
    invoke-static {v2, v0, p1, v1}, LFe/h;->G(LFe/h;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lae/f;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    const-string v0, "error"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-class v0, LFe/c;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v0, 0x0

    .line 52
    :goto_1
    iget-object v1, p0, LFe/d;->c:Lae/f;

    .line 53
    .line 54
    iget-object v2, p0, LFe/d;->b:LFe/h;

    .line 55
    .line 56
    invoke-static {v2, v0, p1, v1}, LFe/h;->G(LFe/h;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lae/f;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSuccess(Ljava/util/Map;)V
    .locals 1

    .line 1
    iget v0, p0, LFe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "entitlements"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LFe/d;->b:LFe/h;

    .line 12
    .line 13
    iget-object v0, p0, LFe/d;->c:Lae/f;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LFe/h;->H(Lae/f;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    const-string v0, "entitlements"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LFe/d;->b:LFe/h;

    .line 25
    .line 26
    iget-object v0, p0, LFe/d;->c:Lae/f;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LFe/h;->H(Lae/f;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
