.class Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->addWebViewListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;


# direct methods
.method public constructor <init>(Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;)V
    .locals 0

    iput-object p1, p0, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService$2;->this$0:Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPostMessage(Landroid/webkit/WebView;Lx3/e;Landroid/net/Uri;ZLx3/a;)V
    .locals 0

    .line 1
    const-string p1, "Unexpected method in JavaScriptSessionService: "

    .line 2
    .line 3
    invoke-virtual {p2}, Lx3/e;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->access$100()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p3, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {}, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->access$200()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    invoke-virtual {p3, p4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-static {}, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->access$300()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    invoke-virtual {p3, p4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-static {}, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->access$400()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    if-eqz p4, :cond_0

    .line 45
    .line 46
    iget-object p1, p0, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService$2;->this$0:Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;

    .line 47
    .line 48
    invoke-static {p1, p3}, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->access$500(Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {}, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->access$600()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    if-eqz p4, :cond_1

    .line 63
    .line 64
    iget-object p1, p0, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService$2;->this$0:Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;

    .line 65
    .line 66
    invoke-static {p1, p3}, Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;->access$700(Lcom/iab/omid/library/applovin/adsession/JavaScriptSessionService;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lcom/iab/omid/library/applovin/utils/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_0
    const-string p2, "Error parsing JS message in JavaScriptSessionService."

    .line 79
    .line 80
    invoke-static {p2, p1}, Lcom/iab/omid/library/applovin/utils/d;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method
