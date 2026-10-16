.class public final Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;
.super Lhb/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhb/r;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;",
        "Lhb/K;",
        "moshi",
        "<init>",
        "(Lhb/K;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lhb/w;",
        "reader",
        "fromJson",
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "stringAdapter",
        "Lhb/r;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final options:Lhb/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final stringAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhb/K;)V
    .locals 7
    .param p1    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "moshi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v5, "project_key"

    .line 10
    .line 11
    const-string v6, "uid"

    .line 12
    .line 13
    const-string v1, "platform"

    .line 14
    .line 15
    const-string v2, "platform_version"

    .line 16
    .line 17
    const-string v3, "source"

    .line 18
    .line 19
    const-string v4, "source_version"

    .line 20
    .line 21
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->options:Lhb/u;

    .line 30
    .line 31
    sget-object v0, Lff/x;->a:Lff/x;

    .line 32
    .line 33
    const-string v1, "platform"

    .line 34
    .line 35
    const-class v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;
    .locals 18
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lhb/w;->b()V

    const/4 v2, 0x0

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    .line 3
    :goto_0
    invoke-virtual {v1}, Lhb/w;->o()Z

    move-result v2

    const-string v3, "platform_version"

    const-string v10, "platformVersion"

    const-string v11, "source_version"

    const-string v12, "sourceVersion"

    const-string v13, "project_key"

    const-string v14, "projectKey"

    const-string v15, "platform"

    move/from16 v16, v2

    const-string v2, "source"

    move-object/from16 v17, v4

    const-string v4, "uid"

    if-eqz v16, :cond_6

    move-object/from16 v16, v5

    .line 4
    iget-object v5, v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->options:Lhb/u;

    invoke-virtual {v1, v5}, Lhb/w;->W(Lhb/u;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    goto :goto_1

    .line 5
    :pswitch_0
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_0

    :goto_1
    move-object/from16 v5, v16

    :goto_2
    move-object/from16 v4, v17

    goto :goto_0

    :cond_0
    invoke-static {v4, v4, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 6
    :pswitch_1
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v14, v13, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 7
    :pswitch_2
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {v12, v11, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 9
    :pswitch_3
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v2, v2, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 10
    :pswitch_4
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    goto :goto_2

    .line 11
    :cond_4
    invoke-static {v10, v3, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_5
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    move-object/from16 v5, v16

    goto/16 :goto_0

    :cond_5
    invoke-static {v15, v15, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 13
    :pswitch_6
    invoke-virtual {v1}, Lhb/w;->Y()V

    .line 14
    invoke-virtual {v1}, Lhb/w;->Z()V

    goto :goto_1

    :cond_6
    move-object/from16 v16, v5

    .line 15
    invoke-virtual {v1}, Lhb/w;->h()V

    move-object v5, v3

    .line 16
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    if-eqz v17, :cond_c

    if-eqz v16, :cond_b

    if-eqz v6, :cond_a

    if-eqz v7, :cond_9

    if-eqz v8, :cond_8

    if-eqz v9, :cond_7

    move-object/from16 v5, v16

    move-object/from16 v4, v17

    invoke-direct/range {v3 .. v9}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_7
    move-object v2, v4

    .line 17
    invoke-static {v2, v2, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 18
    :cond_8
    invoke-static {v14, v13, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 19
    :cond_9
    invoke-static {v12, v11, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 20
    :cond_a
    invoke-static {v2, v2, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 21
    :cond_b
    invoke-static {v10, v5, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 22
    :cond_c
    invoke-static {v15, v15, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "platform"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;->getPlatform()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "platform_version"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;->getPlatformVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "source"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "source_version"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;->getSourceVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    const-string v0, "project_key"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;->getProjectKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 13
    const-string v0, "uid"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest_DeviceInfoJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x2d

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(CrashRequest.DeviceInfo)"

    .line 4
    .line 5
    const-string v2, "toString(...)"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcb/a;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
