.class public abstract Lcom/moloco/sdk/service_locator/b;
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
    const/16 v1, 0x9

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
    sput-object v0, Lcom/moloco/sdk/service_locator/b;->a:Lef/p;

    .line 13
    .line 14
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 15
    .line 16
    const/16 v1, 0xa

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
    sput-object v0, Lcom/moloco/sdk/service_locator/b;->b:Lef/p;

    .line 26
    .line 27
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 28
    .line 29
    const/16 v1, 0xb

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/moloco/sdk/service_locator/b;->c:Lef/p;

    .line 39
    .line 40
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 41
    .line 42
    const/16 v1, 0xc

    .line 43
    .line 44
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/moloco/sdk/service_locator/b;->d:Lef/p;

    .line 52
    .line 53
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 54
    .line 55
    const/16 v1, 0xd

    .line 56
    .line 57
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lcom/moloco/sdk/service_locator/b;->e:Lef/p;

    .line 65
    .line 66
    return-void
.end method

.method public static a()Lcom/moloco/sdk/internal/services/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/service_locator/b;->c:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/moloco/sdk/internal/services/u;

    .line 8
    .line 9
    return-object v0
.end method

.method public static b()Lcom/moloco/sdk/internal/error/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/service_locator/b;->d:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/moloco/sdk/internal/error/b;

    .line 8
    .line 9
    return-object v0
.end method
