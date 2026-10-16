.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/h;


# instance fields
.field public final a:LKd/a;

.field public final b:Lcom/moloco/sdk/internal/ortb/model/u;

.field public final c:LY2/B;

.field public final d:Lkotlin/jvm/internal/i;

.field public final e:LHf/x0;

.field public final f:LHf/x0;

.field public g:Lcom/moloco/sdk/internal/A;


# direct methods
.method public constructor <init>(LKd/a;Lcom/moloco/sdk/internal/ortb/model/u;LY2/B;Ltf/l;)V
    .locals 1

    .line 1
    const-string v0, "scope"

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
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->a:LKd/a;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->c:LY2/B;

    .line 14
    .line 15
    check-cast p4, Lkotlin/jvm/internal/i;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->d:Lkotlin/jvm/internal/i;

    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->e:LHf/x0;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->f:LHf/x0;

    .line 28
    .line 29
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 30
    .line 31
    sget-object p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 32
    .line 33
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->g:Lcom/moloco/sdk/internal/A;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v3, p1

    .line 6
    move-object v2, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->a:LKd/a;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    const/4 p3, 0x3

    .line 14
    invoke-static {p1, p2, v0, p3}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final isLoaded()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->f:LHf/x0;

    .line 2
    .line 3
    return-object v0
.end method
