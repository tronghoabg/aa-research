.class Lcom/applovin/impl/z6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/s2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/z6;->initialize(Ljava/util/List;Lcom/applovin/impl/sdk/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/a7;

.field final synthetic b:Lcom/applovin/impl/sdk/k;

.field final synthetic c:Lcom/applovin/impl/z6;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/z6;Lcom/applovin/impl/a7;Lcom/applovin/impl/sdk/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/z6$b;->c:Lcom/applovin/impl/z6;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/z6$b;->a:Lcom/applovin/impl/a7;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/applovin/impl/z6$b;->b:Lcom/applovin/impl/sdk/k;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lcom/applovin/impl/z6$e;->a:Lcom/applovin/impl/z6$e;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    sget-object p2, Lcom/applovin/impl/z6$d;->b:Lcom/applovin/impl/z6$d;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    sget-object p1, Lcom/applovin/impl/a5;->x:Lcom/applovin/impl/a5;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/applovin/impl/a5;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, Lcom/applovin/impl/z6$b;->a:Lcom/applovin/impl/a7;

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/applovin/impl/a7;->j()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object p1, Lcom/applovin/impl/a5;->y:Lcom/applovin/impl/a5;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/applovin/impl/a5;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object p2, p0, Lcom/applovin/impl/z6$b;->a:Lcom/applovin/impl/a7;

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/applovin/impl/a7;->c()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    :goto_0
    iget-object v0, p0, Lcom/applovin/impl/z6$b;->c:Lcom/applovin/impl/z6;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/applovin/impl/z6$b;->b:Lcom/applovin/impl/sdk/k;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/applovin/impl/sdk/k;->e()Lcom/applovin/impl/c;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Lcom/applovin/impl/z6$b$a;

    .line 59
    .line 60
    invoke-direct {v2, p0, p1, p2}, Lcom/applovin/impl/z6$b$a;-><init>(Lcom/applovin/impl/z6$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-class p1, Lcom/applovin/mediation/MaxDebuggerTcfStringActivity;

    .line 64
    .line 65
    invoke-static {v0, p1, v1, v2}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    sget-object v0, Lcom/applovin/impl/z6$c;->d:Lcom/applovin/impl/z6$c;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-ne p1, v0, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Lcom/applovin/impl/z6$b;->c:Lcom/applovin/impl/z6;

    .line 82
    .line 83
    iget-object p2, p0, Lcom/applovin/impl/z6$b;->b:Lcom/applovin/impl/sdk/k;

    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/applovin/impl/sdk/k;->e()Lcom/applovin/impl/c;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    new-instance v0, Lcom/applovin/impl/z6$b$b;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Lcom/applovin/impl/z6$b$b;-><init>(Lcom/applovin/impl/z6$b;)V

    .line 92
    .line 93
    .line 94
    const-class v1, Lcom/applovin/mediation/MaxDebuggerCmpNetworksListActivity;

    .line 95
    .line 96
    invoke-static {p1, v1, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_2
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->c()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->b()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    iget-object v0, p0, Lcom/applovin/impl/z6$b;->c:Lcom/applovin/impl/z6;

    .line 109
    .line 110
    invoke-static {p1, p2, v0}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method
