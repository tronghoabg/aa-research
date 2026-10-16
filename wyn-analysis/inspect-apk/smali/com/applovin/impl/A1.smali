.class public final synthetic Lcom/applovin/impl/A1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Lcom/applovin/impl/z0;

.field public final synthetic b:Landroid/app/AlertDialog;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/z0;Landroid/app/AlertDialog;Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/A1;->a:Lcom/applovin/impl/z0;

    iput-object p2, p0, Lcom/applovin/impl/A1;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/applovin/impl/A1;->c:Landroid/app/Activity;

    iput-boolean p4, p0, Lcom/applovin/impl/A1;->d:Z

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/A1;->a:Lcom/applovin/impl/z0;

    iget-object v1, p0, Lcom/applovin/impl/A1;->b:Landroid/app/AlertDialog;

    iget-object v2, p0, Lcom/applovin/impl/A1;->c:Landroid/app/Activity;

    iget-boolean v3, p0, Lcom/applovin/impl/A1;->d:Z

    invoke-static {v0, v1, v2, v3, p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Landroid/app/AlertDialog;Landroid/app/Activity;ZLandroid/content/DialogInterface;)V

    return-void
.end method
