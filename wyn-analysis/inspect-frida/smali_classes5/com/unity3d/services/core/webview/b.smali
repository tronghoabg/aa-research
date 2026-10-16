.class public final synthetic Lcom/unity3d/services/core/webview/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/r;
.implements Ld2/u;
.implements LN0/k;
.implements Ldd/a;
.implements Lq5/f;
.implements Ljg/b;
.implements Luc/c;
.implements Luc/b;
.implements Lld/c;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements LO9/a;
.implements Lna/m;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/unity3d/services/core/webview/b;->a:I

    iput-object p1, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final i(LO9/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln9/b;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-interface {p1}, LO9/b;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LE8/a;

    .line 11
    .line 12
    iput-object p1, v0, Ln9/b;->c:LE8/a;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Ln9/b;->e:Ln9/a;

    .line 17
    .line 18
    check-cast p1, LC8/f;

    .line 19
    .line 20
    iget-object v2, p1, LC8/f;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-object v3, p1, LC8/f;->d:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    add-int/2addr v3, v2

    .line 36
    iget-object v2, p1, LC8/f;->f:LC8/n;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, LC8/n;->a(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, LC8/f;->b()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    iget-object p1, p1, LC8/f;->m:LC8/b;

    .line 48
    .line 49
    invoke-static {p1}, LC8/c;->a(LC8/b;)LC8/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v1, p1}, Ln9/a;->a(LC8/c;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    :goto_0
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 5

    .line 1
    check-cast p1, Ld2/m;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LN1/n;

    .line 9
    .line 10
    iget-object v1, v0, LN1/n;->n:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p1, Ld2/m;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, Ld2/v;->b(LN1/n;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    move v1, v3

    .line 36
    :goto_1
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v0, v4}, Ld2/m;->c(LN1/n;Z)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    return v3

    .line 45
    :cond_2
    return v4
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lea/F;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La2/v;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lea/G;->b:Lad/L;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lad/L;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string p1, "Session Event Type: SESSION_START"

    .line 25
    .line 26
    const-string v1, "EventGDTLogger"

    .line 27
    .line 28
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    sget-object p1, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "this as java.lang.String).getBytes(charset)"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public attachCompleter(LN0/j;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LEf/L;

    .line 4
    .line 5
    new-instance v1, LA/W;

    .line 6
    .line 7
    const/16 v2, 0x12

    .line 8
    .line 9
    invoke-direct {v1, v2, p1, v0}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LEf/z0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 13
    .line 14
    .line 15
    const-string p1, "Deferred.asListenableFuture"

    .line 16
    .line 17
    return-object p1
.end method

.method public b(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, [Ljava/lang/Class;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_1

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 8

    .line 1
    instance-of v0, p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lkd/h;

    .line 6
    .line 7
    const-string v2, "PigeonProxyApiRegistrar"

    .line 8
    .line 9
    const-string v3, "Failed to remove Dart strong reference with identifier: "

    .line 10
    .line 11
    iget-wide v4, v1, Lkd/h;->a:J

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-le v0, v1, :cond_0

    .line 23
    .line 24
    new-instance v0, Lkd/a;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const-string v7, "null cannot be cast to non-null type kotlin.String"

    .line 32
    .line 33
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v6, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    const/4 v7, 0x2

    .line 48
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v0, v6, v1, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 58
    .line 59
    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_0
    return-void

    .line 76
    :cond_1
    new-instance p1, Lkd/a;

    .line 77
    .line 78
    const-string v0, ""

    .line 79
    .line 80
    const-string v1, "channel-error"

    .line 81
    .line 82
    const-string v6, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference\'."

    .line 83
    .line 84
    invoke-direct {p1, v1, v6, v0}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 88
    .line 89
    .line 90
    new-instance p1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lcom/unity3d/services/core/webview/b;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/Class;

    .line 9
    .line 10
    :try_start_0
    sget-object v1, Lna/r;->a:Lna/r;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lna/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object v0

    .line 17
    :catch_0
    move-exception v1

    .line 18
    new-instance v2, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v4, "Unable to create instance of "

    .line 23
    .line 24
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v2

    .line 43
    :pswitch_0
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    const-string v1, "\' with no args"

    .line 46
    .line 47
    const-string v2, "Failed to invoke constructor \'"

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    return-object v0

    .line 57
    :catch_1
    move-exception v0

    .line 58
    goto :goto_0

    .line 59
    :catch_2
    move-exception v3

    .line 60
    goto :goto_1

    .line 61
    :catch_3
    move-exception v3

    .line 62
    goto :goto_2

    .line 63
    :goto_0
    sget-object v1, Lpa/c;->a:Lp7/b;

    .line 64
    .line 65
    new-instance v1, Ljava/lang/RuntimeException;

    .line 66
    .line 67
    const-string v2, "Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 68
    .line 69
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :goto_1
    new-instance v4, Ljava/lang/RuntimeException;

    .line 74
    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Lpa/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {v4, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw v4

    .line 102
    :goto_2
    new-instance v4, Ljava/lang/RuntimeException;

    .line 103
    .line 104
    new-instance v5, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, Lpa/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-direct {v4, v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    throw v4

    .line 127
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    .line 3
    .line 4
    const-string v2, ", Stacktrace: "

    .line 5
    .line 6
    const-string v3, "Cause: "

    .line 7
    .line 8
    const-string v4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    iget-object v5, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    iget v10, p0, Lcom/unity3d/services/core/webview/b;->a:I

    .line 17
    .line 18
    packed-switch v10, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v5, Lkd/o;

    .line 22
    .line 23
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast p1, Ljava/lang/Long;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v10

    .line 41
    :try_start_0
    iget-object p1, v5, Lkd/o;->a:LC8/i;

    .line 42
    .line 43
    iget-object p1, p1, LC8/i;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkd/d;

    .line 46
    .line 47
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1, v10, v11, v1}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    instance-of v0, p1, Lkd/a;

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    check-cast p1, Lkd/a;

    .line 65
    .line 66
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 71
    .line 72
    new-array v2, v7, [Ljava/lang/Object;

    .line 73
    .line 74
    aput-object p1, v2, v9

    .line 75
    .line 76
    aput-object v0, v2, v8

    .line 77
    .line 78
    aput-object v1, v2, v6

    .line 79
    .line 80
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_0
    check-cast v5, Lkd/r;

    .line 122
    .line 123
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    check-cast p1, Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v1, "null cannot be cast to non-null type android.net.http.SslError"

    .line 133
    .line 134
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    check-cast v0, Landroid/net/http/SslError;

    .line 138
    .line 139
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v1, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType"

    .line 144
    .line 145
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    check-cast p1, Lkd/L;

    .line 149
    .line 150
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    packed-switch v1, :pswitch_data_1

    .line 155
    .line 156
    .line 157
    const/4 p1, -0x1

    .line 158
    goto :goto_1

    .line 159
    :pswitch_1
    iget-object v0, v5, Lkd/r;->a:LC8/i;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 165
    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p1, " doesn\'t represent a native value."

    .line 175
    .line 176
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :pswitch_2
    move p1, v7

    .line 188
    goto :goto_1

    .line 189
    :pswitch_3
    move p1, v9

    .line 190
    goto :goto_1

    .line 191
    :pswitch_4
    const/4 p1, 0x5

    .line 192
    goto :goto_1

    .line 193
    :pswitch_5
    move p1, v6

    .line 194
    goto :goto_1

    .line 195
    :pswitch_6
    move p1, v8

    .line 196
    goto :goto_1

    .line 197
    :pswitch_7
    const/4 p1, 0x4

    .line 198
    :goto_1
    invoke-virtual {v0, p1}, Landroid/net/http/SslError;->hasError(I)Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 210
    goto :goto_2

    .line 211
    :catchall_1
    move-exception p1

    .line 212
    instance-of v0, p1, Lkd/a;

    .line 213
    .line 214
    if-eqz v0, :cond_1

    .line 215
    .line 216
    check-cast p1, Lkd/a;

    .line 217
    .line 218
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 221
    .line 222
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 223
    .line 224
    new-array v2, v7, [Ljava/lang/Object;

    .line 225
    .line 226
    aput-object p1, v2, v9

    .line 227
    .line 228
    aput-object v0, v2, v8

    .line 229
    .line 230
    aput-object v1, v2, v6

    .line 231
    .line 232
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    goto :goto_2

    .line 237
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :goto_2
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_8
    check-cast v5, Lkd/i;

    .line 274
    .line 275
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    check-cast p1, Ljava/util/List;

    .line 279
    .line 280
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    check-cast v4, Ljava/lang/Long;

    .line 288
    .line 289
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 290
    .line 291
    .line 292
    move-result-wide v10

    .line 293
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 298
    .line 299
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    check-cast p1, Ljava/lang/String;

    .line 303
    .line 304
    :try_start_2
    iget-object v1, v5, Lkd/i;->a:LC8/i;

    .line 305
    .line 306
    iget-object v1, v1, LC8/i;->d:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v1, Lkd/d;

    .line 309
    .line 310
    new-instance v4, Lkd/t;

    .line 311
    .line 312
    invoke-direct {v4, p1, v5}, Lkd/t;-><init>(Ljava/lang/String;Lkd/i;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v10, v11, v4}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 322
    goto :goto_3

    .line 323
    :catchall_2
    move-exception p1

    .line 324
    instance-of v0, p1, Lkd/a;

    .line 325
    .line 326
    if-eqz v0, :cond_2

    .line 327
    .line 328
    check-cast p1, Lkd/a;

    .line 329
    .line 330
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 331
    .line 332
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 333
    .line 334
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 335
    .line 336
    new-array v2, v7, [Ljava/lang/Object;

    .line 337
    .line 338
    aput-object p1, v2, v9

    .line 339
    .line 340
    aput-object v0, v2, v8

    .line 341
    .line 342
    aput-object v1, v2, v6

    .line 343
    .line 344
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    goto :goto_3

    .line 349
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    :goto_3
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_9
    check-cast v5, Lkd/o;

    .line 386
    .line 387
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    check-cast p1, Ljava/util/List;

    .line 391
    .line 392
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    check-cast p1, Ljava/lang/Long;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 402
    .line 403
    .line 404
    move-result-wide v10

    .line 405
    :try_start_3
    iget-object p1, v5, Lkd/o;->a:LC8/i;

    .line 406
    .line 407
    iget-object p1, p1, LC8/i;->d:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast p1, Lkd/d;

    .line 410
    .line 411
    new-instance v1, Lkd/n;

    .line 412
    .line 413
    invoke-direct {v1, v5}, Lkd/n;-><init>(Lkd/o;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {p1, v10, v11, v1}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 423
    goto :goto_4

    .line 424
    :catchall_3
    move-exception p1

    .line 425
    instance-of v0, p1, Lkd/a;

    .line 426
    .line 427
    if-eqz v0, :cond_3

    .line 428
    .line 429
    check-cast p1, Lkd/a;

    .line 430
    .line 431
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 432
    .line 433
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 434
    .line 435
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 436
    .line 437
    new-array v2, v7, [Ljava/lang/Object;

    .line 438
    .line 439
    aput-object p1, v2, v9

    .line 440
    .line 441
    aput-object v0, v2, v8

    .line 442
    .line 443
    aput-object v1, v2, v6

    .line 444
    .line 445
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object p1

    .line 449
    goto :goto_4

    .line 450
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    :goto_4
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    return-void

    .line 486
    nop

    .line 487
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_9
        :pswitch_8
        :pswitch_0
    .end packed-switch

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public f(LO9/b;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/unity3d/services/core/webview/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ln9/d;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    invoke-interface {p1}, LO9/b;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, LK8/a;

    .line 16
    .line 17
    iput-object p1, v0, Ln9/d;->c:LK8/a;

    .line 18
    .line 19
    invoke-virtual {v0}, Ln9/d;->Z()V

    .line 20
    .line 21
    .line 22
    iget-object p1, v0, Ln9/d;->c:LK8/a;

    .line 23
    .line 24
    iget-object v1, v0, Ln9/d;->b:Ln9/c;

    .line 25
    .line 26
    check-cast p1, Lcom/google/firebase/auth/FirebaseAuth;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v2, p1, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->s()LK8/z;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p1, v1}, LK8/z;->a(I)V

    .line 45
    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/unity3d/services/core/webview/b;->i(LO9/b;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lp8/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LPc/o;

    .line 4
    .line 5
    const-string v1, "exception"

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Lp8/m;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, LPc/o;->success()V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :catch_1
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :goto_0
    new-instance v2, Ldd/g;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {v2, v1, p1}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, LPc/o;->d(Ldd/g;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v2, Ldd/g;

    .line 43
    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_2
    invoke-direct {v2, v1, p1}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, LPc/o;->d(Ldd/g;)V

    .line 56
    .line 57
    .line 58
    :goto_3
    return-void
.end method

.method public h(Llg/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    check-cast p1, Llg/c;

    return-object p1
.end method

.method public j(Lad/L;ILandroid/os/Bundle;)Z
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    and-int/2addr p2, v2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    :try_start_0
    iget-object p2, p1, Lad/L;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Lm1/g;

    .line 14
    .line 15
    invoke-interface {p2}, Lm1/g;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    iget-object p2, p1, Lad/L;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Lm1/g;

    .line 21
    .line 22
    invoke-interface {p2}, Lm1/g;->a()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Landroid/os/Parcelable;

    .line 27
    .line 28
    if-nez p3, :cond_0

    .line 29
    .line 30
    new-instance p3, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    move-object p3, v1

    .line 42
    :goto_0
    const-string v1, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 43
    .line 44
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catch_0
    move-exception p1

    .line 49
    const-string p2, "InputConnectionCompat"

    .line 50
    .line 51
    const-string p3, "Can\'t insert content from IME; requestPermission() failed"

    .line 52
    .line 53
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 58
    .line 59
    iget-object v1, p1, Lad/L;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lm1/g;

    .line 62
    .line 63
    invoke-interface {v1}, Lm1/g;->getDescription()Landroid/content/ClipDescription;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v3, Landroid/content/ClipData$Item;

    .line 68
    .line 69
    iget-object p1, p1, Lad/L;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lm1/g;

    .line 72
    .line 73
    invoke-interface {p1}, Lm1/g;->b()Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-direct {v3, v4}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p2, v1, v3}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0x1f

    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    if-lt v0, v1, :cond_2

    .line 87
    .line 88
    new-instance v0, Lac/a;

    .line 89
    .line 90
    invoke-direct {v0, p2, v3}, Lac/a;-><init>(Landroid/content/ClipData;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    new-instance v0, Lk1/d;

    .line 95
    .line 96
    invoke-direct {v0}, Lk1/d;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p2, v0, Lk1/d;->b:Landroid/content/ClipData;

    .line 100
    .line 101
    iput v3, v0, Lk1/d;->c:I

    .line 102
    .line 103
    :goto_2
    invoke-interface {p1}, Lm1/g;->j()Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {v0, p1}, Lk1/c;->b(Landroid/net/Uri;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, p3}, Lk1/c;->setExtras(Landroid/os/Bundle;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Lk1/c;->build()Lk1/f;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object p2, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p2, Lq/r;

    .line 120
    .line 121
    invoke-static {p2, p1}, Lk1/S;->i(Landroid/view/View;Lk1/f;)Lk1/f;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-nez p1, :cond_3

    .line 126
    .line 127
    return v2

    .line 128
    :cond_3
    :goto_3
    const/4 p1, 0x0

    .line 129
    return p1
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lcom/unity3d/services/core/webview/b;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v1, Landroidx/credentials/playservices/HiddenActivity;->c:I

    .line 9
    .line 10
    check-cast v0, Lo1/d;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lo1/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    sget v1, Landroidx/credentials/playservices/HiddenActivity;->c:I

    .line 17
    .line 18
    check-cast v0, Lo1/d;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lo1/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    sget v1, Landroidx/credentials/playservices/HiddenActivity;->c:I

    .line 25
    .line 26
    check-cast v0, Lo1/d;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lo1/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lcom/unity3d/services/core/webview/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lm9/d0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v8, 0x0

    .line 32
    if-ne v1, v3, :cond_2

    .line 33
    .line 34
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    move-object v7, p1

    .line 39
    check-cast v7, Ls9/k;

    .line 40
    .line 41
    invoke-virtual {v7}, Ls9/k;->d()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget-object v5, v0, Lm9/d0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    new-instance v4, Lm9/o;

    .line 50
    .line 51
    iget-object v6, v7, Ls9/k;->a:Ls9/h;

    .line 52
    .line 53
    move v9, v8

    .line 54
    invoke-direct/range {v4 .. v9}, Lm9/o;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ls9/h;Ls9/k;ZZ)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v7}, Ls9/k;->e()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    new-instance v4, Lm9/o;

    .line 65
    .line 66
    move-object p1, v7

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    iget-object v6, p1, Ls9/k;->a:Ls9/h;

    .line 70
    .line 71
    invoke-direct/range {v4 .. v9}, Lm9/o;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ls9/h;Ls9/k;ZZ)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-object v4

    .line 75
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, "BatchGetDocumentsRequest returned unexpected document type: "

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-class v0, Ls9/k;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-array v0, v8, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw v2

    .line 101
    :cond_2
    const-string p1, "Mismatch in docs returned from document lookup."

    .line 102
    .line 103
    new-array v0, v8, [Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw v2

    .line 109
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    throw p1

    .line 114
    :pswitch_0
    new-instance v0, Lm9/Y;

    .line 115
    .line 116
    new-instance v1, Lm9/W;

    .line 117
    .line 118
    iget-object v2, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lm9/W;

    .line 121
    .line 122
    iget-object v3, v2, Lm9/W;->a:Lp9/u;

    .line 123
    .line 124
    iget-object v2, v2, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 125
    .line 126
    invoke-direct {v1, v3, v2}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Lp9/D;

    .line 134
    .line 135
    invoke-direct {v0, v1, p1, v2}, Lm9/Y;-><init>(Lm9/W;Lp9/D;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_1
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lm9/m;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    move-object v4, p1

    .line 151
    check-cast v4, Ls9/k;

    .line 152
    .line 153
    if-eqz v4, :cond_4

    .line 154
    .line 155
    invoke-virtual {v4}, Ls9/k;->c()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_4

    .line 160
    .line 161
    const/4 p1, 0x1

    .line 162
    :goto_1
    move v6, p1

    .line 163
    goto :goto_2

    .line 164
    :cond_4
    const/4 p1, 0x0

    .line 165
    goto :goto_1

    .line 166
    :goto_2
    new-instance v1, Lm9/o;

    .line 167
    .line 168
    iget-object v2, v0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 169
    .line 170
    iget-object v3, v0, Lm9/m;->a:Ls9/h;

    .line 171
    .line 172
    const/4 v5, 0x1

    .line 173
    invoke-direct/range {v1 .. v6}, Lm9/o;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ls9/h;Ls9/k;ZZ)V

    .line 174
    .line 175
    .line 176
    return-object v1

    .line 177
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public v(Landroid/view/View;Lk1/v0;)Lk1/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/unity3d/services/core/webview/WebView;

    invoke-static {v0, p1, p2}, Lcom/unity3d/services/core/webview/WebView;->a(Lcom/unity3d/services/core/webview/WebView;Landroid/view/View;Lk1/v0;)Lk1/v0;

    move-result-object p1

    return-object p1
.end method
