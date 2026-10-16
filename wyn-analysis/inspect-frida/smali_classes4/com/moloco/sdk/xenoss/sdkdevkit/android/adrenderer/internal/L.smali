.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/moloco/sdk/internal/ortb/model/u;

.field public final c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

.field public final d:Lcom/moloco/sdk/acm/recorder/c;

.field public final e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

.field public final f:LKd/a;

.field public final g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

.field public final h:LHf/x0;

.field public final i:LHf/x0;

.field public final j:LHf/x0;

.field public final k:LHf/x0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;LY2/B;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 7

    .line 1
    const-string v0, "bid"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 12
    .line 13
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 14
    .line 15
    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 16
    .line 17
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 20
    .line 21
    sget-object p1, LEf/S;->a:LLf/e;

    .line 22
    .line 23
    sget-object p1, LJf/n;->a:LFf/e;

    .line 24
    .line 25
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->f:LKd/a;

    .line 30
    .line 31
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 32
    .line 33
    move-object v1, p2

    .line 34
    move-object v3, p3

    .line 35
    move-object v4, p4

    .line 36
    move v5, p5

    .line 37
    move-object v6, p7

    .line 38
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;-><init>(Lcom/moloco/sdk/internal/ortb/model/u;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;LY2/B;ZLcom/moloco/sdk/acm/recorder/c;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 42
    .line 43
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->h:LHf/x0;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->i:LHf/x0;

    .line 52
    .line 53
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->j:LHf/x0;

    .line 58
    .line 59
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->k:LHf/x0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final destroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->f:LKd/a;

    .line 3
    .line 4
    invoke-static {v1, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isLoaded()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->i:LHf/e0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->k:LHf/x0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->i:LHf/x0;

    .line 2
    .line 3
    return-object v0
.end method
