.class Lcom/applovin/impl/p$a;
.super Lcom/applovin/impl/s2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/p;->initialize(Lcom/applovin/impl/n;Lcom/applovin/impl/sdk/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/applovin/impl/n;

.field final synthetic f:Lcom/applovin/impl/p;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/p;Landroid/content/Context;Lcom/applovin/impl/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/p$a;->f:Lcom/applovin/impl/p;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/applovin/impl/p$a;->e:Lcom/applovin/impl/n;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/applovin/impl/s2;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/p$a;->e:Lcom/applovin/impl/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/n;->g()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public c(I)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/applovin/impl/p$a;->e:Lcom/applovin/impl/n;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/applovin/impl/n;->g()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/applovin/impl/o;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/applovin/impl/p$a;->f:Lcom/applovin/impl/p;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/applovin/impl/o;->c()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v1, v2}, Lcom/applovin/impl/p;->a(Lcom/applovin/impl/p;Ljava/lang/String;)Lcom/applovin/impl/r2;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/applovin/impl/o;->b()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lcom/applovin/impl/p$a;->f:Lcom/applovin/impl/p;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/applovin/impl/o;->b()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "AB Test Experiment Name"

    .line 44
    .line 45
    invoke-static {v1, v3, v2}, Lcom/applovin/impl/p;->a(Lcom/applovin/impl/p;Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/impl/r2;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p1}, Lcom/applovin/impl/o;->d()Lcom/applovin/impl/l8;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v1, p0, Lcom/applovin/impl/p$a;->f:Lcom/applovin/impl/p;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/applovin/impl/l8;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v1, v2}, Lcom/applovin/impl/p;->b(Lcom/applovin/impl/p;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "Device ID Targeting"

    .line 67
    .line 68
    invoke-static {v1, v3, v2}, Lcom/applovin/impl/p;->a(Lcom/applovin/impl/p;Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/impl/r2;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/applovin/impl/p$a;->f:Lcom/applovin/impl/p;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/applovin/impl/l8;->b()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v1, v2}, Lcom/applovin/impl/p;->c(Lcom/applovin/impl/p;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const-string v3, "Device Type Targeting"

    .line 86
    .line 87
    invoke-static {v1, v3, v2}, Lcom/applovin/impl/p;->a(Lcom/applovin/impl/p;Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/impl/r2;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/applovin/impl/l8;->c()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    iget-object v1, p0, Lcom/applovin/impl/p$a;->f:Lcom/applovin/impl/p;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/applovin/impl/l8;->c()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {v1, p1}, Lcom/applovin/impl/p;->a(Lcom/applovin/impl/p;Ljava/util/List;)Lcom/applovin/impl/r2;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_1
    return-object v0
.end method

.method public d(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/p$a;->e:Lcom/applovin/impl/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/n;->g()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/applovin/impl/o;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/applovin/impl/o;->b()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v1

    .line 24
    :goto_0
    invoke-virtual {p1}, Lcom/applovin/impl/o;->d()Lcom/applovin/impl/l8;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/applovin/impl/l8;->c()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move v1, v2

    .line 35
    :cond_1
    add-int/lit8 v0, v0, 0x3

    .line 36
    .line 37
    add-int/2addr v0, v1

    .line 38
    return v0
.end method

.method public e(I)Lcom/applovin/impl/r2;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/p$b;->a:Lcom/applovin/impl/p$b;

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
    const-string v0, "TARGETED WATERFALL FOR CURRENT DEVICE"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object v0, Lcom/applovin/impl/p$b;->b:Lcom/applovin/impl/p$b;

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
    const-string v0, "OTHER WATERFALLS"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    new-instance p1, Lcom/applovin/impl/w4;

    .line 34
    .line 35
    const-string v0, ""

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lcom/applovin/impl/w4;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p1
.end method
