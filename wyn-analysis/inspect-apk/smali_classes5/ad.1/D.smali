.class public final Lad/D;
.super Lad/j;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(ILG9/e;Lad/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lad/j;-><init>(ILG9/e;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lad/D;->c:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onAdLoaded()V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/D;->c:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lad/k;

    .line 14
    .line 15
    invoke-interface {v0}, Lad/k;->onAdLoaded()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
