.class Lcom/applovin/impl/l0$a;
.super Lcom/applovin/impl/s2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/l0;->initialize(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/applovin/impl/sdk/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/util/List;

.field final synthetic f:Ljava/util/List;

.field final synthetic g:Ljava/util/List;

.field final synthetic h:Ljava/util/List;

.field final synthetic i:Ljava/util/List;

.field final synthetic j:Lcom/applovin/impl/l0;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/l0;Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/l0$a;->j:Lcom/applovin/impl/l0;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/applovin/impl/l0$a;->e:Ljava/util/List;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/applovin/impl/l0$a;->f:Ljava/util/List;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/applovin/impl/l0$a;->g:Ljava/util/List;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/applovin/impl/l0$a;->h:Ljava/util/List;

    .line 10
    .line 11
    iput-object p7, p0, Lcom/applovin/impl/l0$a;->i:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {p0, p2}, Lcom/applovin/impl/s2;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/applovin/impl/l0$c;->values()[Lcom/applovin/impl/l0$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    return v0
.end method

.method public c(I)Ljava/util/List;
    .locals 4

    .line 1
    sget-object v0, Lcom/applovin/impl/l0$c;->a:Lcom/applovin/impl/l0$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->e:Ljava/util/List;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, Lcom/applovin/impl/l0$c;->b:Lcom/applovin/impl/l0$c;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->f:Ljava/util/List;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sget-object v0, Lcom/applovin/impl/l0$c;->c:Lcom/applovin/impl/l0$c;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->g:Ljava/util/List;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    sget-object v0, Lcom/applovin/impl/l0$c;->d:Lcom/applovin/impl/l0$c;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ne p1, v0, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->h:Ljava/util/List;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->i:Ljava/util/List;

    .line 48
    .line 49
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lcom/applovin/impl/b7;

    .line 73
    .line 74
    iget-object v3, p0, Lcom/applovin/impl/l0$a;->j:Lcom/applovin/impl/l0;

    .line 75
    .line 76
    invoke-static {v3, v2, v1}, Lcom/applovin/impl/l0;->a(Lcom/applovin/impl/l0;Lcom/applovin/impl/b7;Z)Lcom/applovin/impl/r2;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    return-object v0
.end method

.method public d(I)I
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/l0$c;->a:Lcom/applovin/impl/l0$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->e:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    sget-object v0, Lcom/applovin/impl/l0$c;->b:Lcom/applovin/impl/l0$c;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->f:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    sget-object v0, Lcom/applovin/impl/l0$c;->c:Lcom/applovin/impl/l0$c;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ne p1, v0, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->g:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_2
    sget-object v0, Lcom/applovin/impl/l0$c;->d:Lcom/applovin/impl/l0$c;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->h:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1

    .line 61
    :cond_3
    iget-object p1, p0, Lcom/applovin/impl/l0$a;->i:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public e(I)Lcom/applovin/impl/r2;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/l0$c;->a:Lcom/applovin/impl/l0$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcom/applovin/impl/w4;

    .line 10
    .line 11
    const-string v0, "MISSING TCF VENDORS (TC STRING)"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object v0, Lcom/applovin/impl/l0$c;->b:Lcom/applovin/impl/l0$c;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    new-instance p1, Lcom/applovin/impl/w4;

    .line 26
    .line 27
    const-string v0, "MISSING ATP NETWORKS (AC STRING)"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    sget-object v0, Lcom/applovin/impl/l0$c;->c:Lcom/applovin/impl/l0$c;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    new-instance p1, Lcom/applovin/impl/w4;

    .line 42
    .line 43
    const-string v0, "LISTED TCF VENDORS (TC STRING)"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    sget-object v0, Lcom/applovin/impl/l0$c;->d:Lcom/applovin/impl/l0$c;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    new-instance p1, Lcom/applovin/impl/w4;

    .line 58
    .line 59
    const-string v0, "LISTED ATP NETWORKS (AC STRING)"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_3
    new-instance p1, Lcom/applovin/impl/w4;

    .line 66
    .line 67
    const-string v0, "NON-CONFIGURABLE NETWORKS"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object p1
.end method
