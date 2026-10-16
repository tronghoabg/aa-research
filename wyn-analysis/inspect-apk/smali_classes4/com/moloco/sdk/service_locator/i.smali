.class public abstract Lcom/moloco/sdk/service_locator/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/p;

.field public static final b:Lef/p;

.field public static final c:Lef/p;

.field public static final d:Lef/p;

.field public static final e:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 2
    .line 3
    const/16 v1, 0x1c

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
    sput-object v0, Lcom/moloco/sdk/service_locator/i;->a:Lef/p;

    .line 13
    .line 14
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 15
    .line 16
    const/16 v1, 0x1d

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
    sput-object v0, Lcom/moloco/sdk/service_locator/i;->b:Lef/p;

    .line 26
    .line 27
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lcom/moloco/sdk/service_locator/i;->c:Lef/p;

    .line 38
    .line 39
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lcom/moloco/sdk/service_locator/i;->d:Lef/p;

    .line 50
    .line 51
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/moloco/sdk/service_locator/i;->e:Lef/p;

    .line 62
    .line 63
    return-void
.end method

.method public static a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-direct {v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static b()Lcom/moloco/sdk/internal/services/k;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/service_locator/i;->a:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/moloco/sdk/internal/services/k;

    .line 8
    .line 9
    return-object v0
.end method
