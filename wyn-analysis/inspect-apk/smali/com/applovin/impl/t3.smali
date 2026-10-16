.class public Lcom/applovin/impl/t3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/applovin/impl/t3$a;
    }
.end annotation


# instance fields
.field private a:Lcom/applovin/impl/t3$a;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/t3$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/applovin/impl/t3;->a:Lcom/applovin/impl/t3$a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/applovin/impl/t3;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lcom/applovin/impl/y2;)Lcom/applovin/impl/t3;
    .locals 3

    .line 7
    invoke-virtual {p0}, Lcom/applovin/impl/y2;->O()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/applovin/impl/y2;->getFormat()Lcom/applovin/mediation/MaxAdFormat;

    move-result-object p0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Lcom/applovin/impl/q3;

    new-instance v2, Lcom/applovin/impl/j3;

    invoke-direct {v2, v0, p0}, Lcom/applovin/impl/j3;-><init>(Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;)V

    invoke-direct {v1, v2}, Lcom/applovin/impl/q3;-><init>(Lcom/applovin/impl/j3;)V

    return-object v1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lcom/applovin/mediation/MaxAdFormat;)Lcom/applovin/impl/t3;
    .locals 2

    .line 4
    invoke-virtual {p0}, Lcom/applovin/mediation/MaxAdFormat;->getLabel()Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/applovin/impl/t3;

    sget-object v1, Lcom/applovin/impl/t3$a;->b:Lcom/applovin/impl/t3$a;

    invoke-direct {v0, v1, p0}, Lcom/applovin/impl/t3;-><init>(Lcom/applovin/impl/t3$a;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/applovin/impl/t3;
    .locals 2

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Lcom/applovin/impl/t3;

    sget-object v1, Lcom/applovin/impl/t3$a;->a:Lcom/applovin/impl/t3$a;

    invoke-direct {v0, v1, p0}, Lcom/applovin/impl/t3;-><init>(Lcom/applovin/impl/t3$a;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/applovin/impl/t3$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/t3;->a:Lcom/applovin/impl/t3$a;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/t3;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
