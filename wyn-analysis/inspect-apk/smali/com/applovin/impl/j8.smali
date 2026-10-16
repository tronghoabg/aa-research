.class public Lcom/applovin/impl/j8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/applovin/impl/u2;

.field private final b:Lcom/applovin/impl/a4;

.field private final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/impl/e3;Lcom/applovin/impl/sdk/k;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string p2, "bidder_placement"

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p1, p2, v0}, Lcom/applovin/impl/sdk/utils/JsonUtils;->getJSONObject(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/applovin/impl/a4;

    .line 14
    .line 15
    invoke-direct {v1, p2, p4}, Lcom/applovin/impl/a4;-><init>(Lorg/json/JSONObject;Lcom/applovin/impl/sdk/k;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/applovin/impl/j8;->b:Lcom/applovin/impl/a4;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-object v0, p0, Lcom/applovin/impl/j8;->b:Lcom/applovin/impl/a4;

    .line 22
    .line 23
    :goto_0
    new-instance v1, Lcom/applovin/impl/u2;

    .line 24
    .line 25
    const-string v2, "name"

    .line 26
    .line 27
    const-string v3, ""

    .line 28
    .line 29
    invoke-static {p1, v2, v3}, Lcom/applovin/impl/sdk/utils/JsonUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v4, "display_name"

    .line 34
    .line 35
    invoke-static {p1, v4, v3}, Lcom/applovin/impl/sdk/utils/JsonUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x0

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    const/4 p2, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move p2, v4

    .line 45
    :goto_1
    invoke-direct {v1, v2, v3, p2, p3}, Lcom/applovin/impl/u2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/applovin/impl/e3;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lcom/applovin/impl/j8;->a:Lcom/applovin/impl/u2;

    .line 49
    .line 50
    const-string p2, "placements"

    .line 51
    .line 52
    invoke-static {p2, p1}, Lcb/a;->m(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance p2, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, Lcom/applovin/impl/j8;->c:Ljava/util/List;

    .line 66
    .line 67
    :goto_2
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-ge v4, p2, :cond_3

    .line 72
    .line 73
    invoke-static {p1, v4, v0}, Lcom/applovin/impl/sdk/utils/JsonUtils;->getJSONObject(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-eqz p2, :cond_2

    .line 78
    .line 79
    iget-object p3, p0, Lcom/applovin/impl/j8;->c:Ljava/util/List;

    .line 80
    .line 81
    new-instance v1, Lcom/applovin/impl/a4;

    .line 82
    .line 83
    invoke-direct {v1, p2, p4}, Lcom/applovin/impl/a4;-><init>(Lorg/json/JSONObject;Lcom/applovin/impl/sdk/k;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    return-void
.end method


# virtual methods
.method public a()Lcom/applovin/impl/a4;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/j8;->b:Lcom/applovin/impl/a4;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lcom/applovin/impl/u2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/j8;->a:Lcom/applovin/impl/u2;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/j8;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/j8;->b:Lcom/applovin/impl/a4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
