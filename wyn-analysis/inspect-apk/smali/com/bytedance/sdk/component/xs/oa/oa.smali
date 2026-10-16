.class public Lcom/bytedance/sdk/component/xs/oa/oa;
.super Lcom/bytedance/sdk/component/xs/oa/yo;
.source "SourceFile"


# static fields
.field public static final oa:Lcom/bytedance/sdk/component/oa/uef/uef;

.field public static final uef:Lcom/bytedance/sdk/component/oa/uef/uef;


# instance fields
.field private cq:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private dj:Lcom/bytedance/sdk/component/oa/uef/uef;

.field private wrv:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef$uef;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/uef$uef;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/uef$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/uef$uef;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/uef$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/bytedance/sdk/component/xs/oa/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 15
    .line 16
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef$uef;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/uef$uef;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/uef$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/bytedance/sdk/component/xs/oa/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/yo;-><init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/bytedance/sdk/component/xs/oa/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->dj:Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->wrv:Z

    .line 10
    .line 11
    new-instance p1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->cq:Ljava/util/Map;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/component/xs/oa;
    .locals 14

    .line 36
    const-string v0, "UTF-8"

    :try_start_0
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 37
    iget-boolean v2, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->wrv:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, ""

    if-eqz v2, :cond_0

    .line 38
    :try_start_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    goto/16 :goto_2

    .line 39
    :cond_0
    new-instance v2, Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    invoke-direct {v2}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;-><init>()V

    .line 40
    iget-object v4, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 41
    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    .line 42
    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    .line 43
    invoke-virtual {v4}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v5

    .line 44
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 45
    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x1

    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 47
    :cond_1
    invoke-virtual {v2, v5}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    .line 48
    :cond_2
    invoke-virtual {v4}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 49
    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v6

    if-lez v6, :cond_3

    .line 50
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 51
    iget-object v7, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->cq:Ljava/util/Map;

    invoke-virtual {v4, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 52
    :cond_3
    iget-object v4, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->cq:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 53
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 54
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 55
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 56
    invoke-static {v6, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v5, :cond_5

    move-object v5, v3

    :cond_5
    invoke-static {v5, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    goto :goto_1

    .line 57
    :cond_6
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/xs;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/xs;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 58
    :goto_2
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 59
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 60
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->dj:Lcom/bytedance/sdk/component/oa/uef/uef;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/uef;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 61
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/Object;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 62
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v0

    .line 63
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v0

    .line 64
    invoke-interface {v0}, Lcom/bytedance/sdk/component/oa/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 65
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->cz()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Ljava/lang/String;)V

    .line 66
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 67
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    move-result-object v1

    if-eqz v1, :cond_7

    const/4 v2, 0x0

    .line 68
    :goto_3
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef()I

    move-result v4

    if-ge v2, v4, :cond_7

    .line 69
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/ivm;->oa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 70
    :cond_7
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object v1

    if-nez v1, :cond_8

    :goto_4
    move-object v9, v3

    goto :goto_5

    .line 71
    :cond_8
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wk;->oa()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    .line 72
    :goto_5
    new-instance v4, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v5

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v6

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v10

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v12

    invoke-direct/range {v4 .. v13}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v4

    :catchall_0
    :cond_9
    const/4 v0, 0x0

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/uef/uef;)V
    .locals 8

    .line 2
    const-string v0, "UTF-8"

    :try_start_0
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 3
    iget-boolean v2, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->wrv:Z

    if-eqz v2, :cond_0

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    .line 5
    :cond_0
    new-instance v2, Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    invoke-direct {v2}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;-><init>()V

    .line 6
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    .line 8
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    .line 9
    invoke-virtual {v3}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 11
    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    .line 12
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 13
    :cond_1
    invoke-virtual {v2, v4}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    .line 14
    :cond_2
    invoke-virtual {v3}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 15
    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v5

    if-lez v5, :cond_3

    .line 16
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 17
    iget-object v6, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->cq:Ljava/util/Map;

    invoke-virtual {v3, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 18
    :cond_3
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->cq:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 19
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 20
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 21
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 22
    invoke-static {v5, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v4, :cond_5

    const-string v4, ""

    :cond_5
    invoke-static {v4, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/xs$uef;

    goto :goto_1

    .line 23
    :cond_6
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/oa/uef/xs$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/xs;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/xs;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 24
    :goto_2
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 25
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->dj:Lcom/bytedance/sdk/component/oa/uef/uef;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/uef;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 27
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/Object;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 28
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->lw:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->lw:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 30
    :cond_7
    iget v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm:I

    if-lez v0, :cond_8

    .line 31
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(I)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 32
    :cond_8
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v0

    .line 33
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/component/xs/oa/oa$1;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/component/xs/oa/oa$1;-><init>(Lcom/bytedance/sdk/component/xs/oa/oa;Lcom/bytedance/sdk/component/xs/uef/uef;)V

    .line 34
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_3
    if-eqz p1, :cond_9

    .line 35
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v1}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    :cond_9
    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa;->wrv:Z

    return-void
.end method
