.class public abstract Lcom/applovin/impl/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/applovin/impl/p0$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/applovin/impl/p0$a;

.field private static final b:Lcom/applovin/impl/p0$a;

.field private static final c:Lcom/applovin/impl/p0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/applovin/impl/p0$a;

    .line 2
    .line 3
    sget-object v1, Lcom/applovin/impl/a5;->r:Lcom/applovin/impl/a5;

    .line 4
    .line 5
    const-string v2, "Age Restricted User"

    .line 6
    .line 7
    invoke-direct {v0, v2, v1}, Lcom/applovin/impl/p0$a;-><init>(Ljava/lang/String;Lcom/applovin/impl/a5;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/applovin/impl/p0;->a:Lcom/applovin/impl/p0$a;

    .line 11
    .line 12
    new-instance v0, Lcom/applovin/impl/p0$a;

    .line 13
    .line 14
    sget-object v1, Lcom/applovin/impl/a5;->q:Lcom/applovin/impl/a5;

    .line 15
    .line 16
    const-string v2, "Has User Consent"

    .line 17
    .line 18
    invoke-direct {v0, v2, v1}, Lcom/applovin/impl/p0$a;-><init>(Ljava/lang/String;Lcom/applovin/impl/a5;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/applovin/impl/p0;->b:Lcom/applovin/impl/p0$a;

    .line 22
    .line 23
    new-instance v0, Lcom/applovin/impl/p0$a;

    .line 24
    .line 25
    sget-object v1, Lcom/applovin/impl/a5;->s:Lcom/applovin/impl/a5;

    .line 26
    .line 27
    const-string v2, "\"Do Not Sell\""

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, Lcom/applovin/impl/p0$a;-><init>(Ljava/lang/String;Lcom/applovin/impl/a5;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/applovin/impl/p0;->c:Lcom/applovin/impl/p0$a;

    .line 33
    .line 34
    return-void
.end method

.method public static a()Lcom/applovin/impl/p0$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/p0;->c:Lcom/applovin/impl/p0$a;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    sget-object v1, Lcom/applovin/impl/p0;->b:Lcom/applovin/impl/p0$a;

    invoke-static {v1, p0}, Lcom/applovin/impl/p0;->a(Lcom/applovin/impl/p0$a;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    sget-object v1, Lcom/applovin/impl/p0;->c:Lcom/applovin/impl/p0$a;

    invoke-static {v1, p0}, Lcom/applovin/impl/p0;->a(Lcom/applovin/impl/p0$a;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lcom/applovin/impl/p0$a;Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/applovin/impl/p0$a;->a(Lcom/applovin/impl/p0$a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/applovin/impl/p0$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lcom/applovin/impl/a5;Ljava/lang/Boolean;Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Failed to update compliance value for key: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "AppLovinSdk"

    invoke-static {p1, p0}, Lcom/applovin/impl/sdk/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 8
    :try_start_0
    invoke-static {p0, v1, p2}, Lcom/applovin/impl/b5;->a(Lcom/applovin/impl/a5;Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    .line 9
    invoke-static {p0, p1, p2}, Lcom/applovin/impl/b5;->b(Lcom/applovin/impl/a5;Ljava/lang/Object;Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    if-eqz v1, :cond_2

    if-eq v1, p1, :cond_1

    return p0

    :cond_1
    return v0

    :cond_2
    return p0

    :catchall_0
    move-exception p0

    .line 10
    const-string p1, "Unable to update compliance"

    const-string p2, "ComplianceManager"

    invoke-static {p2, p1, p0}, Lcom/applovin/impl/sdk/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    sget-object p1, Lcom/applovin/impl/sdk/k;->D0:Lcom/applovin/impl/sdk/k;

    if-eqz p1, :cond_3

    .line 12
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->D()Lcom/applovin/impl/r1;

    move-result-object p1

    const-string v1, "updateCompliance"

    invoke-virtual {p1, p2, v1, p0}, Lcom/applovin/impl/r1;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return v0
.end method

.method public static a(ZLandroid/content/Context;)Z
    .locals 1

    .line 2
    sget-object v0, Lcom/applovin/impl/a5;->s:Lcom/applovin/impl/a5;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {v0, p0, p1}, Lcom/applovin/impl/p0;->a(Lcom/applovin/impl/a5;Ljava/lang/Boolean;Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static b()Lcom/applovin/impl/p0$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/p0;->b:Lcom/applovin/impl/p0$a;

    return-object v0
.end method

.method public static b(ZLandroid/content/Context;)Z
    .locals 1

    .line 2
    sget-object v0, Lcom/applovin/impl/a5;->q:Lcom/applovin/impl/a5;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {v0, p0, p1}, Lcom/applovin/impl/p0;->a(Lcom/applovin/impl/a5;Ljava/lang/Boolean;Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static c()Lcom/applovin/impl/p0$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/p0;->a:Lcom/applovin/impl/p0$a;

    .line 2
    .line 3
    return-object v0
.end method
