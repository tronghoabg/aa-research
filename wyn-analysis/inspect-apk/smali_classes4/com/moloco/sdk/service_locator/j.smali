.class public abstract Lcom/moloco/sdk/service_locator/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/p;

.field public static final b:Lef/p;

.field public static final c:Lef/p;

.field public static final d:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/moloco/sdk/service_locator/j;->a:Lef/p;

    .line 12
    .line 13
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/moloco/sdk/service_locator/j;->b:Lef/p;

    .line 24
    .line 25
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/moloco/sdk/service_locator/j;->c:Lef/p;

    .line 36
    .line 37
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 38
    .line 39
    const/4 v1, 0x6

    .line 40
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lcom/moloco/sdk/service_locator/j;->d:Lef/p;

    .line 48
    .line 49
    return-void
.end method

.method public static a()Lwd/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/service_locator/j;->a:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lwd/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public static b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/service_locator/j;->d:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 8
    .line 9
    return-object v0
.end method
