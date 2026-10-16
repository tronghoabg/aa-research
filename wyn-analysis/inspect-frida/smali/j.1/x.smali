.class public final synthetic Lj/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/i;


# instance fields
.field public final synthetic a:Lj/f;


# direct methods
.method public synthetic constructor <init>(Lj/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/x;->a:Lj/f;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj/x;->a:Lj/f;

    invoke-virtual {v0, p1}, Lj/f;->g(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
