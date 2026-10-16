.class public final LGe/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LGe/u;


# direct methods
.method public constructor <init>(LGe/u;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LGe/k;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LGe/k;->b:LGe/u;

    return-void
.end method

.method public constructor <init>(LGe/u;LGe/t;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, LGe/k;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LGe/k;->b:LGe/u;

    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 1
    iget v0, p0, LGe/k;->a:I

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
    invoke-static {p1}, LGe/c;->l(Lcom/qonversion/android/sdk/dto/QonversionError;)LGe/v;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, LGe/k;->b:LGe/u;

    .line 16
    .line 17
    invoke-interface {v0, p1}, LGe/u;->onError(LGe/v;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const-string v0, "error"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, LGe/c;->l(Lcom/qonversion/android/sdk/dto/QonversionError;)LGe/v;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, LGe/k;->b:LGe/u;

    .line 31
    .line 32
    invoke-interface {v0, p1}, LGe/u;->onError(LGe/v;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, LGe/t;->a(Z)Ljava/util/Map;

    move-result-object v0

    .line 2
    iget-object v1, p0, LGe/k;->b:LGe/u;

    invoke-interface {v1, v0}, LGe/u;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V
    .locals 1

    const-string v0, "remoteConfigList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, LGe/c;->e(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LGe/k;->b:LGe/u;

    invoke-interface {v0, p1}, LGe/u;->onSuccess(Ljava/util/Map;)V

    return-void
.end method
