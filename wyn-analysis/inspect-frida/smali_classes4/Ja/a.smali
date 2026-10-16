.class public LJa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Luc/p;


# instance fields
.field public a:Luc/r;


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
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 2

    .line 1
    new-instance v0, Luc/r;

    .line 2
    .line 3
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 4
    .line 5
    const-string v1, "google_mlkit_commons"

    .line 6
    .line 7
    invoke-direct {v0, p1, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LJa/a;->a:Luc/r;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LJa/a;->a:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 0

    .line 1
    check-cast p2, Ltc/g;

    .line 2
    .line 3
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
