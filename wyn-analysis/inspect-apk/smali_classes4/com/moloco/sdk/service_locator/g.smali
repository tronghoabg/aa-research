.class public abstract Lcom/moloco/sdk/service_locator/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/p;

.field public static final b:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/moloco/sdk/service_locator/g;->a:Lef/p;

    .line 13
    .line 14
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 15
    .line 16
    const/16 v1, 0x1b

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/moloco/sdk/service_locator/g;->b:Lef/p;

    .line 26
    .line 27
    return-void
.end method

.method public static a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/service_locator/g;->a:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 8
    .line 9
    return-object v0
.end method
