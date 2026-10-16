.class public abstract Lcom/moloco/sdk/service_locator/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/p;

.field public static final b:Lef/p;

.field public static final c:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/moloco/sdk/service_locator/l;->a:Lef/p;

    .line 13
    .line 14
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 15
    .line 16
    const/16 v1, 0x9

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/moloco/sdk/service_locator/l;->b:Lef/p;

    .line 26
    .line 27
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 28
    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/moloco/sdk/service_locator/l;->c:Lef/p;

    .line 39
    .line 40
    return-void
.end method

.method public static a()Lcom/moloco/sdk/internal/services/events/c;
    .locals 9

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/services/events/c;

    .line 2
    .line 3
    invoke-static {}, Lcom/moloco/sdk/service_locator/e;->a()Lcom/moloco/sdk/internal/services/x;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lcom/moloco/sdk/service_locator/j;->b:Lef/p;

    .line 8
    .line 9
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lcom/moloco/sdk/internal/services/c;

    .line 14
    .line 15
    invoke-static {}, Lcom/moloco/sdk/service_locator/e;->b()Lcom/moloco/sdk/internal/services/v;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Lcom/moloco/sdk/service_locator/e;->d:Lef/p;

    .line 20
    .line 21
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Lcom/moloco/sdk/internal/services/i;

    .line 26
    .line 27
    sget-object v5, Lcom/moloco/sdk/service_locator/l;->b:Lef/p;

    .line 28
    .line 29
    invoke-virtual {v5}, Lef/p;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 34
    .line 35
    sget-object v6, Lcom/moloco/sdk/service_locator/i;->c:Lef/p;

    .line 36
    .line 37
    invoke-virtual {v6}, Lef/p;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lcom/moloco/sdk/internal/services/q;

    .line 42
    .line 43
    sget-object v7, Lcom/moloco/sdk/service_locator/i;->b:Lef/p;

    .line 44
    .line 45
    invoke-virtual {v7}, Lef/p;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Lcom/moloco/sdk/internal/services/proto/a;

    .line 50
    .line 51
    sget-object v8, Lcom/moloco/sdk/service_locator/l;->c:Lef/p;

    .line 52
    .line 53
    invoke-virtual {v8}, Lef/p;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, Lcom/moloco/sdk/internal/services/events/e;

    .line 58
    .line 59
    invoke-direct/range {v0 .. v8}, Lcom/moloco/sdk/internal/services/events/c;-><init>(Lcom/moloco/sdk/internal/services/x;Lcom/moloco/sdk/internal/services/c;Lcom/moloco/sdk/internal/services/v;Lcom/moloco/sdk/internal/services/i;Lcom/moloco/sdk/internal/services/usertracker/c;Lcom/moloco/sdk/internal/services/q;Lcom/moloco/sdk/internal/services/proto/a;Lcom/moloco/sdk/internal/services/events/e;)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method
