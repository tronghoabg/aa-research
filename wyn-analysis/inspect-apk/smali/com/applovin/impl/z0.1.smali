.class public Lcom/applovin/impl/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/applovin/impl/sdk/k;

.field private final b:I

.field private final c:Lcom/applovin/impl/t0;

.field private d:Ljava/util/List;

.field private e:Ljava/lang/String;

.field private f:Lcom/applovin/impl/v0;

.field private g:Lcom/applovin/impl/u0$c;

.field private h:Lcom/applovin/impl/v0;

.field private i:Landroid/app/Dialog;

.field private j:J

.field private k:J

.field private l:J

.field private m:Lcom/applovin/impl/u0$b;

.field private final n:Lcom/applovin/impl/b;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/sdk/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/applovin/impl/t0;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/applovin/impl/t0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    .line 10
    .line 11
    new-instance v0, Lcom/applovin/impl/u0$b;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/applovin/impl/u0$b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/applovin/impl/z0;->m:Lcom/applovin/impl/u0$b;

    .line 17
    .line 18
    new-instance v0, Lcom/applovin/impl/z0$a;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/applovin/impl/z0$a;-><init>(Lcom/applovin/impl/z0;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/applovin/impl/z0;->n:Lcom/applovin/impl/b;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    .line 26
    .line 27
    sget-object v0, Lcom/applovin/impl/y4;->a7:Lcom/applovin/impl/y4;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p0, Lcom/applovin/impl/z0;->b:I

    .line 40
    .line 41
    return-void
.end method

.method private a(Landroid/app/Dialog;)Landroid/app/Activity;
    .locals 1

    .line 153
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 154
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 155
    check-cast p1, Landroid/app/Activity;

    return-object p1

    .line 156
    :cond_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 157
    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    .line 158
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 159
    check-cast p1, Landroid/app/Activity;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Landroid/app/Dialog;)Landroid/app/Dialog;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/applovin/impl/z0;->i:Landroid/app/Dialog;

    return-object p1
.end method

.method private a(I)Lcom/applovin/impl/v0;
    .locals 4

    .line 150
    iget-object v0, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 151
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/applovin/impl/v0;

    .line 152
    invoke-virtual {v2}, Lcom/applovin/impl/v0;->c()I

    move-result v3

    if-ne p1, v3, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;)Lcom/applovin/impl/v0;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/applovin/impl/z0;->h:Lcom/applovin/impl/v0;

    return-object p0
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;I)Lcom/applovin/impl/v0;
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/applovin/impl/z0;->a(I)Lcom/applovin/impl/v0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;)Lcom/applovin/impl/v0;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/applovin/impl/z0;->h:Lcom/applovin/impl/v0;

    return-object p1
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Lcom/applovin/sdk/AppLovinCmpError;)Ljava/util/HashMap;
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/sdk/AppLovinCmpError;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/applovin/sdk/AppLovinCmpError;)Ljava/util/HashMap;
    .locals 3

    .line 165
    invoke-interface {p1}, Lcom/applovin/sdk/AppLovinCmpError;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "error_message"

    invoke-static {v1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 166
    invoke-interface {p1}, Lcom/applovin/sdk/AppLovinCmpError;->getCmpMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mediated_network_error_message"

    invoke-static {v2, v1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 167
    invoke-interface {p1}, Lcom/applovin/sdk/AppLovinCmpError;->getCode()Lcom/applovin/sdk/AppLovinCmpError$Code;

    move-result-object v1

    invoke-virtual {v1}, Lcom/applovin/sdk/AppLovinCmpError$Code;->getValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "error_code"

    invoke-static {v2, v1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 168
    invoke-interface {p1}, Lcom/applovin/sdk/AppLovinCmpError;->getCmpCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "mediated_network_error_code"

    invoke-static {v1, p1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private synthetic a(Landroid/app/AlertDialog;Landroid/app/Activity;ZLandroid/content/DialogInterface;)V
    .locals 2

    .line 129
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    .line 130
    const-string v0, "android:id/alertTitle"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p4

    .line 131
    invoke-virtual {p1, p4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 132
    invoke-virtual {p1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result p4

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 133
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p4

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 134
    iget p4, p0, Lcom/applovin/impl/z0;->b:I

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setMaxLines(I)V

    const/16 p4, 0x30

    .line 135
    invoke-static {p2, p4}, Lcom/applovin/sdk/AppLovinSdkUtils;->dpToPx(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 136
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/applovin/impl/z0;->l:J

    .line 137
    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string p2, "details"

    invoke-static {p2, p1}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    .line 138
    iget-object p2, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p2}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object p2

    sget-object p3, Lcom/applovin/impl/d2;->n:Lcom/applovin/impl/d2;

    invoke-virtual {p2, p3, p1}, Lcom/applovin/impl/e2;->d(Lcom/applovin/impl/d2;Ljava/util/Map;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/v0;)V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v0}, Lcom/applovin/impl/t0;->b()V

    .line 140
    new-instance v0, Lcom/applovin/impl/z0$h;

    invoke-direct {v0, p0, p1}, Lcom/applovin/impl/z0$h;-><init>(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    .line 141
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    .line 142
    invoke-static {v0, v1, v2}, Lcom/applovin/sdk/AppLovinSdkUtils;->runOnUiThreadDelayed(Ljava/lang/Runnable;J)V

    return-void
.end method

.method private synthetic a(Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 12

    if-nez p1, :cond_0

    .line 33
    const-string v0, "Consent flow state is null"

    invoke-direct {p0, v0}, Lcom/applovin/impl/z0;->a(Ljava/lang/String;)V

    return-void

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Transitioning to state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ConsentFlowStateMachine"

    invoke-virtual {v0, v3, v2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/applovin/impl/z0;->f:Lcom/applovin/impl/v0;

    if-eqz v0, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v6, p0, Lcom/applovin/impl/z0;->k:J

    sub-long/2addr v2, v6

    goto :goto_0

    :cond_2
    const-wide/16 v2, 0x0

    .line 36
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/applovin/impl/z0;->k:J

    .line 37
    iget-object v0, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v0, p1, v2, v3}, Lcom/applovin/impl/t0;->a(Lcom/applovin/impl/v0;J)V

    .line 38
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v6, Lcom/applovin/impl/v0$b;->a:Lcom/applovin/impl/v0$b;

    const-string v7, "cf_start"

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-ne v0, v6, :cond_b

    .line 39
    invoke-static {p2}, Lcom/applovin/impl/d;->d(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 40
    invoke-direct/range {p0 .. p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;)V

    return-void

    .line 41
    :cond_3
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->F()Lcom/applovin/impl/sdk/EventServiceImpl;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/applovin/impl/sdk/EventServiceImpl;->trackEvent(Ljava/lang/String;)V

    .line 42
    move-object v6, p1

    check-cast v6, Lcom/applovin/impl/w0;

    .line 43
    iput-object v6, p0, Lcom/applovin/impl/z0;->h:Lcom/applovin/impl/v0;

    .line 44
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 45
    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 46
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->h()Landroid/net/Uri;

    move-result-object v10

    if-eqz v10, :cond_4

    move v2, v9

    goto :goto_1

    :cond_4
    move v2, v8

    .line 47
    :goto_1
    invoke-virtual {v6}, Lcom/applovin/impl/w0;->f()Ljava/util/List;

    move-result-object v0

    .line 48
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/applovin/impl/x0;

    .line 49
    new-instance v0, Lcom/applovin/impl/z0$b;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/applovin/impl/z0$b;-><init>(Lcom/applovin/impl/z0;ZLcom/applovin/impl/x0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    .line 50
    invoke-virtual {v3}, Lcom/applovin/impl/x0;->c()Lcom/applovin/impl/x0$a;

    move-result-object v4

    sget-object v11, Lcom/applovin/impl/x0$a;->b:Lcom/applovin/impl/x0$a;

    if-ne v4, v11, :cond_5

    .line 51
    invoke-virtual {v3}, Lcom/applovin/impl/x0;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_2

    .line 52
    :cond_5
    invoke-virtual {v3}, Lcom/applovin/impl/x0;->c()Lcom/applovin/impl/x0$a;

    move-result-object v4

    sget-object v11, Lcom/applovin/impl/x0$a;->c:Lcom/applovin/impl/x0$a;

    if-ne v4, v11, :cond_6

    .line 53
    invoke-virtual {v3}, Lcom/applovin/impl/x0;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_2

    .line 54
    :cond_6
    invoke-virtual {v3}, Lcom/applovin/impl/x0;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3, v0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_2

    .line 55
    :cond_7
    invoke-virtual {v6}, Lcom/applovin/impl/w0;->h()Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-static {v0}, Lcom/applovin/impl/sdk/utils/StringUtils;->isValidString(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 57
    new-instance v3, Landroid/text/SpannableString;

    invoke-direct {v3, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 58
    sget v4, Lcom/applovin/sdk/R$string;->applovin_terms_of_service_text:I

    invoke-static {v4}, Lcom/applovin/impl/sdk/k;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 59
    sget v8, Lcom/applovin/sdk/R$string;->applovin_privacy_policy_text:I

    invoke-static {v8}, Lcom/applovin/impl/sdk/k;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 60
    filled-new-array {v4, v8}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    .line 61
    invoke-static {v0, v11}, Lcom/applovin/impl/sdk/utils/StringUtils;->containsAtLeastOneSubstring(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_a

    if-eqz v2, :cond_8

    .line 62
    new-instance v0, Lcom/applovin/impl/z0$c;

    invoke-direct {v0, p0, v10, p2}, Lcom/applovin/impl/z0$c;-><init>(Lcom/applovin/impl/z0;Landroid/net/Uri;Landroid/app/Activity;)V

    .line 63
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 64
    invoke-static {v3, v4, v0, v9}, Lcom/applovin/impl/sdk/utils/StringUtils;->addLinks(Landroid/text/Spannable;Ljava/util/regex/Pattern;Landroid/text/style/ClickableSpan;Z)V

    .line 65
    :cond_8
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->f()Landroid/net/Uri;

    move-result-object v0

    .line 66
    new-instance v4, Lcom/applovin/impl/z0$d;

    invoke-direct {v4, p0, v0, p2}, Lcom/applovin/impl/z0$d;-><init>(Lcom/applovin/impl/z0;Landroid/net/Uri;Landroid/app/Activity;)V

    .line 67
    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 68
    invoke-static {v3, v0, v4, v9}, Lcom/applovin/impl/sdk/utils/StringUtils;->addLinks(Landroid/text/Spannable;Ljava/util/regex/Pattern;Landroid/text/style/ClickableSpan;Z)V

    goto :goto_3

    :cond_9
    const/4 v3, 0x0

    .line 69
    :cond_a
    :goto_3
    invoke-virtual {v7, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 70
    invoke-virtual {v6}, Lcom/applovin/impl/w0;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 71
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 72
    new-instance v3, Lcom/applovin/impl/A1;

    invoke-direct {v3, p0, v0, p2, v2}, Lcom/applovin/impl/A1;-><init>(Lcom/applovin/impl/z0;Landroid/app/AlertDialog;Landroid/app/Activity;Z)V

    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 73
    iput-object v0, p0, Lcom/applovin/impl/z0;->i:Landroid/app/Dialog;

    .line 74
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 75
    iget-object v0, p0, Lcom/applovin/impl/z0;->m:Lcom/applovin/impl/u0$b;

    invoke-virtual {v0}, Lcom/applovin/impl/u0$b;->d()V

    return-void

    .line 76
    :cond_b
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v4, Lcom/applovin/impl/v0$b;->b:Lcom/applovin/impl/v0$b;

    if-ne v0, v4, :cond_e

    .line 77
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->k()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->m()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 78
    invoke-static {p2}, Lcom/applovin/impl/d;->d(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 79
    invoke-direct/range {p0 .. p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;)V

    return-void

    .line 80
    :cond_c
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object v0

    sget-object v2, Lcom/applovin/impl/d2;->p:Lcom/applovin/impl/d2;

    invoke-virtual {v0, v2}, Lcom/applovin/impl/m7;->a(Lcom/applovin/impl/d2;)V

    .line 81
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 82
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->s()Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;

    move-result-object v6

    new-instance v0, Lcom/applovin/impl/z0$e;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/applovin/impl/z0$e;-><init>(Lcom/applovin/impl/z0;JLcom/applovin/impl/v0;Landroid/app/Activity;)V

    invoke-virtual {v6, p2, v0}, Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;->loadCmp(Landroid/app/Activity;Lcom/applovin/impl/privacy/cmp/CmpServiceImpl$e;)V

    return-void

    .line 83
    :cond_d
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    return-void

    .line 84
    :cond_e
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v6, Lcom/applovin/impl/v0$b;->c:Lcom/applovin/impl/v0$b;

    if-ne v0, v6, :cond_10

    .line 85
    move-object v0, p1

    check-cast v0, Lcom/applovin/impl/y0;

    .line 86
    invoke-virtual {v0}, Lcom/applovin/impl/y0;->g()Ljava/lang/String;

    move-result-object v2

    .line 87
    invoke-virtual {v0}, Lcom/applovin/impl/y0;->f()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_f

    .line 88
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, v9}, Ljava/util/HashMap;-><init>(I)V

    .line 89
    :cond_f
    const-string v4, "flow_type"

    const-string v6, "unified"

    invoke-interface {v3, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    iget-object v4, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v4}, Lcom/applovin/impl/sdk/k;->F()Lcom/applovin/impl/sdk/EventServiceImpl;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Lcom/applovin/impl/sdk/EventServiceImpl;->trackEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 91
    invoke-direct {p0, v0, p2}, Lcom/applovin/impl/z0;->b(Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    return-void

    .line 92
    :cond_10
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v6, Lcom/applovin/impl/v0$b;->e:Lcom/applovin/impl/v0$b;

    if-ne v0, v6, :cond_13

    .line 93
    invoke-static {p2}, Lcom/applovin/impl/d;->d(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 94
    invoke-direct/range {p0 .. p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;)V

    return-void

    .line 95
    :cond_11
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->m()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 96
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->s()Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;->preloadCmp(Landroid/app/Activity;)V

    .line 97
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    return-void

    .line 98
    :cond_12
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object v0

    sget-object v2, Lcom/applovin/impl/d2;->p:Lcom/applovin/impl/d2;

    invoke-virtual {v0, v2}, Lcom/applovin/impl/m7;->a(Lcom/applovin/impl/d2;)V

    .line 99
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 100
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->s()Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;

    move-result-object v6

    new-instance v0, Lcom/applovin/impl/z0$f;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/applovin/impl/z0$f;-><init>(Lcom/applovin/impl/z0;JLcom/applovin/impl/v0;Landroid/app/Activity;)V

    invoke-virtual {v6, p2, v0}, Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;->loadCmp(Landroid/app/Activity;Lcom/applovin/impl/privacy/cmp/CmpServiceImpl$e;)V

    return-void

    .line 101
    :cond_13
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v4, Lcom/applovin/impl/v0$b;->f:Lcom/applovin/impl/v0$b;

    if-ne v0, v4, :cond_16

    .line 102
    invoke-static {p2}, Lcom/applovin/impl/d;->d(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 103
    invoke-direct/range {p0 .. p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;)V

    return-void

    .line 104
    :cond_14
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->m()Z

    move-result v0

    if-nez v0, :cond_15

    .line 105
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->F()Lcom/applovin/impl/sdk/EventServiceImpl;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/applovin/impl/sdk/EventServiceImpl;->trackEvent(Ljava/lang/String;)V

    .line 106
    :cond_15
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object v0

    sget-object v2, Lcom/applovin/impl/d2;->s:Lcom/applovin/impl/d2;

    invoke-virtual {v0, v2}, Lcom/applovin/impl/m7;->a(Lcom/applovin/impl/d2;)V

    .line 107
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 108
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->s()Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;

    move-result-object v6

    new-instance v0, Lcom/applovin/impl/z0$g;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/applovin/impl/z0$g;-><init>(Lcom/applovin/impl/z0;JLcom/applovin/impl/v0;Landroid/app/Activity;)V

    invoke-virtual {v6, p2, v0}, Lcom/applovin/impl/privacy/cmp/CmpServiceImpl;->showCmp(Landroid/app/Activity;Lcom/applovin/impl/privacy/cmp/CmpServiceImpl$f;)V

    return-void

    .line 109
    :cond_16
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v6, Lcom/applovin/impl/v0$b;->g:Lcom/applovin/impl/v0$b;

    if-ne v0, v6, :cond_1d

    .line 110
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->a()Lcom/applovin/impl/v0$a;

    move-result-object v0

    .line 111
    sget-object v6, Lcom/applovin/impl/v0$a;->c:Lcom/applovin/impl/v0$a;

    if-ne v0, v6, :cond_17

    .line 112
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->k()Z

    move-result v0

    .line 113
    iget-object v6, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v6, p1, v0, v2, v3}, Lcom/applovin/impl/t0;->a(Lcom/applovin/impl/v0;ZJ)V

    .line 114
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    return-void

    .line 115
    :cond_17
    sget-object v6, Lcom/applovin/impl/v0$a;->d:Lcom/applovin/impl/v0$a;

    if-ne v0, v6, :cond_1a

    .line 116
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->A0()Z

    move-result v0

    .line 117
    iget-object v6, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    sget-object v7, Lcom/applovin/impl/a5;->t:Lcom/applovin/impl/a5;

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v6, v7, v10}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/a5;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v0, :cond_18

    .line 118
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_18
    move v8, v9

    .line 119
    :cond_19
    iget-object v0, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v0, p1, v8, v2, v3}, Lcom/applovin/impl/t0;->a(Lcom/applovin/impl/v0;ZJ)V

    .line 120
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    return-void

    .line 121
    :cond_1a
    sget-object v6, Lcom/applovin/impl/v0$a;->e:Lcom/applovin/impl/v0$a;

    if-ne v0, v6, :cond_1c

    .line 122
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->x()Lcom/applovin/impl/u0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/u0;->h()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1b

    move v8, v9

    .line 123
    :cond_1b
    iget-object v0, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v0, p1, v8, v2, v3}, Lcom/applovin/impl/t0;->a(Lcom/applovin/impl/v0;ZJ)V

    .line 124
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    return-void

    .line 125
    :cond_1c
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid consent flow decision type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/applovin/impl/z0;->a(Ljava/lang/String;)V

    return-void

    .line 126
    :cond_1d
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v2, Lcom/applovin/impl/v0$b;->d:Lcom/applovin/impl/v0$b;

    if-ne v0, v2, :cond_1e

    .line 127
    invoke-direct {p0}, Lcom/applovin/impl/z0;->b()V

    return-void

    .line 128
    :cond_1e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Invalid consent flow destination state: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/applovin/impl/z0;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V
    .locals 0

    .line 29
    invoke-virtual {p1, p3}, Lcom/applovin/impl/v0;->a(Ljava/lang/Boolean;)I

    move-result p3

    invoke-direct {p0, p3}, Lcom/applovin/impl/z0;->a(I)Lcom/applovin/impl/v0;

    move-result-object p3

    .line 30
    invoke-direct {p0, p1, p3, p2}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/v0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/applovin/impl/z0;->f:Lcom/applovin/impl/v0;

    .line 32
    invoke-direct {p0, p2, p3}, Lcom/applovin/impl/z0;->c(Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Landroid/app/AlertDialog;Landroid/app/Activity;ZLandroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/applovin/impl/z0;->a(Landroid/app/AlertDialog;Landroid/app/Activity;ZLandroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/applovin/impl/z0;->b(Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Lcom/applovin/sdk/AppLovinCmpError;J)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/applovin/impl/z0;->a(Lcom/applovin/sdk/AppLovinCmpError;J)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z0;Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/applovin/impl/z0;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/applovin/sdk/AppLovinCmpError;J)V
    .locals 0

    .line 160
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    const-string p3, "duration_ms"

    invoke-static {p3, p2}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p2

    if-nez p1, :cond_0

    .line 161
    iget-object p1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object p1

    sget-object p3, Lcom/applovin/impl/d2;->q:Lcom/applovin/impl/d2;

    invoke-virtual {p1, p3, p2}, Lcom/applovin/impl/e2;->d(Lcom/applovin/impl/d2;Ljava/util/Map;)V

    return-void

    .line 162
    :cond_0
    invoke-direct {p0, p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/sdk/AppLovinCmpError;)Ljava/util/HashMap;

    move-result-object p1

    .line 163
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 164
    iget-object p1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object p1

    sget-object p3, Lcom/applovin/impl/d2;->r:Lcom/applovin/impl/d2;

    invoke-virtual {p1, p3, p2}, Lcom/applovin/impl/e2;->d(Lcom/applovin/impl/d2;Ljava/util/Map;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 143
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/applovin/impl/l1;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Last started states: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/applovin/impl/z0;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nLast successful state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/applovin/impl/z0;->f:Lcom/applovin/impl/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "details"

    invoke-static {v1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 145
    iget-object v1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v1}, Lcom/applovin/impl/sdk/k;->D()Lcom/applovin/impl/r1;

    move-result-object v1

    sget-object v2, Lcom/applovin/impl/d2;->O0:Lcom/applovin/impl/d2;

    invoke-virtual {v1, v2, p1, v0}, Lcom/applovin/impl/e2;->a(Lcom/applovin/impl/d2;Ljava/lang/String;Ljava/util/Map;)V

    .line 146
    iget-object v0, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v0, p1}, Lcom/applovin/impl/t0;->b(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/applovin/impl/z0;->m:Lcom/applovin/impl/u0$b;

    if-eqz v0, :cond_0

    .line 148
    new-instance v1, Lcom/applovin/impl/s0;

    sget v2, Lcom/applovin/impl/s0;->e:I

    invoke-direct {v1, v2, p1}, Lcom/applovin/impl/s0;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/applovin/impl/u0$b;->a(Lcom/applovin/impl/s0;)V

    .line 149
    :cond_0
    invoke-direct {p0}, Lcom/applovin/impl/z0;->b()V

    return-void
.end method

.method public static synthetic b(Lcom/applovin/impl/z0;Landroid/app/Dialog;)Landroid/app/Activity;
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/applovin/impl/z0;->a(Landroid/app/Dialog;)Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/applovin/impl/z0;)Landroid/app/Dialog;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/applovin/impl/z0;->i:Landroid/app/Dialog;

    return-object p0
.end method

.method private b()V
    .locals 4

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/applovin/impl/z0;->j:J

    sub-long/2addr v0, v2

    .line 6
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "duration_ms"

    invoke-static {v1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v1}, Lcom/applovin/impl/t0;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "details"

    invoke-static {v2, v1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 8
    iget-object v1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v1}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object v1

    sget-object v2, Lcom/applovin/impl/d2;->v:Lcom/applovin/impl/d2;

    invoke-virtual {v1, v2, v0}, Lcom/applovin/impl/e2;->d(Lcom/applovin/impl/d2;Ljava/util/Map;)V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    .line 10
    iput-object v0, p0, Lcom/applovin/impl/z0;->f:Lcom/applovin/impl/v0;

    const-wide/16 v1, 0x0

    .line 11
    iput-wide v1, p0, Lcom/applovin/impl/z0;->j:J

    .line 12
    iput-wide v1, p0, Lcom/applovin/impl/z0;->k:J

    .line 13
    iput-wide v1, p0, Lcom/applovin/impl/z0;->l:J

    .line 14
    iget-object v1, p0, Lcom/applovin/impl/z0;->c:Lcom/applovin/impl/t0;

    invoke-virtual {v1}, Lcom/applovin/impl/t0;->a()V

    .line 15
    iget-object v1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v1}, Lcom/applovin/impl/sdk/k;->e()Lcom/applovin/impl/c;

    move-result-object v1

    iget-object v2, p0, Lcom/applovin/impl/z0;->n:Lcom/applovin/impl/b;

    invoke-virtual {v1, v2}, Lcom/applovin/impl/c;->b(Lcom/applovin/impl/b;)V

    .line 16
    iget-object v1, p0, Lcom/applovin/impl/z0;->g:Lcom/applovin/impl/u0$c;

    if-eqz v1, :cond_0

    .line 17
    iget-object v2, p0, Lcom/applovin/impl/z0;->m:Lcom/applovin/impl/u0$b;

    invoke-interface {v1, v2}, Lcom/applovin/impl/u0$c;->a(Lcom/applovin/impl/u0$b;)V

    .line 18
    iput-object v0, p0, Lcom/applovin/impl/z0;->g:Lcom/applovin/impl/u0$c;

    .line 19
    :cond_0
    new-instance v0, Lcom/applovin/impl/u0$b;

    invoke-direct {v0}, Lcom/applovin/impl/u0$b;-><init>()V

    iput-object v0, p0, Lcom/applovin/impl/z0;->m:Lcom/applovin/impl/u0$b;

    return-void
.end method

.method private b(Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic b(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic c(Lcom/applovin/impl/z0;)Lcom/applovin/impl/v0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/z0;->f:Lcom/applovin/impl/v0;

    return-object p0
.end method

.method private c(Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 2

    .line 2
    new-instance v0, Lcom/applovin/impl/mediation/ads/f;

    const/16 v1, 0x8

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/applovin/impl/mediation/ads/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0}, Lcom/applovin/sdk/AppLovinSdkUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic d(Lcom/applovin/impl/z0;)Lcom/applovin/impl/sdk/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/applovin/impl/z0;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/applovin/impl/z0;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic f(Lcom/applovin/impl/z0;)Lcom/applovin/impl/u0$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/z0;->m:Lcom/applovin/impl/u0$b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(ILandroid/app/Activity;Lcom/applovin/impl/u0$c;)V
    .locals 3

    .line 13
    iget-object v0, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    const-string v1, "ConsentFlowStateMachine"

    if-eqz v0, :cond_2

    .line 14
    iget-object p1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unable to start states: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Consent flow already in progress for states: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_1
    new-instance p1, Lcom/applovin/impl/s0;

    sget p2, Lcom/applovin/impl/s0;->d:I

    const-string v0, "Consent flow is already in progress."

    invoke-direct {p1, p2, v0}, Lcom/applovin/impl/s0;-><init>(ILjava/lang/String;)V

    .line 17
    new-instance p2, Lcom/applovin/impl/u0$b;

    invoke-direct {p2, p1}, Lcom/applovin/impl/u0$b;-><init>(Lcom/applovin/impl/s0;)V

    .line 18
    invoke-interface {p3, p2}, Lcom/applovin/impl/u0$c;->a(Lcom/applovin/impl/u0$b;)V

    return-void

    .line 19
    :cond_2
    iget-object v0, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-static {v0}, Lcom/applovin/impl/a1;->a(Lcom/applovin/impl/sdk/k;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    .line 20
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/applovin/impl/z0;->e:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lcom/applovin/impl/z0;->g:Lcom/applovin/impl/u0$c;

    .line 22
    invoke-direct {p0, p1}, Lcom/applovin/impl/z0;->a(I)Lcom/applovin/impl/v0;

    move-result-object p1

    .line 23
    iget-object p3, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p3}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p3}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Starting consent flow with states: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\nInitial state: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v1, v0}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    :cond_3
    invoke-static {p2}, Lcom/applovin/impl/sdk/k;->a(Landroid/content/Context;)Lcom/applovin/impl/c;

    move-result-object p3

    iget-object v0, p0, Lcom/applovin/impl/z0;->n:Lcom/applovin/impl/b;

    invoke-virtual {p3, v0}, Lcom/applovin/impl/c;->a(Lcom/applovin/impl/b;)V

    .line 25
    iget-object p3, p0, Lcom/applovin/impl/z0;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p3}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    move-result-object p3

    sget-object v0, Lcom/applovin/impl/d2;->m:Lcom/applovin/impl/d2;

    invoke-virtual {p3, v0}, Lcom/applovin/impl/m7;->a(Lcom/applovin/impl/d2;)V

    .line 26
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/applovin/impl/z0;->j:J

    const/4 p3, 0x0

    .line 27
    invoke-direct {p0, p3, p1, p2}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/v0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    return-void
.end method

.method public a(Landroid/app/Activity;Lcom/applovin/impl/u0$c;)V
    .locals 1

    .line 12
    sget-object v0, Lcom/applovin/impl/v0$a;->c:Lcom/applovin/impl/v0$a;

    invoke-virtual {v0}, Lcom/applovin/impl/v0$a;->b()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/applovin/impl/z0;->a(ILandroid/app/Activity;Lcom/applovin/impl/u0$c;)V

    return-void
.end method

.method public a()Z
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/applovin/impl/z0;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
