.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/h;


# instance fields
.field public final a:Lcom/moloco/sdk/internal/ortb/model/u;

.field public final b:LKd/a;

.field public final c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

.field public final d:LY2/B;

.field public final e:Z

.field public final f:Lcom/moloco/sdk/acm/recorder/c;

.field public g:Lcom/moloco/sdk/internal/A;

.field public final h:LHf/x0;

.field public final i:LHf/e0;

.field public j:LEf/H0;

.field public k:Lcom/moloco/sdk/acm/l;

.field public l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/ortb/model/u;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;LY2/B;ZLcom/moloco/sdk/acm/recorder/c;)V
    .locals 1

    .line 1
    const-string v0, "bid"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scope"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->a:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->b:LKd/a;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->d:LY2/B;

    .line 21
    .line 22
    iput-boolean p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->e:Z

    .line 23
    .line 24
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->f:Lcom/moloco/sdk/acm/recorder/c;

    .line 25
    .line 26
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 27
    .line 28
    sget-object p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 29
    .line 30
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 34
    .line 35
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->h:LHf/x0;

    .line 42
    .line 43
    new-instance p2, LHf/e0;

    .line 44
    .line 45
    invoke-direct {p2, p1}, LHf/e0;-><init>(LHf/c0;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->i:LHf/e0;

    .line 49
    .line 50
    return-void
.end method

.method public static final b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;LEf/K;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "Vast AD failed to load: "

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/16 v5, 0xc

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    const-string v1, "VastAdLoad"

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-interface {p1, v0}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 35
    .line 36
    invoke-direct {p1, p3}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 40
    .line 41
    invoke-interface {p2, p3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->e:Z

    .line 2
    .line 3
    const/4 v6, 0x3

    .line 4
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->b:LKd/a;

    .line 5
    .line 6
    const/4 v8, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->j:LEf/H0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v8}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v1, p0

    .line 20
    move-wide v3, p1

    .line 21
    move-object v2, p3

    .line 22
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v7, v8, v0, v6}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->j:LEf/H0;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->j:LEf/H0;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, v8}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v1, p0

    .line 43
    move-wide v3, p1

    .line 44
    move-object v2, p3

    .line 45
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v7, v8, v0, v6}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->j:LEf/H0;

    .line 53
    .line 54
    return-void
.end method

.method public final isLoaded()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->i:LHf/e0;

    .line 2
    .line 3
    return-object v0
.end method
