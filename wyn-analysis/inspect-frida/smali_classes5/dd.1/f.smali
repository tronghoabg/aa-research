.class public Ldd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;


# instance fields
.field public a:Ldd/e;

.field public b:Luc/f;

.field public c:Lrc/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldd/f;->c:Lrc/b;

    .line 2
    .line 3
    iget-object v0, p0, Ldd/f;->a:Ldd/e;

    .line 4
    .line 5
    check-cast p1, Lq/s1;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lq/s1;->b(Luc/t;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldd/f;->a:Ldd/e;

    .line 11
    .line 12
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Landroid/app/Activity;

    .line 15
    .line 16
    iput-object p1, v0, Ldd/e;->b:Landroid/app/Activity;

    .line 17
    .line 18
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lqc/a;->c:Luc/f;

    .line 2
    .line 3
    new-instance v1, La9/a;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Ldd/f;->b:Luc/f;

    .line 9
    .line 10
    new-instance v2, Ldd/e;

    .line 11
    .line 12
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-direct {v2, p1, v1}, Ldd/e;-><init>(Landroid/content/Context;La9/a;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Ldd/f;->a:Ldd/e;

    .line 18
    .line 19
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/consent_sdk/a;->F(Luc/f;Ldd/e;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldd/f;->c:Lrc/b;

    .line 2
    .line 3
    iget-object v1, p0, Ldd/f;->a:Ldd/e;

    .line 4
    .line 5
    check-cast v0, Lq/s1;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lq/s1;->m(Luc/t;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldd/f;->a:Ldd/e;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Ldd/e;->b:Landroid/app/Activity;

    .line 14
    .line 15
    iput-object v1, p0, Ldd/f;->c:Lrc/b;

    .line 16
    .line 17
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldd/f;->c:Lrc/b;

    .line 2
    .line 3
    iget-object v1, p0, Ldd/f;->a:Ldd/e;

    .line 4
    .line 5
    check-cast v0, Lq/s1;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lq/s1;->m(Luc/t;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldd/f;->a:Ldd/e;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Ldd/e;->b:Landroid/app/Activity;

    .line 14
    .line 15
    iput-object v1, p0, Ldd/f;->c:Lrc/b;

    .line 16
    .line 17
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Ldd/f;->a:Ldd/e;

    .line 3
    .line 4
    iget-object v0, p0, Ldd/f;->b:Luc/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/consent_sdk/a;->F(Luc/f;Ldd/e;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldd/f;->b:Luc/f;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldd/f;->c:Lrc/b;

    .line 2
    .line 3
    iget-object v0, p0, Ldd/f;->a:Ldd/e;

    .line 4
    .line 5
    check-cast p1, Lq/s1;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lq/s1;->b(Luc/t;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldd/f;->a:Ldd/e;

    .line 11
    .line 12
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Landroid/app/Activity;

    .line 15
    .line 16
    iput-object p1, v0, Ldd/e;->b:Landroid/app/Activity;

    .line 17
    .line 18
    return-void
.end method
