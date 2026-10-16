.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/e;


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 13

    const/4 v0, 0x0

    const-string v1, "url"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, LFe/c;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 2
    :cond_0
    :try_start_0
    new-instance v2, Lef/k;

    invoke-direct {v2, v1, p1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 3
    new-array v1, v1, [Lef/k;

    aput-object v2, v1, v0

    .line 4
    new-instance v2, LJ3/g;

    invoke-direct {v2, v0}, LJ3/g;-><init>(I)V

    .line 5
    aget-object v0, v1, v0

    .line 6
    iget-object v1, v0, Lef/k;->a:Ljava/lang/Object;

    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    iget-object v0, v0, Lef/k;->b:Ljava/lang/Object;

    .line 9
    invoke-virtual {v2, v0, v1}, LJ3/g;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v2}, LJ3/g;->a()LJ3/h;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Url: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "PersistentHttpRequest"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_3

    .line 12
    :cond_1
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const-string v2, "Enqueuing request to "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "PersistentHttpRequest"

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 13
    new-instance p1, LA7/b0;

    const-class v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlGetRequestWorker;

    invoke-direct {p1, v1}, LA7/b0;-><init>(Ljava/lang/Class;)V

    .line 14
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_2

    .line 16
    invoke-static {v1}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    :goto_1
    move-object v12, v1

    goto :goto_2

    .line 17
    :cond_2
    sget-object v1, Lff/x;->a:Lff/x;

    goto :goto_1

    .line 18
    :goto_2
    new-instance v2, LJ3/d;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v8, -0x1

    const-wide/16 v10, -0x1

    invoke-direct/range {v2 .. v12}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 19
    iget-object v1, p1, LA7/b0;->d:Ljava/lang/Object;

    check-cast v1, LS3/p;

    iput-object v2, v1, LS3/p;->j:LJ3/d;

    .line 20
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x2

    .line 21
    invoke-virtual {p1, v1}, LA7/b0;->r(I)V

    .line 22
    iget-object v1, p1, LA7/b0;->d:Ljava/lang/Object;

    check-cast v1, LS3/p;

    iput-object v0, v1, LS3/p;->e:LJ3/h;

    .line 23
    invoke-virtual {p1}, LA7/b0;->i()LJ3/s;

    move-result-object p1

    .line 24
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;

    .line 25
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;->a:LK3/q;

    invoke-virtual {v0, p1}, LJ3/x;->a(LJ3/s;)LS3/e;

    move-result-object p1

    const-string v0, "enqueue(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    return-void
.end method

.method public final a(Ljava/lang/String;[BLJd/f;Ljava/lang/String;)V
    .locals 15

    move-object/from16 v1, p1

    const/4 v0, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string v5, "url"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "body"

    const-string v7, "contentType"

    move-object/from16 v8, p3

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {v1}, LFe/c;->h(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_0

    return-void

    .line 27
    :cond_0
    :try_start_0
    new-instance v9, Lef/k;

    invoke-direct {v9, v5, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lef/k;

    move-object/from16 v10, p2

    invoke-direct {v5, v6, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    invoke-virtual {v8}, LJ4/d;->toString()Ljava/lang/String;

    move-result-object v6

    .line 29
    new-instance v8, Lef/k;

    invoke-direct {v8, v7, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    const-string v6, "contentEncoding"

    .line 31
    new-instance v7, Lef/k;

    move-object/from16 v10, p4

    invoke-direct {v7, v6, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    new-array v6, v3, [Lef/k;

    aput-object v9, v6, v4

    aput-object v5, v6, v2

    aput-object v8, v6, v0

    const/4 v5, 0x3

    aput-object v7, v6, v5

    .line 33
    new-instance v5, LJ3/g;

    invoke-direct {v5, v4}, LJ3/g;-><init>(I)V

    :goto_0
    if-ge v4, v3, :cond_1

    .line 34
    aget-object v7, v6, v4

    .line 35
    iget-object v8, v7, Lef/k;->a:Ljava/lang/Object;

    .line 36
    check-cast v8, Ljava/lang/String;

    .line 37
    iget-object v7, v7, Lef/k;->b:Ljava/lang/Object;

    .line 38
    invoke-virtual {v5, v7, v8}, LJ3/g;->i(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr v4, v2

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    goto :goto_3

    .line 39
    :cond_1
    invoke-virtual {v5}, LJ3/g;->a()LJ3/h;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const-string v4, "Enqueuing request to "

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v4, "PersistentHttpRequest"

    const/16 v8, 0xc

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 41
    new-instance v1, LA7/b0;

    const-class v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;

    invoke-direct {v1, v3}, LA7/b0;-><init>(Ljava/lang/Class;)V

    .line 42
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 43
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x18

    if-lt v4, v5, :cond_2

    .line 44
    invoke-static {v3}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    :goto_1
    move-object v14, v3

    goto :goto_2

    .line 45
    :cond_2
    sget-object v3, Lff/x;->a:Lff/x;

    goto :goto_1

    .line 46
    :goto_2
    new-instance v4, LJ3/d;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v10, -0x1

    const-wide/16 v12, -0x1

    invoke-direct/range {v4 .. v14}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 47
    iget-object v3, v1, LA7/b0;->d:Ljava/lang/Object;

    check-cast v3, LS3/p;

    iput-object v4, v3, LS3/p;->j:LJ3/d;

    .line 48
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 49
    invoke-virtual {v1, v0}, LA7/b0;->r(I)V

    .line 50
    iget-object v0, v1, LA7/b0;->d:Ljava/lang/Object;

    check-cast v0, LS3/p;

    iput-object v2, v0, LS3/p;->e:LJ3/h;

    .line 51
    invoke-virtual {v1}, LA7/b0;->i()LJ3/s;

    move-result-object v0

    .line 52
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;

    .line 53
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;->a:LK3/q;

    invoke-virtual {v1, v0}, LJ3/x;->a(LJ3/s;)LS3/e;

    move-result-object v0

    const-string v1, "enqueue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 54
    :goto_3
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const-string v2, "Failed to enqueue persistent request for url: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v2, "PersistentHttpRequest"

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method
