.class Lcom/applovin/impl/z6$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/z6$b;->a(Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/applovin/impl/z6$b;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/z6$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/z6$b$a;->c:Lcom/applovin/impl/z6$b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/z6$b$a;->a:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/applovin/impl/z6$b$a;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/applovin/mediation/MaxDebuggerTcfStringActivity;

    invoke-virtual {p0, p1}, Lcom/applovin/impl/z6$b$a;->a(Lcom/applovin/mediation/MaxDebuggerTcfStringActivity;)V

    return-void
.end method

.method public a(Lcom/applovin/mediation/MaxDebuggerTcfStringActivity;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/z6$b$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/applovin/impl/z6$b$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/applovin/impl/z6$b$a;->c:Lcom/applovin/impl/z6$b;

    iget-object v2, v2, Lcom/applovin/impl/z6$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1, v0, v1, v2}, Lcom/applovin/impl/c7;->initialize(Ljava/lang/String;Ljava/lang/String;Lcom/applovin/impl/sdk/k;)V

    return-void
.end method
