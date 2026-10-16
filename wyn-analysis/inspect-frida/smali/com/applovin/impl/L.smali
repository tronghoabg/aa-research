.class public final synthetic Lcom/applovin/impl/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic a:Lcom/applovin/impl/e6;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/e6;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/L;->a:Lcom/applovin/impl/e6;

    iput-object p2, p0, Lcom/applovin/impl/L;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/L;->a:Lcom/applovin/impl/e6;

    iget-object v1, p0, Lcom/applovin/impl/L;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/e6;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method
