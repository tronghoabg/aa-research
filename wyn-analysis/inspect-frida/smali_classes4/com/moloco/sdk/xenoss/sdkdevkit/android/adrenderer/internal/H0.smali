.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;
.super Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;
.source "SourceFile"


# instance fields
.field public final synthetic k:LHf/x0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;LK8/H;LHf/x0;Ljava/lang/String;)V
    .locals 10

    .line 1
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/F;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/F;

    .line 2
    .line 3
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;->k:LHf/x0;

    .line 4
    .line 5
    new-instance v4, Lcom/moloco/sdk/service_locator/h;

    .line 6
    .line 7
    const/16 p4, 0xe

    .line 8
    .line 9
    invoke-direct {v4, p4}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 13
    .line 14
    const/4 p4, 0x7

    .line 15
    invoke-direct {v5, p4}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 19
    .line 20
    const/16 p4, 0x8

    .line 21
    .line 22
    invoke-direct {v6, p4}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move-object v7, p2

    .line 29
    move-object v9, p3

    .line 30
    move-object v2, p5

    .line 31
    invoke-direct/range {v0 .. v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/F;Ltf/a;Ltf/l;Ltf/l;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;ZLK8/H;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;

    .line 2
    .line 3
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;->k:LHf/x0;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
