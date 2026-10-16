.class public final synthetic LFf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/U;


# instance fields
.field public final synthetic a:LFf/e;

.field public final synthetic b:LEf/M0;


# direct methods
.method public synthetic constructor <init>(LFf/e;LEf/M0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFf/c;->a:LFf/e;

    iput-object p2, p0, LFf/c;->b:LEf/M0;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, LFf/c;->a:LFf/e;

    .line 2
    .line 3
    iget-object v0, v0, LFf/e;->b:Landroid/os/Handler;

    .line 4
    .line 5
    iget-object v1, p0, LFf/c;->b:LEf/M0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
