.class public final synthetic Lcom/qonversion/android/sdk/automations/mvp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;


# direct methods
.method public synthetic constructor <init>(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/qonversion/android/sdk/automations/mvp/a;->a:Z

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/a;->b:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/a;->b:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    iget-boolean v1, p0, Lcom/qonversion/android/sdk/automations/mvp/a;->a:Z

    invoke-static {v1, v0, p1, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->G(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method
