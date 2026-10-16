.class public final Lcom/moloco/sdk/service_locator/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/moloco/sdk/service_locator/f;

.field public static volatile b:Lcom/moloco/sdk/internal/e;

.field public static final c:Lef/p;

.field public static final d:Lef/p;

.field public static final e:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/service_locator/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/service_locator/f;->a:Lcom/moloco/sdk/service_locator/f;

    .line 7
    .line 8
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 9
    .line 10
    const/16 v1, 0x17

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/moloco/sdk/service_locator/f;->c:Lef/p;

    .line 20
    .line 21
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 22
    .line 23
    const/16 v1, 0x18

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lcom/moloco/sdk/service_locator/f;->d:Lef/p;

    .line 33
    .line 34
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 35
    .line 36
    const/16 v1, 0x19

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/moloco/sdk/service_locator/f;->e:Lef/p;

    .line 46
    .line 47
    return-void
.end method
