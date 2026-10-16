.class Lcom/bytedance/sdk/component/xs/oa/oa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/oa/uef/yo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/xs/oa/oa;->uef(Lcom/bytedance/sdk/component/xs/uef/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/component/xs/oa/oa;

.field final synthetic uef:Lcom/bytedance/sdk/component/xs/uef/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/xs/oa/oa;Lcom/bytedance/sdk/component/xs/uef/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/oa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/oa/uef/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    if-eqz p1, :cond_2

    .line 4
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    if-eqz p2, :cond_2

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/oa;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->cz()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 8
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/oa/uef/ivm;->oa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object p1

    if-nez p1, :cond_1

    .line 10
    const-string p1, ""

    :goto_1
    move-object v5, p1

    goto :goto_2

    .line 11
    :cond_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wk;->oa()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 12
    :goto_2
    new-instance v0, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v1

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v2

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v6

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v8

    invoke-direct/range {v0 .. v9}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    iget-object p2, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/oa;

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V

    :cond_2
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/oa;Ljava/io/IOException;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/oa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/oa;

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    :cond_0
    return-void
.end method
