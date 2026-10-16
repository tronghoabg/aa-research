.class public final synthetic Lcom/applovin/impl/I0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lcom/applovin/impl/t4;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/t4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/I0;->a:Lcom/applovin/impl/t4;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/I0;->a:Lcom/applovin/impl/t4;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/applovin/impl/t4;->b(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    return-void
.end method
